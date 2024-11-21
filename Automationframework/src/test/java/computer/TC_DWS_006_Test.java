package computer;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genricutility.BaseClassUtility;
import objectrepository.HomePage;

public class TC_DWS_006_Test 
	extends BaseClassUtility{
		@Test
		public void clickOnComputers() throws EncryptedDocumentException, IOException {
			//test=extReport.createTest("clickOnComputers");
			hp=new HomePage(driver);
			hp.getComputerLinks().click();
			Assert.assertEquals(driver.getTitle(), eUtil.getStringDatafromExcel("Books", 2, 0), "Computers page is not displayed");
			//Assert.assertNotEquals(driver.getTitle(), eUtil.getStringDatafromExcel("computers", 1, 0), "Computers page is not displayed");
			test.log(Status.PASS, "Computer page is displayed");
			
		}

	}



