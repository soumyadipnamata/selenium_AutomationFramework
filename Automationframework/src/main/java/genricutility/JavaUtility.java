package genricutility;

import java.time.LocalDateTime;
import java.util.Random;

public class JavaUtility {
	/**
	 * this method is used to capture  system date and time
	 * @return
	 */
	public String getSystemTime() {
		
		return LocalDateTime.now().toString().replace(":","-");
	}
	/**
	 * this method is used to generate random numbers within 1000
	 * @return
	 */
public int getRandomNumber() {
	Random ran=new Random();
	return ran.nextInt(1000);
	
}
}
