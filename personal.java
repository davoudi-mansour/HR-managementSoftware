
import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.ColumnText;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfImportedPage;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Rectangle;
import java.io.FileOutputStream;
import nezam.Main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mansour davoudi
 */
public class personal {
    page9 p9=null;
    public personal(page9 p9)
    {
        this.p9=p9;
    }
    
    
   public  void generatePdf()
   {
       manageEng mg=new manageEng();
       int id=Integer.parseInt(p9.textField84.getText());
       Main main=mg.getMain(id);
       String name=main.getFname();
       String lname=main.getLname();
       String faname=main.getFathername();
       String latin=main.getLatin();
       String cmeli=main.getMelicode();
       String identitynumber=main.getIdentitycardnumber();
       String loc=main.getCofbirth();
       String birth=main.getDofbirth();
       String nezamvazife=main.getSarbazi();
       String religious=main.getReligion();
       String ozviyatno=main.getMembershipnumber();
       String parvaneno=main.getLicensenumber();
       String address=main.getAddress();
       String postal=main.getPostalcode();
       String hphone=main.getMphone();
       String sphone=main.getHphone();
       String madrak=main.getMadraknezarat();
       String major=main.getMajor();
       String uni=main.getUniname();
       String denduni=main.getDenduni();
       String dinputinfo=main.getDateinputinfo();
       String jobplace=main.getJobplace();
       String jobaddress=main.getJobaddress();
       String sabeghe=main.getSabeghe();
       String semat=main.getSemat();
       String savabegh=main.getSavabegh();
       String filename=main.getFname()+"-"+main.getLname();
       
       try{
        
                    
        Document document = new Document(PageSize.A4);
        
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(System.getProperty("user.home")+"\\Desktop\\"+filename+"1.pdf"));
        
        document.open();
        PdfContentByte cb = writer.getDirectContent();


        PdfReader reader = new PdfReader(System.getProperty("user.home")+"\\Desktop\\kardani\\import.pdf");
        PdfImportedPage page = writer.getImportedPage(reader, 1);
         
         cb.addTemplate(page, 0, 0);
         BaseFont bs=BaseFont.createFont("BZar.ttf",BaseFont.IDENTITY_H,true);
         Font font = new Font(bs, 14);
        
        ColumnText c1 = new ColumnText(writer.getDirectContent());
        c1.setSimpleColumn(300,600,455,720);
        c1.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c1.addElement(new Paragraph( name+" "+lname,font));
        c1.go();
        
        ColumnText c2 = new ColumnText(writer.getDirectContent());
        c2.setSimpleColumn(118,600,180,720);
        c2.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c2.addElement(new Paragraph( faname,font));
        c2.go();
        
        ColumnText c3= new ColumnText(writer.getDirectContent());
        c3.setSimpleColumn(120,600,350,675);
       // c3.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c3.addElement(new Paragraph( latin));
        c3.go();
        
         ColumnText c4= new ColumnText(writer.getDirectContent());
        c4.setSimpleColumn(368,500,538,640);
        c4.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c4.addElement(new Paragraph(cmeli,font));
        c4.go();
        
        ColumnText c5= new ColumnText(writer.getDirectContent());
        c5.setSimpleColumn(110,500,350,640);
        c5.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c5.addElement(new Paragraph(identitynumber,font));
        c5.go();
        
        ColumnText c6= new ColumnText(writer.getDirectContent());
        c6.setSimpleColumn(370,500,495,603);
        c6.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c6.addElement(new Paragraph(loc,font));
        c6.go();
        
        ColumnText c7= new ColumnText(writer.getDirectContent());
        c7.setSimpleColumn(78,500,240,603);
        c7.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c7.addElement(new Paragraph(birth,font));
        c7.go();
        
        
         ColumnText c8= new ColumnText(writer.getDirectContent());
        c8.setSimpleColumn(336,480,525,565);
        c8.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c8.addElement(new Paragraph(nezamvazife,font));
        c8.go();
        
        ColumnText c9= new ColumnText(writer.getDirectContent());
        c9.setSimpleColumn(90,440,200,565);
        c9.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c9.addElement(new Paragraph(religious,font));
        c9.go();
        
         ColumnText c10= new ColumnText(writer.getDirectContent());
        c10.setSimpleColumn(340,410,500,530);
        c10.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c10.addElement(new Paragraph(ozviyatno,font));
        c10.go();
        
        ColumnText c11= new ColumnText(writer.getDirectContent());
        c11.setSimpleColumn(43,410,200,530);
        c11.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c11.addElement(new Paragraph(parvaneno,font));
        c11.go();
         
        ColumnText c12= new ColumnText(writer.getDirectContent());
        c12.setSimpleColumn(170,300,580,495);
        c12.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c12.addElement(new Paragraph(address,font));
        c12.go();
        
         ColumnText c13= new ColumnText(writer.getDirectContent());
        c13.setSimpleColumn(350,300,479,453);
        c13.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c13.addElement(new Paragraph(postal,font));
        c13.go();
        
         ColumnText c14= new ColumnText(writer.getDirectContent());
        c14.setSimpleColumn(65,300,250,453);
        c14.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c14.addElement(new Paragraph(hphone,font));
        c14.go();
        
         ColumnText c15= new ColumnText(writer.getDirectContent());
        c15.setSimpleColumn(350,250,480,418);
        c15.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c15.addElement(new Paragraph(sphone,font));
        c15.go();
        
         ColumnText c16= new ColumnText(writer.getDirectContent());
        c16.setSimpleColumn(67,250,200,418);
        c16.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c16.addElement(new Paragraph(madrak,font));
        c16.go();
        
         ColumnText c17= new ColumnText(writer.getDirectContent());
        c17.setSimpleColumn(350,200,450,381);
        c17.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c17.addElement(new Paragraph(major,font));
        c17.go();
        
         ColumnText c18= new ColumnText(writer.getDirectContent());
        c18.setSimpleColumn(35,200,500,381);
        c18.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c18.addElement(new Paragraph(uni,font));
        c18.go();
        
           ColumnText c19= new ColumnText(writer.getDirectContent());
        c19.setSimpleColumn(295,200,480,340);
        c19.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c19.addElement(new Paragraph(denduni,font));
        c19.go();
        
         ColumnText c20= new ColumnText(writer.getDirectContent());
        c20.setSimpleColumn(40,200,200,340);
        c20.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c20.addElement(new Paragraph(jobplace,font));
        c20.go();
        
         ColumnText c21= new ColumnText(writer.getDirectContent());
        c21.setSimpleColumn(350,150,400,300);
        c21.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c21.addElement(new Paragraph(sabeghe+" سال",font));
        c21.go();
        
        ColumnText c22= new ColumnText(writer.getDirectContent());
        c22.setSimpleColumn(65,150,190,296);
        c22.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c22.addElement(new Paragraph(semat,font));
        c22.go();
        
        ColumnText c23= new ColumnText(writer.getDirectContent());
        c23.setSimpleColumn(300,120,570,235);
        c23.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c23.addElement(new Paragraph(jobaddress,font));
        c23.go();
        
         ColumnText c24= new ColumnText(writer.getDirectContent());
        c24.setSimpleColumn(200,90,590,210);
        c24.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c24.addElement(new Paragraph(savabegh,font));
        c24.go();
        
         ColumnText c25 = new ColumnText(writer.getDirectContent());
        c25.setSimpleColumn(50,700,150,775);
        //c25.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c25.addElement(new Paragraph( dinputinfo,font));
        c25.go();
        
        
       
        
        
        
        
        document.close();
     
                    
   }
        catch(Exception e){}
   
   }
    
}
