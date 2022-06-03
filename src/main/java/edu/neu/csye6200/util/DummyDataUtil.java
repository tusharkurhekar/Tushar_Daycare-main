package edu.neu.csye6200.util;

import edu.neu.csye6200.model.Student;
import edu.neu.csye6200.model.Teacher;
import edu.neu.csye6200.model.Vaccination;
import edu.neu.csye6200.service.*;




import java.util.ArrayList;
import java.util.List;

/**
 * bipin : 12/11/21 : Created the class
 */
public class DummyDataUtil {
    TeacherFactory tf = new TeacherFactory();
    StudentFactory sf = new StudentFactory();
    VaccinationFactory vf = new VaccinationFactory();
    
    public List<Teacher> populateTeacherData(String csv){
        List<Teacher> teachers = new ArrayList<>();
        List<String> teacherCsv = FileUtil.readCsv(csv);
        for(String teacherString : teacherCsv){
            teachers.add(tf.getObject(teacherString));
        }
        return teachers;
    }
    public List<Student> populateStudentData(String csv){
        List<Student> students = new ArrayList<>();
        List<String> studentCsvs = FileUtil.readCsv(csv);
        for(String studentString : studentCsvs){
            students.add(sf.getObject(studentString));
        }
        return students;
    }
    public List<Vaccination> populateVaccineData(String csv){
        List<Vaccination> vaccines = new ArrayList<>();
        List<String> vaccineCsvs = FileUtil.readCsv(csv);
        for(String vaccineString : vaccineCsvs){
            vaccines.add(vf.getObject(vaccineString));
        }
        return vaccines;
    }
}
