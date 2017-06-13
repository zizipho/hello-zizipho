package api.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class StoreStock implements Serializable{
public StoreStock() {
		// TODO Auto-generated constructor stub
	}
/**
	 * 
	 */
private static final long serialVersionUID = 1L;
private int ID;
private int quantity;
private String code;
private String barcode;
private String serialNum;
private String description;
private List<CurrentStock> currentStocks;

public List<CurrentStock> getCurrentStocks() {
	return currentStocks;
}
public void setCurrentStocks(List<CurrentStock> currentStocks) {
	this.currentStocks = currentStocks;
}
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
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public String getBarcode() {
	return barcode;
}
public void setBarcode(String barcode) {
	this.barcode = barcode;
}
public String getSerialNum() {
	return serialNum;
}
public void setSerialNum(String serialNum) {
	this.serialNum = serialNum;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;	
}
public List<CurrentStock> getStoreStocks() {
	if(currentStocks==null){
		currentStocks=new ArrayList<CurrentStock>();
	}
	return currentStocks;
}
public void setStoreStocks(List<StoreStock> storeStocks, List<CurrentStock> currentStocks) {
	this.currentStocks = currentStocks;
}



}
