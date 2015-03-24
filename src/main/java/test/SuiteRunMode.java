package test;

import com.util.Xls_Reader;

/**
 * Created by mkaleem on 3/24/15.
 */
public class SuiteRunMode {
     public static void main(String[] args){
         System.out.println(System.getProperty("user.dir")+ "src/main/java/xls/AffliateTestData_PROD.xls");
         System.out.println();

        // Xls_Reader x = new Xls_Reader(System.getProperty("user.dir")
     }
    public static boolean isSuiteRunnable(Xls_Reader xls , String suiteName){
        boolean isExecutable=false;
        for(int i=2; i <= xls.getRowCount("Test Suite") ;i++ ){
            String suite = xls.getCellData("Test Suite", "TSID", i);
            String runmode = xls.getCellData("Test Suite", "Runmode", i);

            if(suite.equalsIgnoreCase(suiteName)){
                if(runmode.equalsIgnoreCase("Y")){
                    isExecutable=true;
                }else{
                    isExecutable=false;
                }
            }

        }
        xls=null; // release memory
        return isExecutable;

    }

}