package com.example.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService{
	
	private static final Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);
	
	@Autowired
	private TestMapper testMapper;
	
	public TestObject findUserById(Integer id) {
		TestObject user=testMapper.findUserById(id);
		return user;
	}
	
	
}
