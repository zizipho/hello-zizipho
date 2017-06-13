package api.dto;

import java.io.Serializable;

    public class SalesDetails implements Serializable {

		public SalesDetails() {
			// TODO Auto-generated constructor stub
		}
		/**
		 * 
		 */
private static final long serialVersionUID = 1L;
private int sale;	
private int quantity;		
private int unitPrice;

public int getSale() {
	return sale;
}
public void setSale(int sale) {
	this.sale = sale;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getUnitPrice() {
	return unitPrice;
}
public void setUnitPrice(int unitPrice) {
	this.unitPrice = unitPrice;
}


}
