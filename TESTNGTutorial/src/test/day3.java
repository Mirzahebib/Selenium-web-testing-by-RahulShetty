package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class day3 {
	/*
	 * @Test public void MobCarLoan() { System.out.println("MobCarLoan1"); }
	 */
	
	/*
	 * @Parameters({"URL"})
	 * 
	 * @Test public void MobCarLoan2(String urlname) {
	 * System.out.println("MobCarLoan2"); System.out.println(urlname); }
	 */
	
	/*
	 * @Test(groups= {"Smoke"}) public void MobCarLoan3() {
	 * System.out.println("MobCarLoan3"); }
	 */
	
	/*
	 * @BeforeMethod public void runBeforeEachMethod() {
	 * System.out.println("I am running before each test case"); }
	 */
		
	@Test(dataProvider="getData")
	public void MobCarLoan5(String username,String password) { 
		System.out.println("MobCarLoan4");
		System.out.println(username);
		System.out.println(password);
	}

	@Test public void MobCarLoan6() 
	
	{ System.out.println("MobCarLoan5");
	Assert.assertTrue(false);
	
	} 
	
	/* * @Test public void MobCarLoan7() { System.out.println("MobCarLoan6"); }
	 */
//*/
	/*
	 * @Test public void MobCarLoan8() { System.out.println("MobCarLoan7");
	 */
	/* } */
	/*
	 * @Test public void MobCarLoan9() { System.out.println("MobCarLoan8"); }
	 */

	/*
	 * @AfterMethod public void aftereachmethodcall() {
	 * System.out.println("This is run after each method is executed"); }
	 */
	@DataProvider
	public Object[][] getData() 
	{
		//1st combination - username password - good credit history
		//2nd username - password - no credit history
		//3rd - fraudelent credit history
		Object[][] data = new Object[3][2];
		
		//1st set
		data[0][0]="firstsetusername";
		data[0][1]="firstpassword";
		//columns in the row are nothing but values for that particular combination
		
		//2nd set
		data[1][0]="secondsetusername";
		data[1][1]="secondpassoword";
		
		//3d set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdsetpassword";
		return data;
	}
}
