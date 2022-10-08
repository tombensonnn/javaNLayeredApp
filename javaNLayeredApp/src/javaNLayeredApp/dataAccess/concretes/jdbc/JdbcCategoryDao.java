package javaNLayeredApp.dataAccess.concretes.jdbc;

import javaNLayeredApp.dataAccess.abstracts.CategoryDao;
import javaNLayeredApp.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Category added with JDBC");
		
	}

}
