package api.services;

import java.security.InvalidParameterException;
import java.util.List;

import api.dto.Sales;
import api.dto.Stock;
import api.dto.Store;
import exception.AlreadyExistException;
import exception.NotFoundException;

public interface StroreService {

 public Store create(Store store,String userId) throws NotFoundException,AlreadyExistException,InvalidParameterException;
 public Store update(Store store,String userId)throws NotFoundException,AlreadyExistException, InvalidParameterException;
 public boolean delete(int StoreId)throws NotFoundException,AlreadyExistException, InvalidParameterException;
 public Stock returnStore(Store storeId,String userId)throws NotFoundException,AlreadyExistException, InvalidParameterException;
 public Store get(int Store,String userId)throws NotFoundException,AlreadyExistException, InvalidParameterException;
 public List<Sales>ListStore(int start,int numOfRecords)throws NotFoundException,AlreadyExistException, InvalidParameterException;
				

}

