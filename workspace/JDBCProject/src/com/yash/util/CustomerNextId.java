package com.yash.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yash.samplecrudapplication.util.ConnectionProvider;

public class CustomerNextId {
	public int nextId(){
		String sql="SELECT MAX(ID) FROM CUSTOMER";
		Connection connection= ConnectionProvider.getConnection();
		int resultId=0;
		try {
			PreparedStatement  preparedStatement=connection.prepareStatement(sql);
		preparedStatement.execute();
		ResultSet resultSet= preparedStatement.getResultSet();
		resultId= resultSet.getInt("ID");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ++resultId;
	}
}
