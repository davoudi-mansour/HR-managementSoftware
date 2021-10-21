import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import nezam.Main;
import java.util.*;
/*
 * Created by JFormDesigner on Thu Jun 15 12:48:40 PDT 2017
 */



/**
 * @author mansour davoudi
 */
public class page2 extends JFrame {
    String columnName[]={"\u0634\u0645\u0627\u0631\u0647 \u0647\u0645\u0631\u0627\u0647","\u06a9\u062f \u0645\u0644\u06cc ","\u0646\u0627\u0645 \u067e\u062f\u0631 ","\u0646\u0627\u0645 \u062e\u0627\u0646\u0648\u0627\u062f\u06af\u06cc","\u0646\u0627\u0645","\u0634\u0646\u0627\u0633\u0647","\u0631\u062f\u06cc\u0641"};
    manageEng MG=null;
            
     Thread t1=null;
     Thread t2=null;
    int hours=0; int minutes=0; int seconds=0;
    String sth="";
    public page2() {
        initComponents();
    }
      public void fillTable()
    {
        //String columnName[]={"\u0634\u0645\u0627\u0631\u0647 \u0647\u0645\u0631\u0627\u0647","\u06a9\u062f \u0645\u0644\u06cc ","\u0646\u0627\u0645 \u067e\u062f\u0631 ","\u0646\u0627\u0645 \u062e\u0627\u0646\u0648\u0627\u062f\u06af\u06cc","\u0646\u0627\u0645","\u0634\u0646\u0627\u0633\u0647"};
        DefaultTableModel tablemodel = new DefaultTableModel(columnName, 0);
         MG=new manageEng();
        java.util.List eng=MG.listData();
        Object[] row = new Object[7];
        table1.setModel(tablemodel);
        int count=1;
        for (int i = 0; i < eng.size(); i++)
        {
            Main user =(Main)  eng.get(i);
            row[0] = user.getMphone();
            row[1] = user.getMelicode();
            row[2] = user.getFathername();
            row[3] = user.getLname();
            row[4] = user.getFname();
            row[5]=user.getId();
            row[6]=count;
            tablemodel.addRow(row);
            count++;


        }
       
    }
      public void menuItem4actionPerformed(ActionEvent e)
      {
          tajrobi1 tj1=new tajrobi1();
          tj1.setVisible(true);
      }
      public void menuItem3actionPerformed(ActionEvent e) {
         DefaultTableModel tablemodel = new DefaultTableModel(columnName, 0);
         MG=new manageEng();
        java.util.List eng=MG.listData();
        Object[] row = new Object[7];
        table1.setModel(tablemodel);
        int count=1;
        for (int i = 0; i < eng.size(); i++)
        {
            Main user =(Main)  eng.get(i);
            row[0] = user.getMphone();
            row[1] = user.getMelicode();
            row[2] = user.getFathername();
            row[3] = user.getLname();
            row[4] = user.getFname();
            row[5]=user.getId();
            row[6]=count;
            count++;
            tablemodel.addRow(row);


        }
          
        
    }
      public void showInformation(Integer id)
      {
          MG =new manageEng(id);
          MG.showInfo();
      }
      
      public void Search()
      {
             Main user;
        MG=new manageEng();
        String name;
        name=textField1.getText();
      // int name1=Integer.parseInt(name);
        ArrayList<Main>temp=new ArrayList<>();
         DefaultTableModel tablemodel = new DefaultTableModel(columnName, 0);
         java.util.List eng=MG.listData();
         if(checkBoxMenuItem1.isSelected())
         {
              for (int j=0;j<eng.size();j++)
         {
             user=(Main) eng.get(j);
             if(user.getFname()!=null)
             {
                  if (user.getFname().startsWith(name))
                   temp.add(user);
             }
           
                
         }
        Object[] row = new Object[7];
        table1.setModel(tablemodel);
        int count=1;
        for (int i = 0; i < temp.size(); i++)
        {
             user =temp.get(i);
            row[0] = user.getMphone();
            row[1] = user.getMelicode();
            row[2] = user.getFathername();
            row[3] = user.getLname();
            row[4] = user.getFname();
            row[5]=user.getId();
            row[6]=count;count++;
            
            tablemodel.addRow(row);

        }
             
         }
         if(checkBoxMenuItem2.isSelected())
         {
               for (int j=0;j<eng.size();j++)
         {
             
             user=(Main) eng.get(j);
             
            if(user.getLname()!=null)
             {
                  if (user.getLname().startsWith(name))
                   temp.add(user);
             }
                
         }
        Object[] row = new Object[7];
        
        table1.setModel(tablemodel);
        int count=1;
        for (int i = 0; i < temp.size(); i++)
        {
             user =temp.get(i);
            row[0] = user.getMphone();
            row[1] = user.getMelicode();
            row[2] = user.getFathername();
            row[3] = user.getLname();
            row[4] = user.getFname();
            row[5]=user.getId();
            row[6]=count;count++;
            tablemodel.addRow(row);


        }
             
         }
         if(checkBoxMenuItem3.isSelected())
         {
                for (int j=0;j<eng.size();j++)
         {
             user=(Main) eng.get(j);
             if(user.getMelicode()!=null)
             {
                  if (user.getMelicode().startsWith(name))
                   temp.add(user);
             }
                
         }
        Object[] row = new Object[7];
        
        table1.setModel(tablemodel);
        int count=1;
        for (int i = 0; i < temp.size(); i++)
        {
             user =temp.get(i);
            row[0] = user.getMphone();
            row[1] = user.getMelicode();
            row[2] = user.getFathername();
            row[3] = user.getLname();
            row[4] = user.getFname();
            row[5]=user.getId();
            row[6]=count;count++;
            tablemodel.addRow(row);


        }
             
         }
           if(checkBoxMenuItem4.isSelected())
         {
              for (int j=0;j<eng.size();j++)
         {
             user=(Main) eng.get(j);
             if(user.getMembershipnumber()!=null)
             {
                  if (user.getMembershipnumber().startsWith(name))
                   temp.add(user);
             }
           
                
         }
        Object[] row = new Object[7];
        table1.setModel(tablemodel);
        int count=1;
        for (int i = 0; i < temp.size(); i++)
        {
            user =temp.get(i);
            row[0] = user.getMphone();
            row[1] = user.getMelicode();
            row[2] = user.getFathername();
            row[3] = user.getLname();
            row[4] = user.getFname();
            row[5]=user.getId();
            row[6]=count;count++;
            tablemodel.addRow(row);

        }
        
             
         }
             if(checkBoxMenuItem5.isSelected())
         {
              for (int j=0;j<eng.size();j++)
         {
             user=(Main) eng.get(j);
             if(user.getAddress()!=null)
             {
                  if (user.getAddress().startsWith(name))
                   temp.add(user);
             }
           
                
         }
        Object[] row = new Object[7];
        table1.setModel(tablemodel);
        int count=1;
        for (int i = 0; i < temp.size(); i++)
        {
             user =temp.get(i);
            row[0] = user.getMphone();
            row[1] = user.getMelicode();
            row[2] = user.getFathername();
            row[3] = user.getLname();
            row[4] = user.getFname();
            row[5]=user.getId();
            row[6]=count;count++;
            
            tablemodel.addRow(row);

        }
             
         }
             
             if(checkBoxMenuItem6.isSelected())
         {
              for (int j=0;j<eng.size();j++)
         {
             user=(Main) eng.get(j);
             String uid=String.valueOf(user.getId());
            
                  if (uid.equals(name))
                   temp.add(user);
             
           
                
         }
        Object[] row = new Object[7];
        table1.setModel(tablemodel);
        int count=1;
        for (int i = 0; i < temp.size(); i++)
        {
             user =temp.get(i);
            row[0] = user.getMphone();
            row[1] = user.getMelicode();
            row[2] = user.getFathername();
            row[3] = user.getLname();
            row[4] = user.getFname();
            row[5]=user.getId();
            row[6]=count;count++;
            
            tablemodel.addRow(row);

        }
             
         }
           if (! checkBoxMenuItem1.isSelected() && ! checkBoxMenuItem2.isSelected()&& ! checkBoxMenuItem3.isSelected() && ! checkBoxMenuItem4.isSelected() && ! checkBoxMenuItem5.isSelected() && ! checkBoxMenuItem6.isSelected())
           {
                 for (int j=1;j<eng.size();j++)
         {
             user=(Main) eng.get(j);
             if(user.getMembershipnumber()!=null)
             {
                  if (user.getMembershipnumber().startsWith(name))
                   temp.add(user);
             }
           
                
         }
        Object[] row = new Object[7];
        table1.setModel(tablemodel);
        int count=1;
        for (int i = 0; i < temp.size(); i++)
        {
            user =temp.get(i);
            row[0] = user.getMphone();
            row[1] = user.getMelicode();
            row[2] = user.getFathername();
            row[3] = user.getLname();
            row[4] = user.getFname();
            row[5]=user.getId();
            row[6]=count;count++;
            
            tablemodel.addRow(row);

        }
           }
           
         
        
        
      }
  public void button3ActionPerformed(ActionEvent e) {
        Main user;
        MG=new manageEng();
        String name;
        name=textField1.getText();
      // int name1=Integer.parseInt(name);
        ArrayList<Main>temp=new ArrayList<>();
         DefaultTableModel tablemodel = new DefaultTableModel(columnName, 0);
         java.util.List eng=MG.listData();
         if(checkBoxMenuItem1.isSelected())
         {
              for (int j=0;j<eng.size();j++)
         {
             user=(Main) eng.get(j);
             if(user.getFname()!=null)
             {
                  if (user.getFname().startsWith(name))
                   temp.add(user);
             }
           
                
         }
        Object[] row = new Object[7];
        table1.setModel(tablemodel);
        int count=1;
        for (int i = 0; i < temp.size(); i++)
        {
             user =temp.get(i);
            row[0] = user.getMphone();
            row[1] = user.getMelicode();
            row[2] = user.getFathername();
            row[3] = user.getLname();
            row[4] = user.getFname();
            row[5]=user.getId();
            row[6]=count;count++;
            
            tablemodel.addRow(row);

        }
             
         }
         if(checkBoxMenuItem2.isSelected())
         {
               for (int j=0;j<eng.size();j++)
         {
             
             user=(Main) eng.get(j);
             
            if(user.getLname()!=null)
             {
                  if (user.getLname().startsWith(name))
                   temp.add(user);
             }
                
         }
        Object[] row = new Object[7];
        
        table1.setModel(tablemodel);
        int count=1;
        for (int i = 0; i < temp.size(); i++)
        {
             user =temp.get(i);
            row[0] = user.getMphone();
            row[1] = user.getMelicode();
            row[2] = user.getFathername();
            row[3] = user.getLname();
            row[4] = user.getFname();
            row[5]=user.getId();
            row[6]=count;count++;
            tablemodel.addRow(row);


        }
             
         }
         if(checkBoxMenuItem3.isSelected())
         {
                for (int j=0;j<eng.size();j++)
         {
             user=(Main) eng.get(j);
             if(user.getMelicode()!=null)
             {
                  if (user.getMelicode().startsWith(name))
                   temp.add(user);
             }
                
         }
        Object[] row = new Object[7];
        
        table1.setModel(tablemodel);
        int count=1;
        for (int i = 0; i < temp.size(); i++)
        {
             user =temp.get(i);
            row[0] = user.getMphone();
            row[1] = user.getMelicode();
            row[2] = user.getFathername();
            row[3] = user.getLname();
            row[4] = user.getFname();
            row[5]=user.getId();
            row[6]=count;count++;
            tablemodel.addRow(row);


        }
             
         }
           if(checkBoxMenuItem4.isSelected())
         {
              for (int j=0;j<eng.size();j++)
         {
             user=(Main) eng.get(j);
             if(user.getMembershipnumber()!=null)
             {
                  if (user.getMembershipnumber().startsWith(name))
                   temp.add(user);
             }
           
                
         }
        Object[] row = new Object[7];
        table1.setModel(tablemodel);
        int count=1;
        for (int i = 0; i < temp.size(); i++)
        {
            user =temp.get(i);
            row[0] = user.getMphone();
            row[1] = user.getMelicode();
            row[2] = user.getFathername();
            row[3] = user.getLname();
            row[4] = user.getFname();
            row[5]=user.getId();
            row[6]=count;count++;
            tablemodel.addRow(row);

        }
        
             
         }
             if(checkBoxMenuItem5.isSelected())
         {
              for (int j=0;j<eng.size();j++)
         {
             user=(Main) eng.get(j);
             if(user.getAddress()!=null)
             {
                  if (user.getAddress().startsWith(name))
                   temp.add(user);
             }
           
                
         }
        Object[] row = new Object[7];
        table1.setModel(tablemodel);
        int count=1;
        for (int i = 0; i < temp.size(); i++)
        {
             user =temp.get(i);
            row[0] = user.getMphone();
            row[1] = user.getMelicode();
            row[2] = user.getFathername();
            row[3] = user.getLname();
            row[4] = user.getFname();
            row[5]=user.getId();
            row[6]=count;count++;
            
            tablemodel.addRow(row);

        }
             
         }
             
             if(checkBoxMenuItem6.isSelected())
         {
              for (int j=0;j<eng.size();j++)
         {
             user=(Main) eng.get(j);
             String uid=String.valueOf(user.getId());
            
                  if (uid.equals(name))
                   temp.add(user);
             
           
                
         }
        Object[] row = new Object[7];
        table1.setModel(tablemodel);
        int count=1;
        for (int i = 0; i < temp.size(); i++)
        {
             user =temp.get(i);
            row[0] = user.getMphone();
            row[1] = user.getMelicode();
            row[2] = user.getFathername();
            row[3] = user.getLname();
            row[4] = user.getFname();
            row[5]=user.getId();
            row[6]=count;count++;
            
            tablemodel.addRow(row);

        }
             
         }
           if (! checkBoxMenuItem1.isSelected() && ! checkBoxMenuItem2.isSelected()&& ! checkBoxMenuItem3.isSelected() && ! checkBoxMenuItem4.isSelected() && ! checkBoxMenuItem5.isSelected() && ! checkBoxMenuItem6.isSelected())
           {
                 for (int j=1;j<eng.size();j++)
         {
             user=(Main) eng.get(j);
             if(user.getMembershipnumber()!=null)
             {
                  if (user.getMembershipnumber().startsWith(name))
                   temp.add(user);
             }
           
                
         }
        Object[] row = new Object[7];
        table1.setModel(tablemodel);
        int count=1;
        for (int i = 0; i < temp.size(); i++)
        {
            user =temp.get(i);
            row[0] = user.getMphone();
            row[1] = user.getMelicode();
            row[2] = user.getFathername();
            row[3] = user.getLname();
            row[4] = user.getFname();
            row[5]=user.getId();
            row[6]=count;count++;
            
            tablemodel.addRow(row);

        }
           }
           
         
        
        
    }
   private void menuItem1ActionPerformed(ActionEvent e) //ezafe krdne karbar
    {
       page4 p4=new page4();
       p4.setVisible(true);
       
    }
     private void menuItem60actionPerformed(ActionEvent e) {
       about a=new about();
       a.setVisible(true);
    }
    private void menuItem10actionPerformed(ActionEvent e) {
         tajrobi2 t2=new tajrobi2();
        t2.setVisible(true);
    }
    private void menuItem13actionPerformed(ActionEvent e) {
     
        tasviye t=new tasviye();
        t.setVisible(true);
       
       
    }
      private void menuItem18actionPerformed(ActionEvent e) {
     
       amuzeshiDel adel=new amuzeshiDel();
        adel.setVisible(true);
       
       
    }
     private void menuItem15actionPerformed(ActionEvent e) {
      sahmiye s=new sahmiye();
      s.setVisible(true);
    }
       private void menuItem16actionPerformed(ActionEvent e) {
           page10 p10=new page10();
           p10.setVisible(true);
     
    }
        private void menuItem17actionPerformed(ActionEvent e) {
       gozareshMali ml=new gozareshMali();
       ml.setVisible(true);
    }
         private void menuItem19actionPerformed(ActionEvent e) {
       gozareshMali1 ml=new gozareshMali1();
       ml.setVisible(true);
    }

     private void menuItem11actionPerformed(ActionEvent e) {
       gozaresh g=new gozaresh();
       g.setVisible(true);
    }
       private void menuItem14actionPerformed(ActionEvent e) {
             ozviyatAll ozl=new ozviyatAll();
             ozl.setVisible(true);
            
    }
     private void menuItem12actionPerformed(ActionEvent e) {
       page9 p9=new page9();
       p9.setVisible(true);
    }
    
   private void menuItem9actionPerformed(ActionEvent e) {
       page6 p6=new page6();
         p6.setVisible(true);
    }

    private void menuItem8actionPerformed(ActionEvent e) //hazf karbar
    {   
         page5 p5=new page5();
         p5.setVisible(true);
    }
    

   
    public void menuItem7ActionPerformed(ActionEvent e)
    {
        System.exit(0);
    }
    private void menuItem2actionPerformed(ActionEvent e) {
        tajrobi t=new tajrobi();
        t.setVisible(true);
    }

    public void menuItem5ActionPerformed(ActionEvent e)
    {
        Color initialcolor=Color.RED;
        Color color=JColorChooser.showDialog(this,"Select a color",initialcolor);  
        panel1.setBackground(color);
    }
    Runnable r2= new Runnable() {
        @Override
        public void run() {
            try {
                while (true) {

                    Calendar cal = Calendar.getInstance();
                    hours = cal.get(Calendar.HOUR_OF_DAY);
                    if (hours > 12) hours -= 12;
                    minutes = cal.get(Calendar.MINUTE);
                    seconds = cal.get(Calendar.SECOND);

                    SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
                    Date date = cal.getTime();
                    sth = formatter.format(date);

                    printTime();

                    t1.sleep(1000);  // interval given in milliseconds
                }

            } catch (Exception e) {
            }
        }
    };
     public void printTime(){
        button2.setText(sth);
    }
     Runnable r1=new Runnable() {
        @Override
        public void run() {
           try
           {
               while(true)
               {
                   Date date = new Date();
                   int month = date.getMonth();
                   int day = date.getDate();
                   int year = date.getYear();
                   String datee= gregorian_to_jalali(year + 1900, month + 1, day);
                   setDate(datee);
                   t1.sleep(1000000000);  // interval given in milliseconds

               }
           }
           catch(Exception e){};

        }
    };
     public void setDate(String date)
    {
        button1.setText(date);
    }
     public  String gregorian_to_jalali(int gy1,int gm1,int gd1)
    {
        int g_days_in_month[]=new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int j_days_in_month[]=new int[]{31, 31, 31, 31, 31, 31, 30, 30, 30, 30, 30, 29};
        int gy=gy1-1600;
        int gm=gm1-1;
        int gd=gd1-1;
        int g_day_no =
                365*gy+doubleToInt((gy+3)/4)-doubleToInt((gy+99)/100)+
                        doubleToInt((gy+399)/400);
        int i;
        for (i=0;i<gm;++i)
            g_day_no += g_days_in_month[i];
        if (gm>1 && ((gy%4==0 && gy%100!=0) || (gy%400==0)))
            g_day_no++;
        g_day_no += gd;
        int j_day_no = g_day_no-79;
        int j_np = doubleToInt(j_day_no/12053);
        j_day_no = j_day_no % 12053;
        int jy = 979+33*j_np+4*doubleToInt(j_day_no/1461);
        j_day_no %= 1461;
        if (j_day_no >= 366)
        {
            jy += doubleToInt((j_day_no-1)/365);
            j_day_no = (j_day_no-1)%365;
        }
        for (i = 0; i < 11 && j_day_no >= j_days_in_month[i]; ++i)
            j_day_no -= j_days_in_month[i];
        int jm = i+1;
        String d = "";

        d += Integer.toString(jy)+"/";
        d += jm + "/";
        d += Integer.toString(j_day_no+1) ;



        return d;
    };
      private  int doubleToInt(double f)
    {
        Double fint=new Double(f);
        return fint.intValue();
    };

  
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - reza alipor
        panel1 = new JPanel();
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menuItem1 = new JMenuItem();
        menuItem2 = new JMenuItem();
        menuItem3 = new JMenuItem();
        menuItem4 = new JMenuItem();
        menuItem8=new JMenuItem();
        menuItem9=new JMenuItem();
        menuItem10 = new JMenuItem();
        menuItem12 = new JMenuItem();
        menuItem13=new JMenuItem();
        menuItem14=new JMenuItem();
        menuItem15=new JMenuItem();
        menuItem16=new JMenuItem();
        menuItem17=new JMenuItem();
        menuItem18=new JMenuItem();
        menuItem19=new JMenuItem();

       
        menu2 = new JMenu();
        menuItem5 = new JMenuItem();
        menu3 = new JMenu();
        checkBoxMenuItem1 = new JCheckBoxMenuItem();
        checkBoxMenuItem2 = new JCheckBoxMenuItem();
        checkBoxMenuItem3 = new JCheckBoxMenuItem();
        checkBoxMenuItem4 = new JCheckBoxMenuItem();
        checkBoxMenuItem5=new JCheckBoxMenuItem();
        checkBoxMenuItem6=new JCheckBoxMenuItem();
        menu4 = new JMenu();
        menuItem6 = new JMenuItem();
        menuItem7 = new JMenuItem();
        menuItem11 = new JMenuItem();
        button1 = new JButton();
        button2 = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        textField1 = new JTextField();
      
        button3 = new JButton();
         this.addWindowFocusListener(new WindowAdapter() {
    public void windowGainedFocus(WindowEvent e) {
        textField1.requestFocusInWindow();
    }
});

        //======== this ========
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(255, 255, 153));
            panel1.setForeground(Color.black);

          
            //======== menuBar1 ========
            {

                //======== menu1 ========
                {
                    menu1.setText("منو");
                    menu1.setFont(new Font("Segoe UI", Font.PLAIN, 15));

                    //---- menuItem1 ----
                    menuItem1.setText("\u062b\u0628\u062a \u0646\u0627\u0645 \u062c\u062f\u06cc\u062f");
                    menuItem1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                    menuItem1.addActionListener(e -> menuItem1ActionPerformed(e));
                    menu1.add(menuItem1);

                    //---- menuItem2 ----
                    menuItem2.setText("\u062b\u0628\u062a \u0646\u0627\u0645 \u0645\u0639\u0645\u0627\u0631 \u062a\u062c\u0631\u0628\u06cc");
                    menuItem2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                    menuItem2.addActionListener(e -> menuItem2actionPerformed(e));
                    menu1.add(menuItem2);

                    //---- menuItem3 ----
                    menuItem3.setText("\u0646\u0645\u0627\u06cc\u0634 \u0647\u0645\u0647");
                    menuItem3.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                    menuItem3.addActionListener(e -> menuItem3actionPerformed(e));
                    menu1.add(menuItem3);

                    //---- menuItem4 ----
                    menuItem4.setText("\u0646\u0645\u0627\u06cc\u0634 \u0645\u0639\u0645\u0627\u0631\u0627\u0646 \u062a\u062c\u0631\u0628\u06cc");
                    menuItem4.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                    menu1.add(menuItem4);
                    menuItem4.addActionListener(e-> menuItem4actionPerformed(e));
                    //---- menuItem8----
                     menuItem8.setText("\u062d\u0630\u0641 \u06a9\u0627\u0631\u0628\u0631");
                     menuItem8.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                     menuItem8.addActionListener(e -> menuItem8actionPerformed(e));
                     menu1.add(menuItem8);
                      //---- menuItem9----
                     menuItem9.setText("\u062d\u0630\u0641 \u0633\u0646\u062f \u0645\u0627\u0644\u06cc");
                     menuItem9.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                     menuItem9.addActionListener(e -> menuItem9actionPerformed(e));
                     menu1.add(menuItem9);
                     //--- menuitem18---//
                     menuItem18.setText("حذف گواهی آموزشی");
                     menuItem18.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                     menuItem18.addActionListener(e -> menuItem18actionPerformed(e));
                     menu1.add(menuItem18);
                     //---menuitem13---//
                     menuItem13.setText("تسویه حساب مالی");
                     menuItem13.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                     menuItem13.addActionListener(e -> menuItem13actionPerformed(e));
                     menu1.add(menuItem13);
                     //--menuitem15--//
                     menuItem15.setText("ثبت سهمیه");
                     menuItem15.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                     menuItem15.addActionListener(e -> menuItem15actionPerformed(e));
                     menu1.add(menuItem15);
                     //---menuitem16
                      menuItem16.setText("حذف سهمیه");
                     menuItem16.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                     menuItem16.addActionListener(e -> menuItem16actionPerformed(e));
                     menu1.add(menuItem16);
                      //---menuitem14
                      menuItem14.setText("\u062b\u0628\u062a \u0628\u062f\u0647\u06a9\u0627\u0631\u06cc \u0639\u0636\u0648\u06cc\u062a");
                      menuItem14.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                      menuItem14.addActionListener(e -> menuItem14actionPerformed(e));
                      menu1.add(menuItem14);
                     
                     //----menuItem10----//
                      menuItem10.setText("\u062d\u0630\u0641 \u0645\u0639\u0645\u0627\u0631 \u062a\u062c\u0631\u0628\u06cc");
                      menuItem10.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                      menuItem10.addActionListener(e -> menuItem10actionPerformed(e));
                      menu1.add(menuItem10);
                      //---menuitem11
                      menuItem11.setText("گزارش اعضا");
                      menuItem11.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                      menuItem11.addActionListener(e -> menuItem11actionPerformed(e));
                      menu1.add(menuItem11);
                      //---menuitem17
                      menuItem17.setText("گزارش مالی یک ");
                      menuItem17.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                      menuItem17.addActionListener(e -> menuItem17actionPerformed(e));
                      menu1.add(menuItem17);
                      //---menuitem19
                      menuItem19.setText("گزارش مالی دو ");
                      menuItem19.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                      menuItem19.addActionListener(e -> menuItem19actionPerformed(e));
                      menu1.add(menuItem19);
                      //---menuitem12
                      menuItem12.setText("\u0686\u0627\u067e \u0645\u0634\u062e\u0635\u0627\u062a \u0641\u0631\u062f\u06cc \u0648 \u067e\u0631\u0648\u0627\u0646\u0647");
                      menuItem12.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                      menuItem12.addActionListener(e -> menuItem12actionPerformed(e));
                      menu1.add(menuItem12);
                     
                     
                      
                    
                }
                menuBar1.add(menu1);

                //======== menu2 ========
                {
                    menu2.setText("ویرایش");
                    menu2.setFont(new Font("Segoe UI", Font.PLAIN, 15));

                    //---- menuItem5 ----
                    menuItem5.setText("\u062a\u063a\u06cc\u06cc\u0631 \u0631\u0646\u06af \u0635\u0641\u062d\u0647");
                    menuItem5.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                    menuItem5.addActionListener(e -> menuItem5ActionPerformed(e));
                    menu2.add(menuItem5);
                }
                menuBar1.add(menu2);

                //======== menu3 ========
                {
                    menu3.setText("جستجو");
                    menu3.setFont(new Font("Segoe UI", Font.PLAIN, 15));

                    //---- checkBoxMenuItem1 ----
                    checkBoxMenuItem1.setText("\u0646\u0627\u0645");
                    checkBoxMenuItem1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                    menu3.add(checkBoxMenuItem1);

                    //---- checkBoxMenuItem2 ----
                    checkBoxMenuItem2.setText("\u0646\u0627\u0645 \u062e\u0627\u0646\u0648\u0627\u062f\u06af\u06cc");
                    checkBoxMenuItem2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                    menu3.add(checkBoxMenuItem2);

                    //---- checkBoxMenuItem3 ----
                    checkBoxMenuItem3.setText("\u06a9\u062f \u0645\u0644\u06cc");
                    checkBoxMenuItem3.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                    menu3.add(checkBoxMenuItem3);

                    //---- checkBoxMenuItem4 ----
                    checkBoxMenuItem4.setText("\u0634\u0645\u0627\u0631\u0647 \u0639\u0636\u0648\u06cc\u062a");
                    checkBoxMenuItem4.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                    menu3.add(checkBoxMenuItem4);
                    //---checkboxmenuitem5
                    checkBoxMenuItem5.setText("\u0622\u062f\u0631\u0633 \u0633\u06a9\u0648\u0646\u062a");
                    checkBoxMenuItem5.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                    menu3.add(checkBoxMenuItem5);
                    //---checkboxmenuitem6
                     checkBoxMenuItem6.setText("شناسه");
                    checkBoxMenuItem6.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                    menu3.add(checkBoxMenuItem6);
                    
                    
                    
                }
                menuBar1.add(menu3);

                //======== menu4 ========
                {
                    menu4.setText("بیشتر");
                    menu4.setFont(new Font("Segoe UI", Font.PLAIN, 15));

                    //---- menuItem6 ----
                    menuItem6.setText("\u062f\u0631\u0628\u0627\u0631\u0647");
                    menuItem6.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                     menuItem6.addActionListener(e -> menuItem60actionPerformed(e));
                    menu4.add(menuItem6);

                    //---- menuItem7 ----
                    menuItem7.setText("\u062e\u0631\u0648\u062c");
                    menuItem7.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                    menuItem7.addActionListener(e -> menuItem7ActionPerformed(e) );
                    menu4.add(menuItem7);
                }
                menuBar1.add(menu4);
            }

            //---- button1 ----
            button1.setForeground(Color.black);
            button1.setBackground(new Color(255, 255, 102));
            t1=new Thread(r1);
            t1.start();

            //---- button2 ----
            button2.setBackground(new Color(255, 255, 102));
            button2.setForeground(Color.black);
            t2=new Thread(r2);
            t2.start();
                    

            //======== scrollPane1 ========
            {

                //---- table1 ----
                table1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
                table1.setBorder(new EtchedBorder(Color.yellow, Color.black));
                table1.setRowHeight(35);
                table1.setRowMargin(4);
                table1.setForeground(Color.black);
                table1.setSelectionForeground(new Color(255, 255, 102));
                scrollPane1.setViewportView(table1);
                table1.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                      if (e.getClickCount() == 1) {
                              JTable table1 = (JTable)e.getSource();
                              int row = table1.getSelectedRow();
                              int column =table1.getSelectedColumn();
                              Integer id= (Integer) table1.getValueAt(row, column);
                              showInformation(id);
                               
                              
      
    }
  }
});
                 fillTable();
                 
       DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment((int) JTable.CENTER_ALIGNMENT);
        for (int i=0; i<table1.getColumnCount();i++){
            table1.setDefaultRenderer(table1.getColumnClass(i),renderer);
       }
        table1.updateUI();
            }

            //---- textField1 ----
            textField1.setHorizontalAlignment(SwingConstants.CENTER);
            textField1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            textField1.setForeground(Color.black);
            textField1.setBackground(new Color(255, 255, 102));
               textField1.addKeyListener(new KeyAdapter() {
                 public void keyPressed(KeyEvent e) {
            if (e.getKeyCode()==KeyEvent.VK_ENTER) {
               Search();
            }
         }
                
});

            //---- button3 ----
            button3.setText("\u062c\u0633\u062a\u062c\u0648");
            button3.setFont(new Font("Segoe UI", Font.PLAIN, 15));
            button3.setForeground(Color.black);
            button3.setBackground(new Color(255, 255, 102));
            button3.addActionListener(e -> button3ActionPerformed(e));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(menuBar1, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 736, Short.MAX_VALUE)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(494, 494, 494)
                                .addComponent(button3)
                                .addGap(32, 32, 32)
                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 1018, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(93, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(menuBar1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button3))
                        .addGap(24, 24, 24))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - reza alipor
    private JPanel panel1;
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenuItem menuItem1;
    private JMenuItem menuItem2;
    private JMenuItem menuItem3;
    private JMenuItem menuItem4;
    private JMenu menu2;
    private JMenuItem menuItem5;
    private JMenu menu3;
    private JCheckBoxMenuItem checkBoxMenuItem1;
    private JCheckBoxMenuItem checkBoxMenuItem2;
    private JCheckBoxMenuItem checkBoxMenuItem3;
    private JCheckBoxMenuItem checkBoxMenuItem4;
    private JCheckBoxMenuItem checkBoxMenuItem5;
    private JCheckBoxMenuItem checkBoxMenuItem6;
    private JMenu menu4;
    private JMenuItem menuItem6;
    private JMenuItem menuItem7;
    private JButton button1;
    private JButton button2;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JTextField textField1;
    private JButton button3;
    private JMenuItem menuItem8;
    private JMenuItem menuItem9;
    private JMenuItem menuItem10;
    private JMenuItem menuItem11;
    private JMenuItem menuItem12;
    private JMenuItem menuItem13;
    private JMenuItem menuItem14;
    private JMenuItem menuItem15;
    private JMenuItem menuItem16;
    private JMenuItem menuItem17;
    private JMenuItem menuItem18;
    private JMenuItem menuItem19;


    
    
    
    // JFormDesigner - End of variables declaration  //GEN-END:variables

   
   

   

   

    

   

}
