package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public String read () throws IOException {
		
		String path2 = "C:\\Users\\Atul\\git\\EclipsePullPush\\ExcelReadWrite\\Data\\TestData.xlsx";
		
		File file2 = new File (path2);
		
		FileInputStream fis2 = new FileInputStream(file2);
		
		XSSFWorkbook wb2 = new XSSFWorkbook(fis2);
		
		XSSFSheet sheet2 = wb2.getSheet("info");
		
		String printData = sheet2.getRow(1).getCell(1).getStringCellValue();
		// getStringCellValue is used for string value to get any kind of value from file we have data formatter		
		System.out.println(printData);
		
		// data formatter -- used to fetch any type of value (string, int, char, etc)
		DataFormatter df = new DataFormatter();	
		Object data2 = df.formatCellValue(sheet2.getRow(2).getCell(1));
		
		System.out.println(data2);
	
		wb2.close();
		
		return printData;
				
	}
	
	public static void main(String[] args) throws IOException {
		
		ReadData rd = new ReadData();
		rd.read();
	}
	
	// copy from folder paste in project data file
	// right click on data file properties and copy file path
}
