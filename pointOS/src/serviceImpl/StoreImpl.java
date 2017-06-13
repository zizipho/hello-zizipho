package serviceImpl;

import java.security.InvalidParameterException;

import api.dto.Store;
import api.services.StroreRest;
import exception.AlreadyExistException;
import exception.InvalidParametersException;
import exception.MissingParametersException;
import exception.NotFoundException;

public class StoreImpl implements StroreRest{

	@Override
	public Store create(Store store, String userId)
			throws NotFoundException, MissingParametersException, InvalidParameterException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Store update(Store store, String userId)
			throws NotFoundException, AlreadyExistException, InvalidParameterException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Store voidStore(int storeId, String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int StoreId, String userId)
			throws NotFoundException, AlreadyExistException, MissingParametersException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Store get(int StoreId) throws NotFoundException, InvalidParametersException, MissingParametersException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Store returnStore(Store storeId, String userId)
			throws NotFoundException, MissingParametersException, InvalidParametersException {
		// TODO Auto-generated method stub
		return null;
	}

}
