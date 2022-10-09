package javaNLayeredApp.business.concretes;

import java.util.List;

import javaNLayeredApp.business.abstracts.InstructorService;
import javaNLayeredApp.core.logging.Logger;
import javaNLayeredApp.dataAccess.abstracts.InstructorDao;
import javaNLayeredApp.entities.Instructor;

public class InstructorManager implements InstructorService {

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
