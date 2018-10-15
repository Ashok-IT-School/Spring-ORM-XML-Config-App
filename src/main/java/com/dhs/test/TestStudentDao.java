package com.dhs.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dhs.dao.StudentDao;
import com.dhs.entity.Student;

public class TestStudentDao {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");

		StudentDao dao = ctx.getBean("dao", StudentDao.class);

		Student s = new Student();
		s.setName("raju");
		s.setEmail("raju@gmail.com");

		dao.saveStudent(s);
		System.out.println("Inserted successfully");
	}

}
