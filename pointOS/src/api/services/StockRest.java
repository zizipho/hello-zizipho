package api.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import api.dto.CurrentStock;
import api.dto.Sales;
import api.dto.Stock;
import exception.AlreadyExistException;
import exception.InvalidParametersException;
import exception.MissingParametersException;
import exception.NotFoundException;
@Path("/StockRest")
public interface StockRest {
	
		@POST
		@Produces(MediaType.APPLICATION_JSON)
		@Path("/create")
		public Stock create(Stock stock,String userId)
		throws NotFoundException,MissingParametersException,AlreadyExistException,InvalidParametersException;
		
		
		@PUT
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		@Path("/update")
		public Stock update(Stock stock,String userId)
		throws NotFoundException,MissingParametersException,AlreadyExistException,InvalidParametersException;
		
		@POST                          
		@Produces(MediaType.APPLICATION_JSON)
		@Path("/returnStock")
		public Stock returnStock(Stock stockId,String userId)
		throws NotFoundException,MissingParametersException,AlreadyExistException,InvalidParametersException;
		
		@DELETE
		@Produces(MediaType.APPLICATION_JSON)
		@Path("/delete{id}")
		public boolean delete(@PathParam("id") int StockId,String userId)
		throws NotFoundException,MissingParametersException,AlreadyExistException,InvalidParametersException;
		
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		@Path("/get")
		public Sales get(int SalesId)
		throws NotFoundException,MissingParametersException,AlreadyExistException,InvalidParametersException;
		
		
     	@POST
		@Produces(MediaType.APPLICATION_JSON)
		@Path("/ListStock")
     	public List<CurrentStock>ListStock(int start,int numberofRecords)
        throws NotFoundException,MissingParametersException,AlreadyExistException;
		
	}


