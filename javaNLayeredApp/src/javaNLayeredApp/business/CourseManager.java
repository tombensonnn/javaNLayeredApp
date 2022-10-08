package javaNLayeredApp.business;

import java.util.List;

import javaNLayeredApp.core.logging.Logger;
import javaNLayeredApp.dataAccess.abstracts.CourseDao;
import javaNLayeredApp.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private List<Logger> loggers;
	
	
	public CourseManager(CourseDao courseDao, List<Logger> loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) {
		courseDao.add(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}
	
}
