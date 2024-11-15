package giftCard;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genricutility.BaseClassUtility;
import objectrepository.HomePage;

public class TC_DWS_008_Test 
	extends BaseClassUtility{
		@Test
		public void clickOngiftCard() throws EncryptedDocumentException, IOException {
			//test=extReport.createTest("clickOngiftCard");
			hp=new HomePage(driver);
			hp.getGiftcardslink().click();
			Assert.assertEquals(driver.getTitle(), eUtil.getStringDatafromExcel("GiftCard",1 , 0), "GiftCard page is not displayed");
			test.log(Status.PASS, " GiftCard is displayed");
			
		}

}
