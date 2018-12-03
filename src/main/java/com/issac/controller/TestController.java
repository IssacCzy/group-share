package com.issac.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.issac.domain.Test;
import com.issac.service.TestService;

@RestController
@EnableAutoConfiguration
@RequestMapping("/test")
public class TestController {

	@Resource
	private TestService testService;

	@RequestMapping("/queryTest")
	public Test queryTest(HttpServletRequest request, Model model) {
		int testId = Integer.parseInt(request.getParameter("id"));
		Test test = testService.queryTest(testId);
		return test;
	}
	
	@RequestMapping("/insert")
	public int insert(HttpServletRequest request, Model model) {
		String testName = request.getParameter("name");
		int insert_result = testService.insert(new Test(testName));
		return insert_result;
	}
}
