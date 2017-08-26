package com.hky.sql;

import java.util.Arrays;

public class SqlOptions {
	
	public static final char[] blank=new char[]{'\t','\n','\r',' '};
	
	public static String blanksOption(SqlString sqlStr){
		String str="";
		while(sqlStr.hasNextChar()){
			char c=sqlStr.nextChar();
			if(Arrays.binarySearch(blank, c)>=0){
				str+=c;
			}else{
				sqlStr.back();
				return str;
			}
		}
		return str;
	}

	public static String commentOption(SqlString sqlStr){
		String str="";
		Character c1=null;
		Character c2=null;
		if(sqlStr.hasNextChar()){
			c1=sqlStr.nextChar();
			if(sqlStr.hasNextChar()){
				c2=sqlStr.nextChar();
			}
		}
		if(c1==null){
			return str;
		}
		if(c2==null){
			sqlStr.back();
			return str;
		}
		if(c1!='-'||c2!='-'){
			sqlStr.back();
			sqlStr.back();
			return str;
		}
		str=c1+c2+"";
		while(sqlStr.hasNextChar()){
			char c=sqlStr.nextChar();
			str+=c;
			if(c=='\n'){
				return str;
			}
		}
		return str;
	}
	
	public String packageOption(SqlString sqlStr){
		char c;
		char startc;
		char endc;
		String str="";
		if(sqlStr.hasNextChar()){
			c=sqlStr.nextChar();
		}else{
			return str;
		}
		switch(c){
		case '(':startc='(';
				 endc=')';
				 break;
		case '[':startc='[';
		 		 endc=']';
		 		 break;
		case '{':startc='{';
		 		 endc='}';
		 		 break;
		case '<':startc='<';
		 		 endc='>';
		 		 break;
		case '\'':startc='\'';
		 		 endc='\'';
		 		 break;
		case '"':startc='"';
		 		 endc='"';
		 		 break;
		default :sqlStr.back();
		         return str;
		}
		int i=1;
		str+=startc;
		while(sqlStr.hasNextChar()){
			char c1=sqlStr.nextChar();
			str+=c1;
			if(c1==startc)i++;
			if(c1==endc){
				if(i==1){
					return str;
				}else{
					i--;
				}
			}
		}
		return "";
	}
	
	public String blanksOrCommentOption(SqlString sqlStr){
		String str1="";
		String str2="";
		str1+=blanksOption(sqlStr);
		str2=commentOption(sqlStr);
		if("".equals(str2)){
			return str1;
		}else{
			str1+=str2;
			String str3=blanksOrCommentOption(sqlStr);
			return str1+str3;
		}
	}
	
	public String catchKeyWord(SqlString sqlStr,String keyWord){
		char[] cs=new char[keyWord.length()];
		for(int i=0;i<cs.length;i++){
			if(sqlStr.hasNextChar()){
				cs[i]=sqlStr.nextChar();
			}else{
				for(int ii=i;ii>=0;ii--){
					sqlStr.back();
				}
				return "";
			}
		}
		String str=new String(cs);
		if(keyWord.equalsIgnoreCase(str)){
			String str1=blanksOrCommentOption(sqlStr);
			if("".equals(str1)){
				String str2=packageOption(sqlStr);
				if("".equals(str1)){
					return "";
				}else{
					sqlStr.back(str2.length());
					return str;
				}
			}else{
				sqlStr.back(str1.length());
				return str;
			}
		}else{
			for(int i=0;i<cs.length;i++){
				sqlStr.back();
			}
			return "";
		}
	}
}
