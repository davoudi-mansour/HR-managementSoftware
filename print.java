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

public class print{
    JTable table;
    
    
    public print(JTable table){
        this.table=table;
    }
    public void generatePdf()
    {
       try{
                    int row=table.getRowCount();
                    Document document=new Document();
                    PdfWriter.getInstance(document,new FileOutputStream(System.getProperty("user.home")+"\\Desktop\\gozaresh.pdf"));
                    document.open();
                    PdfPTable tab=new PdfPTable(7);
                    PdfPCell pc=null;
                    BaseFont bs=BaseFont.createFont("TITRB.TTF",BaseFont.IDENTITY_H,true);
                    Font font=new Font(bs);
                   
                    Paragraph p7=new Paragraph("شماره همراه",font);
                    pc=new PdfPCell();
                    pc.addElement(p7);
                    p7.setAlignment(Element.ALIGN_CENTER);
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    pc.setFixedHeight(45);
                    tab.addCell(pc);
                      Paragraph p6=new Paragraph("بدهکاری",font);
                    pc=new PdfPCell();
                    pc.addElement(p6);
                    p6.setAlignment(Element.ALIGN_CENTER);
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    pc.setFixedHeight(45);
                    tab.addCell(pc);
                     Paragraph p5=new Paragraph("نام پدر",font);
                    pc=new PdfPCell();
                    pc.addElement(p5);
                    p5.setAlignment(Element.ALIGN_CENTER);
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    pc.setFixedHeight(45);
                    tab.addCell(pc);
                     Paragraph p4=new Paragraph("نام خانوادگی",font);
                    pc=new PdfPCell();
                    pc.addElement(p4);
                    p4.setAlignment(Element.ALIGN_CENTER);
                    pc.setFixedHeight(45);
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    tab.addCell(pc);
                    Paragraph p3=new Paragraph("نام",font);
                    pc=new PdfPCell();
                    pc.addElement(p3);
                    p3.setAlignment(Element.ALIGN_CENTER);
                    pc.setFixedHeight(45);
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    tab.addCell(pc);
                     Paragraph p2=new Paragraph("شناسه",font);
                    pc=new PdfPCell();
                    pc.addElement(p2);
                    pc.setFixedHeight(45);
                    p2.setAlignment(Element.ALIGN_CENTER);
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    tab.addCell(pc);
                     Paragraph p1=new Paragraph("ردیف",font);
                    pc=new PdfPCell();
                    pc.addElement(p1);
                    p1.setAlignment(Element.ALIGN_CENTER);
                    pc.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
                    pc.setFixedHeight(45);
                    tab.addCell(pc);
                    
                    int column=7;
                    for(int i=0;i<row;i++){
                        for(int j=0;j<column;j++)
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
        return table.getModel().getValueAt(row_index, col_index);
    }
}