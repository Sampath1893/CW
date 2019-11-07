package org.campuswizard.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@RequestMapping(value = "/login")
    public ArrayList<String> getLogin(@RequestParam String username,
            @RequestParam String password) {

		ArrayList<String> al=new ArrayList<String>();
		 System.out.println(username);
		 System.out.println(password);
		
		 al.add(username);
		 al.add(password);
		return al;
		
        
    }

}
