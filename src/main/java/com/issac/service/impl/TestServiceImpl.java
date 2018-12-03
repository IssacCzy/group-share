package com.issac.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.issac.dao.TestDao;
import com.issac.domain.Test;
import com.issac.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Resource
	private TestDao testDao;

	@Override
	public int insert(Test test) {
		return testDao.insert(test);
	}

	@Override
	public Test queryTest(Integer id) {
		return testDao.queryTest(id);
	}

	@Override
	public int delete(Integer id) {
		return testDao.delete(id);
	}

}
