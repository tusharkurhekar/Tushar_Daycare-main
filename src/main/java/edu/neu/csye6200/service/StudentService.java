package edu.neu.csye6200.service;

import edu.neu.csye6200.model.Student;
import edu.neu.csye6200.repository.StudentRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * bipin : 12/11/21 : Created the class
 */
@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    StudentFactory sf = new StudentFactory();
    public List<Student> getAllStudents(){
        List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(students::add);
        return students;
    }

    public void saveStudents(List<Student> students){
        studentRepository.saveAll(students);
    }

    public void saveStudent(Student student){
        studentRepository.save(student);
    }

    public void saveStudent(String csv){
        studentRepository.save(sf.getObject(csv));
    }

    public Optional<Student> getStudentById(Integer id){
        return studentRepository.findById(id);
    }

    public void deleteStudentById(Integer id){
        studentRepository.deleteById(id);
    }
}
