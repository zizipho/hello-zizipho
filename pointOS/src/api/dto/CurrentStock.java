package api.dto;

import java.io.Serializable;

public class CurrentStock implements Serializable {
 public CurrentStock() {
		// TODO Auto-generated constructor stub
	}
/**
	 * 
	 */
   private static final long serialVersionUID = 1L;
   private int ID;
   private int quantity;
   private int refil;
   
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getRefil() {
	return refil;
}
public void setRefil(int refil) {
	this.refil = refil;
}
	

}
