package com.yash.rest.restresumeapp.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.yash.rest.restresumeapp.model.Marks;
import com.yash.rest.restresumeapp.service.MarksService;

@Path("/marksResource")
public class MarksResource {
	MarksService marksService = new MarksService();

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/standards/{standard}")
	public List<Marks> getStudentByStandard(@PathParam("standard") String standard) {

		return new ArrayList<Marks>(marksService.getInfoByStandard(standard));
	}
}
