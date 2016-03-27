package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.service.IIndexService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.logging.Logger;
import com.opensymphony.xwork2.util.logging.LoggerFactory;
public class IndexAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3227129709664558847L;

	private static final Logger logger = LoggerFactory.getLogger(IndexAction.class);
	private String name = "Judy.Hopps";
	
	@Autowired private IIndexService indexService;
	
	public String index(){
		logger.info(name);
		name = name.concat(indexService.test());
		return SUCCESS;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
