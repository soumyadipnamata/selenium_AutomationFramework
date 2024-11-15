package electronics;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genricutility.BaseClassUtility;
import objectrepository.HomePage;

public class TC_DWS_007_Test 
	extends BaseClassUtility{
		@Test
		public void clickOnElectronics() throws EncryptedDocumentException, IOException {
			//test=extReport.createTest("clickOnElectronics");
			hp=new HomePage(driver);
			hp.getElectronicsLink().click();
			Assert.assertEquals(driver.getTitle(), eUtil.getStringDatafromExcel("Electronics", 1, 0), "Electronics page is not displayed");
			test.log(Status.PASS, " Electronicspage is displayed");
			
		}

	}


