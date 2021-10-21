import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;
import nezam.Finance;
import nezam.Main;
/*
 * Created by JFormDesigner on Mon Sep 18 06:26:08 PDT 2017
 */



/**
 * @author mansour davoudi
 */
public class gozaresh extends JFrame {
      String columnName[]={"\u0634\u0645\u0627\u0631\u0647 \u0647\u0645\u0631\u0627\u0647","بدهکاری ","\u0646\u0627\u0645 \u067e\u062f\u0631 ","\u0646\u0627\u0645 \u062e\u0627\u0646\u0648\u0627\u062f\u06af\u06cc","\u0646\u0627\u0645","\u0634\u0646\u0627\u0633\u0647","\u0631\u062f\u06cc\u0641"};
      manageEng MG=null;
      java.util.List eng=null;
      java.util.List finance=null;
      Main user=null;
    public gozaresh() {
          initComponents();
          initTable();
          MG=new manageEng();
          eng=MG.listData();
          finance=MG.listFinance();
    }
    public void initTable()
    {
        DefaultTableModel tablemodel = new DefaultTableModel(columnName, 0);
        table1.setModel(tablemodel);
    }
     public void search()
    {
       
       ArrayList<JCheckBoxMenuItem> choice=new ArrayList<>();
       choice.add(checkBoxMenuItem0);
       choice.add(checkBoxMenuItem1);
       choice.add(checkBoxMenuItem2);
       choice.add(checkBoxMenuItem3);
       choice.add(checkBoxMenuItem4);
       choice.add(checkBoxMenuItem5);
       choice.add(checkBoxMenuItem6);
       choice.add(checkBoxMenuItem7);
       choice.add(checkBoxMenuItem8);
       choice.add(checkBoxMenuItem9);
       choice.add(checkBoxMenuItem10);
       choice.add(checkBoxMenuItem11);
       choice.add(checkBoxMenuItem12);
       choice.add(checkBoxMenuItem13);
       choice.add(checkBoxMenuItem14);
       
       for(int i=0;i<choice.size();i++)
       {
           JCheckBoxMenuItem jcb=choice.get(i);
           
          if (jcb.isSelected()&& i==0){
              noFilter();
               break;
          }
           
          else if(jcb.isSelected()&& i==1)
           {
               filterByName();
               continue;
           }
           else if(jcb.isSelected()&& i==2)
           {
               filterByLname();
               continue;
           }
           else if(jcb.isSelected() && i==3)
           {
               filterByOzviyatKind();
               continue;
           }
           else if(jcb.isSelected() && i==4)
           {
               filterByDateTamdidOzviyat();
               continue;
           }
            else if(jcb.isSelected() && i==5)
           {
               filterByDateFinishParvane();
               continue;
           }
           else if(jcb.isSelected() && i==6)
           {
               filterBySalahiyatKind();
               continue;
               
           }
            else if(jcb.isSelected() && i==7)
           {
                filterByCity();
               continue;
               
           }
            else if(jcb.isSelected() && i==8)
           {
                 filterByMajor();
                continue;
               
           }
           else if(jcb.isSelected() && i==9)
           {
                filterByEjra();
               continue;
               
           }
           else if(jcb.isSelected() && i==10)
           {
                filterByPaye();
               continue;
               
           }
             else if(jcb.isSelected() && i==11)
           {
                filterByDateSodur1();
               continue;
               
           }
            else if(jcb.isSelected() && i==12)
           {
                filterByDateSodur2();
               continue;
               
           }
             else if(jcb.isSelected() && i==13)
           {
                filterByDateSodur3();
               continue;
               
           }
             else if(jcb.isSelected() && i==14)
           {
                filterByNezaratLoc();
               continue;
               
           }
       }
       
       fillTable();
       
       
    }
     
     public void noFilter()
     {
         ArrayList<Main>temp=new ArrayList<>();
          for (int j=0;j<eng.size();j++)
         {
             user=(Main) eng.get(j);
             temp.add(user);  
         }
          eng=temp;
     }
      public void filterByName()
     {
         ArrayList<Main>temp=new ArrayList<>();
         String fname=null;
          fname=textField1.getText().toString();
               for (int j=0;j<eng.size();j++)
         {
             user=(Main) eng.get(j);
             if(user.getFname()!=null)
             {
                  if (user.getFname().startsWith(fname))
                   temp.add(user);
             }
           
                
         }
               eng=temp;
         
     }
      
     public void filterByLname()
     {
         ArrayList<Main>temp=new ArrayList<>();
         String lname=null;
          lname=textField2.getText().toString();
         for (int j=0;j<eng.size();j++)
         {
             user=(Main) eng.get(j);
             if(user.getLname()!=null)
             {
                  if (user.getLname().startsWith(lname))
                   temp.add(user);
             }
           
                
         }
               eng=temp;
         
         
     }
     public void filterByOzviyatKind()
     
         {
             String ozviyatkind=null;
             ArrayList<Main>temp=new ArrayList<>();
             ozviyatkind=textField3.getText().toString();
              for (int j=0;j<eng.size();j++)
         {
             user=(Main) eng.get(j);
             if(user.getOzviyattype()!=null)
             {

                 if (user.getOzviyattype().contains(ozviyatkind))
                   temp.add(user);
             }
           
                
         }
              eng=temp;
             
         }
     public void filterByDateTamdidOzviyat()
             
     
         {
             ArrayList<Main>temp=new ArrayList<>();
             String dtamdidozviyat=null;
              dtamdidozviyat=textField4.getText().toString();
               for (int j=0;j<eng.size();j++)
         {
             user=(Main) eng.get(j);
             if(user.getDtmdidozviyat()!=null)
             {
                  if (user.getDtmdidozviyat().contains(dtamdidozviyat))
                   temp.add(user);
             }
           
                
         }
               eng=temp;
         }
     public void filterByDateFinishParvane()
     {
         String dfparvane=null;
         ArrayList<Main>temp=new ArrayList<>();
           dfparvane=textField6.getText().toString();
              for (int j=0;j<eng.size();j++)
         {
             user=(Main) eng.get(j);
             if(user.getDendetebar()!=null)
             {
                  if (user.getDendetebar().contains(dfparvane))
                      temp.add(user);
             }
           
                
         }
              eng=temp;
     }
     public void filterBySalahiyatKind()
     {
         ArrayList<Main>temp=new ArrayList<>();
         String salahiyatkind=null;
         salahiyatkind=textField7.getText().toString();
               for (int j=0;j<eng.size();j++)
         {
             user=(Main) eng.get(j);
             if(user.getTypequalifucation()!=null)
             {
                  if (user.getTypequalifucation().contains(salahiyatkind))
                   temp.add(user);
             }
           
                
         }
               eng=temp;
     }
     public void filterByCity()
     {
         ArrayList<Main>temp=new ArrayList<>();
         String city=null;
          city=textField8.getText();
                 for (int j=1;j<eng.size();j++)
         {
             user=(Main) eng.get(j);
             if(user.getAddress()!=null)
             {
                  if (user.getAddress().startsWith(city))
                   temp.add(user);
             }
           
                
         }
               eng=temp;
     }
     public void filterByMajor()
     {
         ArrayList<Main>temp=new ArrayList<>();
         String major=null;
          major=textField9.getText().toString();
               for (int j=0;j<eng.size();j++)
         {
             user=(Main) eng.get(j);
             if(user.getMajor()!=null)
             {
                  if (user.getMajor().startsWith(major))
                   temp.add(user);
             }
           
                
         }
               eng=temp;
     }
     public void filterByEjra()
     {
         ArrayList<Main>temp=new ArrayList<>();
         String ejra=null;
          ejra=textField10.getText().toString();
               for (int j=0;j<eng.size();j++)
         {
             user=(Main) eng.get(j);
             if(user.getPerformance()!=null)
             {
                  if (user.getPerformance().startsWith("دارد"))
                   temp.add(user);
             }
           
                
         }
               eng=temp;
     }
             public void filterByPaye()
             {
                 ArrayList<Main>temp=new ArrayList<>();
                String paye=null;
               paye=String.valueOf(comboBox1.getSelectedItem());
               for (int j=0;j<eng.size();j++)
         {
             user=(Main) eng.get(j);
             if(user.getPaye()!=null)
             {
                  if (user.getPaye().equals(paye))
                   temp.add(user);
             }
           
                
         }
               eng=temp;
             }
             
           public void filterByDateSodur1()
           {
               ArrayList<Main>temp=new ArrayList<>();
               String dsodur1=null;
                dsodur1=textField5.getText().toString();
               for (int j=0;j<eng.size();j++)
         {
             user=(Main) eng.get(j);
             if(user.getDsodur1()!=null)
             {
                  if (user.getDsodur1().contains(dsodur1))
                   temp.add(user);
             }
           
                
         }
               eng=temp;
           }
          
           public void filterByDateSodur2()
           {
               ArrayList<Main>temp=new ArrayList<>();
               String dsodur2=null;
                dsodur2=textField11.getText().toString();
               for (int j=0;j<eng.size();j++)
         {
             user=(Main) eng.get(j);
             if(user.getDsodur2()!=null)
             {
                  if (user.getDsodur2().contains(dsodur2))
                   temp.add(user);
             }
           
                
         }
           }
           
            public void filterByDateSodur3()
            {
                String dsodur3=null;
                 ArrayList<Main>temp=new ArrayList<>();
                 dsodur3=textField12.getText().toString();
               for (int j=0;j<eng.size();j++)
         {
             user=(Main) eng.get(j);
             if(user.getDsodur3()!=null)
             {
                  if (user.getDsodur3().contains(dsodur3))
                   temp.add(user);
             }
           
                
         }
               eng=temp;
            }
            public void filterByNezaratLoc()
            {
                String nezaratloc=null;
                ArrayList<Main>temp=new ArrayList<>();
                 nezaratloc =textField13.getText().toString();
               for (int j=0;j<eng.size();j++)
         {
             user=(Main) eng.get(j);
             if(user.getArchivecode()!=null)
             {
                  if (user.getArchivecode().contains(nezaratloc))
                   temp.add(user);
             }
           
                
         }
               eng=temp;
            }
     public void fillTable()
     {
         DefaultTableModel tablemodel = new DefaultTableModel(columnName, 0);
         int count=1;
        Object[]row=new Object[7];
        String phone="--";
        String mcode="--";
         table1.setModel(tablemodel);
          for (int i = 0; i < eng.size(); i++)
        {
             user =(Main)eng.get(i);
             if(user.getMphone()!=null)
            {
                row[0]=user.getMphone().toString();
            }
            else if(user.getMphone()==null)
            {
                row[0]=phone;
            }
//              if(user.getMelicode()!=null)
//            {
//                row[1]=user.getMelicode().toString();
//            }
//            else if(user.getMelicode()==null)
//            {
//                row[1]=mcode;
//            }
             int temp=user.getId();
            row[1]=calculateDebt(temp);
          
           
            row[2] = user.getFathername();
            row[3] = user.getLname();
            row[4] = user.getFname();
            row[5]=user.getId();
            row[6]=count;count++;
            tablemodel.addRow(row);

        }
     }
      public void createExcel()
      {
          Excel ex=new Excel(eng);
      }
              
      public void createPdf()
     {
         print p=new print(table1);
         p.generatePdf();
     }
      public int calculateDebt(int temp)
      {
          int sum=0;
            Finance fi=null;
            ArrayList<Finance>f=new ArrayList<>();
         
       
          for (int j=0;j<finance.size();j++)
         {
             fi=(Finance) finance.get(j);
             if(fi.getIdMain()==temp)
             {
                 sum+=fi.getBedehkariamount();
             }
           
                
         }
          return sum;
              
      }
    

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - maryam koopaei
        panel1 = new JPanel();
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        checkBoxMenuItem0 = new JCheckBoxMenuItem();
        checkBoxMenuItem1 = new JCheckBoxMenuItem();
        checkBoxMenuItem2 = new JCheckBoxMenuItem();
        checkBoxMenuItem3 = new JCheckBoxMenuItem();
        checkBoxMenuItem4 = new JCheckBoxMenuItem();
        checkBoxMenuItem5 = new JCheckBoxMenuItem();
        checkBoxMenuItem6 = new JCheckBoxMenuItem();
        checkBoxMenuItem7 = new JCheckBoxMenuItem();
        checkBoxMenuItem8 = new JCheckBoxMenuItem();
        checkBoxMenuItem9 = new JCheckBoxMenuItem();
        checkBoxMenuItem10 = new JCheckBoxMenuItem();
        checkBoxMenuItem11 = new JCheckBoxMenuItem();
        checkBoxMenuItem12 = new JCheckBoxMenuItem();
        checkBoxMenuItem13 = new JCheckBoxMenuItem();
        checkBoxMenuItem14 = new JCheckBoxMenuItem();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        label2 = new JLabel();
        textField1 = new JTextField();
        label3 = new JLabel();
        textField2 = new JTextField();
        label51 = new JLabel();
        textField3 = new JTextField();
        label53 = new JLabel();
        textField4 = new JTextField();
        label56 = new JLabel();
        label58 = new JLabel();
        textField6 = new JTextField();
        label66 = new JLabel();
        textField7 = new JTextField();
        label10 = new JLabel();
        textField8 = new JTextField();
        label17 = new JLabel();
        textField9 = new JTextField();
        label19 = new JLabel();
        textField10 = new JTextField();
        comboBox1 = new JComboBox<>();
        label62 = new JLabel();
        textField5 = new JTextField();
        label63 = new JLabel();
        textField11 = new JTextField();
        label64 = new JLabel();
        textField12 = new JTextField();
        label4 = new JLabel();
        textField13 = new JTextField();
        button3 = new JButton();
        button4 = new JButton();


        //======== this ========
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(255, 204, 204));

           

            //======== menuBar1 ========
            {

                //======== menu1 ========
                {
                    menu1.setText("\u06af\u0632\u0627\u0631\u0634 \u0628\u0631 \u0627\u0633\u0627\u0633");
                    menu1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                   //---- checkBoxMenuItem0----
                    checkBoxMenuItem0.setText("گزارش همه");
                    checkBoxMenuItem0.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                    menu1.add(checkBoxMenuItem0);
                    //---- checkBoxMenuItem1 ----
                    checkBoxMenuItem1.setText("\u0646\u0627\u0645");
                    checkBoxMenuItem1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                    menu1.add(checkBoxMenuItem1);

                    //---- checkBoxMenuItem2 ----
                    checkBoxMenuItem2.setText("\u0646\u0627\u0645 \u062e\u0627\u0646\u0648\u0627\u062f\u06af\u06cc");
                    checkBoxMenuItem2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                    menu1.add(checkBoxMenuItem2);

                    //---- checkBoxMenuItem3 ----
                    checkBoxMenuItem3.setText("\u0646\u0648\u0639 \u0639\u0636\u0648\u06cc\u062a");
                    checkBoxMenuItem3.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                    menu1.add(checkBoxMenuItem3);

                    //---- checkBoxMenuItem4 ----
                    checkBoxMenuItem4.setText("\u062a\u0627\u0631\u06cc\u062e \u062a\u0645\u062f\u06cc\u062f \u0639\u0636\u0648\u06cc\u062a");
                    checkBoxMenuItem4.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                    menu1.add(checkBoxMenuItem4);

                    //---- checkBoxMenuItem5 ----
                    checkBoxMenuItem5.setText("\u0627\u0639\u062a\u0628\u0627\u0631 \u067e\u0631\u0648\u0627\u0646\u0647 \u0627\u0634\u062a\u063a\u0627\u0644");
                    checkBoxMenuItem5.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                    menu1.add(checkBoxMenuItem5);

                    //---- checkBoxMenuItem6 ----
                    checkBoxMenuItem6.setText("\u0646\u0648\u0639 \u0635\u0644\u0627\u062d\u06cc\u062a");
                    checkBoxMenuItem6.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                    menu1.add(checkBoxMenuItem6);

                    //---- checkBoxMenuItem7 ----
                    checkBoxMenuItem7.setText("\u0634\u0647\u0631 \u0633\u06a9\u0648\u0646\u062a");
                    checkBoxMenuItem7.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                    menu1.add(checkBoxMenuItem7);

                    //---- checkBoxMenuItem8 ----
                    checkBoxMenuItem8.setText("\u0631\u0634\u062a\u0647 \u062a\u062d\u0635\u06cc\u0644\u06cc");
                    checkBoxMenuItem8.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                    menu1.add(checkBoxMenuItem8);

                    //---- checkBoxMenuItem9 ----
                    checkBoxMenuItem9.setText("اجرا");
                    checkBoxMenuItem9.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                    menu1.add(checkBoxMenuItem9);

                    //---- checkBoxMenuItem10 ----
                    checkBoxMenuItem10.setText("\u067e\u0627\u06cc\u0647 \u067e\u0631\u0648\u0627\u0646\u0647 \u0627\u0634\u062a\u063a\u0627\u0644");
                    checkBoxMenuItem10.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                    menu1.add(checkBoxMenuItem10);

                    //---- checkBoxMenuItem11 ----
                    checkBoxMenuItem11.setText("\u0633\u0627\u0644 \u0635\u062f\u0648\u0631 \u067e\u0631\u0648\u0627\u0646\u06471");
                    checkBoxMenuItem11.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                    menu1.add(checkBoxMenuItem11);

                    //---- checkBoxMenuItem12 ----
                    checkBoxMenuItem12.setText("\u0633\u0627\u0644 \u0635\u062f\u0648\u0631 \u067e\u0631\u0648\u0627\u0646\u06472");
                    checkBoxMenuItem12.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                    menu1.add(checkBoxMenuItem12);

                    //---- checkBoxMenuItem13 ----
                    checkBoxMenuItem13.setText("\u0633\u0627\u0644 \u0635\u062f\u0648\u0631 \u067e\u0631\u0648\u0627\u0646\u06473");
                    checkBoxMenuItem13.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                    menu1.add(checkBoxMenuItem13);

                    //---- checkBoxMenuItem14 ----
                    checkBoxMenuItem14.setText("\u0645\u062d\u0644 \u0646\u0638\u0627\u0631\u062a");
                    checkBoxMenuItem14.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                    menu1.add(checkBoxMenuItem14);
                    
                    
                    
                }
                menuBar1.add(menu1);
            }

            //======== scrollPane1 ========
            {

                //---- table1 ----
                table1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
                table1.setBorder(new EtchedBorder(Color.yellow, Color.black));
                table1.setRowHeight(35);
                table1.setRowMargin(4);
                table1.setForeground(Color.black);
                table1.setSelectionForeground(new Color(255, 51, 51));
                scrollPane1.setViewportView(table1);
            }

            //---- label2 ----
            label2.setText("\u0646\u0627\u0645 :");
            label2.setFont(new Font("B Zar", Font.PLAIN, 20));
            label2.setHorizontalAlignment(SwingConstants.CENTER);
            label2.setForeground(Color.black);

            //---- textField1 ----
            textField1.setHorizontalAlignment(SwingConstants.CENTER);
            textField1.setFont(new Font("Segoe UI", Font.PLAIN, 18));

            //---- label3 ----
            label3.setText("\u0646\u0627\u0645 \u062e\u0627\u0646\u0648\u0627\u062f\u06af\u06cc :");
            label3.setHorizontalAlignment(SwingConstants.CENTER);
            label3.setFont(new Font("B Zar", Font.PLAIN, 20));
            label3.setForeground(Color.black);

            //---- textField2 ----
            textField2.setHorizontalAlignment(SwingConstants.CENTER);
            textField2.setFont(new Font("Segoe UI", Font.PLAIN, 18));

            //---- label51 ----
            label51.setText("\u0646\u0648\u0639 \u0639\u0636\u0648\u06cc\u062a :");
            label51.setFont(new Font("B Zar", Font.PLAIN, 20));
            label51.setForeground(Color.black);

            //---- textField3 ----
            textField3.setHorizontalAlignment(SwingConstants.CENTER);
            textField3.setFont(new Font("Segoe UI", Font.PLAIN, 18));

            //---- label53 ----
            label53.setText("\u062a\u0627\u0631\u06cc\u062e \u062a\u0645\u062f\u06cc\u062f \u0639\u0636\u0648\u06cc\u062a:");
            label53.setFont(new Font("B Zar", Font.PLAIN, 20));
            label53.setForeground(Color.black);

            //---- textField4 ----
            textField4.setHorizontalAlignment(SwingConstants.CENTER);
            textField4.setFont(new Font("Segoe UI", Font.PLAIN, 18));

            //---- label56 ----
            label56.setText("\u067e\u0627\u06cc\u0647:");
            label56.setForeground(Color.black);
            label56.setFont(new Font("B Zar", Font.PLAIN, 20));
            label56.setHorizontalAlignment(SwingConstants.RIGHT);

            //---- label58 ----
            label58.setText("\u062a\u0627\u0631\u06cc\u062e \u067e\u0627\u06cc\u0627\u0646 \u0627\u0639\u062a\u0628\u0627\u0631 \u067e\u0631\u0648\u0627\u0646\u0647:");
            label58.setFont(new Font("B Zar", Font.PLAIN, 20));
            label58.setForeground(Color.black);

            //---- textField6 ----
            textField6.setHorizontalAlignment(SwingConstants.CENTER);
            textField6.setFont(new Font("Segoe UI", Font.PLAIN, 18));

            //---- label66 ----
            label66.setText("\u0646\u0648\u0639 \u0635\u0644\u0627\u062d\u06cc\u062a:");
            label66.setFont(new Font("B Zar", Font.PLAIN, 20));
            label66.setForeground(Color.black);

            //---- textField7 ----
            textField7.setHorizontalAlignment(SwingConstants.CENTER);
            textField7.setFont(new Font("Segoe UI", Font.PLAIN, 18));

            //---- label10 ----
            label10.setText("\u0634\u0647\u0631 \u0633\u06a9\u0648\u0646\u062a:");
            label10.setHorizontalAlignment(SwingConstants.CENTER);
            label10.setFont(new Font("B Zar", Font.PLAIN, 20));
            label10.setForeground(Color.black);

            //---- textField8 ----
            textField8.setHorizontalAlignment(SwingConstants.CENTER);
            textField8.setFont(new Font("Segoe UI", Font.PLAIN, 18));

            //---- label17 ----
            label17.setText("\u0631\u0634\u062a\u0647  :");
            label17.setHorizontalAlignment(SwingConstants.CENTER);
            label17.setFont(new Font("B Zar", Font.PLAIN, 20));
            label17.setBackground(Color.black);
            label17.setForeground(Color.black);

            //---- textField9 ----
            textField9.setHorizontalAlignment(SwingConstants.CENTER);
            textField9.setFont(new Font("Segoe UI", Font.PLAIN, 18));

            //---- label19 ----
            label19.setText("اجرا :");
            label19.setHorizontalAlignment(SwingConstants.CENTER);
            label19.setFont(new Font("B Zar", Font.PLAIN, 20));
            label19.setForeground(Color.black);

            //---- textField10 ----
            textField10.setHorizontalAlignment(SwingConstants.CENTER);
            textField10.setFont(new Font("Segoe UI", Font.PLAIN, 18));

            //---- comboBox1 ----
            comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                "1",
                "2",
                "3"
            }));

            //---- label62 ----
            label62.setFont(new Font("B Zar", Font.PLAIN, 20));
            label62.setForeground(Color.black);
            label62.setText("\u062a\u0627\u0631\u06cc\u062e \u0635\u062f\u0648\u0631 \u067e\u0631\u0648\u0627\u0646\u0647 1:");

            //---- textField5 ----
            textField5.setHorizontalAlignment(SwingConstants.CENTER);
            textField5.setFont(new Font("Segoe UI", Font.PLAIN, 18));

            //---- label63 ----
            label63.setFont(new Font("B Zar", Font.PLAIN, 20));
            label63.setForeground(Color.black);
            label63.setText("\u062a\u0627\u0631\u06cc\u062e \u0635\u062f\u0648\u0631 \u067e\u0631\u0648\u0627\u0646\u0647 2:");

            //---- textField11 ----
            textField11.setHorizontalAlignment(SwingConstants.CENTER);
            textField11.setFont(new Font("Segoe UI", Font.PLAIN, 18));

            //---- label64 ----
            label64.setFont(new Font("B Zar", Font.PLAIN, 20));
            label64.setForeground(Color.black);
            label64.setText("\u062a\u0627\u0631\u06cc\u062e \u0635\u062f\u0648\u0631 \u067e\u0631\u0648\u0627\u0646\u0647 3:");

            //---- textField12 ----
            textField12.setHorizontalAlignment(SwingConstants.CENTER);
            textField12.setFont(new Font("Segoe UI", Font.PLAIN, 18));

            //---- label4 ----
            label4.setText("\u0645\u062d\u0644 \u0646\u0638\u0627\u0631\u062a:");
            label4.setFont(new Font("B Zar", Font.PLAIN, 20));
            label4.setHorizontalAlignment(SwingConstants.CENTER);
            label4.setForeground(Color.black);

            //---- textField13 ----
            textField13.setHorizontalAlignment(SwingConstants.CENTER);
            textField13.setFont(new Font("Segoe UI", Font.PLAIN, 18));

            //---- button3 ----
            button3.setText("\u062c\u0633\u062a\u062c\u0648");
            button3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            button3.setBackground(Color.black);
            button3.setForeground(new Color(255, 153, 153));
            button3.addActionListener(e-> actionPerformed1(e));

            //---- button4 ----
            button4.setText("\u06af\u0632\u0627\u0631\u0634");
            button4.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            button4.setBackground(Color.black);
            button4.setForeground(new Color(255, 153, 153));
            button4.addActionListener(e-> actionPerformed2(e));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(menuBar1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(217, 217, 217)
                        .addComponent(button4, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
                        .addGap(250, 250, 250)
                        .addComponent(button3, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(337, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(textField13, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label4)
                                .addGap(28, 28, 28)
                                .addComponent(textField12, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label64)
                                .addGap(18, 18, 18)
                                .addComponent(textField11, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label63)
                                .addGap(18, 18, 18)
                                .addComponent(textField5, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label62))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 1018, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(textField9, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                    .addComponent(textField10, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(label19)
                                    .addComponent(label17))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                        .addComponent(textField4)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label53)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label51)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label3)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label2))
                                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(label56)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textField8, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label10)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textField7, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label66)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textField6, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(label58)))))
                        .addGap(101, 101, 101))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(menuBar1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(button4)
                                    .addComponent(button3))
                                .addGap(27, 27, 27)))
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 292, GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label51, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label53)
                            .addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label17, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(textField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label66)
                            .addComponent(textField7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label10, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label19, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label56)
                            .addComponent(textField8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label58))
                        .addGap(36, 36, 36)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label62, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label63, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label64, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(56, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    // Generated using JFormDesigner Evaluation license - maryam koopaei
    private JPanel panel1;
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JCheckBoxMenuItem checkBoxMenuItem0;
    private JCheckBoxMenuItem checkBoxMenuItem1;
    private JCheckBoxMenuItem checkBoxMenuItem2;
    private JCheckBoxMenuItem checkBoxMenuItem3;
    private JCheckBoxMenuItem checkBoxMenuItem4;
    private JCheckBoxMenuItem checkBoxMenuItem5;
    private JCheckBoxMenuItem checkBoxMenuItem6;
    private JCheckBoxMenuItem checkBoxMenuItem7;
    private JCheckBoxMenuItem checkBoxMenuItem8;
    private JCheckBoxMenuItem checkBoxMenuItem9;
    private JCheckBoxMenuItem checkBoxMenuItem10;
    private JCheckBoxMenuItem checkBoxMenuItem11;
    private JCheckBoxMenuItem checkBoxMenuItem12;
    private JCheckBoxMenuItem checkBoxMenuItem13;
    private JCheckBoxMenuItem checkBoxMenuItem14;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JLabel label2;
    private JTextField textField1;
    private JLabel label3;
    private JTextField textField2;
    private JLabel label51;
    private JTextField textField3;
    private JLabel label53;
    private JTextField textField4;
    private JLabel label56;
    private JLabel label58;
    private JTextField textField6;
    private JLabel label66;
    private JTextField textField7;
    private JLabel label10;
    private JTextField textField8;
    private JLabel label17;
    private JTextField textField9;
    private JLabel label19;
    private JTextField textField10;
    private JComboBox<String> comboBox1;
    private JLabel label62;
    private JTextField textField5;
    private JLabel label63;
    private JTextField textField11;
    private JLabel label64;
    private JTextField textField12;
    private JLabel label4;
    private JTextField textField13;
    private JButton button3;
    private JButton button4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private void actionPerformed1(ActionEvent e) {
        search();
    }

    private void actionPerformed2(ActionEvent e) {
        //createPdf();
          createExcel();
    }
}
