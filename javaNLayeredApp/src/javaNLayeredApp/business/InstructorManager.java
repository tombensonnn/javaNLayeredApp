package javaNLayeredApp.business;

import java.util.List;

import javaNLayeredApp.core.logging.Logger;
import javaNLayeredApp.dataAccess.abstracts.InstructorDao;
import javaNLayeredApp.entities.Instructor;

public class InstructorManager {

	private InstructorDao instructorDao;
	private List<Logger> loggers;
	
	
	public InstructorManager(InstructorDao instructorDao, List<Logger> loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	} 
	
	public void add(Instructor instructor) {
		
		instructorDao.add(instructor);
		
		for (Logger logger : loggers) {
			logger.log(instructor.getName());
		}
	}
	
	
}
