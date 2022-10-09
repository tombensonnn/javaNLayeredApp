package javaNLayeredApp.business.concretes;

import java.util.List;

import javaNLayeredApp.business.abstracts.CourseService;
import javaNLayeredApp.core.logging.Logger;
import javaNLayeredApp.dataAccess.abstracts.CourseDao;
import javaNLayeredApp.entities.Course;

public class CourseManager implements CourseService {
	private CourseDao courseDao;
	private List<Logger> loggers;
	private List<Course> courses;
	
	
	public CourseManager(CourseDao courseDao, List<Logger> loggers, List<Course> courses) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}
	
	public void add(Course course) throws Exception {       
		
		for (Course courseMember : courses) {
			if(courseMember.getCourseName().equals(course.getCourseName())) {
				throw new Exception("Course name cannot be same previous courses");
			}
		}
		
		if(course.getPrice()<0) {
			throw new Exception("Course price cannot be less than 0");
		}
		
		
		courseDao.add(course);
		courses.add(course);
		
		
		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}
	
}
