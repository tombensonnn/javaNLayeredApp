package javaNLayeredApp.dataAccess.concretes.hibernate;

import javaNLayeredApp.dataAccess.abstracts.InstructorDao;
import javaNLayeredApp.entities.Instructor;

public class HibernateInstructorDao  implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Instructor added with hibernate");
		
	}

}
