import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import nezam.Finance;
import nezam.Main;
/*
 * Created by JFormDesigner on Mon Aug 27 21:55:35 PDT 2018
 */

public class gozareshMali extends JFrame {
    
        ArrayList<Finance> fin;
        int number;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        public String columnName[]={"ردیف","نام","شماره عضویت","بدهکاری","پرداختی","مانده","تمدید عضویت","شماره همراه"};
        java.util.List finance;
        ArrayList<Integer> temp;
         Date start=null;
         Date finish=null;
        
        

    public gozareshMali() {
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
        
        finance=ME.listFinanceByDate(start,finish);
        temp=new ArrayList<>();
         for(int i=0; i<finance.size();i++)
         {
            Finance  f=(Finance) finance.get(i);
            System.out.println(i+","+f.getIdMain()+","+f.getRegisterdate());
             number=f.getIdMain();
             if(check(number))
             {
                 temp.add(number);
             }
         }        
         DefaultTableModel tablemodel = new DefaultTableModel(columnName, 0);     
         Object[] row = new Object[8];        
         table1.setModel(tablemodel);
     for (int j=0;j<temp.size();j++){
             System.out.println(temp.get(j));
     }
          for ( int i = 0; i < temp.size(); i++)
        {
            int mid=temp.get(i);
             fin  = new ArrayList<>();
            for(int j=0 ; j<finance.size() ; j++)
            {
                Finance t=(Finance) finance.get(j);
               if (t.getIdMain() == mid)
              {
                    fin.add(t);
               }                   
            }         
            row[0] =i+1;
            row[1] = calculateName(temp.get(i));
            row[2] = calculateNumber(temp.get(i));
            row[3] = calculateBedehkari();
            int b= calculateBedehkari();
            int p= calculatePay();
            row[4]=calculatePay();
            row[5]=b - p;          
            row[6]=Dtamdid(temp.get(i));
            row[7] = phone(temp.get(i));
            tablemodel.addRow(row);

        }
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment((int) JTable.CENTER_ALIGNMENT);
        for (int j=0;j<table1.getColumnCount();j++){
            table1.setDefaultRenderer(table1.getColumnClass(j),renderer);
       }
        table1.updateUI();
       
    }    
      public int calculateBedehkari()
      {
          int total=0;
          Finance t;
          for(int q=0;q<fin.size();q++)
          {
              t= fin.get(q);
              total =t.getBedehkariamount()+total;
          }
          return total;
      }
      
        public int calculatePay()
      {
          int total= 0;
          Finance t;
          for(int q=0;q<fin.size();q++)
          {
              t=fin.get(q);
              total = t.getPay()+total;
          }

          return total;
      }
      
      
      public boolean check (int num)
      {
          boolean flag=true;
          for(int x=0;x<temp.size();x++ )
              if(num == temp.get(x))
              {
                  flag=false;
                  break;
              }
                  return flag;
      }
public String phone(int id)
{
    manageEng me=new manageEng();
    Main m=me.getMain(id);
    String pho="";
    if (m.getMphone() != null){
        pho = m.getMphone();
    }
    return pho;
}
public String Dtamdid(int id)
{
    
    manageEng me=new manageEng();
    Main m=me.getMain(id);
    String dtamdid="";
    if (m.getDtmdidozviyat()!= null){
        dtamdid = m.getDtmdidozviyat();
    }
   
    return dtamdid;
    
}
public String calculateName(int id)
{
    
    manageEng me=new manageEng();
    Main m=me.getMain(id);
    String fname="";
    String lname="";
    if (m.getFname() != null){
        fname=m.getFname();
    }
    else{
       System.out.print(m.getId()+"____________________");
    }
    
    if(m.getLname()!=null){
        lname=m.getLname();
    }   
    return fname +" "+ lname;
    
}

public String calculateNumber(int id)
{
    manageEng me=new manageEng();
    Main m=me.getMain(id);
    return m.getMembershipnumber();
    
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
        printFinance1 pf1=new printFinance1(start,finish,table1,finance);
        pf1.generatePdf();
        Excel exc = new Excel(table1);
        exc.createExcel1();
        
    }
}
