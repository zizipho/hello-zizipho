package api.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Sales implements Serializable {
 public Sales() {
		// TODO Auto-generated constructor stub
	}
/**
	 * 
	 */
private static final long serialVersionUID = 1L;
private int id;
private int totalPrice;
private List<CurrentStock> currentStocks;
 
public List<CurrentStock> getCurrentStocks() {
	if(currentStocks==null){
		
		currentStocks=new ArrayList<CurrentStock>();
	}
	return currentStocks;
}
public void setCurrentStocks(List<CurrentStock> currentStocks) {
	this.currentStocks = currentStocks;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getTotalPrice() {
	return totalPrice;
}
public void setTotalPrice(int totalPrice) {
	this.totalPrice = totalPrice;
}

}
