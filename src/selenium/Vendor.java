package selenium;


import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
public class Vendor {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub		
	
		try
		{
		WebDriver D1;		
		String FILE_NAME = "/home/admin/Documents/VCMP/code/DataDrivenTesting/login.xls";
		//Scanner s = new Scanner(new File("/home/indigenrb2/login.xls"));
		
		/*File homedir = new File(System.getProperty("user.home"));
		File fileToRead = new File(homedir, "/home/indigenrb2/login.xls");*/
		 FileInputStream excelFile = new FileInputStream(FILE_NAME);
         Workbook workbook = new HSSFWorkbook(excelFile);
       
            System.setProperty("webdriver.chrome.driver","//home//admin//Selenium//chromedriver");
			D1= new ChromeDriver();
		
			D1.get("http://49.50.79.181:8080/vcmp_cust_testing/");
         //NT:15012018 login sheet at pos 0  this is for login page
         Sheet datatypeSheet = workbook.getSheetAt(0);
         Iterator<Row> iterator = datatypeSheet.iterator();

         while (iterator.hasNext()) {   ///outer loop for row 

             Row currentRow = iterator.next();
             Iterator<Cell> cellIterator = currentRow.iterator();

             String Sheet0_id="";
             String Sheet0_type="";
             String Sheet0_value="";
             String Sheet0_action="";
             
             
             while (cellIterator.hasNext()) {  ///inner  loop for cells in row

            	 Cell currentCell = cellIterator.next();
                  if(currentCell.getRowIndex() !=0){    //row 0 is header row titles
         			 if(currentCell.getColumnIndex()==0)
         	        {
         				Sheet0_id= currentCell.getStringCellValue().trim();
         				 
         	        } 
         			 else if(currentCell.getColumnIndex()==1)
         	        {
         				Sheet0_type= currentCell.getStringCellValue().trim();
         				 
         	        }
         			else if(currentCell.getColumnIndex()==2)
         	        {
         				 
         				Sheet0_value= currentCell.getStringCellValue();
         	        }
         			else if(currentCell.getColumnIndex()==3)
         	        {
         				 
         				Sheet0_action= currentCell.getStringCellValue().trim();
         	        }
         			
         			  System.out.print(currentCell.getStringCellValue() + "--"); 
         			 
             }
             }
            if(Sheet0_id !="" && Sheet0_type.equals("text")){
             D1.findElement(By.id(Sheet0_id.trim())).sendKeys(Sheet0_value);
            }

            if(Sheet0_action.equals("click"))
            {
            	D1.findElement(By.id(Sheet0_id.trim())).click();
            }
         }
        
       // Thread.sleep(2000);		
 		
        
        //NT:15012018 login sheet at pos 0  this is for login page
        datatypeSheet = workbook.getSheetAt(1);
       iterator = datatypeSheet.iterator();

        while (iterator.hasNext()) {   ///outer loop for row 

            Row currentRow = iterator.next();
            Iterator<Cell> cellIterator = currentRow.iterator();

            String Sheet1_id="";
            String Sheet1_type="";
            String Sheet1_value="";
            String Sheet1_action="";
            int sheet1_value_num=0;
            
            while (cellIterator.hasNext()) {  ///inner  loop for cells in row

           	 Cell currentCell = cellIterator.next();
                 if(currentCell.getRowIndex() !=0){    //row 0 is header row titles
        			 if(currentCell.getColumnIndex()==0)
        	        {
        				Sheet1_id= currentCell.getStringCellValue().trim();
        				 
        	        } 
        			 else if(currentCell.getColumnIndex()==1)
        	        {
        				Sheet1_type= currentCell.getStringCellValue().trim();
        				 
        	        }
        			else if(currentCell.getColumnIndex()==2)
        	        {
        				if(Sheet1_type.equals("select")){
        					sheet1_value_num= (int) currentCell.getNumericCellValue();//StringCellValue();
        				}else{
        					Sheet1_value= currentCell.getStringCellValue().trim();
        				}
        	        }
        			else if(currentCell.getColumnIndex()==3)
        	        {
        				 
        				Sheet1_action= currentCell.getStringCellValue().trim();
        	        }
        			
        			//  System.out.print(currentCell.getStringCellValue() + "--"); 
        			 
            }
            }
           /*if(Sheet1_id !="" && Sheet1_value !="" ){
            D1.findElement(By.id(Sheet1_id)).sendKeys(Sheet1_value);
           }*/

           if(Sheet1_action.equals("click"))
           {
           	D1.findElement(By.id(Sheet1_id.trim())).click();
           }
           String idorg="idOrganization";
           if(Sheet1_type.equals("select")){
        	   Select dropdown = new Select(D1.findElement(By.id(idorg)));
        		dropdown.selectByIndex((sheet1_value_num));
           }
        }
       
       Thread.sleep(2000);	
        
        
       
       //NT:15012018 login sheet at pos 2  this is for add new customer
       datatypeSheet = workbook.getSheetAt(2);
      iterator = datatypeSheet.iterator();

       while (iterator.hasNext()) {   ///outer loop for row 

           Row currentRow = iterator.next();
           Iterator<Cell> cellIterator = currentRow.iterator();

           String Sheet1_id="";
           String Sheet1_type="";
           String Sheet1_value="";
           String Sheet1_action="";
           int sheet1_value_num=0;
           
           while (cellIterator.hasNext()) {  ///inner  loop for cells in row

          	 Cell currentCell = cellIterator.next();
                if(currentCell.getRowIndex() !=0){    //row 0 is header row titles
       			 if(currentCell.getColumnIndex()==0)
       	        {
       				Sheet1_id= currentCell.getStringCellValue().trim();
       				 
       	        } 
       			 else if(currentCell.getColumnIndex()==1)
       	        {
       				Sheet1_type= currentCell.getStringCellValue().trim();
       				 
       	        }
       			else if(currentCell.getColumnIndex()==2)
       	        {
       				if(Sheet1_type.equals("select") || (currentCell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC)){
       					Sheet1_value = String.valueOf( (int) currentCell.getNumericCellValue());//StringCellValue();
       				}else{
       					Sheet1_value = currentCell.getStringCellValue().trim();
       				}
       	        }
       			else if(currentCell.getColumnIndex()==3)
       	        {
       				 
       				Sheet1_action= currentCell.getStringCellValue().trim();
       	        }
       			
       			//  System.out.print(currentCell.getStringCellValue() + "--"); 
       			 
           }
           }
          
           if(Sheet1_id !=""&& Sheet1_type.equals("text")){
               D1.findElement(By.id(Sheet1_id.trim())).sendKeys(Sheet1_value);
              }

          if(Sheet1_action.equals("click"))
          {
          	D1.findElement(By.id(Sheet1_id.trim())).click();
          }
      //    String idorg="idOrganization";
          Thread.sleep(1000);
          /*if(Sheet1_type.equals("select")){
       	   Select dropdown = new Select(D1.findElement(By.id(idorg)));
       		dropdown.selectByIndex((sheet1_value_num));
          }*/
       }
      
    //Thread.sleep(2000);	
        
        
      D1.findElement(By.cssSelector("li[id=idLiControlData]")).click();
        
        
      
      //NT:15012018 login sheet at pos 3  this is for add new customer controll data
      datatypeSheet = workbook.getSheetAt(3);
     iterator = datatypeSheet.iterator();

      while (iterator.hasNext()) {   ///outer loop for row 

          Row currentRow = iterator.next();
          Iterator<Cell> cellIterator = currentRow.iterator();

          String Sheet1_id="";
          String Sheet1_type="";
          String Sheet1_value="";
          String Sheet1_action="";
          int sheet1_value_num=0;
          
          while (cellIterator.hasNext()) {  ///inner  loop for cells in row

         	 Cell currentCell = cellIterator.next();
               if(currentCell.getRowIndex() !=0){    //row 0 is header row titles
      			 if(currentCell.getColumnIndex()==0)
      	        {
      				Sheet1_id= currentCell.getStringCellValue().trim();
      				 
      	        } 
      			 else if(currentCell.getColumnIndex()==1)
      	        {
      				Sheet1_type= currentCell.getStringCellValue().trim();
      				 
      	        }
      			else if(currentCell.getColumnIndex()==2)
      	        {
      				if(Sheet1_type.equals("select") ||(currentCell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC)){
       					Sheet1_value = String.valueOf( (int) currentCell.getNumericCellValue());//StringCellValue();
      				}else{
      					Sheet1_value= currentCell.getStringCellValue().trim();
      				}
      	        }
      			else if(currentCell.getColumnIndex()==3)
      	        {
      				 Sheet1_action= currentCell.getStringCellValue().trim();
      	        }
      			
      			//  System.out.print(currentCell.getStringCellValue() + "--"); 
      			 
          }
          }
         if(Sheet1_id !="" && Sheet1_type.equals("text")){
          D1.findElement(By.id(Sheet1_id.trim())).sendKeys(Sheet1_value);
         }

         if(Sheet1_action.equals("click"))
         {
         	D1.findElement(By.id(Sheet1_id.trim())).click();
         }
     //    String idorg="idOrganization";
        // Thread.sleep(2000);
         /*if(Sheet1_type.equals("select")){
      	   Select dropdown = new Select(D1.findElement(By.id(idorg)));
      		dropdown.selectByIndex((sheet1_value_num));
         }*/
      }
     
    // Thread.sleep(2000);	
        
 	/*	D1.findElement(By.id("idOrganization")).click();
 		
 		Select dropdown = new Select(D1.findElement(By.id("idOrganization")));
 		dropdown.selectByIndex(1);
 		Thread.sleep(2000);
 		
 		D1.findElement(By.id("idReqHmAdd")).click();
         */
         
      
         D1.findElement(By.cssSelector("li[id=idLiMarketing]")).click();
         Thread.sleep(1000);	
     	 D1.findElement(By.id("idInputIndustryList")).sendKeys("0001");
     	 D1.findElement(By.cssSelector("li[id=idLiCCDCommon]")).click();
     	 Thread.sleep(1000);	
         D1.findElement(By.cssSelector("li[id=idLiAccMgt]")).click();
         Thread.sleep(1000);	
    	 D1.findElement(By.id("idInputReconAccList")).sendKeys("22113030");
    	 D1.findElement(By.cssSelector("li[id=idLiPaymentTrans]")).click();
    	 Thread.sleep(1000);
    	 D1.findElement(By.id("idInputTermsOfPaymtList")).sendKeys("K922");
    	 D1.findElement(By.cssSelector("li[id=idLiSADCommon]")).click();
    	 Thread.sleep(1000);
    	 D1.findElement(By.cssSelector("li[id=idLiSADSales]")).click();
    	 Thread.sleep(1000);
    	 //NT:15012018 login sheet at pos 4  this is for Sales area data
         datatypeSheet = workbook.getSheetAt(4);
        iterator = datatypeSheet.iterator();

         while (iterator.hasNext()) {   ///outer loop for row 

             Row currentRow = iterator.next();
             Iterator<Cell> cellIterator = currentRow.iterator();
             Thread.sleep(1000);
             String Sheet1_id="";
             String Sheet1_type="";
             String Sheet1_value="";
             String Sheet1_action="";
             int sheet1_value_num=0;
             
             while (cellIterator.hasNext()) {  ///inner  loop for cells in row

            	 Cell currentCell = cellIterator.next();
                  if(currentCell.getRowIndex() !=0){    //row 0 is header row titles
         			 if(currentCell.getColumnIndex()==0)
         	        {
         				Sheet1_id= currentCell.getStringCellValue();
         				 
         	        } 
         			 else if(currentCell.getColumnIndex()==1)
         	        {
         				Sheet1_type= currentCell.getStringCellValue();
         				 
         	        }
         			else if(currentCell.getColumnIndex()==2)
         	        {
         				if(Sheet1_type.equals("select") ||(currentCell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC)){
           					Sheet1_value = String.valueOf( (int) currentCell.getNumericCellValue());//StringCellValue();
         				}else{
         					Sheet1_value= currentCell.getStringCellValue();
         				}
         	        }
         			else if(currentCell.getColumnIndex()==3)
         	        {
         				 
         				Sheet1_action= currentCell.getStringCellValue();
         	        }
         			
         			//  System.out.print(currentCell.getStringCellValue() + "--"); 
         			 
             }
             }
             if(Sheet1_id !="" && Sheet1_type.equals("text")){
                 D1.findElement(By.id(Sheet1_id.trim())).sendKeys(Sheet1_value);
                }

            if(Sheet1_action.equals("click"))
            {
            	D1.findElement(By.id(Sheet1_id.trim())).click();
            }
        //    String idorg="idOrganization";
            Thread.sleep(1000);
            /*if(Sheet1_type.equals("select")){
         	   Select dropdown = new Select(D1.findElement(By.id(idorg)));
         		dropdown.selectByIndex((sheet1_value_num));
            }*/
         }
        
       // Thread.sleep(2000);
    	 
    	 D1.findElement(By.cssSelector("li[id=idLiSADShipping]")).click();
    	 Thread.sleep(1000);
    	 //D1.findElement(By.id("")).sendKeys("0019");
    	 D1.findElement(By.cssSelector("li[id=idLiSADBillDoc]")).click();
    	 Thread.sleep(1000);
    	 
    	 datatypeSheet = workbook.getSheetAt(5);  //for billing documents in sales area data
         iterator = datatypeSheet.iterator();

          while (iterator.hasNext()) {   ///outer loop for row 

              Row currentRow = iterator.next();
              Iterator<Cell> cellIterator = currentRow.iterator();

              String Sheet1_id="";
              String Sheet1_type="";
              String Sheet1_value="";
              String Sheet1_action="";
              int sheet1_value_num=0;
              
              while (cellIterator.hasNext()) {  ///inner  loop for cells in row

             	 Cell currentCell = cellIterator.next();
                   if(currentCell.getRowIndex() !=0){    //row 0 is header row titles
          			 if(currentCell.getColumnIndex()==0)
          	        {
          				Sheet1_id= currentCell.getStringCellValue().trim();
          				 
          	        } 
          			 else if(currentCell.getColumnIndex()==1)
          	        {
          				Sheet1_type= currentCell.getStringCellValue().trim();
          				 
          	        }
          			else if(currentCell.getColumnIndex()==2)
          	        {
          				if(Sheet1_type.equals("select") ||(currentCell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC)){
           					Sheet1_value = String.valueOf( (int) currentCell.getNumericCellValue());//StringCellValue();
          				}else{
          					Sheet1_value= currentCell.getStringCellValue().trim();
          				}
          	        }
          			else if(currentCell.getColumnIndex()==3)
          	        {
          				 
          				Sheet1_action= currentCell.getStringCellValue().trim();
          	        }
          			
          			//  System.out.print(currentCell.getStringCellValue() + "--"); 
          			 
              }
              }
              if(Sheet1_id !="" && Sheet1_type.equals("text")){
                  D1.findElement(By.id(Sheet1_id.trim())).sendKeys(Sheet1_value);
                 }

             if(Sheet1_action.equals("click"))
             {
             	D1.findElement(By.id(Sheet1_id.trim())).click();
             	 Thread.sleep(1000);
             }
         //    String idorg="idOrganization";
             Thread.sleep(2000);
             /*if(Sheet1_type.equals("select")){
          	   Select dropdown = new Select(D1.findElement(By.id(idorg)));
          		dropdown.selectByIndex((sheet1_value_num));
             }*/
          }
         
    	 
          
          D1.findElement(By.cssSelector("li[id=idLiAddCustData]")).click();
          Thread.sleep(1000);
          
          
          datatypeSheet = workbook.getSheetAt(6);  //for additional customer data
          iterator = datatypeSheet.iterator();

           while (iterator.hasNext()) {   ///outer loop for row 

               Row currentRow = iterator.next();
               Iterator<Cell> cellIterator = currentRow.iterator();

               String Sheet1_id="";
               String Sheet1_type="";
               String Sheet1_value="";
               String Sheet1_action="";
               int sheet1_value_num=0;
               
               while (cellIterator.hasNext()) {  ///inner  loop for cells in row

              	 Cell currentCell = cellIterator.next();
                    if(currentCell.getRowIndex() !=0){    //row 0 is header row titles
           			 if(currentCell.getColumnIndex()==0)
           	        {
           				Sheet1_id= currentCell.getStringCellValue().trim();
           				 
           	        } 
           			 else if(currentCell.getColumnIndex()==1)
           	        {
           				Sheet1_type= currentCell.getStringCellValue().trim();
           				 
           	        }
           			else if(currentCell.getColumnIndex()==2)
           	        {
           				if(Sheet1_type.equals("select") ||(currentCell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC)){
           					Sheet1_value = String.valueOf( (int) currentCell.getNumericCellValue());//StringCellValue();
           				}else{
           					Sheet1_value= currentCell.getStringCellValue().trim();
           				}
           	        }
           			else if(currentCell.getColumnIndex()==3)
           	        {
           				 
           				Sheet1_action= currentCell.getStringCellValue().trim();
           	        }
           			
           		
               }
               }
               if(Sheet1_id !="" && Sheet1_type.equals("text")){
                   D1.findElement(By.id(Sheet1_id.trim())).sendKeys(Sheet1_value);
                  }

              if(Sheet1_action.equals("click"))
              {
              	D1.findElement(By.id(Sheet1_id.trim())).click();
              	 Thread.sleep(1000);
              }
          
              Thread.sleep(2000);
             
           }
           
           
           
           D1.findElement(By.cssSelector("li[id=idLiTextData]")).click();
           Thread.sleep(1000);
           
           
           datatypeSheet = workbook.getSheetAt(7);  //for Text customer data
           iterator = datatypeSheet.iterator();

            while (iterator.hasNext()) {   ///outer loop for row 

                Row currentRow = iterator.next();
                Iterator<Cell> cellIterator = currentRow.iterator();

                String Sheet1_id="";
                String Sheet1_type="";
                String Sheet1_value="";
                String Sheet1_action="";
                int sheet1_value_num=0;
                
                while (cellIterator.hasNext()) {  ///inner  loop for cells in row

               	 Cell currentCell = cellIterator.next();
                     if(currentCell.getRowIndex() !=0){    //row 0 is header row titles
            			 if(currentCell.getColumnIndex()==0)
            	        {
            				Sheet1_id= currentCell.getStringCellValue().trim();
            				 
            	        } 
            			 else if(currentCell.getColumnIndex()==1)
            	        {
            				Sheet1_type= currentCell.getStringCellValue().trim();
            				 
            	        }
            			else if(currentCell.getColumnIndex()==2)
            	        {
            				if(Sheet1_type.equals("select") ||(currentCell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC)){
               					Sheet1_value = String.valueOf( (int) currentCell.getNumericCellValue());//StringCellValue();
            				}else{
            					Sheet1_value= currentCell.getStringCellValue().trim();
            				}
            	        }
            			else if(currentCell.getColumnIndex()==3)
            	        {
            				 
            				Sheet1_action= currentCell.getStringCellValue().trim();
            	        }
            			
            		
                }
                }
                if(Sheet1_id !="" && Sheet1_type.equals("text")){
                    D1.findElement(By.id(Sheet1_id.trim())).sendKeys(Sheet1_value);
                   }

               if(Sheet1_action.equals("click"))
               {
               	D1.findElement(By.id(Sheet1_id.trim())).click();
                Thread.sleep(1000);
               }
           
               Thread.sleep(2000);
              
            }
            
            
            
            
            D1.findElement(By.cssSelector("li[id=idLiNewtabother]")).click();
            Thread.sleep(1000);
            
            datatypeSheet = workbook.getSheetAt(8);  //for 0ther customer data
            iterator = datatypeSheet.iterator();

             while (iterator.hasNext()) {   ///outer loop for row 

                 Row currentRow = iterator.next();
                 Iterator<Cell> cellIterator = currentRow.iterator();

                 String Sheet1_id="";
                 String Sheet1_type="";
                 String Sheet1_value="";
                 String Sheet1_action="";
                 int sheet1_value_num=0;
                 
                 while (cellIterator.hasNext()) {  ///inner  loop for cells in row

                	 Cell currentCell = cellIterator.next();
                      if(currentCell.getRowIndex() !=0){    //row 0 is header row titles
             			 if(currentCell.getColumnIndex()==0)
             	        {
             				Sheet1_id= currentCell.getStringCellValue().trim();
             				 
             	        } 
             			 else if(currentCell.getColumnIndex()==1)
             	        {
             				Sheet1_type= currentCell.getStringCellValue().trim();
             				 
             	        }
             			else if(currentCell.getColumnIndex()==2)
             	        {
             				if(Sheet1_type.equals("select") ||(currentCell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC)){
               					Sheet1_value = String.valueOf( (int) currentCell.getNumericCellValue());//StringCellValue();
             				}else{
             					Sheet1_value= currentCell.getStringCellValue().trim();
             				}
             	        }
             			else if(currentCell.getColumnIndex()==3)
             	        {
             				 
             				Sheet1_action= currentCell.getStringCellValue().trim();
             	        }
             			
             		
                 }
                 }
                 if(Sheet1_id !="" && Sheet1_type.equals("text")){
                     D1.findElement(By.id(Sheet1_id.trim())).sendKeys(Sheet1_value);
                    }

                if(Sheet1_action.equals("click"))
                {
                	D1.findElement(By.id(Sheet1_id.trim())).click();
                	 
                }
            
                Thread.sleep(2000);
               
             }
            
            
            
             
             D1.findElement(By.cssSelector("li[id=idLiNotes]")).click();
             Thread.sleep(1000);
             
             datatypeSheet = workbook.getSheetAt(9);  //for Notes customer data
             iterator = datatypeSheet.iterator();

              while (iterator.hasNext()) {   ///outer loop for row 

                  Row currentRow = iterator.next();
                  Iterator<Cell> cellIterator = currentRow.iterator();

                  String Sheet1_id="";
                  String Sheet1_type="";
                  String Sheet1_value="";
                  String Sheet1_action="";
                  int sheet1_value_num=0;
                  
                  while (cellIterator.hasNext()) {  ///inner  loop for cells in row

                 	 Cell currentCell = cellIterator.next();
                       if(currentCell.getRowIndex() !=0){    //row 0 is header row titles
              			 if(currentCell.getColumnIndex()==0)
              	        {
              				Sheet1_id= currentCell.getStringCellValue().trim();
              				 
              	        } 
              			 else if(currentCell.getColumnIndex()==1)
              	        {
              				Sheet1_type= currentCell.getStringCellValue().trim();
              				 
              	        }
              			else if(currentCell.getColumnIndex()==2)
              	        {
              				if(Sheet1_type.equals("select") ||(currentCell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC)){
               					Sheet1_value = String.valueOf( (int) currentCell.getNumericCellValue());//StringCellValue();
              				}else{
              					Sheet1_value= currentCell.getStringCellValue().trim();
              				}
              	        }
              			else if(currentCell.getColumnIndex()==3)
              	        {
              				 
              				Sheet1_action= currentCell.getStringCellValue().trim();
              	        }
              			
              		
                  }
                  }
                  if(Sheet1_id !="" && Sheet1_type.equals("text")){
                      D1.findElement(By.id(Sheet1_id.trim())).sendKeys(Sheet1_value);
                     }

                 if(Sheet1_action.equals("click"))
                 {
                 	D1.findElement(By.id(Sheet1_id.trim())).click();
                 	 //Thread.sleep(1000);
                 }
             
                 Thread.sleep(2000);
                
              } 
              
              
              
     //     
    	 //D1.findElement(By.cssSelector("li[id=idLiSADPartnerFunc]")).click();
    	 
    	// D1.findElement(By.id("")).click();
    	 

    	/* WebDriverWait wait = new WebDriverWait(D1,30);
    	 WebElement ele =   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='idChkBPartFunc']")));   examining the xpath for a search     
    	    box*/
    	 //   D1.findElement(By.xpath("//*[@id='campaignListTable']")).sendKeys("TEXT");    
    	   
    	 
    	/* int length = D1.findElements(By.id("idChkBPartFunc")).size();
    	 //WebDriverWait wait = new WebDriverWait(D1,10);
    	 for (int i = 0; i < length; i++) {
    	   ele = wait.until(ExpectedConditions.elementToBeClickable(D1.findElements(By.id("idChkBPartFunc")).get(i)));
    	// ele= D1.findElement(By.xpath("//*[@id='idChkBPartFunc']")).get(i);
    		 if(i==5){
    		   if (!ele.isSelected())
       	           ele.click();   
    	   }
    	 }*/
    	 
    	 /*if ( !D1.findElement(By.id("idChkBPartFunc")).isSelected() )
    	 {
    		 D1.findElement(By.id("idChkBPartFunc4")).click();
    	 }
    */	 //D1.findElement(By.id("idPartFuncEdit")).click();
    	 
       /* D1.findElement(By.id("idCompanyName")).sendKeys("XYZ");
		D1.findElement(By.id("idSearchterm")).sendKeys("2");		
		D1.findElement(By.id("idBuildingCode")).sendKeys("A2");	
		D1.findElement(By.id("idRoom")).sendKeys("52");	
		D1.findElement(By.id("idAddressFloor")).sendKeys("3");		
		D1.findElement(By.id("idCO")).sendKeys("AA");		
		D1.findElement(By.id("idStreet2")).sendKeys("WW");		
		D1.findElement(By.id("idStreet3")).sendKeys("zz");
		D1.findElement(By.id("idStreetHousenumber")).sendKeys("AB");
		Thread.sleep(2000);
		D1.findElement(By.id("idStreetHousenumber2")).sendKeys("CD");
		Thread.sleep(2000);
		D1.findElement(By.id("idSupply")).sendKeys("100");
		Thread.sleep(2000);
		
		
		D1.findElement(By.id("idStreet4")).sendKeys("26");
		D1.findElement(By.id("idStreet5")).sendKeys("28");
		D1.findElement(By.id("idDistrict")).sendKeys("Pune");
		D1.findElement(By.id("idDifferentCity")).sendKeys("balewadi");
		D1.findElement(By.id("idpostalCode")).sendKeys("411045");
		
		Thread.sleep(2000);
		
		D1.findElement(By.id("idCity")).sendKeys("PUNE");
		
		Thread.sleep(2000);
		
		D1.findElement(By.id("idInputCountryList")).sendKeys("IN");
		
		Thread.sleep(2000);	
		
		D1.findElement(By.id("idInputRegionList")).sendKeys("13");
		Thread.sleep(2000);	
		
		D1.findElement(By.id("idTimeZonelist")).sendKeys("INDIA");
		
		D1.findElement(By.id("idInputLanguageList")).sendKeys("2");
		D1.findElement(By.id("idTelephone1")).sendKeys("02066666666");
		
		D1.findElement(By.id("idExtension1")).sendKeys("30");
		
		D1.findElement(By.id("idMobilePhone1")).sendKeys("9000000002");
		D1.findElement(By.id("idFax")).sendKeys("02030303030");
		
		Thread.sleep(2000);	
		
		D1.findElement(By.id("idExtensionFax")).sendKeys("4012");
		D1.findElement(By.id("idEmail1")).sendKeys("as@hj");
		
		Thread.sleep(2000);	
		
		D1.findElement(By.id("idBtnSaveCustAddrs")).click();
		
		Thread.sleep(2000);	
		
		//D1.findElement(By.id("idLiCCDCommon")).click();
		D1.findElement(By.cssSelector("li[id=idLiCCDCommon]")).click();*/
		//D1.findElement(By.xpath("//div[3]/div[3]/div/div[1]/ul/li[1])")).click();idLiControlData
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}	

}