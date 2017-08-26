package com.hky.String;

import java.util.Arrays;

public class StringReader {
	
	private static char[]  blank=new char[]{' ','\t','\r','\n'};
	
	private String str;
	
	private int offset=0;
	
	public StringReader(String str){
		this.str=str;
		Arrays.sort(blank);
	}
	
	public String getWord(){
		String word="";
		boolean notGetWord=true;
		while(offset<str.length()){
			char c=str.charAt(offset);
			if(Arrays.binarySearch(blank, c)>=0){
				if(notGetWord){
					offset++;
					continue;
				}else{
					return word;
				}
			}
			word+=c;
			offset++;
			notGetWord=false;
		}
		return word;
	}
}
