package javaNLayeredApp.dataAccess.concretes.jdbc;

import javaNLayeredApp.dataAccess.abstracts.InstructorDao;
import javaNLayeredApp.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Instructor added with JDBC");
		
	}

}
