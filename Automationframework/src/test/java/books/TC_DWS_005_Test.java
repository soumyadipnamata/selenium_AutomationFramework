package books;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genricutility.BaseClassUtility;
import genricutility.ListnerUtility;
import objectrepository.HomePage;


@Listeners(ListnerUtility.class)

public class TC_DWS_005_Test  extends BaseClassUtility{
	@Test
	public void clickOnBooks() throws EncryptedDocumentException, IOException {
		//test=extReport.createTest("clickOnBooks");
		hp=new HomePage(driver);
		hp.getBooksLink().click();
		Assert.assertEquals(driver.getTitle(), eUtil.getStringDatafromExcel("Books", 1, 0), "Books page is not displayed");
		test.log(Status.PASS, "Books page is displayed");
		
	}

}
