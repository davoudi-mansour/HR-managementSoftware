
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
public class parvane2 {
     page9 p9=null;
    public parvane2(page9 p9)
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
       String ds=null;
       String [] dsparvane=new String [3];
       dsparvane[0]=main.getDsodur1();
       dsparvane[1]=main.getDsodur2();
       dsparvane[2]=main.getDsodur3();
       for(int i=0;i<dsparvane.length;i++)
       {
           if (dsparvane[i] !=null && dsparvane[i].startsWith("1"))
               ds=dsparvane[i];
       }
      
      
       String dtamdidparvane=main.getDtamdid();
       String dfparvane=main.getDendetebar();
       
       
       String paye=null;
       String p=main.getPaye();
       if(p.equals("1"))
       {
           paye="یک";
       }
       else if(p.equals("2"))
       {
           paye="دو";
       }
       else if(p.equals("3"))
       {
           paye="سه";
       }
       
       
       
       
       String cmeli=main.getMelicode();
       String identitynumber=main.getIdentitycardnumber();
       String loc=main.getCofbirth();
       String birth=main.getDofbirth();
       String gerayesh=main.getGerayesh();
      
       
       String uniname=main.getUniname();
       
       String ozviyatno=main.getMembershipnumber();
       String parvaneno=main.getLicensenumber();
       String address=main.getAddress();
       String postal=main.getPostalcode();
       String typequalification=main.getTypequalifucation();
    
       String type2=main.getDqualification();
       
      
       
       
       
       String filename=main.getFname()+"-"+main.getLname();
       
       
       String madrak=main.getMadraknezarat();
       String major=main.getMajor();
       
       try{
        
                    
        Document document = new Document(PageSize.A4);
        
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(System.getProperty("user.home")+"\\Desktop\\"+filename+"3.pdf"));
        
        document.open();
        PdfContentByte cb = writer.getDirectContent();


        PdfReader reader = new PdfReader(System.getProperty("user.home")+"\\Desktop\\kardani\\import21.pdf");
        PdfImportedPage page = writer.getImportedPage(reader, 1);
         
         cb.addTemplate(page, 0, 0);
         BaseFont bs=BaseFont.createFont("BZarBd.ttf",BaseFont.IDENTITY_H,true);
         Font font = new Font(bs, 14);
        
        ColumnText c1 = new ColumnText(writer.getDirectContent());
        c1.setSimpleColumn(220,540,500,700);
        c1.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c1.addElement(new Paragraph( name+" "+lname,font));

        c1.go();
        
        ColumnText c2 = new ColumnText(writer.getDirectContent());
        c2.setSimpleColumn(240,480,350,648);
        c2.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c2.addElement(new Paragraph( identitynumber,font));
        c2.go();
        
        ColumnText c3= new ColumnText(writer.getDirectContent());
        c3.setSimpleColumn(80,500,400,648);
        c3.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c3.addElement(new Paragraph( loc,font));
        c3.go();
//        
         ColumnText c4= new ColumnText(writer.getDirectContent());
        c4.setSimpleColumn(245,450,450,620);
        c4.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c4.addElement(new Paragraph(birth.substring(0, 4),font));
        c4.go();
////        
        ColumnText c5= new ColumnText(writer.getDirectContent());
        c5.setSimpleColumn(70,450,460,620);
        c5.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c5.addElement(new Paragraph(madrak,font));
        c5.go();
////        
        ColumnText c6= new ColumnText(writer.getDirectContent());
        c6.setSimpleColumn(170,400,450,595);
        c6.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c6.addElement(new Paragraph(major+" -"+ gerayesh,font));
        c6.go();
////        
        ColumnText c7= new ColumnText(writer.getDirectContent());
        c7.setSimpleColumn(140,450,630,565);
        c7.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c7.addElement(new Paragraph(uniname,font));
        c7.go();
//        
////        
         ColumnText c8= new ColumnText(writer.getDirectContent());
        c8.setSimpleColumn(190,390,500,514);
        c8.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c8.addElement(new Paragraph(ozviyatno,font));
        c8.go();
////        
        ColumnText c9= new ColumnText(writer.getDirectContent());
        c9.setSimpleColumn(200,270,400,410);
        c9.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c9.addElement(new Paragraph(parvaneno,font));
        c9.go();
////         
         ColumnText c10= new ColumnText(writer.getDirectContent());
        c10.setSimpleColumn(10,270,200,405);
        c10.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c10.addElement(new Paragraph(ds,font));
        c10.go();
////        
        ColumnText c11= new ColumnText(writer.getDirectContent());
        c11.setSimpleColumn(10,280,200,380);
        c11.setRunDirection(PdfWriter.RUN_DIRECTION_LTR);
        c11.addElement(new Paragraph(dtamdidparvane,font));
        c11.go();
////         
        ColumnText c12= new ColumnText(writer.getDirectContent());
        c12.setSimpleColumn(10,200,200,357);
        c12.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c12.addElement(new Paragraph(dfparvane,font));
        c12.go();
////        
         ColumnText c13= new ColumnText(writer.getDirectContent());
        c13.setSimpleColumn(380,270,650,435);
        c13.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c13.addElement(new Paragraph(major+"-"+gerayesh,font));
        c13.go();
////        
         ColumnText c14= new ColumnText(writer.getDirectContent());
        c14.setSimpleColumn(205,200,460,357);
        c14.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c14.addElement(new Paragraph(cmeli,font));
        c14.go();
////        
         ColumnText c15= new ColumnText(writer.getDirectContent());
        c15.setSimpleColumn(240,270,400,387);
        c15.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c15.addElement(new Paragraph("فارس",font));
        c15.go();
////        
         ColumnText c16= new ColumnText(writer.getDirectContent());
        c16.setSimpleColumn(462,260,600,360);
        c16.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c16.addElement(new Paragraph(typequalification,font));
        c16.go();
         if(type2!=null)
         {
          ColumnText c17= new ColumnText(writer.getDirectContent());
        c17.setSimpleColumn(472,200,600,340);
        c17.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        c17.addElement(new Paragraph(type2,font));
        c17.go();
         }
         
////        
//         ColumnText c18= new ColumnText(writer.getDirectContent());
//        c18.setSimpleColumn(300,260,500,375);
//      //  c18.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
//        c18.addElement(new Paragraph(dsalahiyatnezarat,font));
//        c18.go();
//        
//           ColumnText c19= new ColumnText(writer.getDirectContent());
//        c19.setSimpleColumn(50,150,550,325);
//        c19.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
//        c19.addElement(new Paragraph(supervisionqualification,font));
//        c19.go();
////        
//         ColumnText c20= new ColumnText(writer.getDirectContent());
//        c20.setSimpleColumn(300,150,500,265);
//      //  c20.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
//        c20.addElement(new Paragraph(dsalahiyatejra,font));
//        c20.go();
////        
//         ColumnText c21= new ColumnText(writer.getDirectContent());
//        c21.setSimpleColumn(50,40,550,215);
//        c21.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
//        c21.addElement(new Paragraph(performancequalification,font));
//        c21.go();
////        
//        ColumnText c22= new ColumnText(writer.getDirectContent());
//        c22.setSimpleColumn(385,50,500,118);
//        c22.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
//        c22.addElement(new Paragraph(fishnum,font));
//        c22.go();
////        
//        ColumnText c23= new ColumnText(writer.getDirectContent());
//        c23.setSimpleColumn(95,50,200,118);
//        c23.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
//        c23.addElement(new Paragraph(fishdate,font));
//        c23.go();
////        
//        ColumnText c24 = new ColumnText(writer.getDirectContent());
//        c24.setSimpleColumn(50,700,150,775);
//        //c25.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
//        c24.addElement(new Paragraph( dinputinfo,font));
//        c24.go();
////        
////        
       
        document.close();
     
                    
   }
        catch(Exception e){}
   
   }
    
}
