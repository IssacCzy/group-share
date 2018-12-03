package com.issac.controller;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {

	@RequestMapping(value = { "/", "/view" })
	public String view(Map<String, Object> map) {
		map.put("name", "SpringBoot");
		map.put("date", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		return "index";
	}

	@RequestMapping("/index/{name}")
	@ResponseBody
	public String index(@PathVariable String name){
		if(null == name){
			name = "boy";
		}
		return "hello world" + name;
	}
}