package ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class properti_file_handling 
{

	public static void main(String[] args) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream inputstr=new FileInputStream("E:\\selenium\\ecplise_workspace\\selenium\\src\\test\\resources\\properti_files\\testdata.properties");
		prop.load(inputstr);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		
		FileOutputStream outputstr=new FileOutputStream("E:\\selenium\\ecplise_workspace\\selenium\\src\\test\\resources\\properti_files\\testdata.properties");
		
		prop.setProperty("test no", "12345");
		prop.setProperty("author", "Siddhartha");
		
		prop.store(outputstr, "this is automated data by selenium");

	}

}
