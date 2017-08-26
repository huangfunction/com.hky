package com.hky.sql;

public class SqlString {
	private String sql;
	private int offset;
	public SqlString(String sql){
		this.sql=sql;
		offset=0;
	}
	public boolean hasNextChar(){
		return offset<sql.length();
	}
	public char nextChar(){
		char c=sql.charAt(offset);
		offset++;
		return c;
	}
	public void back(){
		offset--;
	}
	public void back(int i){
		for(int ii=i;ii>0;ii--){
			back();
		}
	}
}
