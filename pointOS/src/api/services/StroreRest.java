package api.services;

import java.security.InvalidParameterException;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import api.dto.Store;
import exception.AlreadyExistException;
import exception.InvalidParametersException;
import exception.MissingParametersException;
import exception.NotFoundException;

public interface StroreRest {
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/create")
	public Store create(Store store,String userId)
	 throws NotFoundException,MissingParametersException,InvalidParameterException;
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/update")
	public Store update(Store store,String userId)
		throws NotFoundException,AlreadyExistException, InvalidParameterException;
	
	@POST                          
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/voidSale")
	public Store voidStore(int storeId,String userId);
	
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/delete{id}")
	public boolean delete(@PathParam("id") int StoreId,String userId)		
	throws NotFoundException,AlreadyExistException, MissingParametersException;

	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/get")
	public Store get(int StoreId)
	throws NotFoundException,InvalidParametersException,MissingParametersException;

	
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
    @Path("/returnStore")
	public Store returnStore(Store storeId,String userId)
	throws NotFoundException,MissingParametersException,InvalidParametersException;
}
