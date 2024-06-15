package com.korea.di;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ParamController {
	
	@RequestMapping(value= {"/","/insert_form"})
	public String insert_form() {
		return "insert_form";
	}
}
