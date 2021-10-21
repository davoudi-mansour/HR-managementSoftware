
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JTable;
import nezam.Finance;
import nezam.Main;

public class printFinance1{
   
    JTable table;
    java.util.List finance;
    Date start;
    Date finish;
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");

    
    
    public printFinance1(Date start,Date finish,JTable table ,java.util.List finance){
       
        this.table=table;
        this.finance=finance;
        this.start=start;
        this.finish=finish;
    }
      public String  calculateBedehkari()
     {
         String value;
         int total=0;
         
         for( int i=0;i<finance.size();i++)
         {
             Finance f=(Finance) finance.get(i);
             total += f.getBedehkariamount();
         }
         value=String.valueOf(total);
         return value;
     }
      
       public String  calculatePay()
     {
         String value;
         int total=0;
         
        for( int i=0;i<finance.size();i++)
         {
             Finance f=(Finance) finance.get(i);
             total += f.getPay();
         }
         value=String.valueOf(total);
         return value;
     }
      
       
        
    public void generatePdf()
    {
        
      
       try{
          
                    int row=table.getRowCount();
                    Document document = new Document(PageSize.A4);
                    
                   
        
                     PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream( System.getProperty("user.home")+"\\Desktop\\gozaresh-finance-general.pdf"));
                   // Paragraph mansur=new Paragraph("mansurrrr");
                     HeaderFooterPageEvent event = new HeaderFooterPageEvent();
                     writer.setPageEvent(event);
                     
                       
                       document.open();
                      PdfContentByte cb = writer.getDirectContent();
        

                      PdfReader reader = new PdfReader(System.getProperty("user.home")+"\\Desktop\\kardani\\import601.pdf");
                      PdfImportedPage page = writer.getImportedPage(reader, 1);
         
                      cb.addTemplate(page, 0, 0);
                       
                        document.add(new Paragraph(new Chunk(".")));
                      
                      
                     BaseFont bs=BaseFont.createFont("TITRB.TTF",BaseFont.IDENTITY_H,true);
                     Font font=new Font(bs,10);
                    
                    PdfPTable tab=new PdfPTable(6);
                    tab.setWidthPercentage(100);
                   
                 tab.setSpacingBefore(180f);
                 float[] columnWidths = new float[]{20f, 20f, 20f, 20f,20f,20f};
                 tab.setWidths(columnWidths);
            
                    PdfPCell pc=null;
                    
//                    Paragraph p8=new Paragraph("شماره همراه",font);
//                    pc=new PdfPCell();
//                    pc.addElement(p8);
//                    pc.setBorderWidth(2f);
//                    p8.setAlignment(Element.ALIGN_CENTER);
//                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
//                    pc.setFixedHeight(35);
//                    tab.addCell(pc);
//                    
//                    Paragraph p7=new Paragraph(" تاریخ تمدید",font);
//                    pc=new PdfPCell();
//                    pc.addElement(p7);
//                    pc.setBorderWidth(2f);
//                    p7.setAlignment(Element.ALIGN_CENTER);
//                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
//                    pc.setFixedHeight(35);
//                    tab.addCell(pc);
//                  
                    Paragraph p6=new Paragraph(" مانده",font);
                    pc=new PdfPCell();
                    pc.addElement(p6);
                    pc.setBorderWidth(2f);
                    p6.setAlignment(Element.ALIGN_CENTER);
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    pc.setFixedHeight(35);
                    tab.addCell(pc);
                     Paragraph p5=new Paragraph(" پرداختی",font);
                    pc=new PdfPCell();
                    pc.setBorderWidth(2f);
                    pc.addElement(p5);
                    p5.setAlignment(Element.ALIGN_CENTER);
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    pc.setFixedHeight(35);
                    tab.addCell(pc);
                     Paragraph p4=new Paragraph("بدهکاری",font);
                    pc=new PdfPCell();
                    pc.setBorderWidth(2f);
                    pc.addElement(p4);
                    p4.setAlignment(Element.ALIGN_CENTER);
                    pc.setFixedHeight(35);
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    tab.addCell(pc);
                    Paragraph p3=new Paragraph("شماره عضویت",font);
                    pc=new PdfPCell();
                    pc.setBorderWidth(2f);
                    pc.addElement(p3);
                    p3.setAlignment(Element.ALIGN_CENTER);
                    pc.setFixedHeight(35);
                    
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    tab.addCell(pc);
                     Paragraph p2=new Paragraph("نام",font);
                    pc=new PdfPCell();
                    pc.setBorderWidth(2f);
                    pc.addElement(p2);
                    pc.setFixedHeight(35);
                    p2.setAlignment(Element.ALIGN_CENTER);
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    tab.addCell(pc);
                     Paragraph p1=new Paragraph("ردیف",font);
                    pc=new PdfPCell();
                    pc.setBorderWidth(2f); 
                    pc.addElement(p1);
                    p1.setAlignment(Element.ALIGN_CENTER);
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    pc.setFixedHeight(35);
                    tab.addCell(pc);
                    
                  
                    
                    int column=5;
                    for(int i=0;i<row;i++){
                        for(int j=column;j>=0;j--)
                        {
                            pc=new PdfPCell();
                            Object obj = GetData(table, i, j);
                            String value=obj.toString();
                            Paragraph p=new Paragraph(value,font);
                            p.setAlignment(Element.ALIGN_CENTER);
                            pc.addElement(p);
                            pc.setFixedHeight(35);
                            
                            pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                          
                            tab.addCell(pc);

                        }
                        
                    }
                    String valueBedehkari=calculateBedehkari();
                    String valuePay=calculatePay();
                    int v1=Integer.parseInt(valueBedehkari);
                    int v2=Integer.parseInt(valuePay);
                    int left=v1 - v2;
                    String valueLeft=String.valueOf(left);
                    
                    Paragraph p61=new Paragraph(valueLeft,font);
                    pc=new PdfPCell();
                    pc.addElement(p61);
                    pc.setBorderWidth(2f);
                    p61.setAlignment(Element.ALIGN_CENTER);
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    pc.setFixedHeight(35);
                    tab.addCell(pc);
                     Paragraph p51=new Paragraph(valuePay ,font);
                    pc=new PdfPCell();
                    pc.setBorderWidth(2f);
                    pc.addElement(p51);
                    p51.setAlignment(Element.ALIGN_CENTER);
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    pc.setFixedHeight(35);
                    tab.addCell(pc);
                     Paragraph p41=new Paragraph(valueBedehkari,font);
                    pc=new PdfPCell();
                    pc.setBorderWidth(2f);
                    pc.addElement(p41);
                    p41.setAlignment(Element.ALIGN_CENTER);
                    pc.setFixedHeight(35);
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    tab.addCell(pc);
                    Paragraph p31=new Paragraph("---",font);
                    pc=new PdfPCell();
                    pc.setBorderWidth(2f);
                    pc.addElement(p31);
                    p31.setAlignment(Element.ALIGN_CENTER);
                    pc.setFixedHeight(35);
                    
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    tab.addCell(pc);
                    Paragraph p21=new Paragraph("---",font);
                    pc=new PdfPCell();
                    pc.setBorderWidth(2f);
                    pc.addElement(p21);
                    pc.setFixedHeight(35);
                    p21.setAlignment(Element.ALIGN_CENTER);
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    tab.addCell(pc);
                     Paragraph p11=new Paragraph("مجموع",font);
                    pc=new PdfPCell();
                    pc.setBorderWidth(2f); 
                    pc.addElement(p11);
                    p11.setAlignment(Element.ALIGN_CENTER);
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    pc.setFixedHeight(35);
                    tab.addCell(pc);
                   
                  ColumnText c1 = new ColumnText(writer.getDirectContent());
                  c1.setSimpleColumn(425,500,700,658);
                  c1.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                  String startDate=formatter.format(start);
                 c1.addElement(new Paragraph( startDate,font));
                  c1.go();
                  
                   ColumnText c2 = new ColumnText(writer.getDirectContent());
                   c2.setSimpleColumn(265,500,600,658);
                   c2.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                   String finishDate=formatter.format(finish);
                   c2.addElement(new Paragraph( finishDate,font));
                   c2.go();
                  
                 
                   
            
                  document.add(tab);
               
          
                    document.close();
                }
                catch(Exception e){}
            }
        
    public Object GetData(JTable table, int row_index, int col_index){
        Object obj= table.getModel().getValueAt(row_index, col_index);
        if(obj==null)
        {
            obj="---";
        }
        return obj;
    }
}