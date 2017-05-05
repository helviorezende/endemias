package org.wpattern.helviorezende.provap1.ordersentity;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.wpattern.helviorezende.provap1.utils.BaseEntity;

@Entity
@Table(name = "tb_orders")
@AttributeOverride(name = "id", column=@Column(name="orderid"))
public class OrdersEntity extends BaseEntity<Long>{
	
	private static final long serialVersionUID = 1L;		
	
	@NotNull
	@Column(name = "customerid", length = 10, nullable = false)
	private String customerId;
	
	@NotNull
	@Column(name = "employeeid", length = 11, nullable = false)
	private int employeeId;
	
	@NotNull
	@Column(name = "orderdate", length = 8, nullable = false)
	private String orderDate;
	
	@NotNull
	@Column(name = "requireddate", length = 8, nullable = false)
	private String requiredDate;
	
	@NotNull
	@Column(name = "shippeddate", length = 8, nullable = false)
	private String shippedDate;
	
	@NotNull
	@Column(name = "shipvia", length = 11, nullable = false)
	private int shipVia;
	
	@NotNull
	@Column(name = "freight", nullable = false)
	private int Freight;
	
	@NotNull
	@Column(name = "shipname", length = 40, nullable = false)
	private String shipName;
	
	@NotNull
	@Column(name = "shipaddress", length = 60, nullable = false)
	private String shipAddress;
	
	@NotNull
	@Column(name = "shipcity", length = 15, nullable = false)
	private String shipCity;
	
	@NotNull
	@Column(name = "shipregion", length = 15, nullable = false)
	private String shipRegion;
	
	@NotNull
	@Column(name = "shippostalcode", length = 10, nullable = false)
	private String shipPostalCode;
	
	@NotNull
	@Column(name = "shipcountry", length = 15, nullable = false)
	private String shipCountry;

	public OrdersEntity() {
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getRequiredDate() {
		return requiredDate;
	}

	public void setRequiredDate(String requiredDate) {
		this.requiredDate = requiredDate;
	}

	public String getShippedDate() {
		return shippedDate;
	}

	public void setShippedDate(String shippedDate) {
		this.shippedDate = shippedDate;
	}

	public int getShipVia() {
		return shipVia;
	}

	public void setShipVia(int shipVia) {
		this.shipVia = shipVia;
	}

	public int getFreight() {
		return Freight;
	}

	public void setFreight(int freight) {
		Freight = freight;
	}

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public String getShipAddress() {
		return shipAddress;
	}

	public void setShipAddress(String shipAddress) {
		this.shipAddress = shipAddress;
	}

	public String getShipCity() {
		return shipCity;
	}

	public void setShipCity(String shipCity) {
		this.shipCity = shipCity;
	}

	public String getShipRegion() {
		return shipRegion;
	}

	public void setShipRegion(String shipRegion) {
		this.shipRegion = shipRegion;
	}

	public String getShipPostalCode() {
		return shipPostalCode;
	}

	public void setShipPostalCode(String shipPostalCode) {
		this.shipPostalCode = shipPostalCode;
	}

	public String getShipCountry() {
		return shipCountry;
	}

	public void setShipCountry(String shipCountry) {
		this.shipCountry = shipCountry;
	}

	
}
