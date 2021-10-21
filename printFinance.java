
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
import java.util.ArrayList;
import javax.swing.JTable;
import nezam.Finance;
import nezam.Main;

public class printFinance{
    int id;
    JTable table;
    ArrayList<Finance> temp;
    
    
    
    public printFinance(JTable table,int id,ArrayList<Finance> temp){
        this.id=id;
        this.table=table;
        this.temp=temp;
    }
      public String  calculateTotalBedehkari()
     {
         String value;
         int total=0;
         
         for( Finance f: temp )
         {
             total += f.getBedehkariamount();
         }
         value=String.valueOf(total);
         return value;
     }
      
        public String  calculateTotalPay()
     {
         String value;
         int total=0;
         
         for( Finance f: temp )
         {
             total += f.getPay();
         }
         value=String.valueOf(total);
         return value;
     }
        
    public void generatePdf()
    {
        
        manageEng mg=new manageEng();
       Main main=mg.getMain(id);
       String name=main.getFname();
       String lname=main.getLname();
       String cmeli=main.getMelicode();
       String membershipnum=main.getMembershipnumber();
       try{
          
                    int row=table.getRowCount();
                    Document document = new Document(PageSize.A4);
                   
        
                     PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream( System.getProperty("user.home")+"\\Desktop\\gozaresh-finance.pdf"));
                   // Paragraph mansur=new Paragraph("mansurrrr");
                     HeaderFooterPageEvent event = new HeaderFooterPageEvent();
                     writer.setPageEvent(event);
                     
                       
                       document.open();
                      PdfContentByte cb = writer.getDirectContent();
        

                      PdfReader reader = new PdfReader(System.getProperty("user.home")+"\\Desktop\\kardani\\import600.pdf");
                      PdfImportedPage page = writer.getImportedPage(reader, 1);
         
                      cb.addTemplate(page, 0, 0);
                       
                        document.add(new Paragraph(new Chunk(".")));
                      
                      
                     BaseFont bs=BaseFont.createFont("TITRB.TTF",BaseFont.IDENTITY_H,true);
                     Font font=new Font(bs,10);
                     

                      
         
                  
                    
                     
                   
                    PdfPTable tab=new PdfPTable(8);
                    tab.setWidthPercentage(100);
                   
                 tab.setSpacingBefore(210f);
                 float[] columnWidths = new float[]{40f, 40f, 40f, 45f,50f,50f,30f,30f};
                 tab.setWidths(columnWidths);
              //      tab.writeSelectedRows(0, -1, document.right() - tabwidth, document.top(), canvas);
                  // tab.setTotalWidth(document.right(document.rightMargin()) - document.left(document.leftMargin()));
                    PdfPCell pc=null;
                    
                   
                    Paragraph p7=new Paragraph("مانده",font);
                    pc=new PdfPCell();
                    pc.addElement(p7);
                    p7.setAlignment(Element.ALIGN_CENTER);
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    pc.setFixedHeight(35);
                    pc.setBorderWidth(2f);
                    
                    tab.addCell(pc);
                    
                    Paragraph p6=new Paragraph(" پرداختی",font);
                    pc=new PdfPCell();
                    pc.addElement(p6);
                    pc.setBorderWidth(2f);
                    p6.setAlignment(Element.ALIGN_CENTER);
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    pc.setFixedHeight(35);
                    tab.addCell(pc);
                     Paragraph p5=new Paragraph(" بدهکاری",font);
                    pc=new PdfPCell();
                    pc.setBorderWidth(2f);
                    pc.addElement(p5);
                    p5.setAlignment(Element.ALIGN_CENTER);
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    pc.setFixedHeight(35);
                    tab.addCell(pc);
                     Paragraph p4=new Paragraph("نوع سند",font);
                    pc=new PdfPCell();
                    pc.setBorderWidth(2f);
                    pc.addElement(p4);
                    p4.setAlignment(Element.ALIGN_CENTER);
                    pc.setFixedHeight(35);
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    tab.addCell(pc);
                    Paragraph p3=new Paragraph("تاریخ پرداخت",font);
                    pc=new PdfPCell();
                    pc.setBorderWidth(2f);
                    pc.addElement(p3);
                    p3.setAlignment(Element.ALIGN_CENTER);
                    pc.setFixedHeight(35);
                    
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    tab.addCell(pc);
                     Paragraph p2=new Paragraph("تاریخ ثبت",font);
                    pc=new PdfPCell();
                    pc.setBorderWidth(2f);
                    pc.addElement(p2);
                    pc.setFixedHeight(35);
                    p2.setAlignment(Element.ALIGN_CENTER);
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    tab.addCell(pc);
                     Paragraph p1=new Paragraph("شناسه",font);
                    pc=new PdfPCell();
                    pc.setBorderWidth(2f); 
                    pc.addElement(p1);
                    p1.setAlignment(Element.ALIGN_CENTER);
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    pc.setFixedHeight(35);
                    tab.addCell(pc);
                     Paragraph p0=new Paragraph("ردیف",font);
                    pc=new PdfPCell();
                    pc.setBorderWidth(2f); 
                    pc.addElement(p0);
                    p0.setAlignment(Element.ALIGN_CENTER);
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    pc.setFixedHeight(35);
                    tab.addCell(pc);
                  
                    
                    int column=7;
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
                        
                     int b=Integer.parseInt(calculateTotalBedehkari());
                     int p=Integer.parseInt(calculateTotalPay());
                     int left=b - p;
                     String valueLeft=String.valueOf(left);
                    Paragraph p71=new Paragraph(valueLeft,font);
                    pc=new PdfPCell();
                    pc.addElement(p71);
                    p71.setAlignment(Element.ALIGN_CENTER);
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    pc.setFixedHeight(35);
                    pc.setBorderWidth(2f);
                    tab.addCell(pc);
                    
                    String valuePay=calculateTotalPay();
                    Paragraph p61=new Paragraph(valuePay,font);
                    pc=new PdfPCell();
                    pc.addElement(p61);
                    pc.setBorderWidth(2f);
                    p61.setAlignment(Element.ALIGN_CENTER);
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    pc.setFixedHeight(35);
                    tab.addCell(pc);
                    
                    String valueBedehkari=calculateTotalBedehkari();
                    Paragraph p51=new Paragraph(valueBedehkari,font);
                    pc=new PdfPCell();
                    pc.setBorderWidth(2f);
                    pc.addElement(p51);
                    p51.setAlignment(Element.ALIGN_CENTER);
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    pc.setFixedHeight(35);
                    tab.addCell(pc);
                    
                     Paragraph p41=new Paragraph("---",font);
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
                    
                    Paragraph p11=new Paragraph("---",font);
                    pc=new PdfPCell();
                    pc.setBorderWidth(2f); 
                    pc.addElement(p11);
                    p11.setAlignment(Element.ALIGN_CENTER);
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    pc.setFixedHeight(35);
                    tab.addCell(pc);
                    
                     Paragraph p00=new Paragraph("مجموع",font);
                    pc=new PdfPCell();
                    pc.setBorderWidth(2f); 
                    pc.addElement(p00);
                    p00.setAlignment(Element.ALIGN_CENTER);
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    pc.setFixedHeight(35);
                    tab.addCell(pc);
                    


                    
                    
                    
                     ColumnText c1 = new ColumnText(writer.getDirectContent());
                   c1.setSimpleColumn(410,500,700,625);
                  c1.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                 c1.addElement(new Paragraph( name +" "+ lname,font));
                  c1.go();
                  
                   ColumnText c2 = new ColumnText(writer.getDirectContent());
                   c2.setSimpleColumn(240,500,600,625);
                   c2.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                  c2.addElement(new Paragraph( membershipnum,font));
                  c2.go();
                  
                   ColumnText c3 = new ColumnText(writer.getDirectContent());
                   c3.setSimpleColumn(70,500,600,625);
                  c3.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                  c3.addElement(new Paragraph( cmeli,font));
                  c3.go();
                   
                   
            
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