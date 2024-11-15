package genricutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * @author DIP
 */

public class ExcelUtility {
	/**
	 * this method is used to read String data from excel
	 * user must pass sheetname , rowIndex,columnIndex
	 * @param sheetName
	 * @param rowIndex
	 * @param colIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public String getStringDatafromExcel(String sheetName, int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");	
	Workbook workbook = WorkbookFactory.create(fis);
	return workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getStringCellValue();
		
	}
	public boolean getBooleanDatafromExcel(String sheetName, int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");	
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getBooleanCellValue();
	}
	
	public double getDoubleDatafromExcel(String sheetName, int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");	
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getNumericCellValue();
}
	
	public LocalDateTime getLocalDateTimeDatafromExcel(String sheetName, int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");	
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getLocalDateTimeCellValue();
}
}
