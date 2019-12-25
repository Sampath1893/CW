package org.campuswizard.repos;

import org.campuswizard.model.Employees;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeesRepo extends MongoRepository<Employees, String> {
	
	public Employees findByEmpidAndPassword(String empid,String password);

}
