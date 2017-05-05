package org.wpattern.helviorezende.provap1.orderdetailsentity;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.wpattern.helviorezende.provap1.utils.BaseEntity;

@Entity
@Table(name = "tb_orderdetails")
@AttributeOverride(name = "id", column = @Column(name="id"))
public class OrderDetailsEntity extends BaseEntity<Long>{
	private static final long serialVersionUID = 1L;
	
	@NotNull
	@Column(name = "orderid", nullable = false)
	private int orderId;
	
	@NotNull
	@Column(name = "productid", nullable = false)
	private int productId;
	
	@NotNull
	@Column(name = "unitprice", nullable = false)
	private int UnitPrice;
	
	@NotNull
	@Column(name = "quantity", length = 2, nullable = false)
	private int quantity;
	
	@NotNull
	@Column(name = "discount", nullable = false)
	private int discount;

	public OrderDetailsEntity() {
		
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public int getProductId() {
		return productId;
	}



	public void setProductId(int productId) {
		this.productId = productId;
	}



	public int getUnitPrice() {
		return UnitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		UnitPrice = unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	
	
}
