package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class WriteData {

	public void writeExcel () throws IOException {
		
		String path = "C:\\Users\\Atul\\Desktop\\AccountData.xlsx";
		
		File file = new File (path);
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet("info");
		
		File fout = new File(path);
		
		FileOutputStream fos = new FileOutputStream(fout);
	
		sheet.getRow(0).getCell(2).setCellValue("autowrite");
		
		wb.write(fos);
		
		wb.close();
	}
	
	public static void main(String[] args) throws IOException {
		
		WriteData wd = new WriteData();
		wd.writeExcel();
	}
}
