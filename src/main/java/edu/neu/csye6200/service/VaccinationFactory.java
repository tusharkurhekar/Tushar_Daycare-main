/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.service;
import edu.neu.csye6200.model.Vaccination;

/**
 *
 * @author sai chand
 */
public class VaccinationFactory {
    public Vaccination getObject(String csvData) {
        return new Vaccination(csvData);
    }
}
