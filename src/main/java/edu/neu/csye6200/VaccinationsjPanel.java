/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200;

import edu.neu.csye6200.controller.StudentController;
import edu.neu.csye6200.controller.TeacherController;
import edu.neu.csye6200.controller.VaccinationController;
import edu.neu.csye6200.model.Classroom;
import edu.neu.csye6200.model.Vaccination;
import edu.neu.csye6200.service.ClassroomFactory;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author adityamulik
 */
@Component
public class VaccinationsjPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentsjPanel
     */
    
    @Autowired
    TeacherController teacherController;
    @Autowired
    StudentController studentController;
    @Autowired
    VaccinationController vaccinationController;
    @Autowired
    ClassroomFactory classroomFactory;
    
    public VaccinationsjPanel() {
        initComponents();
    }

    @PostConstruct
    public void init() {
        try {
            this.populateBodyVaccinations();
        } catch (Exception c) {
            c.printStackTrace();
            System.out.println("Something went wrong!");
        }
    }
    
    public void populateBodyVaccinations() {
         List<Vaccination> vaccinations = vaccinationController.getAllVaccines();

        if (vaccinations.size() == 0) {
            vaccinationController.addDummyData();
        } else {
            DefaultTableModel model = (DefaultTableModel) tableVaccines.getModel();

            if (model.getRowCount() == 0) {
                vaccinations.forEach(t -> {
                    model.addRow(new Object[]{t.getPersonID(), t.getVaccine(), t.getV1t1(), t.getV1t2(), t.getVaccine2(), t.getV2t1()});
                });
            }

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

        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        tfPersonId = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tfVaccine1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tfv1t1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        tfv1t2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        tfv2t1 = new javax.swing.JTextField();
        addVacButton = new javax.swing.JButton();
        clearVacButton = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        tfVaccine2 = new javax.swing.JTextField();
        deleteVacButton = new javax.swing.JButton();
        Renewal1 = new java.awt.Button();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableVaccines = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(800, 720));

        jLabel3.setBackground(new java.awt.Color(153, 255, 153));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("List of Vaccinations:");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New Vaccination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel5.setOpaque(false);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Id");

        tfPersonId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfPersonId.setToolTipText("");
        tfPersonId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPersonIdActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Vaccine1");

        tfVaccine1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfVaccine1.setToolTipText("");
        tfVaccine1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfVaccine1ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Dose1");

        tfv1t1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfv1t1.setToolTipText("");
        tfv1t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfv1t1ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Dose2");

        tfv1t2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfv1t2.setToolTipText("");
        tfv1t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfv1t2ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Vaccine2");

        tfv2t1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfv2t1.setToolTipText("");
        tfv2t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfv2t1ActionPerformed(evt);
            }
        });

        addVacButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addVacButton.setText("Add");
        addVacButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVacButtonActionPerformed(evt);
            }
        });

        clearVacButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clearVacButton.setText("Clear");
        clearVacButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearVacButtonActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Dose1");

        tfVaccine2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfVaccine2.setToolTipText("");
        tfVaccine2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfVaccine2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tfv1t1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(tfPersonId)
            .addComponent(tfVaccine1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tfv1t2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
            .addComponent(tfv2t1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(addVacButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(clearVacButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
            .addComponent(tfVaccine2)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPersonId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfVaccine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addGap(4, 4, 4)
                .addComponent(tfv1t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfv1t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfVaccine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfv2t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addVacButton)
                    .addComponent(clearVacButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        deleteVacButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteVacButton.setText("Delete");
        deleteVacButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteVacButtonActionPerformed(evt);
            }
        });

        Renewal1.setLabel("Alert");
        Renewal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Renewal1ActionPerformed(evt);
            }
        });

        tableVaccines.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tableVaccines.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "personId", "vaccine1", "dose1", "dose2", "vaccine2", "dose1"
            }
        ));
        jScrollPane3.setViewportView(tableVaccines);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteVacButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Renewal1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(84, 84, 84)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteVacButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Renewal1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(119, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfPersonIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPersonIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPersonIdActionPerformed

    private void tfVaccine1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfVaccine1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfVaccine1ActionPerformed

    private void tfv1t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfv1t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfv1t1ActionPerformed

    private void tfv1t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfv1t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfv1t2ActionPerformed

    private void tfv2t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfv2t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfv2t1ActionPerformed

    private void addVacButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVacButtonActionPerformed
        // TODO add your handling code here:
        String id = tfPersonId.getText();
        String vaccine1 = tfVaccine1.getText();
        String v1t1 = tfv1t1.getText();
        String v1t2 = tfv1t2.getText();
        String vaccine2 = tfVaccine2.getText();
        String v2t1 = tfv2t1.getText();

        if (id.isEmpty() || vaccine1.isEmpty() || v1t1.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter Atleast 1 vaccination info", "Try Again", JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) tableVaccines.getModel();
            model.addRow(new Object[]{id, vaccine1,v1t1, v1t2, vaccine2, v2t1});
        }

        tfPersonId.setText("");
        tfVaccine1.setText("");
        tfv1t1.setText("");
        tfv1t2.setText("");
        tfVaccine2.setText("");
        tfv2t1.setText("");

        String csv = id + "," + vaccine1 + "," + v1t1 + "," + v1t2 + "," + vaccine2 + "," + v2t1;
        System.err.println(csv + "is added to vaccine db");

        vaccinationController.addVaccine(csv);
    }//GEN-LAST:event_addVacButtonActionPerformed

    private void clearVacButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearVacButtonActionPerformed
        // TODO add your handling code here:
        tfPersonId.setText("");
        tfVaccine1.setText("");
        tfv1t1.setText("");
        tfv1t2.setText("");
        tfVaccine2.setText("");
        tfv2t1.setText("");
    }//GEN-LAST:event_clearVacButtonActionPerformed

    private void tfVaccine2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfVaccine2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfVaccine2ActionPerformed

    private void deleteVacButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteVacButtonActionPerformed
        // TODO add your handling code here:
        int row = tableVaccines.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "No Row is Selected", "Please Select Row", JOptionPane.ERROR_MESSAGE);
        } else {
            //int pkid = (int)tableTeachers.getModel().getValueAt(row, 0);
            DefaultTableModel model = (DefaultTableModel) tableVaccines.getModel();
            //            String k = model.getValueAt(0, 0).toString();
            //            System.err.println(k + " is about to deleted : " + row);

            int pkid = Integer.parseInt(model.getValueAt(row, 0).toString());
            model.removeRow(row);

            System.err.println(pkid + " is deleted : " + row);
            vaccinationController.deleteVaccineById(pkid);

        }
    }//GEN-LAST:event_deleteVacButtonActionPerformed

    private void Renewal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Renewal1ActionPerformed
        // TODO add your handling code here:
        int row = tableVaccines.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "No Row is Selected", "Please Select Row", JOptionPane.ERROR_MESSAGE);
        } else {
            //int pkid = (int)tableTeachers.getModel().getValueAt(row, 0);
            DefaultTableModel model = (DefaultTableModel) tableVaccines.getModel();
            //            String k = model.getValueAt(0, 0).toString();
            //            System.err.println(k + " is about to deleted : " + row);

            int pkid = Integer.parseInt(model.getValueAt(row, 0).toString());
            //model.removeRow(row);

            System.err.println(pkid + " is selected : " + row);
            Vaccination vaccination = vaccinationController.getVaccinesById(pkid).get();
            if(vaccination.getVaccine() == null && vaccination.getVaccine2() == null){
                JOptionPane.showMessageDialog(this, "Student is to be vaccinated", "Vaccination alert", JOptionPane.ERROR_MESSAGE);
            }else if(vaccination.getV1t2() == null){
                Calendar c = Calendar.getInstance();
                c.setTime(vaccination.getV1t1());
                c.add(Calendar.MONTH, 3);
                JOptionPane.showMessageDialog(this, c.getTime().toString(), " Next Immunization date(Dose 2)", JOptionPane.ERROR_MESSAGE);
                //JOptionPane.showMessageDialog(this, "Student is to be vaccinated", "Vaccine1 dose 2 missing alert", JOptionPane.ERROR_MESSAGE);
            } else if(vaccination.getVaccine2() == null){
                Calendar c = Calendar.getInstance();
                c.setTime(vaccination.getV1t1());
                c.add(Calendar.YEAR, 1);
                JOptionPane.showMessageDialog(this, c.getTime().toString(), " Next Immunization date(Vaccine 2)", JOptionPane.ERROR_MESSAGE);
                //JOptionPane.showMessageDialog(this, "Student is to be vaccinated", "Vaccine2 missing alert", JOptionPane.ERROR_MESSAGE);
            }
            //            Calendar c = Calendar.getInstance();
            //            c.setTime(date);
            //            c.add(Calendar.YEAR, 1);
            //            JOptionPane.showMessageDialog(this, c.getTime().toString(), " Next renewal date ", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_Renewal1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Renewal1;
    private javax.swing.JButton addVacButton;
    private javax.swing.JButton clearVacButton;
    private javax.swing.JButton deleteVacButton;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tableVaccines;
    private javax.swing.JTextField tfPersonId;
    private javax.swing.JTextField tfVaccine1;
    private javax.swing.JTextField tfVaccine2;
    private javax.swing.JTextField tfv1t1;
    private javax.swing.JTextField tfv1t2;
    private javax.swing.JTextField tfv2t1;
    // End of variables declaration//GEN-END:variables
}
