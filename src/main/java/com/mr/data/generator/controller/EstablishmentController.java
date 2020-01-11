/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mr.data.generator.controller;


import com.mr.data.generator.connection.ConnectionFactory;
import com.mr.data.generator.mode.Establishment;
import java.util.ArrayList;

/**
 *
 * @author Guga
 */
public class EstablishmentController {
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
        prepareConnection();
        ArrayList<Establishment> establishmentList = new ArrayList<>();
        Establishment establishment = new Establishment();
            establishment.setName(randomName());
            establishment.setCnpj(randomCnpj());
            establishment.setDescription(randomDescription());
            establishment.setDistrict(randomDistrict());
            establishment.setNumber(randomNumber());
            establishment.setStars(randomStars());
        sqlSubscribe(establishment);
        establishmentList.add(establishment);
    }
    
    public void prepareConnection(){
        ConnectionFactory.server = this.server;
        ConnectionFactory.database = this.database;
        ConnectionFactory.port = this.port;
        ConnectionFactory.username = this.username;
        ConnectionFactory.password = this.password;
        
        //MySql or Postgres
    }
    
    public String randomName(){
        return "";
    }
    public String randomCnpj(){
        return "";
    }
    public Integer randomDistrict(){
        return 0;
    }
    public Integer randomNumber(){
        return 0;
    }
    public String randomDescription(){
        return "";
    }
    public Double randomStars(){
        return 0.0;
    }
    public void sqlSubscribe(Establishment establishment){
        if(db=="Mysql"){
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
