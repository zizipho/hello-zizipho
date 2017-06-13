package serviceImpl;

import java.security.InvalidParameterException;

import api.dto.Sales;
import api.services.SalesRest;
import exception.AlreadyExistException;
import exception.InvalidParametersException;
import exception.MissingParametersException;
import exception.NotFoundException;

public class SalesImpl implements SalesRest{

	@Override
	public Sales create(Sales sale, String userId)
			throws NotFoundException, MissingParametersException, InvalidParameterException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sales update(Sales sale, String userId)
			throws NotFoundException, AlreadyExistException, InvalidParameterException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sales voidSale(int stockId, String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int StockId, String userId)
			throws NotFoundException, AlreadyExistException, MissingParametersException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Sales get(int SalesId) throws NotFoundException, InvalidParametersException, MissingParametersException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sales returnSale(Sales stockId, String userId)
			throws NotFoundException, MissingParametersException, InvalidParametersException {
		// TODO Auto-generated method stub
		return null;
	}

}
