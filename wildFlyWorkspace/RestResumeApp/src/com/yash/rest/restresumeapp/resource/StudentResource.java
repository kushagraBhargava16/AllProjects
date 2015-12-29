package com.yash.rest.restresumeapp.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.yash.rest.restresumeapp.model.Student;
import com.yash.rest.restresumeapp.service.StudentService;

@Path("/studentResource")
public class StudentResource {
	StudentService studentService = new StudentService();

	@GET
	@Produces(MediaType.APPLICATION_XML)
	// @Path("/cities/{city}")
	public List<Student> getAllStudents() {
		return studentService.fetchAllStudents();
	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/ids/{studentId}")
	public Student getStudentById(@PathParam("studentId") int studentId) {
		return studentService.fetchStudentById(studentId);
	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/cities/{city}")
	public List<Student> getStudentsByCity(@PathParam("city") String city) {
		return studentService.fetchStudentsByCity(city);
	}

}
