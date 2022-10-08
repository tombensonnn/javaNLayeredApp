package javaNLayeredApp.dataAccess.concretes.hibernate;

import javaNLayeredApp.dataAccess.abstracts.CourseDao;
import javaNLayeredApp.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Course added with hibernate");
		
	}

}
