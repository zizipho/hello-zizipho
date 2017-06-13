package serviceImpl;

import java.util.List;

import api.dto.CurrentStock;
import api.dto.Sales;
import api.dto.Stock;
import api.services.StockRest;
import exception.AlreadyExistException;
import exception.InvalidParametersException;
import exception.MissingParametersException;
import exception.NotFoundException;

public class StockImpl implements StockRest{

	@Override
	public Stock create(Stock stock, String userId)
			throws NotFoundException, MissingParametersException, AlreadyExistException, InvalidParametersException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stock update(Stock stock, String userId)
			throws NotFoundException, MissingParametersException, AlreadyExistException, InvalidParametersException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stock returnStock(Stock stockId, String userId)
			throws NotFoundException, MissingParametersException, AlreadyExistException, InvalidParametersException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int StockId, String userId)
			throws NotFoundException, MissingParametersException, AlreadyExistException, InvalidParametersException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Sales get(int SalesId)
			throws NotFoundException, MissingParametersException, AlreadyExistException, InvalidParametersException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CurrentStock> ListStock(int start, int numberofRecords)
			throws NotFoundException, MissingParametersException, AlreadyExistException {
		// TODO Auto-generated method stub
		return null;
	}

}
