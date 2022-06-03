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
import edu.neu.csye6200.model.Student;
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
public class StudentsjPanel extends javax.swing.JPanel {

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

    
    public StudentsjPanel() {
        initComponents();
    }

    @PostConstruct
    public void init() {
        try {
            populateStudent();
        } catch (Exception c) {
            c.printStackTrace();
            System.out.println("Something Went Wrong!");
        }
    }
    
    public void populateStudent() {
        List<Student> students = studentController.getAllStudents();

        if (students.size() == 0) {
            studentController.addDummyData();
            // add students to classes

            List<Student> newStudents = studentController.getAllStudents();
            newStudents.forEach(s -> {

                Classroom classRoom = ClassroomFactory.getClassRoom(s.getAge());
                classRoom.addStudentId(s.getId());

            });

        } else {
            DefaultTableModel model = (DefaultTableModel) tableStudents.getModel();

            if (model.getRowCount() == 0) {
                students.forEach(t -> {
                    model.addRow(new Object[]{t.getId(), t.getName(), t.getAge(), t.getParentName(), t.getPhoneNumber(), t.getRegistrationDate()});
//                      Classroom classRoom = ClassroomFactory.getClassRoom(t.getAge());
//                classRoom.addStudentId(t.getId());
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

        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfAge = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfParentName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfDate = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        tfParentContact = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableStudents = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        Renewal = new java.awt.Button();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(800, 720));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New Student", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel3.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Id");

        tfId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfId.setToolTipText("");
        tfId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Name");

        tfName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfName.setToolTipText("");
        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Age");

        tfAge.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfAge.setToolTipText("");
        tfAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAgeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Parent Name");

        tfParentName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfParentName.setToolTipText("");
        tfParentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfParentNameActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Parent Contact");

        tfDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfDate.setToolTipText("");
        tfDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDateActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Registration Date");

        tfParentContact.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfParentContact.setToolTipText("");
        tfParentContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfParentContactActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tfAge, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(tfId)
            .addComponent(tfName, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tfParentName, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
            .addComponent(tfDate, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
            .addComponent(tfParentContact)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfParentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfParentContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnClear)))
        );

        tableStudents.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tableStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Age", "Parent Name", "Parent Contact", "Reg_Date"
            }
        ));
        jScrollPane1.setViewportView(tableStudents);

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        Renewal.setLabel("Renew");
        Renewal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RenewalActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(153, 255, 153));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("List of Students:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Renewal, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Renewal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdActionPerformed

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameActionPerformed

    private void tfAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAgeActionPerformed

    private void tfParentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfParentNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfParentNameActionPerformed

    private void tfDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String id = tfId.getText();
        String age = tfAge.getText();
        String name = tfName.getText();
        String parentName = tfParentName.getText();
        String parentContact = tfParentContact.getText();
        String rd = tfDate.getText();

        Classroom classRoom = classroomFactory.getClassRoom(Integer.parseInt(age));
        System.out.print("classr room id is : " + classRoom.getClassId());

        int studentCount = classRoom.getStudentIdList().size();
        int teacherCount = classRoom.getTeacherIdList().size();

        float ratio = (float)studentCount / (float)teacherCount;
        System.out.println("counts in class beofr addition : "+ studentCount + " : "+ teacherCount);
        System.out.println("current ration of class will be : "+ ratio + " .Ideal : "+ classRoom.getGroupsize());

        if (ratio >= classRoom.getGroupsize()) {
            JOptionPane.showMessageDialog(this, "ClassRoom Limit is Reached", "Increase Teacher Count", JOptionPane.ERROR_MESSAGE);
        } else { 

            if (id.isEmpty() || age.isEmpty() || name.isEmpty() || parentName.isEmpty() || parentContact.isEmpty() || rd.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Enter All Fields", "Try Again", JOptionPane.ERROR_MESSAGE);
            } else {
                DefaultTableModel model = (DefaultTableModel) tableStudents.getModel();
                model.addRow(new Object[]{id, name, age, parentName, parentContact, rd});
            }

            tfId.setText("");
            tfAge.setText("");
            tfName.setText("");
            tfParentName.setText("");
            tfParentContact.setText("");
            tfDate.setText("");

            String grade = "4";
            String addr = "Boston";
            String email = "kid@neu.edu";
            String csv = id + "," + name + "," + age + "," + grade + "," + rd + "," + parentName + "," + addr + "," + parentContact + "," + email;
            System.err.println(csv + "is added to student db");

            studentController.addStudent(csv);

            classRoom.addStudentId(Integer.parseInt(id));

            ClassroomFactory.showAllClassrooms();

        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        tfId.setText("");
        tfAge.setText("");
        tfName.setText("");
        tfParentName.setText("");
        tfParentContact.setText("");
        tfDate.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void tfParentContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfParentContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfParentContactActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
//        int row = tableStudents.getSelectedRow();
//
//        if (row < 0 ) {
//            JOptionPane.showMessageDialog(this, "No Row is Selected", "Please Select Row", JOptionPane.ERROR_MESSAGE);
//        } else {
//            DefaultTableModel model = (DefaultTableModel)tableStudents.getModel();
//            model.removeRow(row);
//        }

        int row = tableStudents.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "No Row is Selected", "Please Select Row", JOptionPane.ERROR_MESSAGE);
        } else {
            //int pkid = (int)tableTeachers.getModel().getValueAt(row, 0);
            DefaultTableModel model = (DefaultTableModel) tableStudents.getModel();
//            String k = model.getValueAt(0, 0).toString();
//            System.err.println(k + " is about to deleted : " + row);

            int pkid = Integer.parseInt(model.getValueAt(row, 0).toString());
            model.removeRow(row);

            System.err.println(pkid + " is deleted : " + row);
            int age = studentController.getStudentById(pkid).get().getAge();
            studentController.deleteStudentById(pkid);

            Classroom classRoom = classroomFactory.getClassRoom(age);
            classRoom.removeStudentId(pkid);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void RenewalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RenewalActionPerformed
        // TODO add your handling code here:
        int row = tableStudents.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "No Row is Selected", "Please Select Row", JOptionPane.ERROR_MESSAGE);
        } else {
            //int pkid = (int)tableTeachers.getModel().getValueAt(row, 0);
            DefaultTableModel model = (DefaultTableModel) tableStudents.getModel();
//            String k = model.getValueAt(0, 0).toString();
//            System.err.println(k + " is about to deleted : " + row);

            int pkid = Integer.parseInt(model.getValueAt(row, 0).toString());
            //model.removeRow(row);

            System.err.println(pkid + " is selected : " + row);
            Date date = studentController.getStudentById(pkid).map(t -> t.getRegistrationDate()).get();
            Calendar c = Calendar.getInstance();
            c.setTime(date);
            c.add(Calendar.YEAR, 1);
            JOptionPane.showMessageDialog(this, c.getTime().toString(), " Next renewal date ", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_RenewalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Renewal;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableStudents;
    private javax.swing.JTextField tfAge;
    private javax.swing.JTextField tfDate;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfParentContact;
    private javax.swing.JTextField tfParentName;
    // End of variables declaration//GEN-END:variables
}
