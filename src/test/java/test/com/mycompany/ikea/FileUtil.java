/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.com.mycompany.ikea;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author edls3
 */
public class FileUtil {
    public static SignUpPojo getData() throws Exception {

        //read excel file
        FileInputStream inputStream = new FileInputStream(new File("/Users/edls3/NetBeansProjects/ikea/Data/signup.xlsx"));
        Workbook workbook = new XSSFWorkbook(inputStream);
        //getting first worksheet
        Sheet firstSheet = workbook.getSheetAt(0);
       //get first row
        Row r =  firstSheet.getRow(0);  //first row
        Cell c = r.getCell(1); //firstName value
        String firstName = c.getStringCellValue();
        
        r =  firstSheet.getRow(1);  //second row 
        c = r.getCell(1); //lastName value
        String lastName = c.getStringCellValue();
        
        r =  firstSheet.getRow(2);  //third row 
        c = r.getCell(1); //birthDate value
        String birthDate = c.getStringCellValue();
        
        r =  firstSheet.getRow(3);  //fourth row 
        c = r.getCell(1); //address value
        String address = c.getStringCellValue();
        
        r =  firstSheet.getRow(4);  //fifth row 
        c = r.getCell(1); //address1 value
        String address1 = c.getStringCellValue();

        r =  firstSheet.getRow(5);  //sixth row 
        c = r.getCell(1); //cityName value
        String cityName = c.getStringCellValue();
        
        r =  firstSheet.getRow(6);  //seventh row 
        c = r.getCell(1); //zipCode value
        String zipCode = c.getStringCellValue();
        
        r =  firstSheet.getRow(7);  //8th row 
        c = r.getCell(1); //email value
        String email = c.getStringCellValue();
        
        r =  firstSheet.getRow(8);  //9th row 
        c = r.getCell(1); //password value
        String password = c.getStringCellValue();
        
        r =  firstSheet.getRow(9);  //10th row 
        c = r.getCell(1); //adress1 value
        int otpInput0 = (int) c.getNumericCellValue();

        r =  firstSheet.getRow(10);  //11th row 
        c = r.getCell(1); //adress1 value
        int otpInput1 = (int) c.getNumericCellValue();
        
        r =  firstSheet.getRow(11);  //12th row 
        c = r.getCell(1); //adress1 value
        int otpInput2 = (int) c.getNumericCellValue();
        
        r =  firstSheet.getRow(12);  //13th row 
        c = r.getCell(1); //adress1 value
        int otpInput3 = (int) c.getNumericCellValue();
        
        r =  firstSheet.getRow(13);  //14th row 
        c = r.getCell(1); //adress1 value
        int otpInput4 = (int) c.getNumericCellValue();
        
        r =  firstSheet.getRow(14);  //15th row 
        c = r.getCell(1); //adress1 value
        int otpInput5 = (int) c.getNumericCellValue();




        //Populate POJO
        SignUpPojo signup  = new SignUpPojo (firstName, lastName,birthDate,address,address1,
        cityName,zipCode,email,password,otpInput0,otpInput1,otpInput2,otpInput3,otpInput4,otpInput5);
        System.out.println(signup);
        inputStream.close();
        return signup;

    }
    
}
