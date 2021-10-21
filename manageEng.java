
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import nezam.Amuzeshi;
import nezam.Bime;
import nezam.Finance;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import nezam.Main;
import nezam.Majma;
import nezam.Sahmiye;
import nezam.Tajrobi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mansour davoudi
 */
public class manageEng {
       public static  SessionFactory factory= new Configuration().configure().buildSessionFactory();
       Main eng;
       Integer id=null;
       page3 p=null;
       tajrobiform tf=null;
       Integer idTajrobi=null;
       SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
       ozviyatEdit oz=null;
       otherEdit th=null;
       sodurparvaneEdit se=null;
       tamdidparvaneEdit te=null;
       adamOzviyatEdit ao=null;
       taghirpayeEdit pe=null;
       haghnezaratEdit he=null;
       haghejraedit hj=null;
       amuzeshEdit ae=null;
       laghvOzviyatEdit lo=null;
       kartozviyatEdit ko=null; 
       ozvjadidEdit jd=null;
       sahmiyeEdit sahmiye=null;
       int idb;
       page8 p8=null;
       bime b=null;
       int idf;
       int ida;
       int ids;
       public manageEng(Integer id) {
       this.id=id;
        p=new page3(id,this);
      
      }
       public manageEng(Integer id,String name)
       {
          idTajrobi=id;
           tf=new tajrobiform(this, id);
           tf.setVisible(true);
       }
      public manageEng(){};
      
      public List listBime()
      {
             List<Object> allBime=new ArrayList<>();
           Session session = factory.openSession();
           Transaction tx = null;
            try {
            tx = session.beginTransaction();
           String hql = " FROM Bime A ";
            Query queryResult = session.createQuery(hql);
            allBime= queryResult.list();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }     
        return allBime;
      }
      public List listAmuzeshi()
      {
          List<Object> allAmuzeshi=new ArrayList<>();
           Session session = factory.openSession();
           Transaction tx = null;
            try {
            tx = session.beginTransaction();
           String hql = " FROM Amuzeshi A ";
            Query queryResult = session.createQuery(hql);
            allAmuzeshi= queryResult.list();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }     
        return allAmuzeshi;
           
          
      }
      
       public List listFinanceByDate1(Date start,Date finish)
      {
           List <Object>allFinance=new ArrayList<>();
           Session session = factory.openSession();
           Transaction tx = null;
            try {
            tx = session.beginTransaction();
           //String hql = " FROM Finance F ";
            Query queryResult = session.createQuery("FROM Finance AS f WHERE f.registerdate BETWEEN :startDate AND :finishDate")
             .setParameter("startDate", start)
             .setParameter("finishDate", finish);
            allFinance= queryResult.list();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }     
        return allFinance;
      }
    public List listFinanceByDate(Date start,Date finish)
      {
           List <Object>allFinance=new ArrayList<>();
           Session session = factory.openSession();
           Transaction tx = null;
            try {
            tx = session.beginTransaction();
           //String hql = " FROM Finance F ";
            Query queryResult = session.createQuery("FROM Finance AS f WHERE (f.registerdate BETWEEN :startDate AND :finishDate) OR (f.pardakhtdate BETWEEN :startDate AND :finishDate) ")
             .setParameter("startDate", start)
             .setParameter("finishDate", finish);
            allFinance= queryResult.list();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }     
        return allFinance;
      }
    public List listFinance()
      {
           List <Object>allFinance=new ArrayList<>();
           Session session = factory.openSession();
           Transaction tx = null;
            try {
            tx = session.beginTransaction();
           String hql = " FROM Finance F ";
            Query queryResult = session.createQuery(hql);
            allFinance= queryResult.list();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }     
        return allFinance;
           
      }
    public List listTajrobi()
    {
         List <Object>allTajrobi=new ArrayList<>();
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            
           String hql = " FROM Tajrobi T ";
            Query queryResult = session.createQuery(hql);
            allTajrobi = queryResult.list();
            
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }     
        return allTajrobi;
    
    }
    public List listSahmiye()
    {
          List <Object>allSahmiye=new ArrayList<>();
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            
           String hql = " FROM Sahmiye S ";
            Query queryResult = session.createQuery(hql);
            allSahmiye = queryResult.list();
            
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }     
        return allSahmiye;
    }
    public List listMajma()
    {
         List <Object>allMajma=new ArrayList<>();
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            
           String hql = " FROM Majma M ";
            Query queryResult = session.createQuery(hql);
            allMajma = queryResult.list();
            
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }     
        return allMajma;
    
    }
    public Main getMain(int id )
    {
       Main m=null;
        Session session=factory.openSession();
        Transaction tx=null;
        try
        {
            tx=session.beginTransaction();
            m=(Main) session.get(Main.class,id);   
            tx.commit();
            
        }
        catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }     
        return m;
    }
    public List listData() 
{
        List <Object>allUsers=new ArrayList<>();
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            
           String hql = " FROM Main M ";
            Query queryResult = session.createQuery(hql);
            allUsers = queryResult.list();
            
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }     
        return allUsers;
    
}
    public void editInfo()
    {
         Session session = factory.openSession();
         Transaction tx = null;
        try
        {
            tx=session.beginTransaction();
            Main eng =(Main) session.get(Main.class, id);
            
            eng.setFname(p.textField1.getText());
            
            eng.setLname(p.textField2.getText());
            
            eng.setLatin(p.textField3.getText());
           
            
            eng.setFathername(p.textField4.getText());
           //.textField5.setText(eng.getIdentitycardnumber());
            eng.setIdentitycardnumber(p.textField5.getText());
         //p.textField8.setText(eng.getDofbirth());
            eng.setDofbirth(p.textField8.getText());
           //.textField6.setText(eng.getMelicode());
            eng.setMelicode(p.textField6.getText());
          //p.textField10.setText(eng.getPostalcode());
            eng.setPostalcode(p.textField10.getText());
         // p.textArea1.setText(eng.getAddress());
            eng.setAddress(p.textArea1.getText());
         // p.textField11.setText(eng.getMphone());
            eng.setMphone(p.textField11.getText());
         // p.textField12.setText(eng.getHphone());
            eng.setHphone(p.textField12.getText());
           //.textField7.setText(eng.getCofbirth());
            eng.setCofbirth(p.textField7.getText());
          //p.textField26.setText(eng.getSex());
      //    er  eng.setSex(p.textField26.getText());
        //  p.textField16.setText(eng.getSingle());
            eng.setSingle(p.textField16.getText());
         // p.textField17.setText(eng.getUniname());
            eng.setUniname(p.textField17.getText());
          //p.textField18.setText(eng.getMajor());
            eng.setMajor(p.textField18.getText());
          //p.textField14.setText(eng.getMajorcode());
            eng.setMajorcode(p.textField14.getText());
          //p.textField15.setText(eng.getGerayesh());
            eng.setGerayesh(p.textField15.getText());
       //   p.textField19.setText(eng.getMadraknezarat());
            eng.setMadraknezarat(p.textField19.getText());
         // p.textField13.setText(eng.getDenduni());
            eng.setDenduni(p.textField13.getText());
          //p.textArea2.setText(eng.getAddressuni());
            eng.setAddressuni(p.textArea2.getText());
         // p.textField20.setText(eng.getSarbazi());
            eng.setSarbazi(p.textField20.getText());
           //.textField22.setText(eng.getJobplace());
            eng.setJobplace(p.textField22.getText());
          //p.textField23.setText(eng.getJobaddress());
            eng.setJobaddress(p.textArea8.getText());
           //.textField24.setText(eng.getSavabegh());
            eng.setSavabegh(p.textField24.getText());
          //p.textField25.setText(eng.getSabeghe());
            eng.setSabeghe(p.textField25.getText());
            eng.setdocejra(p.textArea4.getText());
            String all=p.textArea3.getText();
            StringBuilder sh=new StringBuilder();
            StringBuilder sadra=new StringBuilder();
            StringBuilder bonyad=new StringBuilder();
            StringBuilder shahr=new StringBuilder();
            
            String[] lines=all.split("\\n");
         
            
            int i=0;
           // System.out.println(lines[0]);
            while( ! lines[i].equals("پایان داکیومنت شیراز"))
            {
                sh.append(lines[i]);
                sh.append("\n");
                i++;
            }
            i++;
             while ( ! lines[i].equals("پایان داکیومنت بنیاد "))
            {
                bonyad.append(lines[i]);
                bonyad.append("\n");
                i++;
            }
            i++;
             while( ! lines[i].equals("پایان داکیومنت صدرا"))
            {
                sadra.append(lines[i]);
                sadra.append("\n");
                i++;
            }
           i++;
            while( ! lines[i].equals("پایان داکیومنت شهرستان"))
            {
                shahr.append(lines[i]);
                shahr.append("\n");
                i++;
            }
            eng.setDocumentshiraz(sh.toString());
            eng.setDocumentsadra(sadra.toString());
            eng.setDocumentshahrestan(shahr.toString());
            eng.setDocumentbonyad(bonyad.toString());
            
           
//            if(eng.getDocumentshiraz()!=null)
//                eng.setDocumentshiraz(p.textArea3.getText());
//            else if(eng.getDocumentbonyad() !=null)
//                eng.setDocumentbonyad(p.textArea3.getText());
//            else if(eng.getDocumentsadra()!=null)
//                eng.setDocumentsadra(p.textArea3.getText());
//            else if (eng.getDocumentshahrestan()!=null)
//                eng.setDocumentshahrestan(p.textArea3.getText());
         // p.textField27.setText(eng.getMembershipnumber());
           eng.setMembershipnumber(p.textField27.getText());
          //p.textField28.setText(eng.getOzviyattype());
            eng.setOzviyattype(p.textField28.getText());
            
          //p.textField29.setText(eng.getOzviyatdate());
            eng.setOzviyatdate(p.textField29.getText());
         // p.textField30.setText(eng.getDtmdidozviyat());
            eng.setDtmdidozviyat(p.textField30.getText());
          //p.textField31.setText(eng.getTotalaverage());
            eng.setTotalaverage(p.textField31.getText());
          //p.textField32.setText(eng.getLicensenumber());
            eng.setLicensenumber(p.textField32.getText());
            eng.setPaye(p.textField33.getText());
            eng.setDtamdid(p.textField34.getText());
            eng.setDendetebar(p.textField35.getText());
            
            
           //.textField36.setText(eng.getDtest1());
            eng.setDtest1(p.textField36.getText());
         // p.textField37.setText(eng.getDtest2());
            eng.setDtest2(p.textField37.getText());
        //  p.textField38.setText(eng.getDtest3());
            eng.setDtest3(p.textField38.getText());
        //  p.textField39.setText(eng.getDsodur1());
            eng.setDsodur1(p.textField39.getText());
          //p.textField40.setText(eng.getDsodur2());
            eng.setDsodur2(p.textField40.getText());
          //p.textField41.setText(eng.getDsodur3());
            eng.setDsodur3(p.textField41.getText());
          //p.textField42.setText(eng.getTypequalifucation());
            eng.setTypequalifucation(p.textField42.getText());
         // p.textField43.setText(eng.getDqualification());
            eng.setDqualification(p.textField43.getText());
          //p.textField44.setText(eng.getMadrakejra());
            eng.setMadrakejra(p.textField44.getText());
           //.textField45.setText(eng.getCodemadrakejra());
            eng.setCodemadrakejra(p.textField45.getText());
       //   p.textField46.setText(eng.getMadrakejra());
            eng.setMadraknezarat(p.textField46.getText());
            eng.setDenteghali(p.textField47.getText());
            if(p.checkBoxMenuItem6.isSelected())
                eng.setNezaratshiraz("شیراز");
             if (p.checkBoxMenuItem4.isSelected())
                 eng.setNezaratsadra("صدرا");
             if(p.checkBoxMenuItem5.isSelected())
                 eng.setNezaratbonyad("بنیاد");
             if(p.checkBoxMenuItem7.isSelected())
                 eng.setNezaratshahrestan("شهرستان");
              if( ! p.checkBoxMenuItem6.isSelected())
                   eng.setNezaratshiraz(null);
              if (! p.checkBoxMenuItem4.isSelected())
                   eng.setNezaratsadra(null);
               if(! p.checkBoxMenuItem5.isSelected())
                   eng.setNezaratbonyad(null);
               if(! p.checkBoxMenuItem7.isSelected())
                 eng.setNezaratshahrestan(null);
               

           //.textField48.setText(eng.getDsalahiyatnezarat());
            eng.setDsalahiyatnezarat(p.textField48.getText());
           //.textField49.setText(eng.getDsalahiyatejra());
            eng.setDsalahiyatejra(p.textField49.getText());
           //.textField50.setText(eng.getArchivecode());
            eng.setArchivecode(p.textField50.getText());
           //.textArea4.setText(eng.getSupervisionqualification());
            eng.setSupervisionqualification(p.textArea4.getText());
            eng.setPerformance(p.textField51.getText());
          //p.textArea5.setText(eng.getPerformancequalification());
          ////////////////////  eng.setPerformancequalification(p.textArea5.getText());
           //.textArea6.setText(eng.getOzviyatdocument());
          ////////////////////  eng.setOzviyatdocument(p.textArea6.getText());
      //    p.textArea7.setText(eng.getNotes());
          ///////////////////////////  eng.setNotes(p.textArea7.getText());
         // p.textField56.setText(eng.getDsendinquiry());
            eng.setDsendinquiry(p.textField56.getText());
         // p.textField57.setText(eng.getDreceivedinquiry());
            eng.setDreceivedinquiry(p.textField57.getText());
        //  p.textField58.setText(eng.getDateinputinfo());
            eng.setDateinputinfo(p.textField58.getText());
        //  p.textField59.setText(eng.getNumbersendletter());
            eng.setNumbersendletter(p.textField59.getText());
        //  p.textField60.setText(eng.getFishnumber());
            eng.setFishnumber(p.textField60.getText());
         // p.textField61.setText(eng.getFishdate());
            eng.setFishdate(p.textField61.getText());
        //  p.textField33.setText(eng.getPaye());
           // eng.setPaye(p.textField33.getText());
           eng.setSupervisionqualification(p.textArea10.getText());
           eng.setPerformancequalification(p.textArea11.getText());
           eng.setOzviyatdocument(p.textArea12.getText());
           eng.setNotes(p.textArea13.getText());
//           eng.setLetter(p.textArea14.getText());
             
            session.update(eng);
            //p.check1();
            tx.commit();
           
        }
        catch(Exception e){}
        finally{session.close();}
    }
    public void saveLetter()
    {
         Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            
            Main main =(Main) session.get(Main.class, id);
//           main.setLetter(p.textArea14.getText());
            session.update(main);
//            p.panel11.invalidate();
//            p.label38.setVisible(true);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }     
    }
    public void saveBio()
    {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            
            Main main =(Main) session.get(Main.class, id);
           main.setBio(p.textArea9.getText());
            session.update(main);
//            p.panel11.invalidate();
//            p.label38.setVisible(true);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }     
        
    }
    public void fillLetter()
    {
          Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            
            Main main =(Main) session.get(Main.class, id);
//           p.textArea14.setText(main.getLetter().toString());
           
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }     
    }
    public void fillBio()
    {
         Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            
            Main main =(Main) session.get(Main.class, id);
           p.textArea9.setText(main.getBio().toString());
           
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }     
    }
    public void saveImage(String path)
    {
       
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            
            Main main =(Main) session.get(Main.class, id);
            main.setImage(path);
            session.update(main);
//            p.panel1.invalidate();
//            p.label31.setVisible(true);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }     
        
    }
    public void removeTajrobi(tajrobi2 t2)
    {
        Session session =factory.openSession();
        Transaction tx=null;
        try
        {
            
            Integer id=Integer.parseInt(t2.textField3.getText());
            tx=session.beginTransaction();
            Tajrobi t=(Tajrobi) session.get(Tajrobi.class, id);
            session.delete(t);
//            t2.panel1.invalidate();
//            t2.label1.setVisible(true);
            tx.commit();
            
        }
         catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
    }
    public void removeSahmiye(page10 p10)
    {
          Session session =factory.openSession();
        Transaction tx=null;
        try
        {
            
            Integer id=Integer.parseInt(p10.textField3.getText());
            tx=session.beginTransaction();
            Sahmiye s=(Sahmiye) session.get(Sahmiye.class, id);
            session.delete(s);
//            p6.panel1.invalidate();
//            p6.label1.setVisible(true);
            tx.commit();
            
        }
         catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
    }
    public void removeFinance(page6 p6)
    {
         Session session =factory.openSession();
        Transaction tx=null;
        try
        {
            
            Integer id=Integer.parseInt(p6.textField3.getText());
            tx=session.beginTransaction();
            Finance finance=(Finance) session.get(Finance.class, id);
            session.delete(finance);
//            p6.panel1.invalidate();
//            p6.label1.setVisible(true);
            tx.commit();
            
        }
         catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
    }
    public void removeAmuzeshi(amuzeshiDel adel)
    {
         Session session =factory.openSession();
        Transaction tx=null;
        try
        {
            
            Integer id=Integer.parseInt(adel.textField3.getText());
            tx=session.beginTransaction();
           Amuzeshi amuzeshi=(Amuzeshi) session.get(Amuzeshi.class, id);
            session.delete(amuzeshi);
//            p6.panel1.invalidate();
//            p6.label1.setVisible(true);
            tx.commit();
            
        }
         catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
    }
    public void removeEng(page5 p5)
    {
         Session session =factory.openSession();
        Transaction tx=null;
        try
        {
            
            Integer id=Integer.parseInt(p5.textField3.getText());
            tx=session.beginTransaction();
            Main eng1=(Main) session.get(Main.class, id);
            session.delete(eng1);
//            p5.panel1.invalidate();
//            p5.label1.setVisible(true);
            tx.commit();
        }
         catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
    }
    public void saveNewEng(page4 p4)
    {
       
        Session session =factory.openSession();
        Transaction tx=null;
        try
        {
            int id=Integer.parseInt(p4.textField1.getText());
            String lname=p4.textField3.getText();
            String fname=p4.textField2.getText();
            String fatherName=p4.textField4.getText();
            String mcode=p4.textField5.getText();
            String mphone=p4.textField6.getText();
            tx=session.beginTransaction();
            Main eng=new Main(id,lname,fname,fatherName,mcode,mphone);
            session.save(eng);
//            p4.panel1.invalidate();
//            p4.label1.setVisible(true);
            tx.commit();
            
        }
        catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }     
    }
    public void showBime()
    {
           List <Object>allBime=new ArrayList<>();
           Session session = factory.openSession();
           Transaction tx = null;
            try {
            tx = session.beginTransaction();
           String hql = " FROM Bime B ";
            Query queryResult = session.createQuery(hql);
            allBime= queryResult.list();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }     
       Bime bime=null;
       Bime bime1=null;
       int idmain;
       String st;
       for (int i=0;i<allBime.size();i++)
       {
           bime=(Bime)allBime.get(i);
           idmain=(Integer)bime.getIdMain();
           if(idmain==this.id)
           {
               bime1=bime;
                break;
           }
              
           
       }
       if(bime1!=null){
           
        p.textField96.setText(String.valueOf(bime1.getId()));
        Date sDate=bime1.getSdate();
        Date eDate=bime1.getEdate();
        if(sDate!=null)
        {
            String sdate=formatter.format(sDate);
            p.textField99.setText(sdate);
        }
         if(eDate!=null)
        {
            String edate=formatter.format(eDate);
            p.textField100.setText(edate);
        }
         p.textField101.setText(bime1.getKhales());
         p.textField102.setText(bime1.getNaKhales());
         p.textField103.setText(bime1.getMetrazh());
         p.textField104.setText(bime1.getSherkat());
        
       }
       
    }
    public void removeImage()
    {
            Session session =factory.openSession();
            Transaction tx=null;
       try
        {
           
            tx=session.beginTransaction();
            Main main=(Main)session.get(Main.class, id);
            main.setImage(null);
            session.update(main);
            
//            p.panel1.invalidate();
//            p.label39.setVisible(true);
            tx.commit();
        }
        catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }     
    }
    public void saveBime()
    {
        Integer idBime=Integer.parseInt(p.textField96.getText());
        Date sdate=null;
        Date edate=null;
        if(p.textField99.getText()!=null)
        {
            try
            {
                 sdate=formatter.parse(p.textField99.getText());
            }
             catch(Exception e){}
        }
          if(p.textField100.getText()!=null)
        {
            try
            {
                 edate=formatter.parse(p.textField100.getText());
            }
             catch(Exception e){}
        }
          String khales=p.textField101.getText();
          String nkhales=p.textField102.getText();
          String metrazh=p.textField103.getText();
          String comp=p.textField104.getText();
          Integer id=this.id;
          Session session =factory.openSession();
          Transaction tx=null;
       try
        {
           
            tx=session.beginTransaction();
           Bime bm=new Bime(idBime, comp, id, khales, nkhales, metrazh, sdate,  edate);
            session.save(bm);
            
            tx.commit();
        }
        catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }     
    }
    public void saveAmuzesh()
    {
        
//        int idamuzesh=Integer.parseInt(p.textField97.getText());
        String name=p.textField83.getText();
        Date sdate=null;
        if(p.textField84.getText()!= null)
        {
            try
            {
                sdate=formatter.parse(p.textField84.getText());
            }
            catch(Exception e){}
            
        }
        Date fdate=null;
        if(p.textField85.getText()!= null)
        {
            try
            {
                fdate=formatter.parse(p.textField85.getText());
            }
            catch(Exception e){}
        }
        String period=p.textField86.getText();
        String place=p.textField87.getText();
        String teachername=p.textField88.getText();
        String mojaveznumber=p.textField89.getText();
        Date dmojavez=null;
        if(p.textField90.getText()!=null)
        {
            try
            {
                dmojavez=formatter.parse(p.textField90.getText());
            }
            catch(Exception e){}
        }
        String sazman=p.textField91.getText();
        Date dazmun=null;
        if(p.textField92.getText()!= null)
        {
            try
            {
                dazmun=formatter.parse(p.textField92.getText());
            }
            catch(Exception e){}
            
        }
        String parvaneteacher=p.textField93.getText();
        String dorenumber=p.textField94.getText();
       Integer idMain1=this.id;
            Session session =factory.openSession();
            Transaction tx=null;
       try
        {
           
            tx=session.beginTransaction();
            Amuzeshi am=new Amuzeshi(  name,dorenumber,  sdate,  fdate,  period,  place,  mojaveznumber,  dmojavez,  dazmun,  teachername,  parvaneteacher, sazman,  idMain1);
            session.save(am);
//            p.panel7.invalidate();
//            p.label34.setVisible(true);
            tx.commit();
        }
        catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }     
    }
    public void fillImage(String path)
    {
     this.p.label1.setIcon(Resizeimage(path));
    }
    public ImageIcon Resizeimage (String imagepath){
        ImageIcon myImage = new ImageIcon(imagepath);
        Image img = myImage.getImage();
       
        Image newimage = img.getScaledInstance(180 , 180, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newimage);
        return image;
        
    }
    public void saveMajma()
    {
         Session session=factory.openSession();
         Transaction tx=null;
         String majmaResult=null;
         Date dbargozari=null;
         
//         int idmajma=Integer.parseInt(p.textField98.getText());
         if(p.textField95.getText()!=null)
         {
             try
             {
                 dbargozari=formatter.parse(p.textField95.getText());
             }
             catch(Exception e){}
         
         }
            
          if(p.radioButton1.isSelected())
          {
              majmaResult=p.radioButton1.getText();
          }
          else if(p.radioButton2.isSelected())
          {
              majmaResult=p.radioButton2.getText();
          }
           int mainId=this.id;
             try
           {
               tx=session.beginTransaction();
               Majma maj=new Majma(dbargozari, majmaResult, mainId);
               session.save(maj);
//               p.panel9.invalidate();
//               p.label35.setVisible(true);
               tx.commit();
               
           }
            catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
          
           
    }
    public void showBime(Integer id)
    {
        this.idb=id;
        b=new bime(this);
        b.setVisible(true);
         Session session = factory.openSession();
          Transaction tx=null;
        try
        {
            tx=session.beginTransaction();
            Bime a=(Bime) session.get(Bime.class, idb);
           Integer idbime=a.getId();
           b.textField96.setText(String.valueOf(idbime));
            if(a.getSdate() != null)
            {
                String sdate=formatter.format(a.getSdate());
                b.textField99.setText(sdate);
            }
            if(a.getEdate()!= null)
            {
                 String edate=formatter.format(a.getEdate());
                b.textField100.setText(edate);
            }
           String khales=a.getKhales();
           b.textField101.setText(khales);
            String nkhales=a.getNaKhales();
           b.textField102.setText(nkhales);
           String metr=a.getMetrazh();
           b.textField103.setText(metr);
           String name=a.getSherkat();
           b.textField104.setText(name);
           
           
            tx.commit();
        }
          catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
        
    
    }

    public void showAmuzeshi(Integer id)
    {
        this.ida=id;
        p8=new page8(this);
        p8.setVisible(true);
        Session session = factory.openSession();
        Transaction tx=null;
        try
        {
            tx=session.beginTransaction();
            Amuzeshi a=(Amuzeshi) session.get(Amuzeshi.class, ida);
            String name=a.getName();
            p8.textField83.setText(name);
            if(a.getSdate() != null)
            {
                String dsdore=formatter.format(a.getSdate());
                p8.textField84.setText(dsdore);
            }
            if(a.getFdate()!= null)
            {
                 String dfdore=formatter.format(a.getFdate());
                 p8.textField85.setText(dfdore);
            }
           
            String period=a.getPeriod();
            p8.textField86.setText(period);
            String mojri=a.getPlace();
            p8.textField87.setText(mojri);
            String teacher=a.getTeachername();
            p8.textField88.setText(teacher);
            String mojnumber=a.getMojaveznumber();
            p8.textField89.setText(mojnumber);
            if(a.getDmojavez() != null)
            {
                String dsodurmoj=formatter.format(a.getDmojavez());
                 p8.textField90.setText(dsodurmoj);
            }
            
            String sazman=a.getSazman();
            p8.textField91.setText(sazman);
            if(a.getDazmun() != null)
            {
                String dazmun=formatter.format(a.getDazmun());
                 p8.textField92.setText(dazmun);
            }
            
            String pemod=a.getParvaneteacher();
            p8.textField93.setText(pemod);
            String num=a.getNumber();
            p8.textField94.setText(num);
            String she=String.valueOf(a.getId());
          
            tx.commit();
        }
          catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
      
    }
    public void showSahmiye(Integer id)
    {
        this.ids=id;
        sahmiye=new sahmiyeEdit(this);
        sahmiye.setVisible(true);
         Session session = factory.openSession();
        Transaction tx=null;
        try
        {
            tx=session.beginTransaction();
            Sahmiye s= (Sahmiye)session.get(Sahmiye.class, this.ids);
          
                
                
                sahmiye.textField47.setText(String.valueOf(s.getId()));
              
                sahmiye.comboBox1.setSelectedItem(s.getKind());
               
              
               sahmiye.textField45.setText(s.getYear());
               sahmiye.textField46.setText(s.getLoc());
               sahmiye.textField43.setText(s.getEntire());
               sahmiye.textField44.setText(s.getPart());
                tx.commit();
        }
        
           catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }      
        
           
        
    }
    public void editSahmiye()
    {
          Session session = factory.openSession();
         Transaction tx=null;
       //  int id=Integer.parseInt(sahmiye.textField47.getText());
         try
         {
             tx=session.beginTransaction();
             int id=Integer.parseInt(sahmiye.textField47.getText());
             Sahmiye s=(Sahmiye)session.get(Sahmiye.class, id);
            
             s.setKind(sahmiye.comboBox1.getSelectedItem().toString());
             s.setYear(sahmiye.textField45.getText());
             s.setLoc(sahmiye.textField46.getText());
             s.setEntire(sahmiye.textField43.getText());
             s.setPart(sahmiye.textField44.getText());
         
             session.update(s);
             tx.commit();
             
         }
          catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
    }
    public void showFinance(Integer id)
    {
        this.idf=id;
        Session session = factory.openSession();
        Transaction tx=null;
        try
        {
            tx=session.beginTransaction();
            Finance f= (Finance)session.get(Finance.class, idf);
            if(f.getBedehkarikind().equals("عضویت سالیانه"))
            {
                oz=new ozviyatEdit(this);
                oz.setVisible(true);
                if(f.getRegisterdate() != null)
                {
                   oz.textField82.setText(formatter.format(f.getRegisterdate())); 
                }
                if(f.getBedehkariamount() != null)
                {
                    oz.textField83.setText(String.valueOf(f.getBedehkariamount()));

                }
               
               oz.comboBox1.setSelectedItem(f.getpaykind());
               oz.comboBox5.setSelectedItem(f.getbankname());
               if(f.getfishnumber() != null)
               {
                   oz.textField84.setText(f.getfishnumber());
               }
               if(f.getchecknumber() != null)
               {
                  oz.textField85.setText(f.getchecknumber());
               }
               if(f.getPay() != null)
               {
                   oz.textField86.setText(String.valueOf(f.getPay()));
               }
               if(f.getPardakhtdate() != null)
               {
                    oz.textField87.setText(formatter.format(f.getPardakhtdate()));
               }
               if(f.getextra() != null)
               {
                   oz.textArea1.setText(f.getextra().toString());
               }
               
                
                
            }
            else  if(f.getBedehkarikind().equals("کارت عضویت"))
            {
                ko=new kartozviyatEdit(this);
                ko.setVisible(true);
                  if(f.getRegisterdate() != null)
                {
                   ko.textField82.setText(formatter.format(f.getRegisterdate())); 
                }
                if(f.getBedehkariamount() != null)
                {
                    ko.textField83.setText(String.valueOf(f.getBedehkariamount()));

                }
               
               ko.comboBox1.setSelectedItem(f.getpaykind());
               ko.comboBox5.setSelectedItem(f.getbankname());
               if(f.getfishnumber() != null)
               {
                   ko.textField84.setText(f.getfishnumber());
               }
               if(f.getchecknumber() != null)
               {
                  ko.textField85.setText(f.getchecknumber());
               }
               if(f.getPay() != null)
               {
                   ko.textField86.setText(String.valueOf(f.getPay()));
               }
               if(f.getPardakhtdate() != null)
               {
                    ko.textField87.setText(formatter.format(f.getPardakhtdate()));
               }
               if(f.getextra() != null)
               {
                   ko.textArea1.setText(f.getextra().toString());
               }
               
            }
            else  if(f.getBedehkarikind().equals("عضو جدید"))
            {
                jd=new ozvjadidEdit(this);
                jd.setVisible(true);
                  if(f.getRegisterdate() != null)
                {
                   jd.textField82.setText(formatter.format(f.getRegisterdate())); 
                }
                if(f.getBedehkariamount() != null)
                {
                    jd.textField83.setText(String.valueOf(f.getBedehkariamount()));

                }
               
               jd.comboBox1.setSelectedItem(f.getpaykind());
               jd.comboBox5.setSelectedItem(f.getbankname());
               if(f.getfishnumber() != null)
               {
                   jd.textField84.setText(f.getfishnumber());
               }
               if(f.getchecknumber() != null)
               {
                  jd.textField85.setText(f.getchecknumber());
               }
               if(f.getPay() != null)
               {
                   jd.textField86.setText(String.valueOf(f.getPay()));
               }
               if(f.getPardakhtdate() != null)
               {
                    jd.textField87.setText(formatter.format(f.getPardakhtdate()));
               }
               if(f.getextra() != null)
               {
                   jd.textArea1.setText(f.getextra().toString());
               }
            
                
            }
            
            else if(f.getBedehkarikind().equals("صدور پروانه اشتغال"))
            {
                se=new sodurparvaneEdit(this);
                se.setVisible(true);
                  if(f.getRegisterdate() != null)
                {
                   se.textField82.setText(formatter.format(f.getRegisterdate())); 
                }
                if(f.getBedehkariamount() != null)
                {
                    se.textField83.setText(String.valueOf(f.getBedehkariamount()));

                }
               
               se.comboBox1.setSelectedItem(f.getpaykind());
               se.comboBox5.setSelectedItem(f.getbankname());
               if(f.getfishnumber() != null)
               {
                   se.textField84.setText(f.getfishnumber());
               }
               if(f.getchecknumber() != null)
               {
                  se.textField85.setText(f.getchecknumber());
               }
               if(f.getPay() != null)
               {
                   se.textField86.setText(String.valueOf(f.getPay()));
               }
               if(f.getPardakhtdate() != null)
               {
                    se.textField87.setText(formatter.format(f.getPardakhtdate()));
               }
               if(f.getextra() != null)
               {
                   se.textArea1.setText(f.getextra().toString());
               }
               
                
            }
            
            else if(f.getBedehkarikind().equals("تمدید پروانه"))
            {
                 te=new tamdidparvaneEdit(this);
                te.setVisible(true);
                  if(f.getRegisterdate() != null)
                {
                   te.textField82.setText(formatter.format(f.getRegisterdate())); 
                }
                if(f.getBedehkariamount() != null)
                {
                    te.textField83.setText(String.valueOf(f.getBedehkariamount()));

                }
               
               te.comboBox1.setSelectedItem(f.getpaykind());
               te.comboBox5.setSelectedItem(f.getbankname());
               if(f.getfishnumber() != null)
               {
                   te.textField84.setText(f.getfishnumber());
               }
               if(f.getchecknumber() != null)
               {
                  te.textField85.setText(f.getchecknumber());
               }
               if(f.getPay() != null)
               {
                   te.textField86.setText(String.valueOf(f.getPay()));
               }
               if(f.getPardakhtdate() != null)
               {
                    te.textField87.setText(formatter.format(f.getPardakhtdate()));
               }
               if(f.getextra() != null)
               {
                   te.textArea1.setText(f.getextra().toString());
               }
               if(f.getParvanedate() != null)
               {
                      te.textField88.setText(formatter.format(f.getParvanedate()));
               }
            
               
                        
            }
             else if(f.getBedehkarikind().equals("تغییر پایه"))
             {
                 pe=new taghirpayeEdit(this);
                 pe.setVisible(true);
                   if(f.getRegisterdate() != null)
                {
                   pe.textField82.setText(formatter.format(f.getRegisterdate())); 
                }
                if(f.getBedehkariamount() != null)
                {
                    pe.textField83.setText(String.valueOf(f.getBedehkariamount()));

                }
               
               pe.comboBox1.setSelectedItem(f.getpaykind());
              pe.comboBox5.setSelectedItem(f.getbankname());
               if(f.getfishnumber() != null)
               {
                   pe.textField84.setText(f.getfishnumber());
               }
               if(f.getchecknumber() != null)
               {
                  pe.textField85.setText(f.getchecknumber());
               }
               if(f.getPay() != null)
               {
                   pe.textField86.setText(String.valueOf(f.getPay()));
               }
               if(f.getPardakhtdate() != null)
               {
                   pe.textField87.setText(formatter.format(f.getPardakhtdate()));
               }
               if(f.getextra() != null)
               {
                  pe.textArea1.setText(f.getextra().toString());
               }
                 
               pe.comboBox4.setSelectedItem(f.getPaye());
                
                 
             }
             else if(f.getBedehkarikind().equals("حق نظارت"))
             {
                 he=new haghnezaratEdit(this);
                 he.setVisible(true);
                 if(f.getRegisterdate() != null)
                 {
                     he.textField82.setText(formatter.format(f.getRegisterdate()));
                 }
                 if(f.getOzviyatsaliyaneamount() != null)
                 {
                     he.textField83.setText(String.valueOf(f.getOzviyatsaliyaneamount()));
                 }
                 if(f.getKarkardamount() != null)
                 {
                     he.textField88.setText(String.valueOf(f.getKarkardamount()));
                 }
                 
                 if(f.getDarsad() != null)
                 {
                     he.textField89.setText(String.valueOf(f.getDarsad()));
                 }
                 
                 he.comboBox1.setSelectedItem(f.getpaykind());
                 he.comboBox5.setSelectedItem(f.getbankname());
                 if(f.getfishnumber() != null)
                 {
                     he.textField84.setText(f.getfishnumber());
                 }
                 if(f.getchecknumber() != null)
                 {
                      he.textField85.setText(f.getchecknumber());
                 }
                 if(f.getPay() != null)
                 {
                     he.textField86.setText(String.valueOf(f.getPay()));
                 }
                if(f.getPardakhtdate() != null)
                {
                    he.textField87.setText(formatter.format(f.getPardakhtdate()));
                }
                if(f.getextra() != null)
                {
                    he.textArea1.setText(f.getextra());
                }
           
             }
             else if(f.getBedehkarikind().equals("حق اجرا")){
                 hj=new haghejraedit(this);
                 hj.setVisible(true);
                   hj=new haghejraedit(this);
                 hj.setVisible(true);
                 if(f.getRegisterdate() != null)
                 {
                     hj.textField82.setText(formatter.format(f.getRegisterdate()));
                 }
                 if(f.getOzviyatsaliyaneamount() != null)
                 {
                     hj.textField83.setText(String.valueOf(f.getOzviyatsaliyaneamount()));
                 }
                 if(f.getKarkardamount() != null)
                 {
                     hj.textField88.setText(String.valueOf(f.getKarkardamount()));
                 }
                 
                 if(f.getDarsad() != null)
                 {
                     hj.textField89.setText(String.valueOf(f.getDarsad()));
                 }
                 
                 hj.comboBox1.setSelectedItem(f.getpaykind());
                 hj.comboBox5.setSelectedItem(f.getbankname());
                 if(f.getfishnumber() != null)
                 {
                     hj.textField84.setText(f.getfishnumber());
                 }
                 if(f.getchecknumber() != null)
                 {
                      hj.textField85.setText(f.getchecknumber());
                 }
                 if(f.getPay() != null)
                 {
                     hj.textField86.setText(String.valueOf(f.getPay()));
                 }
                if(f.getPardakhtdate() != null)
                {
                    hj.textField87.setText(formatter.format(f.getPardakhtdate()));
                }
                if(f.getextra() != null)
                {
                    hj.textArea1.setText(f.getextra());
                }
                
                
                
                 
               
             }
             else if(f.getBedehkarikind().equals("آموزش"))
             {
                ae=new amuzeshEdit(this);
                ae.setVisible(true);
                 if(f.getRegisterdate() != null)
                {
                   ae.textField82.setText(formatter.format(f.getRegisterdate())); 
                }
                if(f.getBedehkariamount() != null)
                {
                    ae.textField83.setText(String.valueOf(f.getBedehkariamount()));

                }
               
               ae.comboBox1.setSelectedItem(f.getpaykind());
               ae.comboBox5.setSelectedItem(f.getbankname());
               if(f.getfishnumber() != null)
               {
                   ae.textField84.setText(f.getfishnumber());
               }
               if(f.getchecknumber() != null)
               {
                  ae.textField85.setText(f.getchecknumber());
               }
               if(f.getPay() != null)
               {
                   ae.textField86.setText(String.valueOf(f.getPay()));
               }
               if(f.getPardakhtdate() != null)
               {
                    ae.textField87.setText(formatter.format(f.getPardakhtdate()));
               }
               if(f.getextra() != null)
               {
                   ae.textArea1.setText(f.getextra().toString());
               }
                 
                
             }
             else if(f.getBedehkarikind().equals("عدم عضویت"))
             {
               ao=new adamOzviyatEdit(this);
               ao.setVisible(true);
                if(f.getRegisterdate() != null)
                {
                   ao.textField82.setText(formatter.format(f.getRegisterdate())); 
                }
                if(f.getBedehkariamount() != null)
                {
                    ao.textField83.setText(String.valueOf(f.getBedehkariamount()));

                }
               
               ao.comboBox1.setSelectedItem(f.getpaykind());
               ao.comboBox5.setSelectedItem(f.getbankname());
               if(f.getfishnumber() != null)
               {
                   ao.textField84.setText(f.getfishnumber());
               }
               if(f.getchecknumber() != null)
               {
                  ao.textField85.setText(f.getchecknumber());
               }
               if(f.getPay() != null)
               {
                   ao.textField86.setText(String.valueOf(f.getPay()));
               }
               if(f.getPardakhtdate() != null)
               {
                    ao.textField87.setText(formatter.format(f.getPardakhtdate()));
               }
               if(f.getextra() != null)
               {
                   ao.textArea1.setText(f.getextra().toString());
               }
             }
             else if(f.getBedehkarikind().equals("لغو عضویت"))
             {
                lo=new laghvOzviyatEdit(this);
                lo.setVisible(true);
                if(f.getRegisterdate() != null)
                {
                   lo.textField82.setText(formatter.format(f.getRegisterdate())); 
                }
                if(f.getBedehkariamount() != null)
                {
                    lo.textField83.setText(String.valueOf(f.getBedehkariamount()));

                }
               
               lo.comboBox1.setSelectedItem(f.getpaykind());
               lo.comboBox5.setSelectedItem(f.getbankname());
               if(f.getfishnumber() != null)
               {
                   lo.textField84.setText(f.getfishnumber());
               }
               if(f.getchecknumber() != null)
               {
                  lo.textField85.setText(f.getchecknumber());
               }
               if(f.getPay() != null)
               {
                   lo.textField86.setText(String.valueOf(f.getPay()));
               }
               if(f.getPardakhtdate() != null)
               {
                    lo.textField87.setText(formatter.format(f.getPardakhtdate()));
               }
               if(f.getextra() != null)
               {
                   lo.textArea1.setText(f.getextra().toString());
               }
               
                
             }
          else    if(f.getBedehkarikind().equals("سایر"))
            {
                th=new otherEdit(this);
                th.setVisible(true);
                if(f.getRegisterdate() != null)
                {
                   th.textField82.setText(formatter.format(f.getRegisterdate())); 
                }
                if(f.getBedehkariamount() != null)
                {
                    th.textField83.setText(String.valueOf(f.getBedehkariamount()));

                }
               
               th.comboBox1.setSelectedItem(f.getpaykind());
               th.comboBox5.setSelectedItem(f.getbankname());
               if(f.getfishnumber() != null)
               {
                   th.textField84.setText(f.getfishnumber());
               }
               if(f.getchecknumber() != null)
               {
                  th.textField85.setText(f.getchecknumber());
               }
               if(f.getPay() != null)
               {
                   th.textField86.setText(String.valueOf(f.getPay()));
               }
               if(f.getPardakhtdate() != null)
               {
                    th.textField87.setText(formatter.format(f.getPardakhtdate()));
               }
               if(f.getextra() != null)
               {
                   th.textArea1.setText(f.getextra().toString());
               }
               
                
                
            }
             
            tx.commit();
            
        }
         catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
      
        
    }
    public void editPardakhtDate(pardakht p)
    {
         Session session = factory.openSession();
         Transaction tx=null;
         int id=Integer.parseInt(p.textField82.getText());
         try
         {
             tx=session.beginTransaction();
             Finance f=(Finance)session.get(Finance.class, id);
             Date pardakht=null;
        if(p.textField83.getText()!=null)
        {
            try
            {
                pardakht=formatter.parse(p.textField83.getText());
                f.setPardakhtdate(pardakht);
            }
            catch(Exception e){}
        }
             session.update(f);
           
             tx.commit();
             
         }
          catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
    }
    public void editOzvjadid()
    {
         Date regDate=null;
        Date payDate=null;
         Session session = factory.openSession();
         Transaction tx=null;
         
         try
         {
             tx=session.beginTransaction();
             Finance f=(Finance)session.get(Finance.class, this.idf);
              if(jd.textField82.getText() !=null)
             {
                   try
             {
                 regDate=formatter.parse(jd.textField82.getText());
             }
                   catch(Exception e){}
             }
             
            f.setRegisterdate(regDate);
              
             if(jd.textField87.getText() !=null)
             {
                   try
             {
                 payDate=formatter.parse(jd.textField87.getText());
             }
                   catch(Exception e){}
             }
                f.setPardakhtdate(payDate);
                f.setfishnumber(jd.textField84.getText());
                f.setchecknumber(jd.textField85.getText());
                f.setextra(jd.textArea1.getText());
                f.setpaykind(jd.comboBox1.getSelectedItem().toString());
                f.setbankname(jd.comboBox5.getSelectedItem().toString());
                
                session.update(f);
         
                tx.commit();
              
         }
         
          catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
         
        
    }
     public void editOther()
    {
         Date regDate=null;
        Date payDate=null;
         Session session = factory.openSession();
         Transaction tx=null;
         
         try
         {
             tx=session.beginTransaction();
             Finance f=(Finance)session.get(Finance.class, this.idf);
              if(th.textField82.getText() !=null)
             {
                   try
             {
                 regDate=formatter.parse(th.textField82.getText());
             }
                   catch(Exception e){}
             }
             
            f.setRegisterdate(regDate);
              
             if(th.textField87.getText() !=null)
             {
                   try
             {
                 payDate=formatter.parse(th.textField87.getText());
             }
                   catch(Exception e){}
             }
                f.setPardakhtdate(payDate);
                f.setfishnumber(th.textField84.getText());
                f.setchecknumber(th.textField85.getText());
                f.setextra(th.textArea1.getText());
                f.setpaykind(th.comboBox1.getSelectedItem().toString());
                f.setbankname(th.comboBox5.getSelectedItem().toString());
                
                session.update(f);
         
                tx.commit();
              
         }
         
          catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
         
        
    }
    public void updateFinanceStatus(int ids)
    {
        Session session = factory.openSession();
         Transaction tx=null;
         
         try
         {
             tx=session.beginTransaction();
             Finance f=(Finance)session.get(Finance.class, ids);
             f.setstatus(1);
            session.update(f);
         
             tx.commit();
              
         }
         
          catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
         
    }
    public void editkartOzviyat()
    {
          Date regDate=null;
        Date payDate=null;
         Session session = factory.openSession();
         Transaction tx=null;
         
         try
         {
             tx=session.beginTransaction();
             Finance f=(Finance)session.get(Finance.class, this.idf);
              if(ko.textField82.getText() !=null)
             {
                   try
             {
                 regDate=formatter.parse(ko.textField82.getText());
             }
                   catch(Exception e){}
             }
             
            f.setRegisterdate(regDate);
              
             if(ko.textField87.getText() !=null)
             {
                   try
             {
                 payDate=formatter.parse(ko.textField87.getText());
             }
                   catch(Exception e){}
             }
                f.setPardakhtdate(payDate);
                f.setfishnumber(ko.textField84.getText());
                f.setchecknumber(ko.textField85.getText());
                f.setextra(ko.textArea1.getText());
                f.setpaykind(ko.comboBox1.getSelectedItem().toString());
                f.setbankname(ko.comboBox5.getSelectedItem().toString());
                
             session.update(f);
        
             tx.commit();
             
         }
         
          catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
         
        
    }
    
    public void editOzviyat()
    {
         
         Session session = factory.openSession();
         Transaction tx=null;
         Date regDate=null;
         Date payDate=null;
         
         try
         {
             tx=session.beginTransaction();
             Finance f=(Finance)session.get(Finance.class, this.idf);
              if(oz.textField82.getText() !=null)
             {
                   try
             {
                 regDate=formatter.parse(oz.textField82.getText());
             }
                   catch(Exception e){}
             }
             
            f.setRegisterdate(regDate);
              
             if(oz.textField87.getText() !=null)
             {
                   try
             {
                 payDate=formatter.parse(oz.textField87.getText());
             }
                   catch(Exception e){}
             }
                f.setPardakhtdate(payDate);
                f.setfishnumber(oz.textField84.getText());
                f.setchecknumber(oz.textField85.getText());
                f.setextra(oz.textArea1.getText());
                f.setpaykind(oz.comboBox1.getSelectedItem().toString());
                f.setbankname(oz.comboBox5.getSelectedItem().toString());
                
          
             
             session.update(f);
        
             tx.commit();
             
         }
         
          catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
         
        
    }
    public void editadamOzviyat()
    {
        Date regDate=null;
        Date payDate=null;
         Session session = factory.openSession();
         Transaction tx=null;
         
         try
         {
             tx=session.beginTransaction();
             Finance f=(Finance)session.get(Finance.class, this.idf);
              if(ao.textField82.getText() !=null)
             {
                   try
             {
                 regDate=formatter.parse(ao.textField82.getText());
             }
                   catch(Exception e){}
             }
             
            f.setRegisterdate(regDate);
              
             if(ao.textField87.getText() !=null)
             {
                   try
             {
                 payDate=formatter.parse(ao.textField87.getText());
             }
                   catch(Exception e){}
             }
                f.setPardakhtdate(payDate);
                f.setfishnumber(ao.textField84.getText());
                f.setchecknumber(ao.textField85.getText());
                f.setextra(ao.textArea1.getText());
                f.setpaykind(ao.comboBox1.getSelectedItem().toString());
                f.setbankname(ao.comboBox5.getSelectedItem().toString());
                
          
             
             session.update(f);
        
             tx.commit();
             
         }
         
          catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
         
        
    }
    public void editlaghvOzviyat()
    {
         Date regDate=null;
        Date payDate=null;
         Session session = factory.openSession();
         Transaction tx=null;
         
         try
         {
             tx=session.beginTransaction();
             Finance f=(Finance)session.get(Finance.class, this.idf);
              if(lo.textField82.getText() !=null)
             {
                   try
             {
                 regDate=formatter.parse(lo.textField82.getText());
             }
                   catch(Exception e){}
             }
             
            f.setRegisterdate(regDate);
              
             if(lo.textField87.getText() !=null)
             {
                   try
             {
                 payDate=formatter.parse(lo.textField87.getText());
             }
                   catch(Exception e){}
             }
                f.setPardakhtdate(payDate);
                f.setfishnumber(lo.textField84.getText());
                f.setchecknumber(lo.textField85.getText());
                f.setextra(lo.textArea1.getText());
                f.setpaykind(lo.comboBox1.getSelectedItem().toString());
                f.setbankname(lo.comboBox5.getSelectedItem().toString());
                
          
             
             session.update(f);
        
             tx.commit();
             
         }
         
          catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
         
        
    }
     public void editAmuzesh()
    {
          Date regDate=null;
        Date payDate=null;
         Session session = factory.openSession();
         Transaction tx=null;
         
         try
         {
             tx=session.beginTransaction();
             Finance f=(Finance)session.get(Finance.class, this.idf);
              if(ae.textField82.getText() !=null)
             {
                   try
             {
                 regDate=formatter.parse(ae.textField82.getText());
             }
                   catch(Exception e){}
             }
             
            f.setRegisterdate(regDate);
              
             if(ae.textField87.getText() !=null)
             {
                   try
             {
                 payDate=formatter.parse(ae.textField87.getText());
             }
                   catch(Exception e){}
             }
                f.setPardakhtdate(payDate);
                f.setfishnumber(ae.textField84.getText());
                f.setchecknumber(ae.textField85.getText());
                f.setextra(ae.textArea1.getText());
                f.setpaykind(ae.comboBox1.getSelectedItem().toString());
                f.setbankname(ae.comboBox5.getSelectedItem().toString());
                
          
             
             session.update(f);
        
             tx.commit();
             
         }
         
          catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
         
        
    }
    
    
    public void editSodurParvane()
    {
        Date regDate=null;
        Date payDate=null;
         Session session = factory.openSession();
         Transaction tx=null;
         
         try
         {
             tx=session.beginTransaction();
             Finance f=(Finance)session.get(Finance.class, this.idf);
              if(se.textField82.getText() !=null)
             {
                   try
             {
                 regDate=formatter.parse(se.textField82.getText());
             }
                   catch(Exception e){}
             }
             
            f.setRegisterdate(regDate);
              
             if(se.textField87.getText() !=null)
             {
                   try
             {
                 payDate=formatter.parse(se.textField87.getText());
             }
                   catch(Exception e){}
             }
                f.setPardakhtdate(payDate);
                f.setfishnumber(se.textField84.getText());
                f.setchecknumber(se.textField85.getText());
                f.setextra(se.textArea1.getText());
                f.setpaykind(se.comboBox1.getSelectedItem().toString());
                f.setbankname(se.comboBox5.getSelectedItem().toString());
                
          
             
             session.update(f);
        
             tx.commit();
             
         }
         
          catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
         
        
    }
    public void editTamdidParvane()
    {
         Date regDate=null;
        Date payDate=null;
        Date parvaneDate=null;
         Session session = factory.openSession();
         Transaction tx=null;
         
         try
         {
             tx=session.beginTransaction();
             Finance f=(Finance)session.get(Finance.class, this.idf);
              if(te.textField82.getText() !=null)
             {
                   try
             {
                 regDate=formatter.parse(te.textField82.getText());
             }
                   catch(Exception e){}
             }
             
            f.setRegisterdate(regDate);
              
             if(te.textField87.getText() !=null)
             {
                   try
             {
                 payDate=formatter.parse(te.textField87.getText());
             }
                   catch(Exception e){}
             }
               if(te.textField88.getText() !=null)
             {
                   try
             {
                 parvaneDate=formatter.parse(te.textField88.getText());
             }
                   catch(Exception e){}
             }
                f.setParvanedate(parvaneDate);
                f.setPardakhtdate(payDate);
                f.setfishnumber(te.textField84.getText());
                f.setchecknumber(te.textField85.getText());
                f.setextra(te.textArea1.getText());
                f.setpaykind(te.comboBox1.getSelectedItem().toString());
                f.setbankname(te.comboBox5.getSelectedItem().toString());
                
          
             
             session.update(f);
        
             tx.commit();
             
         }
         
          catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
         
            
    }
    public void editTaghirPaye()
    {
          Date regDate=null;
         Date payDate=null;
         Session session = factory.openSession();
         Transaction tx=null;
         
         try
         {
             tx=session.beginTransaction();
             Finance f=(Finance)session.get(Finance.class, this.idf);
              if(pe.textField82.getText() !=null)
             {
                   try
             {
                 regDate=formatter.parse(se.textField82.getText());
             }
                   catch(Exception e){}
             }
             
            f.setRegisterdate(regDate);
              
             if(pe.textField87.getText() !=null)
             {
                   try
             {
                 payDate=formatter.parse(pe.textField87.getText());
             }
                   catch(Exception e){}
             }
                f.setPardakhtdate(payDate);
                f.setfishnumber(pe.textField84.getText());
                f.setchecknumber(pe.textField85.getText());
                f.setextra(pe.textArea1.getText());
                f.setpaykind(pe.comboBox1.getSelectedItem().toString());
                f.setbankname(pe.comboBox5.getSelectedItem().toString());
                f.setPaye(pe.comboBox4.getSelectedItem().toString());
                
          
             
              session.update(f);
        
              tx.commit();
             
         }
         
          catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
         
        
              
    }
    public void editNezarat()
    {
         Date regDate=null;
         Date payDate=null;
         Session session = factory.openSession();
         Transaction tx=null;
         
         try
         {
             tx=session.beginTransaction();
             Finance f=(Finance)session.get(Finance.class, this.idf);
              if(he.textField82.getText() !=null)
             {
                   try
             {
                 regDate=formatter.parse(he.textField82.getText());
             }
                   catch(Exception e){}
             }
             
            f.setRegisterdate(regDate);
              
             if(he.textField87.getText() !=null)
             {
                   try
             {
                 payDate=formatter.parse(he.textField87.getText());
             }
                   catch(Exception e){}
             }
                f.setPardakhtdate(payDate);
                f.setfishnumber(he.textField84.getText());
                f.setchecknumber(he.textField85.getText());
                f.setextra(he.textArea1.getText());
                f.setpaykind(he.comboBox1.getSelectedItem().toString());
                f.setbankname(he.comboBox5.getSelectedItem().toString());
                if(he.textField83.getText() != null)
                {
                    f.setOzviyatsaliyaneamount(Integer.parseInt(he.textField83.getText()));
                }
                if(he.textField88.getText() != null)
                {
                    f.setKarkardamount(Double.parseDouble(he.textField88.getText()));
                }
                  if(he.textField89.getText() != null)
                {
                    f.setDarsad(Double.parseDouble(he.textField89.getText()));
                }
                
          
             
              session.update(f);
        
              tx.commit();
             
         }
         
          catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
         
        
        
    }
    public void editejra()
      {
         Date regDate=null;
         Date payDate=null;
         Session session = factory.openSession();
         Transaction tx=null;
         
         try
         {
             tx=session.beginTransaction();
             Finance f=(Finance)session.get(Finance.class, this.idf);
              if(hj.textField82.getText() !=null)
             {
                   try
             {
                 regDate=formatter.parse(hj.textField82.getText());
             }
                   catch(Exception e){}
             }
             
            f.setRegisterdate(regDate);
              
             if(hj.textField87.getText() !=null)
             {
                   try
             {
                 payDate=formatter.parse(hj.textField87.getText());
             }
                   catch(Exception e){}
             }
                f.setPardakhtdate(payDate);
                f.setfishnumber(hj.textField84.getText());
                f.setchecknumber(hj.textField85.getText());
                f.setextra(hj.textArea1.getText());
                f.setpaykind(hj.comboBox1.getSelectedItem().toString());
                f.setbankname(hj.comboBox5.getSelectedItem().toString());
                if(hj.textField83.getText() != null)
                {
                    f.setOzviyatsaliyaneamount(Integer.parseInt(hj.textField83.getText()));
                }
                if(hj.textField88.getText() != null)
                {
                    f.setKarkardamount(Double.parseDouble(hj.textField88.getText()));
                }
                  if(hj.textField89.getText() != null)
                {
                    f.setDarsad(Double.parseDouble(hj.textField89.getText()));
                }
                
          
             
              session.update(f);
        
              tx.commit();
             
         }
         
          catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
         
        
        
        
    } 

     public void editAmuzeshi()
    {
         Session session = factory.openSession();
         Transaction tx = null;
         //int idb=Integer.parseInt(p8.textField96.getText());
         try
         {
             tx=session.beginTransaction();
             Amuzeshi am=(Amuzeshi) session.get(Amuzeshi.class, ida);
             am.setName(p8.textField83.getText());
             if(p8.textField84.getText()!=null)
             {
                 am.setSdate(formatter.parse(p8.textField84.getText()));
             }
               if(p8.textField85.getText()!=null)
             {
                 am.setFdate(formatter.parse(p8.textField85.getText()));
             }
            am.setPeriod(p8.textField86.getText());
            am.setPlace(p8.textField87.getText());
            am.setTeachername(p8.textField88.getText());
            am.setMojaveznumber(p8.textField89.getText());
            if(p8.textField90.getText()!=null)
             {
                 am.setDmojavez(formatter.parse(p8.textField90.getText()));
             }
            am.setSazman(p8.textField91.getText());
             if(p8.textField92.getText()!=null)
             {
                 am.setDazmun(formatter.parse(p8.textField92.getText()));
             }
             am.setParvaneteacher(p8.textField93.getText());
             am.setNumber(p8.textField94.getText());
                    
            
             session.update(am);
            
             tx.commit();
             
         }
         catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
    }
    public void editBime()
    {
         Session session = factory.openSession();
         Transaction tx = null;
         int idb=Integer.parseInt(b.textField96.getText());
         try
         {
             tx=session.beginTransaction();
             Bime bime=(Bime) session.get(Bime.class, idb);
             bime.setId(Integer.parseInt(b.textField96.getText()));
             bime.setSdate(formatter.parse(b.textField99.getText()));
             bime.setEdate(formatter.parse(b.textField100.getText()));
             bime.setKhales(b.textField101.getText());
             bime.setNaKhales(b.textField102.getText());
             bime.setMetrazh(b.textField103.getText());
             bime.setSherkat(b.textField104.getText());
            
             session.update(bime);
            
             tx.commit();
             
         }
         catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
    }
    public void saveNewTajrobi(tajrobi t)
    {
        Session session =factory.openSession();
        Transaction tx=null;
        try
        {
            int id=Integer.parseInt(t.textField1.getText());
            String lname=t.textField3.getText();
            String fname=t.textField2.getText();
            String fatherName=t.textField4.getText();
            String mcode=t.textField5.getText();
            String mphone=t.textField6.getText();
            tx=session.beginTransaction();
            Tajrobi taj=new Tajrobi(id,lname,fname,fatherName,mcode,mphone);
            session.save(taj);
//            t.panel1.invalidate();
//            t.label1.setVisible(true);
            tx.commit();
            
        }
        catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }     
        
    }


    public void saveSahmiye(String entire,String part,String year,String loc,String kind,Integer idmain)
    {
        Session session=factory.openSession();
        Transaction tx=null;
        try
        {
            tx=session.beginTransaction();
           Sahmiye s=new Sahmiye(entire,part,idmain,year,loc,kind);
            session.save(s);
            tx.commit();
            
                
        }
        catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
    }
    public void saveFinance(int id,int value,int pay,Date regDate,Date payDate,String paykind,String fishnumber,String checknumber,String bank,String extra,String kind)
    {
        Session session=factory.openSession();
        Transaction tx=null;
        String creator=identify.usr;
        
        try
        {
            tx=session.beginTransaction();
            Finance fi=new Finance(id,value,pay,regDate,payDate,paykind,fishnumber,checknumber,bank,extra,kind,0,creator);
            session.save(fi);
            tx.commit();
            
                
        }
        catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
    }
/*     public void saveFinanceAsAmuzesh(int fid,int value,String kind,String year,String month,String day,String number,String bank,int pay,Date payDate,int id)
    {
        Session session=factory.openSession();
        Transaction tx=null;
        try
        {
            tx=session.beginTransaction();
            Finance fi=new Finance(fid, value, kind, year, month, day,number,bank,pay,payDate, id);
            session.save(fi);
            tx.commit();
            
                
        }
        catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
    }
     public void saveFinanceAsAdamOzviyat(int fid,int value,String kind,String year,String month,String day,String number,String bank,int pay,Date payDate,int id)
              {
        Session session=factory.openSession();
        Transaction tx=null;
        try
        {
            tx=session.beginTransaction();
            Finance fi=new Finance(fid, value, kind, year, month, day,number,bank,pay,payDate, id);
            session.save(fi);
            tx.commit();
            
                
        }
        catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
    }
     public void saveFinanceAsLaghvOzviyat(int fid,int value,String kind,String year,String month,String day,String number,String bank,int pay,Date payDate,int id)
               {
        Session session=factory.openSession();
        Transaction tx=null;
        try
        {
            tx=session.beginTransaction();
            Finance fi=new Finance(fid, value, kind, year, month, day,number,bank,pay,payDate, id);
            session.save(fi);
            tx.commit();
            
                
        }
        catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
    }
    
     public void saveFinanceAsSodur(int fid,int value,String kind,String year,String month,String day,String number,String bank,int pay,Date payDate,int id)
     {
          Session session=factory.openSession();
        Transaction tx=null;
        try
        {
            tx=session.beginTransaction();
            Finance fi=new Finance(fid, value, kind, year, month, day,number,bank,pay,payDate, id);
            session.save(fi);
            tx.commit();
            
                
        }
        catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
     }
*/
     public void saveFinanceAsTaghir(int id,int value,int pay,Date regDate,Date payDate,String paykind,String fishnumber,String checknumber,String bank,String extra,String kind,String paye)
     {
          Session session=factory.openSession();
        Transaction tx=null;
        String creator=identify.usr;
        try
        {
            tx=session.beginTransaction();
            Finance fi=new Finance(id,value,pay,regDate,payDate,paykind,fishnumber,checknumber,bank,extra,kind,paye,0,creator);
            session.save(fi);
            tx.commit();
            
                
        }
        catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
     }
     public void saveFinanceAsTamdid(int id,int value,int pay,Date regDate,Date payDate,String paykind,String fishnumber,String checknumber,String bank,String extra,String kind,Date parvaneDate)
             
     {
          Session session=factory.openSession();
        Transaction tx=null;
        String creator=identify.usr;
        try
        {
            tx=session.beginTransaction();
            Finance fi=new Finance(id,value,pay,regDate,payDate,paykind,fishnumber,checknumber,bank,extra,kind,parvaneDate,0,creator);
            session.save(fi);
            tx.commit();
            
                
        }
        catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
     }
     public void saveFinanceAsNezarat(int id,int value,int pay,Date regDate,Date payDate,String paykind,String fishnumber,String checknumber,String bank,String extra,String kind,int nezarat,double karkard,double darsad)
     {
        Session session=factory.openSession();
        Transaction tx=null;
        String creator=identify.usr;
        try
        {
            tx=session.beginTransaction();
            Finance fi=new Finance(id,value,pay,regDate,payDate,paykind,fishnumber,checknumber,bank,extra,kind,nezarat,karkard,darsad,0,creator);
            session.save(fi);
            tx.commit();
            
                
        }
        catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
     }

    public void editTajrobi()
    {
         Session session = factory.openSession();
         Transaction tx=null;
         try
         {
              tx=session.beginTransaction();
              Tajrobi taj=(Tajrobi) session.get(Tajrobi.class ,idTajrobi);
              taj.setName(tf.textField71.getText());
              taj.setLname(tf.textField72.getText());
              taj.setFname(tf.textField73.getText());
              taj.setShnumber(tf.textField74.getText());
              taj.setMcode(tf.textField75.getText());
              taj.setTyear(tf.textField76.getText()); 
            
             taj.setHphone(tf.textField77.getText());
             taj.setSphone(tf.textField78.getText());
             taj.setCposti(tf.textField79.getText());
             taj.setNparvane(tf.textField80.getText());
             taj.setDsparvane(tf.textField81.getText());
             taj.setDeparvane(tf.textField82.getText());
           
              taj.setPaye(tf.textField86.getText());
              taj.setCbayegani(tf.textField83.getText());
              taj.setEjraname(tf.textField84.getText());
              
              taj.setDejraname(tf.textField85.getText());
              taj.setAddress(tf.textArea2.getText());
               session.update(taj);
               tx.commit();
//               tf.panel1.invalidate();
//               tf.label10.setVisible(true);
              
              
         }
          catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
    }
    public void showTajrobi()
    {
         Session session = factory.openSession();
         Transaction tx=null;
         try
         {
              tx=session.beginTransaction();
              Tajrobi taj=(Tajrobi) session.get(Tajrobi.class ,idTajrobi);
             
              tf.textField71.setText(taj.getName());
              tf.textField72.setText(taj.getLname());
              tf.textField73.setText(taj.getFname());
              tf.textField74.setText(taj.getShnumber());
              tf.textField75.setText(taj.getMcode());
              tf.textArea2.setText(taj.getAddress());
               String Tyear= taj.getTyear();
               tf.textField76.setText(Tyear);
             
              String hphone=taj.getHphone();
              tf.textField77.setText(hphone); 
              tf.textField78.setText(taj.getSphone());
              tf.textField79.setText(taj.getCposti());
              tf.textField80.setText(taj.getNparvane());
              String dsparvane=taj.getDsparvane();
                   tf.textField81.setText(dsparvane);
                      String deparvane=taj.getDeparvane();
                   tf.textField82.setText(deparvane);
            
             
              tf.textField86.setText(taj.getPaye());
              tf.textField83.setText(taj.getCbayegani());
              tf.textField84.setText(taj.getEjraname());
                String dejra=taj.getDejraname();
                   tf.textField85.setText(dejra);
                    tf.fillTable();
            
         }
          catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }  
    }
    public void showInfo()
    {
        p.setVisible(true);
        
        Session session = factory.openSession();
        Transaction tx=null;
        
        try
        {
            tx=session.beginTransaction();

          eng=(Main) session.get(Main.class, id);
             if(eng.getImage()!=null)
             {
                 String path=eng.getImage();
                 fillImage(path);
             }
             
                 
            p.textField1.setText(eng.getFname());
            p.textField2.setText(eng.getLname());
            p.textField3.setText(eng.getLatin());
            p.textField4.setText(eng.getFathername());
            p.textField5.setText(eng.getIdentitycardnumber());
            p.textField8.setText(eng.getDofbirth());
            p.textField6.setText(eng.getMelicode());
            p.textField10.setText(eng.getPostalcode());
            p.textArea1.setText(eng.getAddress());
            p.textField11.setText(eng.getMphone());
            p.textField12.setText(eng.getHphone());
            p.textField7.setText(eng.getCofbirth());
            p.textField26.setText(eng.getSex());
            p.textField16.setText(eng.getSingle());
            p.textField17.setText(eng.getUniname());
            p.textField18.setText(eng.getMajor());
            p.textField14.setText(eng.getMajorcode());
            p.textField15.setText(eng.getGerayesh());
            p.textField19.setText(eng.getMadraknezarat());
            p.textField13.setText(eng.getDenduni());
            p.textArea2.setText(eng.getAddressuni());
            p.textField20.setText(eng.getSarbazi());
            p.textField22.setText(eng.getJobplace());
            p.textArea8.setText(eng.getJobaddress());
            p.textField24.setText(eng.getSavabegh());
            p.textField25.setText(eng.getSabeghe());
            p.textField26.setText(eng.getSex());
            p.textField51.setText(eng.getPerformance());
            String docShiraz=null;
            String docBonyad=null;
            String docSadra=null;
            String docShahr=null;
            if(eng.getDocumentshiraz()!=null)
                docShiraz=eng.getDocumentshiraz()+"\n"+"پایان داکیومنت شیراز";
            else
            {
                docShiraz="پایان داکیومنت شیراز";
            }
               
             if(eng.getDocumentbonyad() !=null)
                docBonyad=eng.getDocumentbonyad()+"\n"+"پایان داکیومنت بنیاد ";
             else
             {
                 docBonyad="پایان داکیومنت بنیاد ";
             
             }
             if(eng.getDocumentsadra()!=null)
                docSadra=eng.getDocumentsadra()+"\n"+"پایان داکیومنت صدرا";
             else
             {
                 docSadra="پایان داکیومنت صدرا";
             }
                
             if (eng.getDocumentshahrestan()!=null)
                docShahr=eng.getDocumentshahrestan()+"\n"+"پایان داکیومنت شهرستان";
             else
             {
                 docShahr="پایان داکیومنت شهرستان";
             }
            p.textArea3.setText(docShiraz+"\n"+docBonyad+"\n"+docSadra+"\n"+docShahr);
            p.textArea4.setText(eng.getdocejra());
            p.textField27.setText(eng.getMembershipnumber());
            p.textField28.setText(eng.getOzviyattype());
            p.textField29.setText(eng.getOzviyatdate());
            p.textField30.setText(eng.getDtmdidozviyat());
            p.textField31.setText(eng.getTotalaverage());
            p.textField32.setText(eng.getLicensenumber());
             p.textField33.setText(eng.getPaye());
            p.textField34.setText(eng.getDtamdid());
            p.textField35.setText(eng.getDendetebar());
            p.textField36.setText(eng.getDtest1());
            p.textField37.setText(eng.getDtest2());
            p.textField38.setText(eng.getDtest3());
            p.textField39.setText(eng.getDsodur1());
            p.textField40.setText(eng.getDsodur2());
            p.textField41.setText(eng.getDsodur3());
            p.textField42.setText(eng.getTypequalifucation());
            p.textField43.setText(eng.getDqualification());
            p.textField44.setText(eng.getMadrakejra());
            p.textField45.setText(eng.getCodemadrakejra());
            p.textField46.setText(eng.getMadraknezarat());
            p.textField47.setText(eng.getDenteghali());
            if(eng.getNezaratshiraz()!=null)
                p.checkBoxMenuItem6.setSelected(true);
             if (eng.getNezaratsadra()!=null)
               p.checkBoxMenuItem4.setSelected(true);
             if(eng.getNezaratbonyad()!=null)
                p.checkBoxMenuItem5.setSelected(true);
             if(eng.getNezaratshahrestan()!=null)
                p.checkBoxMenuItem7.setSelected(true);
            p.textField48.setText(eng.getDsalahiyatnezarat());
            p.textField49.setText(eng.getDsalahiyatejra());
            p.textField50.setText(eng.getArchivecode());
            p.textArea11.setText(eng.getPerformancequalification());
          
            p.textField56.setText(eng.getDsendinquiry());
            p.textField57.setText(eng.getDreceivedinquiry());
            p.textField58.setText(eng.getDateinputinfo());
            p.textField59.setText(eng.getNumbersendletter());
            p.textField60.setText(eng.getFishnumber());
            p.textField61.setText(eng.getFishdate());
            p.textArea10.setText(eng.getSupervisionqualification());
            p.textArea13.setText(eng.getNotes());
            p.textArea12.setText(eng.getOzviyatdocument());
//            p.textArea14.setText(eng.getLetter());
            
            p.fillTable2();
            p.fillTable3();
            p.fillTable4();
            p.fillTable5();
            fillBio();
            p.fillTable();
      
            
          
            
        }
        catch(Exception e)
        {
            if(tx!= null)
                tx.rollback();
        }
        finally
        {
            session.close();
        }
    }
   
}
