import java.io.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import com.lowagie.text.*;
import com.lowagie.text.Font;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.*;
import sun.font.FontFamily;

public class printSahmiye{
    JTable table;
    
    
    public printSahmiye(JTable table){
        this.table=table;
    }
    public void generatePdf()
    {
       try{
                    int row=table.getRowCount();
                    Document document=new Document();
                    PdfWriter.getInstance(document,new FileOutputStream(System.getProperty("user.home")+"\\Desktop\\gozaresh-sahmiye.pdf"));
                    document.open();
                    PdfPTable tab=new PdfPTable(6);
                    PdfPCell pc=null;
                    BaseFont bs=BaseFont.createFont("TITRB.TTF",BaseFont.IDENTITY_H,true);
                    Font font=new Font(bs);
                    Paragraph p9=new Paragraph("مکان",font);
                    pc=new PdfPCell();
                    pc.addElement(p9);
                    p9.setAlignment(Element.ALIGN_CENTER);
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    pc.setFixedHeight(45);
                    tab.addCell(pc);
                    Paragraph p8=new Paragraph("نوع",font);
                    pc=new PdfPCell();
                    pc.addElement(p8);
                    p8.setAlignment(Element.ALIGN_CENTER);
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    pc.setFixedHeight(45);
                    tab.addCell(pc);
                    Paragraph p7=new Paragraph("سال",font);
                    pc=new PdfPCell();
                    pc.addElement(p7);
                    p7.setAlignment(Element.ALIGN_CENTER);
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    pc.setFixedHeight(45);
                    tab.addCell(pc);
                    Paragraph p6=new Paragraph("سهمیه مصرفی",font);
                    pc=new PdfPCell();
                    pc.addElement(p6);
                    p6.setAlignment(Element.ALIGN_CENTER);
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    pc.setFixedHeight(45);
                    tab.addCell(pc);
                     Paragraph p5=new Paragraph("سهمیه کل",font);
                    pc=new PdfPCell();
                    pc.addElement(p5);
                    p5.setAlignment(Element.ALIGN_CENTER);
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    pc.setFixedHeight(45);
                    tab.addCell(pc);
                     Paragraph p4=new Paragraph("شناسه",font);
                    pc=new PdfPCell();
                    pc.addElement(p4);
                    p4.setAlignment(Element.ALIGN_CENTER);
                    pc.setFixedHeight(45);
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
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
                            pc.setFixedHeight(45);        
                            pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                           // tab.setWidthPercentage(100);
                            tab.addCell(pc);

                        }


                    }
                    document.addCreationDate();

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