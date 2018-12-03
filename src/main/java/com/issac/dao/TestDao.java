package com.issac.dao;

import com.issac.domain.Test;

public interface TestDao {
	int insert(Test test);

	Test queryTest(Integer id);

	int delete(Integer id);
}
