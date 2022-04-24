package testNg_Concept;

import org.testng.annotations.Test;

public class Timeout_Concept {

	@Test(timeOut=5000)
	public void timeTest() {
		
		int sum=1;
		do {
			System.out.println("shubham");
		}
		
		while(sum<2);
		
		

	}

}
