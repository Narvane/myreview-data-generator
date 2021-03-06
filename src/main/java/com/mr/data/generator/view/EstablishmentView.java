/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mr.data.generator.view;

import com.mr.data.generator.connection.ConnectionFactory;
import com.mr.data.generator.controller.EstablishmentController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

/**
 *
 * @author Guga
 */
public class EstablishmentView extends javax.swing.JFrame {

    private EstablishmentController establishmentController = new EstablishmentController();

    DefaultListModel nameListModel = new DefaultListModel();
    DefaultListModel afternameListModel = new DefaultListModel();
    DefaultListModel districtListModel = new DefaultListModel();
    DefaultListModel sqlListModel = new DefaultListModel();

    public EstablishmentView() {
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());

                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        initComponents();
        List<String> names = new ArrayList<>();
		
		String s1 = "Delicias";
		String s2 = "Sabor";
		String s3 = "Tempero";
		String s4 = "Taste";
		String s5 = "Bom";
		String s6 = "Delicioso";
		String s7 = "Fantastico";
		String s8 = "Guloseima";
		String s9 = "Gula";
		String s10 = "Sensação";
		String s11 = "Tropical";
		String s12 = "Fermento";
		String s13 = "Fabuloso";
		String s14 = "Delicioso";
		String s15 = "Glamuroso";
		String s16 = "Cremoso";
		String s17 = "Incrível";
		
                names.add(s1);
		names.add(s2);
		names.add(s3);
		names.add(s4);
		names.add(s5);
		names.add(s6);
		names.add(s7);
		names.add(s8);
		names.add(s9);
		names.add(s10);
		names.add(s11);
		names.add(s12);
		names.add(s13);
		names.add(s14);
		names.add(s15);
		names.add(s16);
		names.add(s17);
                
                names.forEach((iterate) -> {
                    nameListModel.addElement(iterate);
                });
                nameList.setModel(nameListModel);
                
		String s18 = "Caseiras";
		String s19 = "Sabor";
		String s20 = "Gula";
		String s21 = "Tropical";
		String s22 = "Sensação";
		String s23 = "Fermento";
		String s24 = "da Casa";
		String s25 = "do Mundo";
		String s26 = "do Jardim";
		String s27 = "do Campo";
		String s28 = "do Horizonte";
		String s29 = "do Brasil";
		String s30 = "do Mar";
		String s31 = "do Lar";
		
		List<String> afternames = new ArrayList<>();
		afternames.add(s18);
		afternames.add(s19);
		afternames.add(s20);
		afternames.add(s21);
		afternames.add(s22);
		afternames.add(s23);
		afternames.add(s24);
		afternames.add(s25);
		afternames.add(s26);
		afternames.add(s27);
		afternames.add(s28);
		afternames.add(s29);
		afternames.add(s30);
		afternames.add(s31);
                
                afternames.forEach((iterate) -> {
                    afternameListModel.addElement(iterate);
                });
                afternameList.setModel(afternameListModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        sqlTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        nameList = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        afternameList = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        districtList = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();
        allDistrictCheckBox = new javax.swing.JCheckBox();
        addDistrictButton = new javax.swing.JButton();
        deleteDistrictButton = new javax.swing.JButton();
        addNameButton = new javax.swing.JButton();
        deleteNameButton = new javax.swing.JButton();
        addAfternameButton = new javax.swing.JButton();
        deleteAfternameButton = new javax.swing.JButton();
        amountInput = new javax.swing.JTextField();
        amountLabel = new javax.swing.JLabel();
        generateButton = new javax.swing.JButton();
        serverField = new javax.swing.JTextField();
        databaseField = new javax.swing.JTextField();
        portField = new javax.swing.JTextField();
        portLabel = new javax.swing.JLabel();
        databaseLabel = new javax.swing.JLabel();
        serverLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        usernameField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        afternameLabel = new javax.swing.JLabel();
        districtLabel = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        afternameInput = new javax.swing.JTextField();
        districtInput = new javax.swing.JTextField();
        postgresRadio = new javax.swing.JRadioButton();
        mysqlRadio = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();
        titleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        sqlTextArea.setEditable(false);
        sqlTextArea.setColumns(20);
        sqlTextArea.setRows(5);
        jScrollPane1.setViewportView(sqlTextArea);

        jScrollPane2.setViewportView(nameList);

        jScrollPane3.setViewportView(afternameList);

        jScrollPane4.setViewportView(districtList);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        allDistrictCheckBox.setText("All Districts");
        allDistrictCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allDistrictCheckBoxActionPerformed(evt);
            }
        });

        addDistrictButton.setText("Add");
        addDistrictButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDistrictButtonActionPerformed(evt);
            }
        });

        deleteDistrictButton.setText("Delete");
        deleteDistrictButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDistrictButtonActionPerformed(evt);
            }
        });

        addNameButton.setText("Add");
        addNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNameButtonActionPerformed(evt);
            }
        });

        deleteNameButton.setText("Delete");
        deleteNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteNameButtonActionPerformed(evt);
            }
        });

        addAfternameButton.setText("Add");
        addAfternameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAfternameButtonActionPerformed(evt);
            }
        });

        deleteAfternameButton.setText("Delete");
        deleteAfternameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAfternameButtonActionPerformed(evt);
            }
        });

        amountInput.setText("10");

        amountLabel.setLabelFor(amountInput);
        amountLabel.setText("Amount");

        generateButton.setText("Generate");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        serverField.setText("localhost");
        serverField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverFieldActionPerformed(evt);
            }
        });

        databaseField.setText("myreview");

        portField.setText("3306");

        portLabel.setLabelFor(portField);
        portLabel.setText("Port");

        databaseLabel.setLabelFor(databaseField);
        databaseLabel.setText("Database");

        serverLabel.setLabelFor(serverField);
        serverLabel.setText("Server");

        passwordField.setText("root");

        usernameField.setText("root");

        usernameLabel.setText("Username");

        passwordLabel.setLabelFor(passwordField);
        passwordLabel.setText("Password");

        nameLabel.setLabelFor(nameList);
        nameLabel.setText("Name");

        afternameLabel.setLabelFor(afternameList);
        afternameLabel.setText("Aftername");

        districtLabel.setLabelFor(districtList);
        districtLabel.setText("Districts");

        postgresRadio.setText("Postgres");
        postgresRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postgresRadioActionPerformed(evt);
            }
        });

        mysqlRadio.setSelected(true);
        mysqlRadio.setText("MySql");
        mysqlRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mysqlRadioActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLabel.setText("Data Generator");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(addNameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(deleteNameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jScrollPane2)
                                    .addComponent(nameLabel)
                                    .addComponent(nameInput))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(afternameLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(addAfternameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(deleteAfternameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(afternameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(districtInput)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(districtLabel)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(addDistrictButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(deleteDistrictButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(serverLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(serverField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(databaseLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(databaseField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(portLabel)
                                .addGap(2, 2, 2)
                                .addComponent(portField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(usernameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(usernameField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passwordLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(amountLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(amountInput, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(allDistrictCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mysqlRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(postgresRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(generateButton)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serverField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(databaseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(portField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(portLabel)
                    .addComponent(databaseLabel)
                    .addComponent(serverLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel)
                    .addComponent(passwordLabel))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(afternameLabel)
                    .addComponent(districtLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(afternameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(districtInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addNameButton)
                            .addComponent(deleteNameButton)
                            .addComponent(addAfternameButton)
                            .addComponent(deleteAfternameButton)
                            .addComponent(addDistrictButton)
                            .addComponent(deleteDistrictButton)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(amountInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(allDistrictCheckBox)
                        .addComponent(amountLabel)
                        .addComponent(generateButton)
                        .addComponent(mysqlRadio)
                        .addComponent(postgresRadio))
                    .addComponent(jSeparator2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNameButtonActionPerformed

        nameListModel.addElement(nameInput.getText());
        nameInput.setText("");

    }//GEN-LAST:event_addNameButtonActionPerformed

    private void allDistrictCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allDistrictCheckBoxActionPerformed
        if (allDistrictCheckBox.isSelected()) {
            districtList.setEnabled(false);
        } else {
            districtList.setEnabled(true);
        }

    }//GEN-LAST:event_allDistrictCheckBoxActionPerformed

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        ConnectionFactory.server = serverField.getText();
        ConnectionFactory.database = databaseField.getText();
        ConnectionFactory.port = portField.getText();
        ConnectionFactory.username = usernameField.getText();
        ConnectionFactory.password = passwordField.getText();
        choosenDb();
        establishmentController.setNamesList(Collections.list(nameListModel.elements()));
        establishmentController.setAfternameList(Collections.list(afternameListModel.elements()));
        System.out.println(Collections.list(nameListModel.elements()));
        if (!allDistrictCheckBox.isSelected()) {
            establishmentController.setAllDistricts(false);
            establishmentController.setDistrictNames(Collections.list(districtListModel.elements()));
        } else {
            establishmentController.setAllDistricts(true);
        }
        for (int i = 0; i < Integer.parseInt(amountInput.getText()); i++) {
            establishmentController.generateEstablishments();
        }
        
        String formatedInsertes = "";
        for (int i = 0; i < establishmentController.getSqlList().size(); i++) {
            formatedInsertes += establishmentController.getSqlList().get(i)+"\n";
        }
        
        sqlTextArea.setText(formatedInsertes);
    }//GEN-LAST:event_generateButtonActionPerformed

    private void mysqlRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mysqlRadioActionPerformed
        mysqlRadio.setSelected(true);
        postgresRadio.setSelected(false);
    }//GEN-LAST:event_mysqlRadioActionPerformed

    private void serverFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serverFieldActionPerformed

    private void deleteNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteNameButtonActionPerformed
        nameListModel.removeElementAt(nameList.getSelectedIndex());

    }//GEN-LAST:event_deleteNameButtonActionPerformed

    private void addAfternameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAfternameButtonActionPerformed
        afternameListModel.addElement(afternameInput.getText());
        afternameInput.setText("");
    }//GEN-LAST:event_addAfternameButtonActionPerformed

    private void deleteAfternameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAfternameButtonActionPerformed
        afternameListModel.removeElementAt(afternameList.getSelectedIndex());
    }//GEN-LAST:event_deleteAfternameButtonActionPerformed

    private void addDistrictButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDistrictButtonActionPerformed
        districtListModel.addElement(districtInput.getText());
        districtList.setModel(districtListModel);
        districtInput.setText("");
    }//GEN-LAST:event_addDistrictButtonActionPerformed

    private void deleteDistrictButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDistrictButtonActionPerformed
        districtListModel.removeElementAt(districtList.getSelectedIndex());
    }//GEN-LAST:event_deleteDistrictButtonActionPerformed

    private void postgresRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postgresRadioActionPerformed
        mysqlRadio.setSelected(false);
        postgresRadio.setSelected(true);
    }//GEN-LAST:event_postgresRadioActionPerformed
    private void choosenDb() {
        if (mysqlRadio.isSelected()) {
            ConnectionFactory.db = "jdbc:mysql://";
            ConnectionFactory.driver = "com.mysql.jdbc.Driver";
        } else {
            ConnectionFactory.db = "jdbc:postgresql://";
            ConnectionFactory.driver = "org.postgresql.Driver";
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EstablishmentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstablishmentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstablishmentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstablishmentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstablishmentView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAfternameButton;
    private javax.swing.JButton addDistrictButton;
    private javax.swing.JButton addNameButton;
    private javax.swing.JTextField afternameInput;
    private javax.swing.JLabel afternameLabel;
    private javax.swing.JList<String> afternameList;
    private javax.swing.JCheckBox allDistrictCheckBox;
    private javax.swing.JTextField amountInput;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JTextField databaseField;
    private javax.swing.JLabel databaseLabel;
    private javax.swing.JButton deleteAfternameButton;
    private javax.swing.JButton deleteDistrictButton;
    private javax.swing.JButton deleteNameButton;
    private javax.swing.JTextField districtInput;
    private javax.swing.JLabel districtLabel;
    private javax.swing.JList<String> districtList;
    private javax.swing.JButton generateButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton mysqlRadio;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JList<String> nameList;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField portField;
    private javax.swing.JLabel portLabel;
    private javax.swing.JRadioButton postgresRadio;
    private javax.swing.JTextField serverField;
    private javax.swing.JLabel serverLabel;
    private javax.swing.JTextArea sqlTextArea;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
