/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.controller;

import edu.neu.csye6200.model.Vaccination;
import edu.neu.csye6200.service.VaccinationService;
import edu.neu.csye6200.util.DummyDataUtil;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author bipin
 */
@Component
public class VaccinationController {
    @Autowired
    VaccinationService vaccinationService;

    public void addDummyData(){
        vaccinationService.saveVaccinations(new DummyDataUtil().populateVaccineData("/Users/bipin/CodeGround/sem1/csye6200/daycare/src/main/resources/Vaccines.csv"));
    }

    public void printAllVaccines(){
        vaccinationService.getAllVaccinations().forEach(System.out::println);
    }

    public List<Vaccination> getAllVaccines(){
        return vaccinationService.getAllVaccinations();
    }
    public void deleteVaccineById(Integer id){
        vaccinationService.deleteVaccinationsById(id);
    }
    public Optional<Vaccination> getVaccinesById(Integer id){
        return vaccinationService.getVaccinationById(id);
    }

    public void addVaccine(String csv){
        vaccinationService.saveVaccination(csv);
    }
}
