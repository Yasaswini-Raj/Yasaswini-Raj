package com;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



public class StudentDAO {
	public void saveStudentData(StudentBean student) {
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(StudentBean.class)
									.buildSessionFactory();
		
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.save(student);
		session.getTransaction().commit();
		session.close();
	}
	
	public void getStudentData(int rollno) {
		
		
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(StudentBean.class)
									.buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.getTransaction().begin();
		
		StudentBean student = session.get(StudentBean.class,rollno);
		//System.out.println(student.getStudentRollno()  +" "+student.getFname()+" "+student.getLname()+" "+student.getStudentMid());
		System.out.println(student.toString());
		session.getTransaction().commit();

}
	public void getStudentDataBasedonPrimaryKeys() {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(StudentBean.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.getTransaction().begin();
		Query query = session.createQuery("FROM StudentBean as s where s.studentRollno=:studentRollno");
		query.setParameter("studentRollno", 101);
		
		
		List<StudentBean> students = query.list();
		for(StudentBean student: students) {
			System.out.println(student.getStudentRollno()+" "+student.getFname()+" "+student.getLname()+" "+student.getStudentMid());
		}
		
		session.getTransaction().commit();
	}
}
