import com.lowagie.text.Row;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import nezam.Finance;
import nezam.Main;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Excel {
    
    Main user=null;
    java.util.List eng;
    JTable table=null;
    
    
    public Excel(java.util.List eng){
        this.eng=eng;
        createExcel();
    }
    public Excel(JTable table){
        
          this.table=table;
          createExcel1();
        
        
    }
    
    public void createExcel1(){
        TableModel model = table.getModel();
  XSSFWorkbook workbook = new XSSFWorkbook();
  Sheet sheet = workbook.createSheet();
  org.apache.poi.ss.usermodel.Row row;
  Cell cell;

  // write the column headers
  row = sheet.createRow(0);
  for (int c = 0; c < model.getColumnCount(); c++) {
   cell = row.createCell(c);
   cell.setCellValue(model.getColumnName(c));
  }

  // write the data rows
  for (int r = 0; r < model.getRowCount(); r++) {
   row = sheet.createRow(r+1);
   for (int c = 0; c < model.getColumnCount(); c++) {
    cell = row.createCell(c);
    Object value = model.getValueAt(r, c);
    
    if (value instanceof String) {
     cell.setCellValue((String)value);
    } else if (value instanceof Double) {
     cell.setCellValue((Double)value);
    }
    else if (value instanceof Integer) {
     cell.setCellValue((Integer)value);
    }
     
   }
  }  
   try{
               FileOutputStream out = new FileOutputStream(new File(System.getProperty("user.home")+"\\Desktop\\gozaresh-excel.xlsx"));     
               workbook.write(out);
               out.close();
      }
      catch(IOException e1){
          
      }
    }

    
    public void createExcel(){
 
      XSSFWorkbook workbook = new XSSFWorkbook();
      //Create a blank sheet
      XSSFSheet spreadsheet = workbook.createSheet( "اطلاعات کاربران");
      //Create row object
      XSSFRow row;  
      Map < String, Object[] > empinfo = new TreeMap < String, Object[] >();
      empinfo.put( "1", new Object[] {
         "نام", "نام خانوادگی", "نام پدر","کد ملی","تاریخ تولد","صادره","شماره شناسنامه","شماره همراه","آدرس","آدرس محل کار","رشته","گرایش","شماره عضویت","نوع عضویت","تاریخ انتقالی","تاریخ تمدید عصویت","شماره پروانه","تاریخ آخرین تمدید","تاریخ اعتبار پروانه","پایه","صلاحیت نظارت","صلاحیت اجرا","کد بایگانی","محل نظارت"});
         for (int i = 0; i < eng.size(); i++){
           user=(Main) eng.get(i);
           ArrayList<String>loc=new ArrayList<>();
           if(user.getNezaratshiraz() != null)
               loc.add(user.getNezaratshiraz());
           if(user.getNezaratbonyad()!= null)
               loc.add(user.getNezaratbonyad());
           if(user.getNezaratsadra()!= null)
               loc.add(user.getNezaratsadra());
           if(user.getNezaratshahrestan()!= null)
               loc.add(user.getNezaratshahrestan());
           String locResult=String.join("-", loc);
 
           empinfo.put( String.valueOf(i+2), new Object[] {
               user.getFname(),user.getLname(),user.getFathername(),user.getMelicode(),user.getDofbirth(),user.getCofbirth(),user.getIdentitycardnumber(),user.getMphone(),user.getAddress(),user.getJobaddress(),user.getMajor(),user.getGerayesh(),user.getMembershipnumber(),user.getOzviyattype(),user.getDenteghali(),user.getDtmdidozviyat(),user.getLicensenumber(),user.getDtamdid(),user.getDendetebar(),user.getPaye(),user.getTypequalifucation(),user.getDqualification(),user.getArchivecode(),locResult});           
       }
      
      Set < String > keyid = empinfo.keySet();
      int rowid = 0;
      
      for (String key : keyid) {
         row = spreadsheet.createRow(rowid++);
         Object [] objectArr = empinfo.get(key);
         int cellid = 0;
         
         for (Object obj : objectArr){
            Cell cell = row.createCell(cellid++);
            cell.setCellValue((String)obj);
         }
      }
      try{
               FileOutputStream out = new FileOutputStream(new File(System.getProperty("user.home")+"\\Desktop\\gozaresh.xlsx"));     
               workbook.write(out);
               out.close();
      }
      catch(Exception e){
          
      }
         
       //System.out.print(identify.usr);
      //System.out.println("Writesheet.xlsx written successfully");
      
   
      
    }
}
