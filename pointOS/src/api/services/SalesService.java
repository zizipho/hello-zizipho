package api.services;


import java.util.List;

import api.dto.CurrentStock;
import api.dto.Sales;
import exception.AlreadyExistException;
import exception.InvalidParametersException;
import exception.MissingParametersException;
import exception.NotFoundException;

public interface SalesService {
	
 public Sales create(Sales sale,String userId) throws NotFoundException,MissingParametersException,InvalidParametersException;
 public Sales update(Sales sale,String userId) throws MissingParametersException,NotFoundException;
 public Sales voidSale(int stockId,String userId) throws NotFoundException,AlreadyExistException,MissingParametersException,InvalidParametersException;
 public Sales returnSale(Sales stockId,String userId) throws NotFoundException,MissingParametersException,InvalidParametersException;
 public boolean delete(int StockId,String userId) throws NotFoundException,MissingParametersException,InvalidParametersException;
 public Sales get(int SalesId) throws NotFoundException,MissingParametersException,InvalidParametersException;
 public List<CurrentStock>ListStock(int start,int numberofRecords) throws NotFoundException,MissingParametersException,InvalidParametersException;
		
}
