package testngtestui;

import org.testng.annotations.DataProvider;

public class DataProviderData 
{
	@DataProvider(name="dataset1")
	public Object[][] dataset1()
	{
		return new Object[][] 
		{
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"}
		};
	}
	
	@DataProvider
	public Object[][] dataset()
	{
		Object[][] dataset=new Object[4][2];
		
		dataset[0][0]="User1";
		dataset[0][1]="Pass1";
		
		dataset[1][0]="User2";
		dataset[1][1]="Pass2";
		
		dataset[2][0]="User3";
		dataset[2][1]="Pass3";
		
		dataset[3][0]="User4";
		dataset[3][1]="Pass4";
		
		return dataset;
	}
}
