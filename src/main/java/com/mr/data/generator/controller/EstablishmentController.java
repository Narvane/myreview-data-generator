/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mr.data.generator.controller;


import com.mr.data.generator.connection.ConnectionFactory;
import com.mr.data.generator.dao.EstablishmentDAO;
import com.mr.data.generator.mode.Establishment;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Guga
 */
public class EstablishmentController {
    
    EstablishmentDAO establishmentDAO = new EstablishmentDAO();
    
    private String db;
    private String server;
    private String database;
    private String port;
    private String username;
    private String password;
    private ArrayList<String> namesList = new ArrayList<>();
    private ArrayList<String> afternameList = new ArrayList<>();
    private ArrayList<String> sqlList = new ArrayList<>();
    private ArrayList<String> districtNames = new ArrayList<>();
    private Boolean allDistricts;
    
    
    
    public void generateEstablishments(){
        ArrayList<Establishment> establishmentList = new ArrayList<>();
        Establishment establishment = new Establishment();
            establishment.setName(randomName());
            establishment.setCnpj(randomCnpj());
            establishment.setDescription(randomDescription());
            establishment.setDistrict(randomDistrict());
            establishment.setNumber(randomNumber());
            establishment.setStars(randomStars());
        establishmentDAO.generateEstablishment(establishment);
        sqlSubscribe(establishment);
        establishmentList.add(establishment);
    }
    
    
    public String randomName(){
	Random r = new Random();
	String prename = namesList.get(r.nextInt(namesList.size()));
	String afterName = afternameList.get(r.nextInt(afternameList.size()));
		
	while (prename != afterName) {
            String name = prename + " " + afterName;
            return name;
	}
	return randomName();
    }
    public String randomCnpj(){
        Random r = new Random();
	Random r2 = new Random();
		
	int a = r.nextInt(8000000)+1000000;
	int b = r2.nextInt(8000000)+1000000;
	String total = a +""+ b;
	    
	if(establishmentDAO.cnpjExists(total)){
		return randomCnpj();
	}
	return total;
    }
    public Integer randomDistrict(){
        if(allDistricts){
            Random r = new Random();
            return establishmentDAO.getAllDistrictsIds().get(r.nextInt(establishmentDAO.getAllDistrictsIds().size()));
        } 
        Random r = new Random();
        return establishmentDAO.getDistrictByNames(districtNames).get(r.nextInt(districtNames.size()));
    }
    public Integer randomNumber(){
        Random r = new Random();
	return r.nextInt(9999);
    }
    public String randomDescription(){
        Random r = new Random();
        ArrayList<String> descriptions = new ArrayList<>();
        descriptions.add("Nice Place to Eat");
        descriptions.add("Italian Restaurant");
        descriptions.add("Mexican Restaurant");
        descriptions.add("Fast Food");
        descriptions.add("Gourmet");
        return descriptions.get(r.nextInt(4));
    }
    public Double randomStars(){
            Random r = new Random();
            String join = r.nextInt(5) + "." + r.nextInt(5);
	return Double.valueOf(join);
    }
    public void sqlSubscribe(Establishment establishment){
        if(db=="mysql"){
                sqlList.add("INSERT INTO est_establishments"
                + "(est_name, est_cnpj, est_description, dst_district, est_number, est_stars) "
                + "VALUES '"+establishment.getName()+"', '"+establishment.getCnpj()+"', '"+establishment.getDescription()+"', "+establishment.getDistrict()+", "+establishment.getNumber()+", "+establishment.getStars()+";");
            }else{
                sqlList.add("INSERT INTO est_establishments"
                + "VALUES ('"+establishment.getName()+"', '"+establishment.getCnpj()+"', '"+establishment.getDescription()+"', "+establishment.getDistrict()+", "+establishment.getNumber()+", "+establishment.getStars()+");");
            }
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<String> getNamesList() {
        return namesList;
    }

    public void setNamesList(ArrayList<String> namesList) {
        this.namesList = namesList;
    }

    public ArrayList<String> getAfternameList() {
        return afternameList;
    }

    public void setAfternameList(ArrayList<String> afternameList) {
        this.afternameList = afternameList;
    }

    public ArrayList<String> getSqlList() {
        return sqlList;
    }

    public void setSqlList(ArrayList<String> sqlList) {
        this.sqlList = sqlList;
    }

    public ArrayList<String> getDistrictNames() {
        return districtNames;
    }

    public void setDistrictNames(ArrayList<String> districtNames) {
        this.districtNames = districtNames;
    }

    public Boolean getAllDistricts() {
        return allDistricts;
    }

    public void setAllDistricts(Boolean allDistricts) {
        this.allDistricts = allDistricts;
    }
    
    public void addName(String name){
        this.namesList.add(name);
    }
    public void addAftername(String aftername){
        this.afternameList.add(aftername);
    }
    
    public void addDistrict(String districtName){
        this.districtNames.add(districtName);
    }
    
    public void removeName(String name){
        this.namesList.remove(name);
    }
    public void removeAftername(String aftername){
        this.afternameList.remove(aftername);
    }
    
    public void removeDistrict(String districtName){
        this.districtNames.remove(districtName);
    }
}
