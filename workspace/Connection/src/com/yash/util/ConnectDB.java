package com.yash.util;

public interface ConnectDB {
	ConnectDB connect();
	void use();
	void disconnect();
}


class MySQLDriver implements ConnectDB{

	public ConnectDB connect() {
		
		return null;
	}

	public void use() {
		// TODO Auto-generated method stub
		
	}

	public void disconnect() {
		// TODO Auto-generated method stub
		
	}
	
}

