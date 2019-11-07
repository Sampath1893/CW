package org.campuswizard.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/login")
    public ArrayList getLogin(@RequestParam String username,
            @RequestParam String password) {

		ArrayList al=new ArrayList();
		 System.out.println(username);
		 System.out.println(password);
		
		 al.add(username);
		 al.add(password);
		return al;
		
        
    }

}
