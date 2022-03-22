package com.example.demo.resource;

import java.sql.Connection;
import java.util.List;

import com.example.demo.daos.DoctorDao;
import com.example.demo.entity.Doctor;
import com.example.demo.enums.DatabaseName;
import com.example.demo.ifaces.CrudRepository;
import com.example.demo.utils.ConnectionFactory;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/rest")
public class DoctorResource {
	
	private Connection con ;

	private CrudRepository repo ; 
	
	public DoctorResource() {
		super();
		
		con = ConnectionFactory.getConnection(DatabaseName.ORACLE);
		repo = new DoctorDao(con);
		
	}
		
	
	@GET
	@Path("/doctors")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Doctor> getBookList(){
		
		return repo.findAll();
		
	}
	@POST
	@Path("/doctors")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addDoctor(Doctor entity) {
		
		int result = repo.add(entity);
		
		return Response.status(201).entity(entity).build();
		
		
	}
	
	@DELETE
	@Path("/doctors/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response removeDoctorById(@PathParam("id") int id){
		
		 repo.deleteById(id);
		 
		 return Response.status(204).entity("Removed").build();
		
		}
	
	
	

}
