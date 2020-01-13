/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mr.data.generator.dao;

import com.mr.data.generator.connection.ConnectionFactory;
import com.mr.data.generator.mode.Establishment;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guga
 */
public class EstablishmentDAO {

    private Connection connection;

    public void generateEstablishment(Establishment establishment) {
        String sql = "INSERT INTO est_establishments(est_name, est_cnpj, dst_id, est_number, est_description, est_stars) VALUES (?, ?, ?, ?, ?, ?);";
        try {
            connection = ConnectionFactory.doConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, establishment.getName());
            stmt.setString(2, establishment.getCnpj());
            stmt.setInt(3, establishment.getDistrict());
            stmt.setInt(4, establishment.getNumber());
            stmt.setString(5, establishment.getDescription());
            stmt.setDouble(6, establishment.getStars());

            stmt.executeUpdate();
            connection.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Integer> getAllDistrictsIds() {
        ArrayList<Integer> idList = new ArrayList<>();

        String sql = "SELECT * FROM dst_districts";

        try {
            connection = ConnectionFactory.doConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                idList.add(rs.getInt("dst_id"));
            }

            connection.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return idList;
    }

    public ArrayList<Integer> getDistrictByNames(ArrayList<String> districtNames) {
        ArrayList<Integer> idList = new ArrayList<>();
        String sql = "SELECT dst_id FROM dst_districts WHERE dst_name = ?";
        try {
            connection = ConnectionFactory.doConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            for (int i = 0; i < districtNames.size(); i++) {
                stmt.setString(1, districtNames.get(i));

                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    idList.add(rs.getInt("dst_id"));
                }
            }
            connection.close();
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return idList;
    }

    public Boolean cnpjExists(String CNPJ) {
        String sql = "SELECT est_cnpj FROM est_establishments WHERE est_cnpj = ?";
        try {
            connection = ConnectionFactory.doConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, CNPJ);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return true;
            }

            connection.close();
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean districtExists(String districtName) {
        String sql = "SELECT dst_name FROM dst_districts WHERE dst_name = ?";

        try {
            connection = ConnectionFactory.doConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, districtName);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return true;
            }

            connection.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
