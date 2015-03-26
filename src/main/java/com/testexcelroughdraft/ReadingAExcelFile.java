package com.testexcelroughdraft;

import com.util.Xls_Reader;

/**
 * Created by mkaleem on 3/26/15.
 */
public class ReadingAExcelFile {

   public static void main (String [] args) {

       Xls_Reader d = new Xls_Reader("/Users/mkaleem/AppiumProjects/CoreFramework/src/main/java/com/testexcelroughdraft/TestData.xlsx");
       System.out.println(d.getRowCount("SheetONe"));
       System.out.println(d.getCellData("UserName","Password", 3));

   }
}
