import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.*;
import javax.swing.table.TableModel;
import javax.swing.GroupLayout;
import javax.swing.border.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import nezam.Finance;
import nezam.Main;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/*
 * Created by JFormDesigner on Mon Aug 27 21:55:35 PDT 2018
 */

public class gozareshMali1 extends JFrame {
        ArrayList<Finance> fin;
        int number;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        public String columnName[]={"ردیف","نوع","مبلغ","تعداد"};
        java.util.List finance;
        ArrayList<Finance> temp1;
        ArrayList<Finance> temp2;
        ArrayList<Finance> temp3;
        ArrayList<Finance> temp4;
        ArrayList<Finance> temp5;
        ArrayList<Finance> temp6;
        ArrayList<Finance> temp7;
        ArrayList<Finance> temp8;
        ArrayList<Finance> temp9;
        ArrayList<Finance> temp10;
        ArrayList<Finance> temp11;
        ArrayList<Finance> temp12;
        int p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12=0;
          int s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12=0;
        
        double karkard = 0;
        Date start=null;
        Date finish=null;
        
        

    public gozareshMali1() {
        initComponents();
    }
      public void fillTable()
    {
       
        try
        {
            start=formatter.parse(textField7.getText());
        }
        catch(Exception e){}
        
          try
        {
              finish=formatter.parse(textField8.getText());
        }
        catch(Exception e){}
        
       
        
         manageEng ME=new manageEng();
        
          finance=ME.listFinanceByDate1(start,finish);
          temp1=new ArrayList<>();
          temp2=new ArrayList<>();
          temp3=new ArrayList<>();
          temp4=new ArrayList<>();
          temp5=new ArrayList<>();
          temp6=new ArrayList<>();
          temp7=new ArrayList<>();
          temp8=new ArrayList<>();
          temp9=new ArrayList<>();
          temp10=new ArrayList<>();
          temp11=new ArrayList<>();
          temp12=new ArrayList<>();
             
         for(int i=0; i<finance.size();i++)
         {
           Finance  f=(Finance) finance.get(i);
           //System.out.println(f.getBedehkarikind());
           
            if (f.getBedehkarikind()!= null)
            {
                if(f.getBedehkarikind().contains("عضویت سالیانه"))
                {
                    temp1.add(f);
                }
                 if(f.getBedehkarikind().contains("تمدید پروانه"))
                {
                    temp2.add(f);
                }
                  if(f.getBedehkarikind().contains("صدور پروانه"))
                {
                    temp3.add(f);
                }
                   if(f.getBedehkarikind().contains("تغییر پایه"))
                {
                    temp4.add(f);
                }
                    if(f.getBedehkarikind().contains("حق نظارت"))
                {
                    temp5.add(f);
                }
                     if(f.getBedehkarikind().contains("حق اجرا"))
                {
                    temp6.add(f);
                }
                      if(f.getBedehkarikind().contains("آموزش"))
                {
                    temp7.add(f);
                }
                       if(f.getBedehkarikind().contains("عدم عضویت"))
                {
                    temp8.add(f);
                }
                        if(f.getBedehkarikind().contains("لغو عضویت"))
                {
                    temp9.add(f);
                }
                         if(f.getBedehkarikind().contains("کارت عضویت"))
                {
                    temp10.add(f);
                }
                          if(f.getBedehkarikind().contains("عضو جدید"))
                {
                    temp11.add(f);
                }
                           if(f.getBedehkarikind().contains("سایر"))
                {
                    temp12.add(f);
                }         
            }
         }        
         //System.out.println(temp5.size()+"-----");
         DefaultTableModel tablemodel = new DefaultTableModel(columnName, 0);
       
         Object[] row = new Object[4];
   
     if(temp1.size()>0)
     {
         for(int c1=0;c1<temp1.size();c1++)
         {
             
             p1+=temp1.get(c1).getBedehkariamount();
             if(temp1.get(c1).getBedehkariamount() != 0){
                 s1+=1;
             }

         }
     }
      if(temp2.size()>0)
     {
         for(int c2=0;c2<temp2.size();c2++)
         {
             p2+=temp2.get(c2).getBedehkariamount();
              if(temp2.get(c2).getBedehkariamount() != 0){
                 s2+=1;
             }
         }
     } 
      if(temp3.size()>0)
     {
         for(int c3=0;c3<temp3.size();c3++)
         {
             p3+=temp3.get(c3).getBedehkariamount();
              if(temp3.get(c3).getBedehkariamount() != 0){
                 s3+=1;
             }
         }
     }
      if(temp4.size()>0)
     {
         for(int c4=0;c4<temp4.size();c4++)
         {
             p4+=temp4.get(c4).getBedehkariamount();
              if(temp4.get(c4).getBedehkariamount() != 0){
                 s4+=1;
             }
         }
     }
      if(temp5.size()>0)
     {
         for(int c5=0;c5<temp5.size();c5++)
         {
             p5+=temp5.get(c5).getBedehkariamount();
              if(temp5.get(c5).getBedehkariamount() != 0){
                 s5+=1;
             }
             karkard += temp5.get(c5).getKarkardamount();
         }
         //System.out.print(p5);
     } if(temp6.size()>0)
     {
         for(int c6=0;c6<temp6.size();c6++)
         {
             p6+=temp6.get(c6).getBedehkariamount();
              if(temp6.get(c6).getBedehkariamount() != 0){
                 s6+=1;
             }
         }
     } if(temp7.size()>0)
     {
         for(int c7=0;c7<temp7.size();c7++)
         {
             p7+=temp7.get(c7).getBedehkariamount();
              if(temp7.get(c7).getBedehkariamount() != 0){
                 s7+=1;
             }
         }
     } if(temp8.size()>0)
     {
         for(int c8=0;c8<temp8.size();c8++)
         {
             p8+=temp8.get(c8).getBedehkariamount();
              if(temp8.get(c8).getBedehkariamount() != 0){
                 s8+=1;
             }
         }
     } if(temp9.size()>0)
     {
         for(int c9=0;c9<temp9.size();c9++)
         {
             p9+=temp9.get(c9).getBedehkariamount();
              if(temp9.get(c9).getBedehkariamount() != 0){
                 s9+=1;
             }
         }
     } if(temp10.size()>0)
     {
         for(int c10=0;c10<temp10.size();c10++)
         {
             p10+=temp10.get(c10).getBedehkariamount();
              if(temp10.get(c10).getBedehkariamount() != 0){
                 s10+=1;
             }
         }
     
     } if(temp11.size()>0)
     {
         for(int c11=0;c11<temp11.size();c11++)
         {
             p11+=temp11.get(c11).getBedehkariamount();
              if(temp11.get(c11).getBedehkariamount() != 0){
                 s11+=1;
             }
         }
     } if(temp12.size()>0)
     {
         for(int c12=0;c12<temp12.size();c12++)
         {
             p12+=temp12.get(c12).getBedehkariamount();
              if(temp12.get(c12).getBedehkariamount() != 0){
                 s12+=1;
             }
         }
     } 
     table1.setModel(tablemodel);
     for ( int i = 1; i <=12; i++)
        {
            if(i==1)
            {
            row[0] =i;
            row[1] = "عضویت سالیانه";
            row[2] = String.valueOf(p1);
            System.out.println(p1);
            row[3]=s1;
            tablemodel.addRow(row);
            }
            
            if(i==2)
            {
            row[0] =i;
            row[1] = "تمدید پروانه اشتغال";
            row[2] = String.valueOf(p2);
            row[3]=s2;
            tablemodel.addRow(row);
            }
            
              if(i==3)
            {
            row[0] =i;
            row[1] = "صدور پروانه اشتغال";
            row[2] = String.valueOf(p3);
           row[3]=s3;
            tablemodel.addRow(row);
            }
              
            if(i==4)
            {
            row[0] =i;
            row[1] = "تغییر پایه پروانه اشتغال";
            row[2] = String.valueOf(p4);
           row[3]=s4;
            tablemodel.addRow(row);
            }
            
            if(i==5)
            {
            row[0] =i;
            row[1] = "حق نظارت";
            row[2] = String.valueOf(p5);
            row[3]=String.valueOf(s5)+"----"+String.valueOf(karkard);
            tablemodel.addRow(row);
            }
            
             if(i==6)
            {
            row[0] =i;
            row[1] = "حق اجرا";
            row[2] = String.valueOf(p6);
           row[3]=s6;
            tablemodel.addRow(row);
            }
           
              if(i==7)
            {
            row[0] =i;
            row[1] = "آموزش";
            row[2] = String.valueOf(p7);
           row[3]=s7;
            tablemodel.addRow(row);
            }
              
                 if(i==8)
            {
            row[0] =i;
            row[1] = "عدم عضویت";
            row[2] = String.valueOf(p8);
           row[3]=s8;
            tablemodel.addRow(row);
            }
            if(i==9)
            {
            row[0] =i;
            row[1] = "لغو عضویت";
            row[2] = String.valueOf(p9);
           row[3]=s9;
            tablemodel.addRow(row);
            }
              if(i==10)
            {
            row[0] =i;
            row[1] = "کارت عضویت";
            row[2] = String.valueOf(p10);
           row[3]=s10;
            tablemodel.addRow(row);
            }
              
            if(i==11)
            {
            row[0] =i;
            row[1] = "عضو جدید";
            row[2] = String.valueOf(p11);
           row[3]=s11;
            tablemodel.addRow(row);
            }
                
            if(i==12)
            {
            row[0] =i;
            row[1] = "سایر";
            row[2] = String.valueOf(p12);  
           row[3]=s12;
            tablemodel.addRow(row);
            }
        }
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment((int) JTable.CENTER_ALIGNMENT);
        for (int j=0;j<table1.getColumnCount();j++){
            table1.setDefaultRenderer(table1.getColumnClass(j),renderer);
       }
        table1.updateUI();
       
    }
    
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mahshad
        panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        label2 = new JLabel();
        textField7 = new JTextField();
        label3 = new JLabel();
        textField8 = new JTextField();
        button3 = new JButton();
        button4 = new JButton();

        //======== this ========
        setTitle("\u06af\u0632\u0627\u0631\u0634 \u0645\u0627\u0644\u06cc");
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(255, 204, 204));

           

            //======== scrollPane1 ========
            {

                //---- table1 ----
                table1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                    table1.setBorder(new EtchedBorder(new Color(255, 153, 153), Color.black));
                    table1.setRowHeight(45);
                    table1.setRowMargin(4);
                    table1.setForeground(Color.black);
                    table1.setSelectionForeground(new Color(255, 153, 153));
                    table1.setGridColor(new Color(255, 204, 204));
                   table1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                scrollPane1.setViewportView(table1);
            }

            //---- label2 ----
            label2.setText("\u0627\u0632 \u062a\u0627\u0631\u06cc\u062e :");
            label2.setFont(new Font("B Zar", Font.PLAIN, 20));
            label2.setHorizontalAlignment(SwingConstants.CENTER);
            label2.setForeground(Color.black);

            //---- textField7 ----
            textField7.setHorizontalAlignment(SwingConstants.CENTER);
            textField7.setFont(new Font("Segoe UI", Font.PLAIN, 18));

            //---- label3 ----
            label3.setText("\u062a\u0627 \u062a\u0627\u0631\u06cc\u062e :");
            label3.setFont(new Font("B Zar", Font.PLAIN, 20));
            label3.setHorizontalAlignment(SwingConstants.CENTER);
            label3.setForeground(Color.black);

            //---- textField8 ----
            textField8.setHorizontalAlignment(SwingConstants.CENTER);
            textField8.setFont(new Font("Segoe UI", Font.PLAIN, 18));

            //---- button3 ----
            button3.setText("\u062c\u0633\u062a\u062c\u0648");
            button3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            button3.setBackground(Color.black);
            button3.setForeground(new Color(255, 153, 153));
            button3.addActionListener(e-> actionPerformed3(e));

            //---- button4 ----
            button4.setText("\u06af\u0632\u0627\u0631\u0634");
            button4.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            button4.setBackground(Color.black);
            button4.setForeground(new Color(255, 153, 153));
            button4.addActionListener(e-> actionPerformed4(e));


            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap(38, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(textField8, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label3)
                                .addGap(75, 75, 75)
                                .addComponent(textField7, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label2)
                                .addGap(123, 123, 123))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 974, GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(button4, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
                                .addGap(184, 184, 184)
                                .addComponent(button3, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
                                .addGap(300, 300, 300))))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 354, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button4)
                            .addComponent(button3))
                        .addGap(41, 41, 41))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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
    // Generated using JFormDesigner Evaluation license - mahshad
    private JPanel panel1;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JLabel label2;
    private JTextField textField7;
    private JLabel label3;
    private JTextField textField8;
    private JButton button3;
    private JButton button4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private void actionPerformed3(ActionEvent e) {
      fillTable();
    }

    private void actionPerformed4(ActionEvent e) {
        printFinance2 pf2=new printFinance2(start,finish,table1,finance);
        pf2.generatePdf();
        Excel exc = new Excel(table1);
        exc.createExcel1();
    }
}
