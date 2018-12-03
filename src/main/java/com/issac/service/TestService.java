package com.issac.service;

import com.issac.domain.Test;

public interface TestService {
	int insert(Test test);

	Test queryTest(Integer id);

	int delete(Integer id);
}
