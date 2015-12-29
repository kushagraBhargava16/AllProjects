package com.yash.rest.restresumeapp.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yash.rest.restresumeapp.model.Marks;
import com.yash.rest.restresumeapp.util.DBUtil;

public class MarksService {

	public List<Marks> getInfoByStandard(String standard) {
		// TODO Auto-generated method stub
		String sql="select * from marks where standard='"+standard+"'";
		ResultSet resultSet=DBUtil.select(sql);
		List<Marks> marksList=new ArrayList<>();
		try {
			while(resultSet.next()){
				Marks marks=new Marks();
				marks.setMarksId(resultSet.getInt("marksId"));
				marks.setStudentId(resultSet.getInt("studentId"));
				marks.setStandard(resultSet.getString("standard"));
				marks.setTotalMarks(resultSet.getInt("totalMarks"));
				marksList.add(marks);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return marksList;
	}
	
	
}
