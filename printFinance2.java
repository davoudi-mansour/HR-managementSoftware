
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

public class printFinance2{
   
    JTable table;
    java.util.List finance;
    Date start;
    Date finish;
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");

    
    
    public printFinance2(Date start,Date finish,JTable table ,java.util.List finance){
       
        this.table=table;
        this.finance=finance;
        this.start=start;
        this.finish=finish;
    }
    
        
    public void generatePdf()
    {
        
      
       try{
          
                    int row=table.getRowCount();
                    Document document = new Document(PageSize.A4);
                   
        
                     PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream( System.getProperty("user.home")+"\\Desktop\\gozaresh-finance-general-2.pdf"));
                   // Paragraph mansur=new Paragraph("mansurrrr");
                     HeaderFooterPageEvent event = new HeaderFooterPageEvent();
                     writer.setPageEvent(event);
                     
                       
                       document.open();
                      PdfContentByte cb = writer.getDirectContent();
        

                      PdfReader reader = new PdfReader(System.getProperty("user.home")+"\\Desktop\\kardani\\import602.pdf");
                      PdfImportedPage page = writer.getImportedPage(reader, 1);
         
                      cb.addTemplate(page, 0, 0);
                       
                        document.add(new Paragraph(new Chunk(".")));
                      
                      
                     BaseFont bs=BaseFont.createFont("TITRB.TTF",BaseFont.IDENTITY_H,true);
                     Font font=new Font(bs,10);
                    
                    PdfPTable tab=new PdfPTable(3);
                    tab.setWidthPercentage(100);
                   
                 tab.setSpacingBefore(180f);
                 float[] columnWidths = new float[]{20f, 20f, 20f};
                 tab.setWidths(columnWidths);
            
                    PdfPCell pc=null;
                  
                   
                    Paragraph p3=new Paragraph("مبلغ",font);
                    pc=new PdfPCell();
                    pc.setBorderWidth(2f);
                    pc.addElement(p3);
                    p3.setAlignment(Element.ALIGN_CENTER);
                    pc.setFixedHeight(35);
                    
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    tab.addCell(pc);
                    
                     Paragraph p2=new Paragraph("نوع",font);
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
                    
                  
                    
                    int column=2;
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