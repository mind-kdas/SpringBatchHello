package com.kdas;

import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name = "record")
public class HelloRecord {
 
	private int id;
	private BigDecimal sales;
	private int qty;
	private String staffName;
	private Date date;
	private String status;
 
	@XmlAttribute(name = "id")
	public int getId() {
		return id;
	}
 
	public void setId(int id) {
		this.id = id;
	}
 
	@XmlElement(name = "sales")
	public BigDecimal getSales() {
		return sales;
	}
 
	public void setSales(BigDecimal sales) {
		this.sales = sales;
	}
 
	@XmlElement(name = "qty")
	public int getQty() {
		return qty;
	}
 
	public void setQty(int qty) {
		this.qty = qty;
	}
 
	@XmlElement(name = "staffName")
	public String getStaffName() {
		return staffName;
	}
 
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
 
	public Date getDate() {
		return date;
	}
 
	public void setDate(Date date) {
		this.date = date;
	}
 
	@XmlAttribute(name = "status")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Report [id=" + id + ", sales=" + sales 
                    + ", qty=" + qty + ", staffName=" + staffName + "]";
	}
 
}