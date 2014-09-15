/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uquetignyadminapp.visual;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.ReadPreference;
import com.uquetignyadminapp.connection.ConnectionMongoDB;
import java.lang.reflect.Field;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Boudabza
 */
public final class Admin_NewTuples extends javax.swing.JFrame {

    /**
     * Creates new form Admin_NewTuples
     */
    public ArrayList getListofChamps(String nomdeTable, int numdetuple) throws UnknownHostException {
        DBCollection t = getSpecificCollection(nomdeTable);
        ArrayList<Map> test2 = fillSpecificCollection(t);
        Set s = test2.get(numdetuple).keySet();
        ArrayList<String> s2 = new ArrayList<String>(s);
        return s2;

    }

    public ArrayList<Map> fillSpecificCollection(DBCollection ObjectsOfCollection) {
        ArrayList<Map> objectData = new ArrayList<Map>();
        DBCursor dbcur = ObjectsOfCollection.find();
        int i = 0;
        while (dbcur.hasNext()) {
            objectData.add(ObjectsOfCollection.find().toArray().get(i).toMap());
            dbcur.next();
            i++;
        }

        dbcur.close();

        return objectData;
    }

    public DBCollection getSpecificCollection(String nomCollection) throws UnknownHostException {
        ConnectionMongoDB conmgb = new ConnectionMongoDB();
        DBCollection ObjectOfCollection = conmgb.getRecordsOfSpecificCollection(nomCollection);
        return ObjectOfCollection;
    }

    public Admin_NewTuples(String c) throws UnknownHostException, NoSuchFieldException {
        String _c = c;
        // System.out.println(_c);
        initComponents();
        setTitle("ULQ Manager");
        jLabel2.setText(_c);
        ConnectionMongoDB connec = new ConnectionMongoDB();
        DB d = connec.getDB();
       // DBCollection coll = d.getCollection(c);
        // DBCursor cursor = coll.find();

        DBCollection test = getSpecificCollection(_c);
        ArrayList<Map> test2 = fillSpecificCollection(test);

        int cpt = test2.get(1).keySet().size();

       // ArrayList<String>  s = new ArrayList<String>();
        //s = getListofChamps(jTextField1.getText(), 1);
        //System.out.println(s.toString());
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
        jTextField6.setVisible(false);
        jTextField7.setVisible(false);
        jTextField8.setVisible(false);
        jTextField9.setVisible(false);
        jTextField10.setVisible(false);
        jTextField11.setVisible(false);

        if (cpt == 3) {
            jTextField3.setVisible(true);
            jTextField4.setVisible(true);
            jTextField5.setVisible(false);
            jTextField6.setVisible(false);
            jTextField7.setVisible(false);
            jTextField8.setVisible(false);
            jTextField9.setVisible(false);
            jTextField10.setVisible(false);
            jTextField11.setVisible(false);

        }

        if (cpt == 4) {
            jTextField4.setVisible(true);
            jTextField5.setVisible(false);
            jTextField6.setVisible(false);
            jTextField7.setVisible(false);
            jTextField8.setVisible(false);
            jTextField9.setVisible(false);
            jTextField10.setVisible(false);
            jTextField11.setVisible(false);

        }

        if (cpt == 5) {
            jTextField4.setVisible(true);

            jTextField5.setVisible(true);
            jTextField6.setVisible(false);
            jTextField7.setVisible(false);
            jTextField8.setVisible(false);
            jTextField9.setVisible(false);
            jTextField10.setVisible(false);
            jTextField11.setVisible(false);
        }

        if (cpt == 6) {
            jTextField4.setVisible(true);
            jTextField5.setVisible(true);
            jTextField6.setVisible(true);
            jTextField7.setVisible(false);
            jTextField8.setVisible(false);
            jTextField9.setVisible(false);
            jTextField10.setVisible(false);
            jTextField11.setVisible(false);

        }

        if (cpt == 7) {
            jTextField4.setVisible(true);
            jTextField5.setVisible(true);
            jTextField6.setVisible(true);
            jTextField7.setVisible(true);
            jTextField8.setVisible(false);
            jTextField9.setVisible(false);
            jTextField10.setVisible(false);
            jTextField11.setVisible(false);

        }

        if (cpt == 8) {
            jTextField4.setVisible(true);
            jTextField5.setVisible(true);
            jTextField6.setVisible(true);
            jTextField7.setVisible(true);
            jTextField8.setVisible(true);
            jTextField9.setVisible(false);
            jTextField10.setVisible(false);
            jTextField11.setVisible(false);

        }
        if (cpt == 9) {
            jTextField4.setVisible(true);
            jTextField5.setVisible(true);
            jTextField6.setVisible(true);
            jTextField7.setVisible(true);
            jTextField8.setVisible(true);
            jTextField9.setVisible(true);
            jTextField10.setVisible(false);
            jTextField11.setVisible(false);

        }
        if (cpt == 10) {
            jTextField4.setVisible(true);
            jTextField5.setVisible(true);
            jTextField6.setVisible(true);
            jTextField7.setVisible(true);
            jTextField8.setVisible(true);
            jTextField9.setVisible(true);
            jTextField10.setVisible(true);
            jTextField11.setVisible(false);

        }

        if (cpt == 11) {
            jTextField4.setVisible(true);
            jTextField5.setVisible(true);
            jTextField6.setVisible(true);
            jTextField7.setVisible(true);
            jTextField8.setVisible(true);
            jTextField9.setVisible(true);
            jTextField10.setVisible(true);
            jTextField11.setVisible(true);

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setText("Ajout tuple de la table :");

        jButton1.setText("Inserer tuples");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setMinimumSize(new java.awt.Dimension(20, 20));

        jTextField2.setMinimumSize(new java.awt.Dimension(20, 20));

        jTextField3.setMinimumSize(new java.awt.Dimension(20, 20));

        jTextField4.setMinimumSize(new java.awt.Dimension(20, 20));

        jTextField5.setMinimumSize(new java.awt.Dimension(20, 20));

        jTextField6.setMinimumSize(new java.awt.Dimension(20, 20));

        jTextField7.setMinimumSize(new java.awt.Dimension(20, 20));

        jTextField8.setMinimumSize(new java.awt.Dimension(20, 20));
        jTextField8.setName(""); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jTextField9.setMinimumSize(new java.awt.Dimension(20, 20));
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jTextField10.setMinimumSize(new java.awt.Dimension(20, 20));

        jTextField11.setMinimumSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 287, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(119, 119, 119))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(41, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jMenu1.setText("Fichier");

        jMenuItem1.setText("Retour");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Quitter");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            ConnectionMongoDB connect = new ConnectionMongoDB();
            DB d = connect.getDB();

            if (jLabel2.getText().equals("Campus")) {
                DBCollection coll = d.getCollection(this.jLabel2.getText());

                BasicDBObject doc = new BasicDBObject("_id", jTextField1.getText()).
                        append("site_campus", jTextField2.getText()).
                        append("adresse_campus", jTextField3.getText()).
                        append("telephone", jTextField4.getText()).
                        append("fax", jTextField5.getText()).
                        append("responsable", jTextField6.getText());
                coll.insert(doc);
            }

            if (jLabel2.getText().equals("Personne")) {
                DBCollection coll = d.getCollection(this.jLabel2.getText());

                BasicDBObject doc = new BasicDBObject("_id", jTextField1.getText()).
                        append("type", jTextField2.getText()).
                        append("nompersonne", jTextField3.getText()).
                        append("prenompersonne", jTextField4.getText()).
                        append("titrepersonne", jTextField5.getText()).
                        append("adressepersonne", jTextField6.getText()).
                        append("telephonepersonne", jTextField7.getText()).
                        append("codepostalpersonne", jTextField8.getText()).
                        append("typecours", jTextField9.getText()).
                        append("campusid", jTextField10.getText());
                coll.insert(doc);
            }

            if (jLabel2.getText().equals("Batiment")) {
                DBCollection coll = d.getCollection(this.jLabel2.getText());

                BasicDBObject doc = new BasicDBObject("_id", jTextField1.getText()).
                        append("nombatiment", jTextField2.getText()).
                        append("adresse", jTextField3.getText()).
                        append("telephone", jTextField4.getText()).
                        append("niveau", jTextField5.getText()).
                        append("campusid", jTextField6.getText()).
                        append("telephonepersonne", jTextField7.getText()).
                        append("ufrid", jTextField8.getText());
                coll.insert(doc);
            }

            if (jLabel2.getText().equals("UFR")) {
                DBCollection coll = d.getCollection(this.jLabel2.getText());

                BasicDBObject doc = new BasicDBObject("_id", jTextField1.getText()).
                        append("nomUFR", jTextField2.getText()).
                        append("doyenUFR", jTextField3.getText()).
                        append("typeUFR", jTextField4.getText()).
                        append("departementUFR", jTextField5.getText()).
                        append("centrerechercheUFR", jTextField6.getText()).
                        append("batimentid", jTextField7.getText());
                coll.insert(doc);
            }

            if (jLabel2.getText().equals("Bureau")) {
                DBCollection coll = d.getCollection(this.jLabel2.getText());

                BasicDBObject doc = new BasicDBObject("numerobureau", jTextField1.getText()).
                        append("telephonebureau", jTextField2.getText()).
                        append("batimentid", jTextField3.getText());
                coll.insert(doc);
            }

            if (jLabel2.getText().equals("Classe")) {
                DBCollection coll = d.getCollection(this.jLabel2.getText());

                BasicDBObject doc = new BasicDBObject("numeroclasse", jTextField1.getText()).
                        append("placesclasse", jTextField2.getText()).
                        append("batimentid", jTextField3.getText());
                coll.insert(doc);
            }

            if (jLabel2.getText().equals("LabTP")) {
                DBCollection coll = d.getCollection(this.jLabel2.getText());

                BasicDBObject doc = new BasicDBObject("_id", jTextField1.getText()).
                        append("numerolab", jTextField2.getText()).
                        append("placestp", jTextField3.getText()).
                        append("machinestp", jTextField4.getText()).
                        append("batimentid", jTextField5.getText());
                coll.insert(doc);
            }

            if (jLabel2.getText().equals("CentreRecherche")) {
                DBCollection coll = d.getCollection(this.jLabel2.getText());

                BasicDBObject doc = new BasicDBObject("_id", jTextField1.getText()).
                        append("nomcentrerecherche", jTextField2.getText()).
                        append("directeurcentrerecherche", jTextField3.getText()).
                        append("equipescentrerecherche", jTextField4.getText()).
                        append("UFRid", jTextField5.getText());
                coll.insert(doc);
            }

            if (jLabel2.getText().equals("Departement")) {
                DBCollection coll = d.getCollection(this.jLabel2.getText());

                BasicDBObject doc = new BasicDBObject("_id", jTextField1.getText()).
                        append("nomdepartement", jTextField2.getText()).
                        append("directeurdepartement", jTextField3.getText()).
                        append("profdepartement", jTextField4.getText()).
                        append("UFRid", jTextField5.getText());
                coll.insert(doc);
            }

            if (jLabel2.getText().equals("EcoleInstitut")) {
                DBCollection coll = d.getCollection(this.jLabel2.getText());

                BasicDBObject doc = new BasicDBObject("_id", jTextField1.getText()).
                        append("nomecoleinstitut", jTextField2.getText()).
                        append("directeurecoleinstitut", jTextField3.getText()).
                        append("profecoleinstitut", jTextField4.getText()).
                        append("UFRid", jTextField5.getText());
                coll.insert(doc);
            }

            if (jLabel2.getText().equals("Professeur")) {
                DBCollection coll = d.getCollection(this.jLabel2.getText());

                BasicDBObject doc = new BasicDBObject("_id", jTextField1.getText()).
                        append("nomprofesseur", jTextField2.getText()).
                        append("contact", jTextField3.getText()).
                        append("année", jTextField4.getText());
                coll.insert(doc);
            }

            if (jLabel2.getText().equals("Cours")) {
                DBCollection coll = d.getCollection(this.jLabel2.getText());

                BasicDBObject doc = new BasicDBObject("_id", jTextField1.getText()).
                        append("nomcours", jTextField2.getText()).
                        append("creditcours", jTextField3.getText()).
                        append("prerequiscours", jTextField4.getText());
                coll.insert(doc);
            }

            if (jLabel2.getText().equals("Diplome")) {
                DBCollection coll = d.getCollection(this.jLabel2.getText());

                BasicDBObject doc = new BasicDBObject("_id", jTextField1.getText()).
                        append("nomdiplome", jTextField2.getText()).
                        append("nbanneesdiplome", jTextField3.getText()).
                        append("prerequis", jTextField4.getText());
                coll.insert(doc);
            }
            
              javax.swing.JOptionPane.showMessageDialog(null, "Des nouvelles données ont été insérées dans la table :"
                      + " " + jTextField1.getText());            
            
            Admin1 admin = new Admin1();
            admin.setVisible(true);
            this.setVisible(false);
            

        } catch (UnknownHostException ex) {
            Logger.getLogger(Admin_NewTuples.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:

        Admin1 a = new Admin1();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        int code = 0;
        System.exit(code);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_NewTuples.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_NewTuples.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_NewTuples.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_NewTuples.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(String c) throws UnknownHostException, NoSuchFieldException {
                new Admin_NewTuples(c).setVisible(true);

            }

            @Override
            public void run() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
