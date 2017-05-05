package org.wpattern.helviorezende.provap1.productsentity;


import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.wpattern.helviorezende.provap1.utils.BaseEntity;

@Entity
@Table(name = "tb_products")
@AttributeOverride(name = "id", column=@Column(name="productid"))
public class ProductsEntity extends BaseEntity<Long>{

	private static final long serialVersionUID = 1L;
	
	@NotNull
	@Column(name = "productname", length = 40, nullable = false)
	private String productName;
	
	@NotNull
	@Column(name = "supplierid", length = 11, nullable = false)
	private int supplierId;
	
	@NotNull
	@Column(name = "categoryid", length = 11, nullable = false)
	private int categoryId;
	
	@NotNull
	@Column(name = "quantityperunit", length = 2, nullable = false)
	private int quantityPerUnit;
	
	@NotNull
	@Column(name = "unitprice", length = 11, nullable = false)
	private int unitPrice;
	
	@NotNull
	@Column(name = "unitsinstock", length = 2, nullable = false)
	private int UnitsInStock;

	@NotNull
	@Column(name = "unitsonorder", length = 2, nullable = false)
	private int UnitsOnOrder;
	
	@NotNull
	@Column(name = "reorderlevel", length = 2, nullable = false)
	private int reorderlevel;
	
	@NotNull
	@Column(name = "discontinued", length = 2, nullable = false)
	private String discontinued;
	
	public ProductsEntity(){
		
	}


	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	
	public int getSupplierId() {
		return supplierId;
	}


	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}


	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getQuantityPerUnit() {
		return quantityPerUnit;
	}


	public void setQuantityPerUnit(int quantityPerUnit) {
		this.quantityPerUnit = quantityPerUnit;
	}


	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getUnitsInStock() {
		return UnitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		UnitsInStock = unitsInStock;
	}

	public int getUnitsOnOrder() {
		return UnitsOnOrder;
	}

	public void setUnitsOnOrder(int unitsOnOrder) {
		UnitsOnOrder = unitsOnOrder;
	}

	public int getReorderlevel() {
		return reorderlevel;
	}

	public void setReorderlevel(int reorderlevel) {
		this.reorderlevel = reorderlevel;
	}

	public String getDiscontinued() {
		return discontinued;
	}

	public void setDiscontinued(String discontinued) {
		this.discontinued = discontinued;
	}
	
	
	
	


}