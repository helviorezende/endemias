package org.wpattern.test.helviorezende.provap1.categories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wpattern.helviorezende.provap1.categoriesentity.CategoriesEntity;
import org.wpattern.helviorezende.provap1.categoriesentity.CategoriesRepository;
import org.wpattern.test.helviorezende.provap1.AbstractTest;

public class CategoriesRepositoryTest extends AbstractTest{
	
	private static final Logger LOGGER = Logger.getLogger(CategoriesRepositoryTest.class);
	
	@Autowired
	private CategoriesRepository categoriesrepository;
	
	@Test
	public void findAllTest(){
		List<CategoriesEntity> categories = this.categoriesrepository.findAll();
		LOGGER.info("FindAll():" + categories);
	}
	
	@Test
	public void testInsert(){
CategoriesEntity categoriespacote = new CategoriesEntity();
		
		categoriespacote.setCategoryName("processador");
		categoriespacote.setDescription("core i3");
		
	
		categoriespacote = this.categoriesrepository.save(categoriespacote);				
		LOGGER.info (categoriespacote + " " );
	}
	
	@Test
	public void updateCategories() {
		CategoriesEntity categories = categoriesrepository.findOne(2L);
		categories.setCategoryName("mesa");
		categoriesrepository.save(categories);
		LOGGER.info("Update categories: " + this.categoriesrepository.findAll());
		}
	
	@Test
	public void deleteCategories() {
		this.categoriesrepository.delete(1L);
		List<CategoriesEntity> categories = this.categoriesrepository.findAll();
		LOGGER.info("Categories delete: " + categories);
	}
	
	

}
