package com.hky.sql2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Elements {
	
	public static final String 
		blank="^\\s+",
		comment="^--.*[\\n|\\r\\n]?",
		a="'(('{2})?|\\w)*'";
	
	public static void main(String[] args) {
		Pattern p=Pattern.compile(a);
		Matcher m=p.matcher("'''a'''");
		if(m.matches()){
			System.out.println("已匹配");
			System.out.println(m.group());
			System.out.println(m.start());
			System.out.println(m.end());
		}
		
		System.out.println(m.groupCount());
	}

}
