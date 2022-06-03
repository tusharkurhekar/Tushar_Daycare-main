/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.neu.csye6200.repository;

import edu.neu.csye6200.model.Vaccination;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author bipin
 */
@Repository
public interface VaccinationRepository extends CrudRepository<Vaccination, Integer>{
    
}
