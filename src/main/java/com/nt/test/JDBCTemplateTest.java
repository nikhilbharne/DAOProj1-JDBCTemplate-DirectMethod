package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.nt.service.EmployeeService;

public class JDBCTemplateTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeService service=null;
		//Create Container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//Target Beans
		service=ctx.getBean("empService",EmployeeService.class);
		
		//Invoke Method
		System.out.println("Emp Count"+service.fetchEmpCount());
		
		//close Container
		((AbstractApplicationContext) ctx).close();
		
	}//main

}//class
