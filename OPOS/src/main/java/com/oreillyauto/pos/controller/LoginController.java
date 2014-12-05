package com.oreillyauto.pos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "login")
public class LoginController {

	@RequestMapping(method = RequestMethod.GET, value = "/login")
	public String newLogin(@RequestParam String username, ModelMap model) {

		model.addAttribute("username", username);

		return "mainMenu";
	}

	public void userName() {
		// No clue what to put here
	}

	public void password() {

	}

}
