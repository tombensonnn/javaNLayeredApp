package javaNLayeredApp.business;

import java.util.List;

import javaNLayeredApp.core.logging.Logger;
import javaNLayeredApp.dataAccess.abstracts.CategoryDao;
import javaNLayeredApp.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private List<Logger> loggers;
	
	
	public CategoryManager(CategoryDao categoryDao, List<Logger> loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	
	public void add(Category category) {
		categoryDao.add(category);
		
		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	}
}
