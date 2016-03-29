package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.service.IIndexService;
@Controller
@RequestMapping("/newp2p/melody")
public class MelodyController {
	@Autowired private IIndexService indexService;
	@RequestMapping(value="sing", method = RequestMethod.GET)
	public String singing(ModelMap model){
		model.addAttribute("name", "R.Kelly");
		return "hello";
	}
	@RequestMapping(value="chris", method=RequestMethod.GET)
	public String chrisBrown(Model model){
		List<String> allAlbums = indexService.listAllAlbums();
		model.addAttribute("allAlbums", allAlbums);
		return "index";
	}
}
