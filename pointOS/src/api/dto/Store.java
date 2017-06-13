package api.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Store implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private int id;
	private int userID;
	private String name;
	private int parentStore;
	private List<StoreStock> storeStocks;
 
	public Store() {
		// TODO Auto-generated constructor stub
	}
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getParentStore() {
		return parentStore;
	}
	public void setParentStore(int parentStore) {
		this.parentStore = parentStore;
	}
	public List<StoreStock> getStoreStocks() {
		if(storeStocks==null){
			
			storeStocks=new ArrayList<StoreStock>();
		}
		return storeStocks;
	}
	public void setStoreStocks(List<StoreStock> storeStocks) {
		this.storeStocks = storeStocks;
	}
	

}
