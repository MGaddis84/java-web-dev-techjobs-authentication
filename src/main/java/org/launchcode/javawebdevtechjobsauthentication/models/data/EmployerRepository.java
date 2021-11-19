package org.launchcode.javawebdevtechjobsauthentication.models.data;

import org.launchcode.javawebdevtechjobsauthentication.models.Employer;
import org.launchcode.javawebdevtechjobsauthentication.models.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

@Repository
public interface EmployerRepository extends CrudRepository<Employer, Integer> {

}
