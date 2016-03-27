package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping("/newp2p/singing")
public class MelodyController {

	@RequestMapping(method = RequestMethod.GET)
	public String singing(ModelMap model){
		model.addAttribute("name", "R.Kelly");
		return "hello";
	}
}
