package org.wpattern.helviorezende.provap1.categoriesentity;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.wpattern.helviorezende.provap1.utils.BaseEntity;

@Entity
@Table(name = "tb_categories")
@AttributeOverride(name = "id", column = @Column(name = "categoryid"))
public class CategoriesEntity extends BaseEntity<Long>{
	
	private static final long serialVersionUID = 1L;
	
	@NotNull
	@Column(name = "categoryname", length = 15, nullable = false)
	private String categoryName;

	@NotNull
	@Column(name = "description", length = 15,nullable = false)
	private String Description;
	
	public CategoriesEntity() {
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
}
