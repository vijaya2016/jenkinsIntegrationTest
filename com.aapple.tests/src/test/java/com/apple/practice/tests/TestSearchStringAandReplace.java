package com.apple.practice.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSearchStringAandReplace {
	SearchSrringAndReplace test = new SearchSrringAndReplace();
	@Test(dataProvider = "getpositivedata")
	public void TestPositiveScenarioes(String s, char c,String t)
	{
			       
	//	test.replaceCharbyLoop(s, c),t
		Assert.assertEquals(t,test.replaceCharbyLoop(s, c));
	}

@DataProvider
public Object[][] getpositivedata()
{
return  new Object[][]{{"vijaya",'v',"ijaya"},{"Vara",'r',"Vaa"},{"testing",'t',"esing"},{"Automaation",'a',"Automtion"}};
}
}
