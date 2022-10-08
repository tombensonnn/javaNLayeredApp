package javaNLayeredApp.dataAccess.concretes.jdbc;

import javaNLayeredApp.dataAccess.abstracts.CourseDao;
import javaNLayeredApp.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Course added with JDBC");
		
	}

}
