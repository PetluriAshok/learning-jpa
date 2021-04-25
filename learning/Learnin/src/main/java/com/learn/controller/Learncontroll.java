package com.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.model.MobileSpecs;
import com.learn.repository.Mobilespecsrepo;

@RestController
public class Learncontroll {

	@Autowired
	private Mobilespecsrepo mobilespecsrepo;

	@RequestMapping("/")
	public String string() {

		return "xgyhujkhvgf";

	}

	@RequestMapping("/specs")
	public List<MobileSpecs> getspecs() {

		return mobilespecsrepo.getallspecs();

	}

}
