//package externalFiles;
//
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//public class ExcelFile {
//
//	public static void main(String[] args) throws IOException {
//		XSSFWorkbook wb = new XSSFWorkbook(); 
//		XSSFSheet ws = wb.createSheet("RandomNum");
//		
//		Row r1 = ws.createRow(1);
//		Cell c1 = r1.createCell(1);
//		c1.setCellValue("Random Number");
//		
//		String path ="MyExcel\\RanNum.xlsx";
//		File f = new File(path);
//		FileOutputStream f1 = new FileOutputStream(f);
//		wb.write(f1);
//		f1.close();
//		
//
//	}
//
//}
