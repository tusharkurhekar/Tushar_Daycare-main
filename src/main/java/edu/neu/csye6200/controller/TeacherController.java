package edu.neu.csye6200.controller;

import edu.neu.csye6200.model.Teacher;
import edu.neu.csye6200.service.TeacherService;
import edu.neu.csye6200.util.DummyDataUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * bipin : 12/11/21 : Created the class
 */

@Component
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    public void addDummyData(){

        teacherService.saveTeachers(new DummyDataUtil().populateTeacherData("/Users/bipin/CodeGround/sem1/csye6200/daycare/src/main/resources/Teachers.csv"));
    }

    public void printAllTeachers(){
        teacherService.getAllTeachers().forEach(System.out::println);
    }

    public List<Teacher> getAllTeachers(){
        return teacherService.getAllTeachers();
    }
    public void deleteTeacherById(Integer id){
        teacherService.deleteTeacherById(id);
    }
    public Optional<Teacher> getTeacherById(Integer id){
        return teacherService.getTeacherById(id);
    }

    public void addTeacher(String csv){
        teacherService.saveTeacher(csv);
    }


}
