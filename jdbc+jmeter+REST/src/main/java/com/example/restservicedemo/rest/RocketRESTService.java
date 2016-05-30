package com.example.restservicedemo.rest;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.example.restservicedemo.domain.Rocket;
import com.example.restservicedemo.service.RocketManager;

@Path("rocket")
public class RocketRESTService {
	
	private RocketManager rm = new RocketManager();
	
	@GET
	@Path("/{rocketId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Rocket getRocket(@PathParam("rocketId") Long id) {
		Rocket r = rm.getRocket(id);
		return r;
	}
	
	@POST
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addRocket(Rocket rocket) {
		rm.addRocket(rocket);
		return Response.status(201).entity("Rocket").build();
	}
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Rocket> getAllRockets() {
		List<Rocket> rockets = rm.getAllRockets();
		return rockets;
	}
	
	@GET
	@Path("/testRocket")
	@Produces(MediaType.TEXT_HTML)
	public String testRocket() {
		return "REST API /rocket is running";
	}
	
	@DELETE
	public Response clearRockets() {
		rm.clearRockets();
		return Response.status(200).build();
	}

}