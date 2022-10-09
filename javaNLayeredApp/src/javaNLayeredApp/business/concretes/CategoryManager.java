package javaNLayeredApp.business.concretes;

import java.util.List;

import javaNLayeredApp.business.abstracts.CategoryService;
import javaNLayeredApp.core.logging.Logger;
import javaNLayeredApp.dataAccess.abstracts.CategoryDao;
import javaNLayeredApp.entities.Category;

public class CategoryManager implements CategoryService {
	private CategoryDao categoryDao;
	private List<Logger> loggers;
	private List<Category> categories;
	
	
	public CategoryManager(CategoryDao categoryDao, List<Logger> loggers, List<Category> categories) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}
	
	
	public void add(Category category) throws Exception {
		
		for (Category categoryMember : categories) {
			if(categoryMember.getCategoryName().equals(category.getCategoryName())) {
				throw new Exception("Category name cannot be same previous categories");
			}
		}
		
		categoryDao.add(category);
		categories.add(category);
		
		
		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	}
}
