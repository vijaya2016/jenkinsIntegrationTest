package com.apple.practice.tests;

public class SearchAllOccurancesOfaCharacterInaString {

public static void main(String args[])
{
	 String s = "HellHHolWlHlolrlHd";
String s1 = "HellHHolWlHlolrlHd";
	char c = 'H';
	char c1 = 'H';
//int k = s.length();
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)==c)
		{
			s=s.substring(0,i)+s.substring(i+1, s.length());
		//	k=k-1;
			i=i-1;
		}
	}
	System.out.println(s);

	s1=	s1.replaceAll(String.valueOf(c1),"");
			System.out.println(s1);
	
}
}
