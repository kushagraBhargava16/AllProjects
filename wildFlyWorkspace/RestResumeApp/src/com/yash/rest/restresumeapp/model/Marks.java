package com.yash.rest.restresumeapp.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Marks {
	private int marksId;
	private int studentId;
	private String standard;
	int totalMarks;
	
	public Marks(){
		
	}
	public Marks(int marksId, int studentId, String standard, int totalMarks) {
		super();
		this.marksId = marksId;
		this.studentId = studentId;
		this.standard = standard;
		this.totalMarks = totalMarks;
	}

	public int getMarksId() {
		return marksId;
	}

	public void setMarksId(int marksId) {
		this.marksId = marksId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

}
