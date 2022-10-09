package javaNLayeredApp;

import java.util.ArrayList;
import java.util.List;

import javaNLayeredApp.business.concretes.CourseManager;
import javaNLayeredApp.core.logging.DatabaseLogger;
import javaNLayeredApp.core.logging.EmailLogger;
import javaNLayeredApp.core.logging.FileLogger;
import javaNLayeredApp.core.logging.Logger;
import javaNLayeredApp.dataAccess.abstracts.CourseDao;
import javaNLayeredApp.dataAccess.concretes.hibernate.HibernateCourseDao;
import javaNLayeredApp.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {		
		Course course1 = new Course(1, "Java", 15);
		Course course2 = new Course(2, "C#", 20);
		Course course3 = new Course(3, "Python", 17);
		Course course4 = new Course(4, "Kotlin", 21);
		
		List<Course> courses = new ArrayList<Course>();
		
		
		courses.add(course1);
		courses.add(course2);
		courses.add(course3);
		
		Logger databaseLogger = new DatabaseLogger();
		Logger fileLogger = new FileLogger();
		Logger emailLogger = new EmailLogger();
		
		List<Logger> loggers = new ArrayList<Logger>();
		
		loggers.add(emailLogger);
		loggers.add(fileLogger);
		loggers.add(databaseLogger);
		
		
		

		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers, courses);
		courseManager.add(course4);
		
		
		
		
		
		
		
	}

}
