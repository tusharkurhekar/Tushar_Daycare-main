package edu.neu.csye6200.repository;

import edu.neu.csye6200.model.AbstractPerson;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * bipin : 12/11/21 : Created the class
 */
@NoRepositoryBean
public interface AbstractPersonRepository<T extends AbstractPerson> extends CrudRepository<T, Integer> {
}
