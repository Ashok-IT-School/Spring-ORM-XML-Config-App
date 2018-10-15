package com.dhs.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.dhs.entity.Student;

@Transactional(readOnly = false)
public class StudentDao {
	private HibernateTemplate ht;

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	public boolean saveStudent(Student s) {
		ht.save(s);
		return true;
	}

}
