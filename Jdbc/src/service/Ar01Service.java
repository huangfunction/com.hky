package service;

import dao.Ar01Dao;

public class Ar01Service {
	
	Ar01Dao ar01Dao;

	public void insert(String userName,String passWord){
		boolean isExist = ar01Dao.exist(userName, passWord);
		if(!isExist){
			ar01Dao.insert(userName, passWord);
		}
	}
}
