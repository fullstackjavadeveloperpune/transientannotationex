package com.fullstack.jpa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Service {

	private static SessionFactory factory = new Configuration().configure().buildSessionFactory();

	public static void main(String[] args) {

		// save();
		
		findById(1);

	}

	static void save() {
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		Employee employee = new Employee("SWARA", 97000.96, 9);

		session.save(employee);

		transaction.commit();
	}

	static void findById(int empId) {

		Session session = factory.openSession();

		Employee employee = session.get(Employee.class, empId);

		System.out.println(employee);
	}

}
