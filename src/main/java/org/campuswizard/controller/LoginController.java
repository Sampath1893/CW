package org.campuswizard.controller;

import org.campuswizard.model.Employees;
import org.campuswizard.repos.EmployeesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.EntityResponse;



@CrossOrigin(origins="*")
@RestController
public class LoginController {
	
	@Autowired EmployeesRepo employeesRepo;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<?> getLogin(@RequestBody Employees request) {
		
		Employees empResult=employeesRepo.findByEmpidAndPassword(request.getEmpid(), request.getPassword());
		
		if(empResult != null) {
			return new ResponseEntity<>(empResult, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>("Bad Credentials", HttpStatus.BAD_REQUEST);
		}
    }

}
