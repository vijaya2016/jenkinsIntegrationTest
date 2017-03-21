package com.apple.practice.tests;

public class SearchSrringAndReplace {
String s1;
char c;
public  String replaceCharbyLoop(String s,char c)
{
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)==c)
		{
			s=s.substring(0,i)+s.substring(i+1, s.length());
			i=i-1;
		}
	}
	return s;
}	
public  String replaceCharByMethod(String s,char c)
{
s=	s.replaceAll(String.valueOf(c),"");
return s;

}

}