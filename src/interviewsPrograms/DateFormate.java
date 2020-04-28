package interviewsPrograms;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormate
{

	public static void main(String[] args)
	{
		
		  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss") ;
		  String date = dateFormat.format(new Date());
		
		 System.out.println(date);
		  //d.findElement(By.xpath("//*[@id='Email']")).sendKeys(name+"_"+file);

	}

}
