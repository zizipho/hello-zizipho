package api.services;

import java.util.List;

import api.dto.CurrentStock;
import api.dto.Stock;
import exception.AlreadyExistException;
import exception.InvalidParametersException;
import exception.MissingParametersException;
import exception.NotFoundException;

public interface StockService {
	public Stock create(Stock stock,String userId) throws NotFoundException,MissingParametersException,AlreadyExistException,InvalidParametersException;;
	public Stock update(Stock stock,String userId)throws NotFoundException,MissingParametersException,AlreadyExistException,InvalidParametersException;
    public boolean delete(int StockId) throws NotFoundException,MissingParametersException,AlreadyExistException,InvalidParametersException;
    public Stock returnStock(Stock stockId,String userId)throws NotFoundException,MissingParametersException,AlreadyExistException,InvalidParametersException;
    public Stock get(int Stock)throws NotFoundException,MissingParametersException,AlreadyExistException,InvalidParametersException;
    public List<CurrentStock>ListStock(int start,int numberofRecords)throws NotFoundException,MissingParametersException,AlreadyExistException,InvalidParametersException;
	}


