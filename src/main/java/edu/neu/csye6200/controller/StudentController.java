package edu.neu.csye6200.controller;

import edu.neu.csye6200.model.Student;
import edu.neu.csye6200.service.StudentService;
import edu.neu.csye6200.util.DummyDataUtil;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * bipin : 12/11/21 : Created the class
 */
@Component
public class StudentController {
    @Autowired
    StudentService studentService;

    public void addDummyData(){

        studentService.saveStudents(new DummyDataUtil().populateStudentData("/Users/bipin/CodeGround/sem1/csye6200/daycare/src/main/resources/Students.csv"));
    }

    public void printAllStudents(){
        studentService.getAllStudents().forEach(System.out::println);
    }

    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    public void deleteStudentById(Integer id){
        studentService.deleteStudentById(id);
    }
    public Optional<Student> getStudentById(Integer id){
        return studentService.getStudentById(id);
    }

    public void addStudent(String csv){
        studentService.saveStudent(csv);
    }
}
