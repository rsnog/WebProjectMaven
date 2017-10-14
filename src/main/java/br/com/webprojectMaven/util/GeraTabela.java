package br.com.webprojectMaven.util;

import org.hibernate.Session;

public class GeraTabela {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.close();

		// // create session factory
		// SessionFactory factory = new Configuration()
		// .configure("hibernate.cfg.xml")
		// .addAnnotatedClass(Departamento.class)
		// .buildSessionFactory();
		//
		// // create session
		// Session session = factory.getCurrentSession();
		//
		// try {
		// // create a student object
		// System.out.println("Creating new Departamento object...");
		// Departamento tempDep = new Departamento("InfoDev", 34.7);
		//
		// // start a transaction
		// session.beginTransaction();
		//
		// // save the student object
		// System.out.println("Saving the Depto...");
		// session.save(tempDep);
		//
		// // commit transaction
		// session.getTransaction().commit();
		//
		// System.out.println("Done!");
		// }
		// finally {
		// factory.close();
		// }
		// }

	}
}
