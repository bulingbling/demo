package com.example.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.TestObject;
import com.example.test.TestService;
import com.example.test.TestServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

/**
 * 
 */
@RestController
@RequestMapping("api")
@Api("swaggerDemoController related api")
public class SwaggerDemoController {
 
    private static final Logger logger= LoggerFactory.getLogger(SwaggerDemoController.class);
 
    @Autowired
    private TestServiceImpl userService;
 
    @ApiOperation(value = "findUserByIda", notes = "findUserByIdNotea",tags = "user")
 //   @ApiImplicitParam(name = "id", value = "USERID", paramType = "path", required = true, dataType = "Integer")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public TestObject getStudent(@PathVariable int id) {
        logger.info("开始查询某个学生信息");
        return userService.findUserById(id);
    }
 
 
}
