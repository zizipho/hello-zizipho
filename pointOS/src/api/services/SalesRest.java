package api.services;



import java.security.InvalidParameterException;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import api.dto.Sales;
import exception.AlreadyExistException;
import exception.InvalidParametersException;
import exception.MissingParametersException;
import exception.NotFoundException;

@Path("/SaleRest")
public interface SalesRest{
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/create")
	public Sales create(Sales sale,String userId)
	 throws NotFoundException,MissingParametersException,InvalidParameterException;
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/update")
	public Sales update(Sales sale,String userId)
		throws NotFoundException,AlreadyExistException, InvalidParameterException;
	
	@POST                          
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/voidSale")
	public Sales voidSale(int stockId,String userId);
	
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/delete{id}")
	public boolean delete(@PathParam("id") int StockId,String userId)		
	throws NotFoundException,AlreadyExistException, MissingParametersException;

	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/get")
	public Sales get(int SalesId)
	throws NotFoundException,InvalidParametersException,MissingParametersException;

	
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
    @Path("/returnSale")
	public Sales returnSale(Sales stockId,String userId)
	throws NotFoundException,MissingParametersException,InvalidParametersException;
	
}
