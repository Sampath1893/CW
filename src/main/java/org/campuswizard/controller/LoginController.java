package org.campuswizard.controller;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin(origins="http://campuswizard-stage.surge.sh/")
@RestController
public class LoginController {
	
	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json")
    public void getLogin(@RequestBody testBean request) {
		
System.out.println("its going in ");
		System.out.println(request.getUsername());
		
        
    }

}
