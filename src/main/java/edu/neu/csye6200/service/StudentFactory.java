package edu.neu.csye6200.service;
import edu.neu.csye6200.model.*;

/**
 * bipin : 12/11/21 : Created the class
 */
public class StudentFactory extends AbstractPersonFactory<Student>{
        
    @Override
    public Student getObject(String csvData) {
        return new Student(csvData);
    }
    
    @Override
    public Student getObject() {
        // TODO Auto-generated method stub
        return new Student();
    }
}
