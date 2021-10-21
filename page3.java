import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import nezam.Amuzeshi;
import nezam.Bime;
import nezam.Finance;
import nezam.Majma;
import nezam.Sahmiye;
/*
 * Created by JFormDesigner on Thu Jul 27 01:05:50 PDT 2017
 */



/**
 * @author mansour davoudi
 */
public class page3 extends JFrame {
     Integer id=null;
    manageEng ME;
    ArrayList<Finance> tempFinance;
    public String columnName[]={"ردیف","شناسه","تاریخ ثبت","تاریخ پرداخت","نوع سند","بدهکاری","پرداختی","مانده"};
    public String columnName1[]={"\u0634\u0646\u0627\u0633\u0647","\u0646\u0627\u0645 \u062f\u0648\u0631\u0647","\u0634\u0645\u0627\u0631\u0647 \u062f\u0648\u0631\u0647"};
    public String columnName2[]={"\u0634\u0646\u0627\u0633\u0647","\u062a\u0627\u0631\u06cc\u062e \u0628\u0631\u06af\u0632\u0627\u0631\u06cc","\u0646\u062a\u06cc\u062c\u0647"};
    public String columnName4[]={"\u0634\u0645\u0627\u0631\u0647 \u0628\u06cc\u0645\u0647 \u0646\u0627\u0645\u0647","\u0646\u0627\u0645 \u0634\u0631\u06a9\u062a","\u062a\u0627\u0631\u06cc\u062e \u0635\u062f\u0648\u0631","\u062a\u0627\u0631\u06cc\u062e \u0627\u0646\u0642\u0636\u0627"};
    public String columnName6[]={"\u0634\u0646\u0627\u0633\u0647","\u06a9\u0644 \u0633\u0647\u0645\u06cc\u0647","\u0633\u0647\u0645\u06cc\u0647 \u0645\u0635\u0631\u0641\u06cc","\u0633\u0627\u0644","\u0646\u0648\u0639","\u0645\u0643\u0627\u0646"};
    public page3(Integer id,manageEng ME) {
        this.id=id;
        this.ME=ME;
        initComponents();
    }
    public void showFinance(Integer id)
    {
       
        ME.showFinance(id);
    }
    public void showSahmiye(int id)
    {
        ME.showSahmiye(id);
    }
    public void showAmuzeshi(Integer id)
    {
        ME.showAmuzeshi(id);
    }
    public void showBime(Integer id)
    {
        ME.showBime(id);
    }
    public void fillTable5()
    {
         Sahmiye m=null;
          java.util.List sahm=ME.listSahmiye();
         ArrayList<Sahmiye> temp1=new ArrayList<>();
         DefaultTableModel tablemodel = new DefaultTableModel(columnName6, 0);
         table5.setModel(tablemodel);
         int idmain;
             for (int j=0;j<sahm.size();j++)
         {
           m=(Sahmiye) sahm.get(j);
            idmain=(Integer) m.getIdMain();
             if (idmain==this.id)
             {
                  
                   temp1.add(m);
             }
           
                
         }
         Object[] row = new Object[6];
         
         table5.setModel(tablemodel);
        for (int i = 0; i < temp1.size(); i++)
        {
            m =temp1.get(i);
           
            row[0] =m.getId();
            row[1] = m.getEntire();
            row[2] = m.getPart();
            row[3]=m.getYear();
           row[4]=m.getKind();
           row[5]=m.getLoc();
                   
            tablemodel.addRow(row);
            

        }
           DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment((int) JTable.CENTER_ALIGNMENT);
        for (int i=0; i<table5.getColumnCount();i++){
            table5.setDefaultRenderer(table5.getColumnClass(i),renderer);
       }
        table5.updateUI();
    }
    public void fillTable3()
    {
         Majma m=null;
          java.util.List majma=ME.listMajma();
         ArrayList<Majma> temp1=new ArrayList<>();
         DefaultTableModel tablemodel = new DefaultTableModel(columnName2, 0);
         int idmain;
             for (int j=0;j<majma.size();j++)
         {
           m=(Majma) majma.get(j);
            idmain=(Integer) m.getIdMain();
             if (idmain==this.id)
             {
                  
                   temp1.add(m);
             }
           
                
         }
         Object[] row = new Object[3];
         
         table3.setModel(tablemodel);
        for (int i = 0; i < temp1.size(); i++)
        {
            m =temp1.get(i);
           
            row[0] =m.getId();
            row[1] = m.getDbargozari();
            row[2] = m.getResult();
           
            tablemodel.addRow(row);

        }
           DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment((int) JTable.CENTER_ALIGNMENT);
        for (int i=0; i<table3.getColumnCount();i++){
            table3.setDefaultRenderer(table3.getColumnClass(i),renderer);
       }
        table3.updateUI();
        
    }
    public void fillTable2()
    {
          Amuzeshi a=null;
          java.util.List amuzeshi=ME.listAmuzeshi();
         ArrayList<Amuzeshi> temp1=new ArrayList<>();
         DefaultTableModel tablemodel = new DefaultTableModel(columnName1, 0);
         int idmain;
             for (int j=0;j<amuzeshi.size();j++)
         {
           a=(Amuzeshi) amuzeshi.get(j);
            idmain=(Integer) a.getIdMain();
             if (idmain==this.id)
             {
                  
                   temp1.add(a);
             }
           
                
         }
         Object[] row = new Object[3];
         
         table2.setModel(tablemodel);
        for (int i = 0; i < temp1.size(); i++)
        {
            a =temp1.get(i);
           
            row[0] =a.getId();
            row[1] = a.getName();
            row[2] = a.getNumber();
           
            tablemodel.addRow(row);

        }
           DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment((int) JTable.CENTER_ALIGNMENT);
        for (int i=0; i<table2.getColumnCount();i++){
            table2.setDefaultRenderer(table2.getColumnClass(i),renderer);
       }
        table2.updateUI();
        
                
    }
    public void fillTable4()
    {
            Bime b=null;
          java.util.List bime=ME.listBime();
         ArrayList<Bime> temp1=new ArrayList<>();
         DefaultTableModel tablemodel = new DefaultTableModel(columnName4, 0);
         int idmain;
             for (int j=0;j<bime.size();j++)
         {
           b=(Bime) bime.get(j);
            idmain=(Integer) b.getIdMain();
             if (idmain==this.id)
             {
                  
                   temp1.add(b);
             }
           
                
         }
         Object[] row = new Object[4];
         
         table4.setModel(tablemodel);
        for (int i = 0; i < temp1.size(); i++)
        {
            b=temp1.get(i);
           
            row[3] =b.getEdate();
            row[2] = b.getSdate();
            row[1] = b.getSherkat();
            row[0]=b.getId();
           
            tablemodel.addRow(row);

        }
           DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment((int) JTable.CENTER_ALIGNMENT);
        for (int i=0; i<table4.getColumnCount();i++){
            table4.setDefaultRenderer(table4.getColumnClass(i),renderer);
       }
        table4.updateUI();
    }
     public void fillTable()
    {
        int i;
       
        
         Finance f=null;
         java.util.List finance=ME.listFinance();
          tempFinance=new ArrayList<>();
         DefaultTableModel tablemodel = new DefaultTableModel(columnName, 0);
         int idmain;
             for (int j=0;j<finance.size();j++)
         {
            f=(Finance) finance.get(j);
            idmain=(Integer) f.getIdMain();
             if (idmain==this.id)
             {
                  
                   tempFinance.add(f);
             }
           
                
         }
         int totalB=0;
        totalB=calculateTotalBedehkari(tempFinance);
        int totalP=0;
        totalP=calculateTotalPay(tempFinance);
        int totalLeft=0;totalLeft=totalB - totalP;
        String left=String.valueOf(totalLeft);
        textField81.setText(left);
         
         
         table1.setModel(tablemodel);
         Object[] row = new Object[8];
         
        for (i=0;  i <= tempFinance.size(); i++)
        {
           
                   f =tempFinance.get(i);
           
            row[0] =i+1;
            row[1] = f.getId();
            row[2] = f.getRegisterdate();
            row[3] = f.getPardakhtdate();
            row[4]=f.getBedehkarikind();
            row[5]=f.getBedehkariamount();
            row[6]=f.getPay();
            row[7]=calculate(tempFinance,i);
          
            tablemodel.addRow(row);
        }
        
        
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment((int) JTable.CENTER_ALIGNMENT);
        for (int j=0; j<table1.getColumnCount(); j++){
            table1.setDefaultRenderer(table1.getColumnClass(j),renderer);
       }
        table1.updateUI();
      
    }
     
     
   public int  calculateTotalBedehkari(ArrayList<Finance> temp)
     {
         int total=0;
         
         for( Finance f: temp )
         {
             total += f.getBedehkariamount();
         }
         return total;
     }
   
     public int  calculateTotalPay(ArrayList<Finance> temp)
     {
         int total=0;
         
         for( Finance f: temp )
         {
             total += f.getPay();
         }
         return total;
     }
   
//    public void check1()
//    {
//        panel4.invalidate();
//        label28.setVisible(true);
//    }

        
  private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mahshad
        tabbedPane1 = new JTabbedPane();
        panel1 = new JPanel();
        label1 = new JLabel();
        button1 = new JButton();
        label31 = new JLabel();
        button12 = new JButton();
        label39 = new JLabel();
        panel2 = new JPanel();
        label2 = new JLabel();
        textField1 = new JTextField();
        label3 = new JLabel();
        textField2 = new JTextField();
        label1111 = new JLabel();
        textField3 = new JTextField();
        label4 = new JLabel();
        textField4 = new JTextField();
        label5 = new JLabel();
        textField5 = new JTextField();
        label9 = new JLabel();
        textField8 = new JTextField();
        label7 = new JLabel();
        textField6 = new JTextField();
        label12 = new JLabel();
        textField10 = new JTextField();
        label10 = new JLabel();
        label13 = new JLabel();
        textField11 = new JTextField();
        label14 = new JLabel();
        textField12 = new JTextField();
        label6 = new JLabel();
        label8 = new JLabel();
        textField7 = new JTextField();
        label22 = new JLabel();
        label11 = new JLabel();
        textField16 = new JTextField();
        label20 = new JLabel();
        textField17 = new JTextField();
        label17 = new JLabel();
        label18 = new JLabel();
        textField14 = new JTextField();
        label19 = new JLabel();
        textField15 = new JTextField();
        textField18 = new JTextField();
        label16 = new JLabel();
        label15 = new JLabel();
        textField19 = new JTextField();
        textField13 = new JTextField();
        label21 = new JLabel();
        textField20 = new JTextField();
        label23 = new JLabel();
        label24 = new JLabel();
        textField22 = new JTextField();
        label25 = new JLabel();
        label26 = new JLabel();
        textField24 = new JTextField();
        label27 = new JLabel();
        textField25 = new JTextField();
        textField26 = new JTextField();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        scrollPane8 = new JScrollPane();
        textArea2 = new JTextArea();
        scrollPane9 = new JScrollPane();
        textArea8 = new JTextArea();
        panel3 = new JPanel();
        label50 = new JLabel();
        textField27 = new JTextField();
        label51 = new JLabel();
        textField28 = new JTextField();
        label52 = new JLabel();
        textField29 = new JTextField();
        label53 = new JLabel();
        textField30 = new JTextField();
        label55 = new JLabel();
        textField32 = new JTextField();
        label56 = new JLabel();
        textField33 = new JTextField();
        label57 = new JLabel();
        textField34 = new JTextField();
        label58 = new JLabel();
        textField35 = new JTextField();
        label59 = new JLabel();
        textField36 = new JTextField();
        label60 = new JLabel();
        textField37 = new JTextField();
        label61 = new JLabel();
        textField38 = new JTextField();
        label62 = new JLabel();
        textField39 = new JTextField();
        label63 = new JLabel();
        textField40 = new JTextField();
        label64 = new JLabel();
        textField41 = new JTextField();
        label66 = new JLabel();
        textField42 = new JTextField();
        label67 = new JLabel();
        textField43 = new JTextField();
        label68 = new JLabel();
        textField44 = new JTextField();
        label69 = new JLabel();
        textField45 = new JTextField();
        label70 = new JLabel();
        textField46 = new JTextField();
        label71 = new JLabel();
        textField48 = new JTextField();
        label72 = new JLabel();
        textField49 = new JTextField();
        label73 = new JLabel();
        textField50 = new JTextField();
        label54 = new JLabel();
        textField31 = new JTextField();
        label88 = new JLabel();
        textField47 = new JTextField();
        panel4 = new JPanel();
        label74 = new JLabel();
        label65 = new JLabel();
        label79 = new JLabel();
        textField56 = new JTextField();
        label80 = new JLabel();
        textField57 = new JTextField();
        label81 = new JLabel();
        textField58 = new JTextField();
        label82 = new JLabel();
        textField59 = new JTextField();
        label83 = new JLabel();
        textField60 = new JTextField();
        label84 = new JLabel();
        textField61 = new JTextField();
        label28 = new JLabel();
        scrollPane3 = new JScrollPane();
        textArea3 = new JTextArea();
        label76 = new JLabel();
        label77 = new JLabel();
        textField51 = new JTextField();
        scrollPane4 = new JScrollPane();
        textArea4 = new JTextArea();
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        checkBoxMenuItem6 = new JCheckBoxMenuItem();
        checkBoxMenuItem4 = new JCheckBoxMenuItem();
        checkBoxMenuItem5 = new JCheckBoxMenuItem();
        checkBoxMenuItem7 = new JCheckBoxMenuItem();
        label78 = new JLabel();
        panel5 = new JPanel();
        label75 = new JLabel();
        scrollPane14 = new JScrollPane();
        textArea10 = new JTextArea();
        label85 = new JLabel();
        label86 = new JLabel();
        scrollPane16 = new JScrollPane();
        textArea12 = new JTextArea();
        label87 = new JLabel();
        scrollPane17 = new JScrollPane();
        textArea13 = new JTextArea();
        button2 = new JButton();
        button3 = new JButton();
        scrollPane15 = new JScrollPane();
        textArea11 = new JTextArea();
        panel13 = new JPanel();
        scrollPane5 = new JScrollPane();
        table5 = new JTable();
        button4 = new JButton();
        panel6 = new JPanel();
        scrollPane2 = new JScrollPane();
        table1 = new JTable();
        button7 = new JButton();
        label30 = new JLabel();
        label32 = new JLabel();
        textField81 = new JTextField();
        label36 = new JLabel();
        scrollPane12 = new JScrollPane();
        comboBox1 = new JComboBox<>();
        label33 = new JLabel();
        button15 = new JButton();
        button17 = new JButton();
        panel10 = new JPanel();
        label127 = new JLabel();
        textField96 = new JTextField();
        label128 = new JLabel();
        textField99 = new JTextField();
        label129 = new JLabel();
        textField100 = new JTextField();
        label130 = new JLabel();
        textField101 = new JTextField();
        label131 = new JLabel();
        textField102 = new JTextField();
        label132 = new JLabel();
        textField103 = new JTextField();
        label133 = new JLabel();
        textField104 = new JTextField();
        button14 = new JButton();
        button16 = new JButton();
        panel12 = new JPanel();
        scrollPane18 = new JScrollPane();
        table4 = new JTable();
        panel7 = new JPanel();
        label109 = new JLabel();
        textField83 = new JTextField();
        label112 = new JLabel();
        textField84 = new JTextField();
        label113 = new JLabel();
        textField85 = new JTextField();
        label114 = new JLabel();
        textField86 = new JTextField();
        label115 = new JLabel();
        textField87 = new JTextField();
        label116 = new JLabel();
        textField88 = new JTextField();
        label117 = new JLabel();
        textField89 = new JTextField();
        label118 = new JLabel();
        textField90 = new JTextField();
        label119 = new JLabel();
        textField91 = new JTextField();
        label122 = new JLabel();
        textField92 = new JTextField();
        label123 = new JLabel();
        textField93 = new JTextField();
        label124 = new JLabel();
        textField94 = new JTextField();
        label34 = new JLabel();
        button18 = new JButton();
        button19 = new JButton();
        panel8 = new JPanel();
        scrollPane10 = new JScrollPane();
        table2 = new JTable();
        panel9 = new JPanel();
        scrollPane11 = new JScrollPane();
        table3 = new JTable();
        label125 = new JLabel();
        textField95 = new JTextField();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        label35 = new JLabel();
        button20 = new JButton();
        button21 = new JButton();
        panel11 = new JPanel();
        scrollPane13 = new JScrollPane();
        textArea9 = new JTextArea();
        button13 = new JButton();
        label38 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();

        //======== tabbedPane1 ========
        {
            tabbedPane1.setFont(new Font("Segoe UI", Font.PLAIN, 14));

            //======== panel1 ========
            {
                panel1.setBackground(new Color(255, 204, 204));

              

                //---- label1 ----
                label1.setBackground(Color.pink);

                //---- button1 ----
                button1.setText("\u062b\u0628\u062a \u0639\u06a9\u0633");
                button1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                button1.setBackground(Color.black);
                button1.setForeground(new Color(255, 153, 153));
                button1.addActionListener(e-> button1actionPerformed(e));

                //---- label31 ----
                label31.setText("\u0639\u06a9\u0633 \u0628\u0627 \u0645\u0648\u0641\u0642\u06cc\u062a \u062b\u0628\u062a \u0634\u062f!!");
                label31.setForeground(Color.red);
                label31.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                label31.setVisible(false);

                //---- button12 ----
                button12.setText("\u062d\u0630\u0641 \u0639\u06a9\u0633");
                button12.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                button12.setBackground(Color.black);
                button12.setForeground(new Color(255, 153, 153));
                button12.addActionListener(e-> actionPerformed12(e));
                

                //---- label39 ----
                label39.setText("\u0639\u06a9\u0633 \u0628\u0627 \u0645\u0648\u0641\u0642\u06cc\u062a \u062d\u0630\u0641 \u0634\u062f!!");
                label39.setForeground(Color.red);
                label39.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                label39.setVisible(false);

                GroupLayout panel1Layout = new GroupLayout(panel1);
                panel1.setLayout(panel1Layout);
                panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGap(368, 368, 368)
                            .addComponent(button12)
                            .addGap(18, 18, 18)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
                                .addComponent(label31)
                                .addComponent(label39))
                            .addContainerGap(371, Short.MAX_VALUE))
                );
                panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGroup(panel1Layout.createParallelGroup()
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(92, 92, 92)
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(172, 172, 172)
                                    .addComponent(button12))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(167, 167, 167)
                                    .addComponent(button1)))
                            .addGap(99, 99, 99)
                            .addComponent(label31)
                            .addGap(74, 74, 74)
                            .addComponent(label39)
                            .addContainerGap(196, Short.MAX_VALUE))
                );
            }
            tabbedPane1.addTab("\u0639\u06a9\u0633", panel1);

            //======== panel2 ========
            {
                panel2.setForeground(Color.black);
                panel2.setBackground(new Color(255, 204, 204));

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

                //---- label1111 ----
                label1111.setText("\u0644\u0627\u062a\u06cc\u0646:");
                label1111.setFont(new Font("B Zar", Font.PLAIN, 20));
                label1111.setForeground(Color.black);

                //---- textField3 ----
                textField3.setHorizontalAlignment(SwingConstants.CENTER);
                textField3.setFont(new Font("Segoe UI", Font.PLAIN, 16));

                //---- label4 ----
                label4.setText("\u0646\u0627\u0645 \u067e\u062f\u0631 :");
                label4.setHorizontalAlignment(SwingConstants.CENTER);
                label4.setFont(new Font("B Zar", Font.PLAIN, 20));
                label4.setForeground(Color.black);

                //---- textField4 ----
                textField4.setHorizontalAlignment(SwingConstants.CENTER);
                textField4.setFont(new Font("Segoe UI", Font.PLAIN, 18));

                //---- label5 ----
                label5.setText("\u0634\u0645\u0627\u0631\u0647 \u06a9\u0627\u0631\u062a \u0634\u0646\u0627\u0633\u0627\u06cc\u06cc :");
                label5.setHorizontalAlignment(SwingConstants.CENTER);
                label5.setFont(new Font("B Zar", Font.PLAIN, 20));
                label5.setForeground(Color.black);

                //---- textField5 ----
                textField5.setHorizontalAlignment(SwingConstants.CENTER);
                textField5.setFont(new Font("Segoe UI", Font.PLAIN, 18));

                //---- label9 ----
                label9.setText("\u0633\u0627\u0644 \u062a\u0648\u0644\u062f :");
                label9.setHorizontalAlignment(SwingConstants.CENTER);
                label9.setFont(new Font("B Zar", Font.PLAIN, 20));
                label9.setForeground(Color.black);

                //---- textField8 ----
                textField8.setHorizontalAlignment(SwingConstants.CENTER);
                textField8.setFont(new Font("Segoe UI", Font.PLAIN, 18));

                //---- label7 ----
                label7.setText("\u06a9\u062f \u0645\u0644\u06cc :");
                label7.setHorizontalAlignment(SwingConstants.CENTER);
                label7.setFont(new Font("B Zar", Font.PLAIN, 20));
                label7.setForeground(Color.black);

                //---- textField6 ----
                textField6.setHorizontalAlignment(SwingConstants.CENTER);
                textField6.setFont(new Font("Segoe UI", Font.PLAIN, 18));

                //---- label12 ----
                label12.setText("\u06a9\u062f \u067e\u0633\u062a\u06cc :");
                label12.setHorizontalAlignment(SwingConstants.CENTER);
                label12.setFont(new Font("B Zar", Font.PLAIN, 20));
                label12.setForeground(Color.black);

                //---- textField10 ----
                textField10.setHorizontalAlignment(SwingConstants.CENTER);
                textField10.setFont(new Font("Segoe UI", Font.PLAIN, 18));

                //---- label10 ----
                label10.setText("\u0622\u062f\u0631\u0633 :");
                label10.setHorizontalAlignment(SwingConstants.CENTER);
                label10.setFont(new Font("B Zar", Font.PLAIN, 20));
                label10.setForeground(Color.black);

                //---- label13 ----
                label13.setText("\u0634\u0645\u0627\u0631\u0647 \u0647\u0645\u0631\u0627\u0647 :");
                label13.setHorizontalAlignment(SwingConstants.CENTER);
                label13.setFont(new Font("B Zar", Font.PLAIN, 20));
                label13.setForeground(Color.black);

                //---- textField11 ----
                textField11.setHorizontalAlignment(SwingConstants.CENTER);
                textField11.setFont(new Font("Segoe UI", Font.PLAIN, 18));

                //---- label14 ----
                label14.setText("\u0634\u0645\u0627\u0631\u0647 \u062b\u0627\u0628\u062a :");
                label14.setHorizontalAlignment(SwingConstants.CENTER);
                label14.setFont(new Font("B Zar", Font.PLAIN, 20));
                label14.setForeground(Color.black);

                //---- textField12 ----
                textField12.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                textField12.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label8 ----
                label8.setText("\u0645\u062d\u0644 \u062a\u0648\u0644\u062f:");
                label8.setFont(new Font("B Zar", Font.PLAIN, 20));
                label8.setForeground(Color.black);

                //---- textField7 ----
                textField7.setHorizontalAlignment(SwingConstants.CENTER);
                textField7.setFont(new Font("Segoe UI", Font.PLAIN, 18));

                //---- label22 ----
                label22.setText("\u062c\u0646\u0633\u06cc\u062a :");
                label22.setHorizontalAlignment(SwingConstants.CENTER);
                label22.setFont(new Font("B Zar", Font.PLAIN, 20));
                label22.setForeground(Color.black);
                label22.setBackground(Color.black);

                //---- label11 ----
                label11.setText("\u0645\u062c\u0631\u062f/\u0645\u062a\u0627\u0647\u0644:");
                label11.setFont(new Font("B Zar", Font.PLAIN, 20));
                label11.setForeground(Color.black);

                //---- textField16 ----
                textField16.setHorizontalAlignment(SwingConstants.CENTER);
                textField16.setFont(new Font("Segoe UI", Font.PLAIN, 18));

                //---- label20 ----
                label20.setText("\u0646\u0627\u0645 \u062f\u0627\u0646\u0634\u06af\u0627\u0647 :");
                label20.setHorizontalAlignment(SwingConstants.CENTER);
                label20.setFont(new Font("B Zar", Font.PLAIN, 20));
                label20.setForeground(Color.black);

                //---- textField17 ----
                textField17.setHorizontalAlignment(SwingConstants.CENTER);
                textField17.setFont(new Font("Segoe UI", Font.PLAIN, 13));

                //---- label17 ----
                label17.setText("\u0631\u0634\u062a\u0647 \u062a\u062d\u0635\u06cc\u0644\u06cc :");
                label17.setHorizontalAlignment(SwingConstants.CENTER);
                label17.setFont(new Font("B Zar", Font.PLAIN, 20));
                label17.setBackground(Color.black);
                label17.setForeground(Color.black);

                //---- label18 ----
                label18.setText("\u06a9\u062f \u0631\u0634\u062a\u0647 :");
                label18.setHorizontalAlignment(SwingConstants.CENTER);
                label18.setFont(new Font("B Zar", Font.PLAIN, 20));
                label18.setForeground(Color.black);

                //---- textField14 ----
                textField14.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                textField14.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label19 ----
                label19.setText("\u06af\u0631\u0627\u06cc\u0634 :");
                label19.setHorizontalAlignment(SwingConstants.CENTER);
                label19.setFont(new Font("B Zar", Font.PLAIN, 20));
                label19.setForeground(Color.black);

                //---- textField15 ----
                textField15.setHorizontalAlignment(SwingConstants.CENTER);
                textField15.setFont(new Font("Segoe UI", Font.PLAIN, 14));

                //---- textField18 ----
                textField18.setHorizontalAlignment(SwingConstants.CENTER);
                textField18.setFont(new Font("Segoe UI", Font.PLAIN, 14));

                //---- label16 ----
                label16.setText("\u062a\u0627\u0631\u06cc\u062e \u0627\u062e\u0630 \u0645\u062f\u0631\u06a9 \u062a\u062d\u0635\u06cc\u0644\u06cc :");
                label16.setHorizontalAlignment(SwingConstants.CENTER);
                label16.setFont(new Font("B Zar", Font.PLAIN, 20));
                label16.setBackground(Color.black);
                label16.setForeground(Color.black);

                //---- label15 ----
                label15.setText("\u0645\u062f\u0631\u06a9 \u062a\u062d\u0635\u06cc\u0644\u06cc :");
                label15.setHorizontalAlignment(SwingConstants.CENTER);
                label15.setFont(new Font("B Zar", Font.PLAIN, 20));
                label15.setForeground(Color.black);

                //---- textField19 ----
                textField19.setHorizontalAlignment(SwingConstants.CENTER);
                textField19.setFont(new Font("Segoe UI", Font.PLAIN, 16));

                //---- textField13 ----
                textField13.setHorizontalAlignment(SwingConstants.CENTER);
                textField13.setFont(new Font("Segoe UI", Font.PLAIN, 18));

                //---- label21 ----
                label21.setText("\u0648\u0636\u0639\u06cc\u062a \u062e\u062f\u0645\u062a :");
                label21.setFont(new Font("B Zar", Font.PLAIN, 20));
                label21.setForeground(Color.black);

                //---- textField20 ----
                textField20.setHorizontalAlignment(SwingConstants.CENTER);
                textField20.setFont(new Font("Segoe UI", Font.PLAIN, 18));

                //---- label23 ----
                label23.setText(" \u0622\u062f\u0631\u0633 \u062f\u0627\u0646\u0634\u06af\u0627\u0647 :");
                label23.setHorizontalAlignment(SwingConstants.CENTER);
                label23.setFont(new Font("B Zar", Font.PLAIN, 20));
                label23.setForeground(Color.black);

                //---- label24 ----
                label24.setText("\u0645\u062d\u0644 \u06a9\u0627\u0631 :");
                label24.setHorizontalAlignment(SwingConstants.CENTER);
                label24.setFont(new Font("B Zar", Font.PLAIN, 20));
                label24.setForeground(Color.black);
                label24.setBackground(Color.black);

                //---- textField22 ----
                textField22.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                textField22.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label25 ----
                label25.setText("\u0622\u062f\u0631\u0633 \u0645\u062d\u0644 \u06a9\u0627\u0631:");
                label25.setFont(new Font("B Zar", Font.PLAIN, 20));
                label25.setForeground(Color.black);

                //---- label26 ----
                label26.setText("\u0633\u0648\u0627\u0628\u0642 \u0634\u063a\u0644\u06cc :");
                label26.setHorizontalAlignment(SwingConstants.CENTER);
                label26.setFont(new Font("B Zar", Font.PLAIN, 20));
                label26.setBackground(Color.black);
                label26.setForeground(Color.black);

                //---- textField24 ----
                textField24.setFont(new Font("Segoe UI", Font.PLAIN, 14));
                textField24.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label27 ----
                label27.setText("\u0633\u0627\u0628\u0642\u0647:");
                label27.setFont(new Font("B Zar", Font.PLAIN, 20));
                label27.setForeground(Color.black);

                //---- textField25 ----
                textField25.setHorizontalAlignment(SwingConstants.CENTER);
                textField25.setFont(new Font("Segoe UI", Font.PLAIN, 18));

                //---- textField26 ----
                textField26.setHorizontalAlignment(SwingConstants.CENTER);
                textField26.setFont(new Font("Segoe UI", Font.PLAIN, 18));

                //======== scrollPane1 ========
                {

                    //---- textArea1 ----
                    textArea1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
                    textArea1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                    scrollPane1.setViewportView(textArea1);
                }

                //======== scrollPane8 ========
                {

                    //---- textArea2 ----
                    textArea2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
                    textArea2.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                    scrollPane8.setViewportView(textArea2);
                }

                //======== scrollPane9 ========
                {

                    //---- textArea8 ----
                    textArea8.setFont(new Font("Segoe UI", Font.PLAIN, 14));
                    textArea8.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                    scrollPane9.setViewportView(textArea8);
                }

                GroupLayout panel2Layout = new GroupLayout(panel2);
                panel2.setLayout(panel2Layout);
                panel2Layout.setHorizontalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                            .addContainerGap(26, Short.MAX_VALUE)
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addGroup(panel2Layout.createParallelGroup()
                                        .addGroup(panel2Layout.createSequentialGroup()
                                            .addComponent(textField16, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label11)
                                            .addGap(18, 18, 18)
                                            .addComponent(textField26, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label22)
                                            .addGap(18, 18, 18)
                                            .addComponent(textField7, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel2Layout.createSequentialGroup()
                                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 438, GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(label10)))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(panel2Layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(textField10, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label12)
                                            .addGap(18, 18, 18)
                                            .addComponent(textField6, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label7)
                                            .addGap(22, 22, 22)
                                            .addComponent(textField8, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label9))
                                        .addGroup(panel2Layout.createSequentialGroup()
                                            .addComponent(label8)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(label6)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(textField12, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(label14)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(textField11, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label13))))
                                .addGroup(GroupLayout.Alignment.LEADING, panel2Layout.createSequentialGroup()
                                    .addGroup(panel2Layout.createParallelGroup()
                                        .addGroup(panel2Layout.createSequentialGroup()
                                            .addComponent(textField19, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label15))
                                        .addGroup(panel2Layout.createSequentialGroup()
                                            .addComponent(textField20, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(label21)))
                                    .addGap(18, 18, 18)
                                    .addGroup(panel2Layout.createParallelGroup()
                                        .addGroup(panel2Layout.createSequentialGroup()
                                            .addComponent(textField15, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label19)
                                            .addGap(18, 18, 18)
                                            .addComponent(textField14, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(label18)
                                            .addGap(24, 24, 24))
                                        .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(scrollPane8, GroupLayout.PREFERRED_SIZE, 405, GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(panel2Layout.createParallelGroup()
                                        .addGroup(panel2Layout.createSequentialGroup()
                                            .addGap(11, 11, 11)
                                            .addComponent(label23)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                            .addComponent(textField18, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(panel2Layout.createSequentialGroup()
                                            .addComponent(label17)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(textField17, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label20))
                                        .addGroup(panel2Layout.createSequentialGroup()
                                            .addComponent(textField13)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label16))))
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addComponent(textField25, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label27)
                                    .addGap(18, 18, 18)
                                    .addComponent(textField24)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(label26)
                                    .addGap(18, 18, 18)
                                    .addComponent(scrollPane9, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label25)
                                    .addGap(18, 18, 18)
                                    .addComponent(textField22, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label24))
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addComponent(textField5, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label5)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(textField4, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(label4)
                                    .addGap(18, 18, 18)
                                    .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label1111)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(textField2)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label3)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label2)))
                            .addGap(45, 45, 45))
                );
                panel2Layout.setVerticalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label1111))
                                    .addGap(8, 8, 8))
                                .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel2Layout.createParallelGroup()
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addGap(48, 48, 48)
                                    .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label9, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label10, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label12, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label7, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)))
                            .addGap(60, 60, 60)
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label13, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label6)
                                .addComponent(textField16, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label11)
                                .addComponent(textField26, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label22, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField7, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label8)
                                .addComponent(textField12, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label14, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField11, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                            .addGap(60, 60, 60)
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label20, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label17, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label15, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label19, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label18, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField17, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField15, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField14, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField19, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField18, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                            .addGap(42, 42, 42)
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label16, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label21, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label23, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField13, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField20, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                                .addComponent(scrollPane8, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
                            .addGap(44, 44, 44)
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label24)
                                    .addComponent(label25)
                                    .addComponent(label26)
                                    .addComponent(label27)
                                    .addComponent(textField22, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField25, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField24, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                                .addComponent(scrollPane9, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(55, Short.MAX_VALUE))
                );
            }
            tabbedPane1.addTab("\u0627\u0637\u0644\u0627\u0639\u0627\u062a \u0634\u062e\u0635\u06cc", panel2);

            //======== panel3 ========
            {
                panel3.setBackground(new Color(255, 204, 204));

                //---- label50 ----
                label50.setText("\u0634\u0645\u0627\u0631\u0647 \u0639\u0636\u0648\u06cc\u062a :");
                label50.setFont(new Font("B Zar", Font.PLAIN, 20));
                label50.setForeground(Color.black);

                //---- textField27 ----
                textField27.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                textField27.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label51 ----
                label51.setText("\u0646\u0648\u0639 \u0639\u0636\u0648\u06cc\u062a :");
                label51.setFont(new Font("B Zar", Font.PLAIN, 20));
                label51.setForeground(Color.black);

                //---- textField28 ----
                textField28.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                textField28.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label52 ----
                label52.setText("\u062a\u0627\u0631\u06cc\u062e \u0634\u0631\u0648\u0639 \u0639\u0636\u0648\u06cc\u062a :");
                label52.setFont(new Font("B Zar", Font.PLAIN, 20));
                label52.setForeground(Color.black);

                //---- textField29 ----
                textField29.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                textField29.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label53 ----
                label53.setText("\u062a\u0627\u0631\u06cc\u062e \u062a\u0645\u062f\u06cc\u062f \u0639\u0636\u0648\u06cc\u062a:");
                label53.setFont(new Font("B Zar", Font.PLAIN, 20));
                label53.setForeground(Color.black);

                //---- textField30 ----
                textField30.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                textField30.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label55 ----
                label55.setText("\u0634\u0645\u0627\u0631\u0647 \u067e\u0631\u0648\u0627\u0646\u0647:");
                label55.setFont(new Font("B Zar", Font.PLAIN, 20));
                label55.setForeground(Color.black);

                //---- textField32 ----
                textField32.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                textField32.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label56 ----
                label56.setText("\u067e\u0627\u06cc\u0647:");
                label56.setForeground(Color.black);
                label56.setFont(new Font("B Zar", Font.PLAIN, 20));
                label56.setHorizontalAlignment(SwingConstants.RIGHT);

                //---- textField33 ----
                textField33.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                textField33.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label57 ----
                label57.setText("\u062a\u0627\u0631\u06cc\u062e \u062a\u0645\u062f\u06cc\u062f \u067e\u0631\u0648\u0627\u0646\u0647:");
                label57.setFont(new Font("B Zar", Font.PLAIN, 20));
                label57.setForeground(Color.black);

                //---- textField34 ----
                textField34.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                textField34.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label58 ----
                label58.setText("\u062a\u0627\u0631\u06cc\u062e \u067e\u0627\u06cc\u0627\u0646 \u0627\u0639\u062a\u0628\u0627\u0631 \u067e\u0631\u0648\u0627\u0646\u0647:");
                label58.setFont(new Font("B Zar", Font.PLAIN, 20));
                label58.setForeground(Color.black);

                //---- textField35 ----
                textField35.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                textField35.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label59 ----
                label59.setText("\u062a\u0627\u0631\u06cc\u062e \u0642\u0628\u0648\u0644\u06cc 1 :");
                label59.setFont(new Font("B Zar", Font.PLAIN, 20));
                label59.setForeground(Color.black);

                //---- textField36 ----
                textField36.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                textField36.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label60 ----
                label60.setText("\u062a\u0627\u0631\u06cc\u062e \u0642\u0628\u0648\u0644\u06cc 2 :");
                label60.setFont(new Font("B Zar", Font.PLAIN, 20));
                label60.setForeground(Color.black);

                //---- textField37 ----
                textField37.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                textField37.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label61 ----
                label61.setText("\u062a\u0627\u0631\u06cc\u062e \u0642\u0628\u0648\u0644\u06cc 3 :");
                label61.setFont(new Font("B Zar", Font.PLAIN, 20));
                label61.setForeground(Color.black);

                //---- textField38 ----
                textField38.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                textField38.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label62 ----
                label62.setText(" \u067e\u0631\u0648\u0627\u0646\u0647 1 :");
                label62.setFont(new Font("B Zar", Font.PLAIN, 20));
                label62.setForeground(Color.black);

                //---- textField39 ----
                textField39.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                textField39.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label63 ----
                label63.setText("\u067e\u0631\u0648\u0627\u0646\u0647 2:");
                label63.setFont(new Font("B Zar", Font.PLAIN, 20));
                label63.setForeground(Color.black);

                //---- textField40 ----
                textField40.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                textField40.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label64 ----
                label64.setText("\u067e\u0631\u0648\u0627\u0646\u0647  3:");
                label64.setFont(new Font("B Zar", Font.PLAIN, 20));
                label64.setForeground(Color.black);

                //---- textField41 ----
                textField41.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                textField41.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label66 ----
                label66.setText("\u0635\u0644\u0627\u062d\u06cc\u062a \u0646\u0638\u0627\u0631\u062a:");
                label66.setFont(new Font("B Zar", Font.PLAIN, 20));
                label66.setForeground(Color.black);

                //---- textField42 ----
                textField42.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                textField42.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label67 ----
                label67.setText("\u0635\u0644\u0627\u062d\u06cc\u062a \u0627\u062c\u0631\u0627:");
                label67.setFont(new Font("B Zar", Font.PLAIN, 20));
                label67.setForeground(Color.black);

                //---- textField43 ----
                textField43.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                textField43.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label68 ----
                label68.setText("\u0645\u062f\u0631\u06a9 \u0627\u062c\u0631\u0627:");
                label68.setFont(new Font("B Zar", Font.PLAIN, 20));
                label68.setForeground(Color.black);

                //---- textField44 ----
                textField44.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                textField44.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label69 ----
                label69.setText("\u06a9\u062f \u0645\u062f\u0631\u06a9 \u0627\u062c\u0631\u0627:");
                label69.setFont(new Font("B Zar", Font.PLAIN, 20));
                label69.setForeground(Color.black);

                //---- textField45 ----
                textField45.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                textField45.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label70 ----
                label70.setText("\u0645\u062f\u0631\u06a9 \u0646\u0638\u0627\u0631\u062a:");
                label70.setFont(new Font("B Zar", Font.PLAIN, 20));
                label70.setForeground(Color.black);

                //---- textField46 ----
                textField46.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                textField46.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label71 ----
                label71.setText("\u062a\u0627\u0631\u06cc\u062e \u0635\u0644\u0627\u062d\u06cc\u062a \u0646\u0638\u0627\u0631\u062a:");
                label71.setFont(new Font("B Zar", Font.PLAIN, 20));
                label71.setForeground(Color.black);

                //---- textField48 ----
                textField48.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                textField48.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label72 ----
                label72.setText("\u062a\u0627\u0631\u06cc\u062e \u0635\u0644\u0627\u062d\u06cc\u062a \u0627\u062c\u0631\u0627:");
                label72.setFont(new Font("B Zar", Font.PLAIN, 20));
                label72.setForeground(Color.black);

                //---- textField49 ----
                textField49.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                textField49.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label73 ----
                label73.setText("\u06a9\u062f \u0628\u0627\u06cc\u06af\u0627\u0646\u06cc :");
                label73.setFont(new Font("B Zar", Font.PLAIN, 20));
                label73.setForeground(Color.black);

                //---- textField50 ----
                textField50.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                textField50.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label54 ----
                label54.setText("\u0645\u0639\u062f\u0644:");
                label54.setFont(new Font("B Zar", Font.PLAIN, 20));
                label54.setForeground(Color.black);

                //---- textField31 ----
                textField31.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                textField31.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label88 ----
                label88.setText("\u062a\u0627\u0631\u06cc\u062e \u0627\u0646\u062a\u0642\u0627\u0644\u06cc:");
                label88.setFont(new Font("B Zar", Font.PLAIN, 20));
                label88.setForeground(Color.black);

                //---- textField47 ----
                textField47.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                textField47.setHorizontalAlignment(SwingConstants.CENTER);

                GroupLayout panel3Layout = new GroupLayout(panel3);
                panel3.setLayout(panel3Layout);
                panel3Layout.setHorizontalGroup(
                    panel3Layout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(panel3Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(textField50, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(label73)
                                    .addGap(59, 59, 59)
                                    .addComponent(textField49, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(label72)
                                    .addGap(57, 57, 57)
                                    .addComponent(textField48, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(label71))
                                .addGroup(panel3Layout.createSequentialGroup()
                                    .addGroup(panel3Layout.createParallelGroup()
                                        .addGroup(panel3Layout.createSequentialGroup()
                                            .addContainerGap(50, Short.MAX_VALUE)
                                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addGroup(GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                                                    .addComponent(textField30)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(label53)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(textField29, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(label52))
                                                .addGroup(GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                                                    .addComponent(textField35, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(label58)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(textField34, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(label57)))
                                            .addGap(18, 18, 18)
                                            .addGroup(panel3Layout.createParallelGroup()
                                                .addComponent(textField28, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(textField33, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                                            .addContainerGap(49, Short.MAX_VALUE)
                                            .addGroup(panel3Layout.createParallelGroup()
                                                .addGroup(panel3Layout.createSequentialGroup()
                                                    .addGap(2, 2, 2)
                                                    .addComponent(textField31, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(label54)
                                                    .addGap(0, 0, Short.MAX_VALUE))
                                                .addGroup(GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                                                    .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addGroup(panel3Layout.createSequentialGroup()
                                                            .addComponent(textField38, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(label61)
                                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(textField37, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(label60)
                                                            .addGap(80, 80, 80))
                                                        .addGroup(panel3Layout.createSequentialGroup()
                                                            .addGap(0, 0, Short.MAX_VALUE)
                                                            .addGroup(panel3Layout.createParallelGroup()
                                                                .addGroup(panel3Layout.createSequentialGroup()
                                                                    .addComponent(textField46, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(label70)
                                                                    .addGap(18, 18, 18)
                                                                    .addComponent(textField45, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(label69)
                                                                    .addGap(18, 18, 18)
                                                                    .addComponent(textField44, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(label68)
                                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                    .addComponent(textField43, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(panel3Layout.createSequentialGroup()
                                                                    .addComponent(textField47, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                    .addComponent(label88)
                                                                    .addGap(44, 44, 44)
                                                                    .addComponent(textField41, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                    .addComponent(label64)
                                                                    .addGap(75, 75, 75)
                                                                    .addComponent(textField40, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)))))
                                                    .addGap(3, 3, 3)))))
                                    .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(panel3Layout.createSequentialGroup()
                                            .addGap(9, 9, 9)
                                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addGroup(panel3Layout.createSequentialGroup()
                                                    .addComponent(textField39, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(label62)
                                                    .addGap(6, 6, 6))
                                                .addGroup(panel3Layout.createSequentialGroup()
                                                    .addComponent(label67)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(textField42, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(label66)))
                                            .addGap(11, 11, 11))
                                        .addGroup(GroupLayout.Alignment.LEADING, panel3Layout.createSequentialGroup()
                                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addComponent(label63)
                                                .addComponent(label56))
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(textField32, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label55))
                                        .addGroup(panel3Layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addGroup(panel3Layout.createSequentialGroup()
                                                    .addComponent(label51)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(textField27, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(label50))
                                                .addGroup(panel3Layout.createSequentialGroup()
                                                    .addComponent(textField36, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(label59)
                                                    .addGap(6, 6, 6)))))))
                            .addGap(60, 60, 60))
                );
                panel3Layout.setVerticalGroup(
                    panel3Layout.createParallelGroup()
                        .addGroup(panel3Layout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label50, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField27, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label51, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField28, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label52, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField29, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label53)
                                .addComponent(textField30, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(60, 60, 60)
                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label55)
                                .addComponent(textField32, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField33, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label56)
                                .addComponent(label57)
                                .addComponent(textField34, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label58)
                                .addComponent(textField35, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(60, 60, 60)
                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(textField38, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label59, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label61, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField36, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField37, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label60, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                            .addGap(60, 60, 60)
                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label62, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField39, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label63)
                                .addComponent(textField41, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label64)
                                .addComponent(textField40, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField47, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label88))
                            .addGap(60, 60, 60)
                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label66)
                                .addComponent(textField45, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label70)
                                .addComponent(textField46, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label69)
                                .addComponent(textField44, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label68)
                                .addComponent(textField42, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField43, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label67))
                            .addGap(60, 60, 60)
                            .addGroup(panel3Layout.createParallelGroup()
                                .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label71)
                                    .addComponent(textField49, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label72)
                                    .addComponent(textField48, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label73, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField50, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label54)
                                    .addComponent(textField31, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(68, Short.MAX_VALUE))
                );
            }
            tabbedPane1.addTab("\u0627\u0637\u0644\u0627\u0639\u0627\u062a \u067e\u0631\u0648\u0627\u0646\u0647 1", panel3);

            //======== panel4 ========
            {
                panel4.setBackground(new Color(255, 204, 204));

                //---- label74 ----
                label74.setText("\u062f\u0627\u06a9\u06cc\u0648\u0645\u0646\u062a:");
                label74.setFont(new Font("B Zar", Font.PLAIN, 20));
                label74.setForeground(Color.black);

                //---- label65 ----
                label65.setText("\u0646\u0638\u0627\u0631\u062a:");
                label65.setFont(new Font("B Zar", Font.PLAIN, 20));
                label65.setForeground(Color.black);

                //---- label79 ----
                label79.setText("\u062a\u0627\u0631\u06cc\u062e \u0627\u0631\u0633\u0627\u0644 \u0627\u0633\u062a\u0639\u0644\u0627\u0645 :");
                label79.setHorizontalAlignment(SwingConstants.CENTER);
                label79.setFont(new Font("B Zar", Font.PLAIN, 20));
                label79.setBackground(Color.black);
                label79.setForeground(Color.black);

                //---- textField56 ----
                textField56.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                textField56.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label80 ----
                label80.setText("\u062a\u0627\u0631\u06cc\u062e \u062f\u0631\u06cc\u0627\u0641\u062a \u0627\u0633\u062a\u0639\u0644\u0627\u0645 :");
                label80.setHorizontalAlignment(SwingConstants.CENTER);
                label80.setFont(new Font("B Zar", Font.PLAIN, 20));
                label80.setBackground(Color.black);
                label80.setForeground(Color.black);

                //---- textField57 ----
                textField57.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                textField57.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label81 ----
                label81.setText("\u062a\u0627\u0631\u06cc\u062e \u062b\u0628\u062a \u0627\u0637\u0644\u0627\u0639\u0627\u062a :");
                label81.setHorizontalAlignment(SwingConstants.TRAILING);
                label81.setFont(new Font("B Zar", Font.PLAIN, 20));
                label81.setForeground(Color.black);
                label81.setBackground(Color.black);

                //---- textField58 ----
                textField58.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                textField58.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label82 ----
                label82.setText("\u0634\u0645\u0627\u0631\u0647 \u0646\u0627\u0645\u0647 :");
                label82.setFont(new Font("B Zar", Font.PLAIN, 20));
                label82.setForeground(Color.black);

                //---- textField59 ----
                textField59.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                textField59.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label83 ----
                label83.setText("\u0634\u0645\u0627\u0631\u0647 \u0641\u06cc\u0634 \u0628\u0627\u0646\u06a9\u06cc:");
                label83.setFont(new Font("B Zar", Font.PLAIN, 20));
                label83.setForeground(Color.black);

                //---- textField60 ----
                textField60.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                textField60.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label84 ----
                label84.setText("\u062a\u0627\u0631\u06cc\u062e \u0641\u06cc\u0634 \u0628\u0627\u0646\u06a9\u06cc:");
                label84.setFont(new Font("B Zar", Font.PLAIN, 20));
                label84.setForeground(Color.black);

                //---- textField61 ----
                textField61.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                textField61.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label28 ----
                label28.setText("\u0627\u0646\u062c\u0627\u0645 \u0634\u062f!!");
                label28.setBackground(new Color(255, 204, 204));
                label28.setForeground(Color.red);
                label28.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                label28.setVisible(false);

                //======== scrollPane3 ========
                {

                    //---- textArea3 ----
                    textArea3.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                    textArea3.setFont(new Font("Segoe UI", Font.PLAIN, 14));
                    scrollPane3.setViewportView(textArea3);
                }

                //---- label76 ----
                label76.setFont(new Font("B Zar", Font.PLAIN, 20));
                label76.setForeground(Color.black);

                //---- label77 ----
                label77.setText("\u0627\u062c\u0631\u0627:");
                label77.setFont(new Font("B Zar", Font.PLAIN, 20));
                label77.setForeground(Color.black);

                //---- textField51 ----
                textField51.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                textField51.setHorizontalAlignment(SwingConstants.CENTER);

                //======== scrollPane4 ========
                {

                    //---- textArea4 ----
                    textArea4.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                    textArea4.setFont(new Font("Segoe UI", Font.PLAIN, 14));
                    scrollPane4.setViewportView(textArea4);
                }

                //======== menuBar1 ========
                {

                    //======== menu1 ========
                    {
                        menu1.setText("\u0645\u062d\u0644 \u0646\u0638\u0627\u0631\u062a");
                        menu1.setFont(new Font("Segoe UI", Font.PLAIN, 15));

                        //---- checkBoxMenuItem6 ----
                        checkBoxMenuItem6.setText("\u0634\u06cc\u0631\u0627\u0632");
                        checkBoxMenuItem6.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                        menu1.add(checkBoxMenuItem6);

                        //---- checkBoxMenuItem4 ----
                        checkBoxMenuItem4.setText("\u0635\u062f\u0631\u0627");
                        checkBoxMenuItem4.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                        menu1.add(checkBoxMenuItem4);

                        //---- checkBoxMenuItem5 ----
                        checkBoxMenuItem5.setText("\u0628\u0646\u06cc\u0627\u062f \u0645\u0633\u06a9\u0646");
                        checkBoxMenuItem5.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                        menu1.add(checkBoxMenuItem5);

                        //---- checkBoxMenuItem7 ----
                        checkBoxMenuItem7.setText("\u0634\u0647\u0631\u0633\u062a\u0627\u0646");
                        checkBoxMenuItem7.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                        menu1.add(checkBoxMenuItem7);
                    }
                    menuBar1.add(menu1);
                }

                //---- label78 ----
                label78.setText("\u062f\u0627\u06a9\u06cc\u0648\u0645\u0646\u062a:");
                label78.setFont(new Font("B Zar", Font.PLAIN, 20));
                label78.setForeground(Color.black);

                GroupLayout panel4Layout = new GroupLayout(panel4);
                panel4.setLayout(panel4Layout);
                panel4Layout.setHorizontalGroup(
                    panel4Layout.createParallelGroup()
                        .addGroup(panel4Layout.createParallelGroup()
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(label76)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(panel4Layout.createSequentialGroup()
                            .addContainerGap(37, Short.MAX_VALUE)
                            .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(textField58, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                        .addComponent(textField61))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panel4Layout.createParallelGroup()
                                        .addGroup(panel4Layout.createSequentialGroup()
                                            .addGroup(panel4Layout.createParallelGroup()
                                                .addComponent(label84)
                                                .addComponent(label81))
                                            .addGap(153, 153, 153)
                                            .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(textField57, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(textField60, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(panel4Layout.createParallelGroup()
                                                .addComponent(label83)
                                                .addComponent(label80))
                                            .addGap(106, 106, 106)
                                            .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(textField59, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(textField56, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(panel4Layout.createParallelGroup()
                                                .addComponent(label79, GroupLayout.Alignment.TRAILING)
                                                .addGroup(GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                                                    .addComponent(label82)
                                                    .addGap(42, 42, 42))))
                                        .addGroup(GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                                            .addGap(41, 41, 41)
                                            .addComponent(label28)
                                            .addGap(541, 541, 541))))
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(scrollPane4, GroupLayout.PREFERRED_SIZE, 772, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(scrollPane3, GroupLayout.PREFERRED_SIZE, 772, GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(panel4Layout.createParallelGroup()
                                        .addComponent(label78)
                                        .addComponent(label74))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                    .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(panel4Layout.createSequentialGroup()
                                            .addComponent(textField51, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(label77))
                                        .addGroup(panel4Layout.createSequentialGroup()
                                            .addComponent(menuBar1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(label65)))
                                    .addGap(2, 2, 2)))
                            .addGap(42, 42, 42))
                );
                panel4Layout.setVerticalGroup(
                    panel4Layout.createParallelGroup()
                        .addGroup(panel4Layout.createParallelGroup()
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(label76)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(panel4Layout.createSequentialGroup()
                            .addGroup(panel4Layout.createParallelGroup()
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addGap(77, 77, 77)
                                    .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(menuBar1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label65)
                                        .addComponent(label74))
                                    .addGap(127, 127, 127)
                                    .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label77)
                                        .addComponent(textField51, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label78)))
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addGap(58, 58, 58)
                                    .addComponent(scrollPane3, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                    .addGap(82, 82, 82)
                                    .addComponent(scrollPane4, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)))
                            .addGap(111, 111, 111)
                            .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label79, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField56, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label80, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField57, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label81, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField58, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                            .addGap(60, 60, 60)
                            .addGroup(panel4Layout.createParallelGroup()
                                .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label83)
                                    .addComponent(label82, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField59, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField60, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label84)
                                    .addComponent(textField61, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                            .addComponent(label28)
                            .addContainerGap())
                );
            }
            tabbedPane1.addTab("\u0627\u0637\u0644\u0627\u0639\u0627\u062a \u067e\u0631\u0648\u0627\u0646\u0647 2", panel4);

            //======== panel5 ========
            {
                panel5.setBackground(new Color(255, 204, 204));

                //---- label75 ----
                label75.setText("\u0635\u0644\u0627\u062d\u06cc\u062a \u0646\u0638\u0627\u0631\u062a:");
                label75.setFont(new Font("B Zar", Font.PLAIN, 20));
                label75.setForeground(Color.black);

                //======== scrollPane14 ========
                {

                    //---- textArea10 ----
                    textArea10.setFont(new Font("Segoe UI", Font.PLAIN, 14));
                    textArea10.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                    scrollPane14.setViewportView(textArea10);
                }

                //---- label85 ----
                label85.setText("\u0635\u0644\u0627\u062d\u06cc\u062a \u0627\u062c\u0631\u0627:");
                label85.setFont(new Font("B Zar", Font.PLAIN, 20));
                label85.setForeground(Color.black);

                //---- label86 ----
                label86.setText("\u062f\u0627\u06a9\u06cc\u0648\u0645\u0646\u062a \u0639\u0636\u0648\u06cc\u062a:");
                label86.setFont(new Font("B Zar", Font.PLAIN, 20));
                label86.setForeground(Color.black);

                //======== scrollPane16 ========
                {

                    //---- textArea12 ----
                    textArea12.setFont(new Font("Segoe UI", Font.PLAIN, 14));
                    textArea12.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                    scrollPane16.setViewportView(textArea12);
                }

                //---- label87 ----
                label87.setText("\u06cc\u0627\u062f\u062f\u0627\u0634\u062a:");
                label87.setFont(new Font("B Zar", Font.PLAIN, 20));
                label87.setForeground(Color.black);

                //======== scrollPane17 ========
                {

                    //---- textArea13 ----
                    textArea13.setFont(new Font("Segoe UI", Font.PLAIN, 14));
                    textArea13.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                    scrollPane17.setViewportView(textArea13);
                }

                //---- button2 ----
                button2.setText("\u062b\u0628\u062a");
                button2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                button2.setBackground(Color.black);
                button2.setForeground(new Color(255, 153, 153));
                button2.addActionListener(e-> button2actionPerformed(e));

                //---- button3 ----
                button3.setText("\u0644\u063a\u0648");
                button3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                button3.setBackground(Color.black);
                button3.setForeground(new Color(255, 153, 153));
                button3.addActionListener(e-> button3actionPerformed(e));

                //======== scrollPane15 ========
                {

                    //---- textArea11 ----
                    textArea11.setFont(new Font("Segoe UI", Font.PLAIN, 14));
                    textArea11.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                    scrollPane15.setViewportView(textArea11);
                }

                GroupLayout panel5Layout = new GroupLayout(panel5);
                panel5.setLayout(panel5Layout);
                panel5Layout.setHorizontalGroup(
                    panel5Layout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addGroup(panel5Layout.createParallelGroup()
                                .addGroup(panel5Layout.createSequentialGroup()
                                    .addComponent(scrollPane17, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label87)
                                    .addGap(0, 719, Short.MAX_VALUE))
                                .addGroup(panel5Layout.createSequentialGroup()
                                    .addGroup(panel5Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(button3, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panel5Layout.createSequentialGroup()
                                            .addComponent(scrollPane15, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label85)))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                                    .addGroup(panel5Layout.createParallelGroup()
                                        .addGroup(GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                                            .addGroup(panel5Layout.createParallelGroup()
                                                .addGroup(panel5Layout.createSequentialGroup()
                                                    .addComponent(scrollPane14, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(label75))
                                                .addGroup(panel5Layout.createSequentialGroup()
                                                    .addComponent(scrollPane16, GroupLayout.PREFERRED_SIZE, 326, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(label86)))
                                            .addGap(42, 42, 42))
                                        .addGroup(GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
                                            .addGap(371, 371, 371))))))
                );
                panel5Layout.setVerticalGroup(
                    panel5Layout.createParallelGroup()
                        .addGroup(panel5Layout.createSequentialGroup()
                            .addGroup(panel5Layout.createParallelGroup()
                                .addGroup(panel5Layout.createSequentialGroup()
                                    .addGap(99, 99, 99)
                                    .addGroup(panel5Layout.createParallelGroup()
                                        .addComponent(scrollPane14, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(scrollPane15, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panel5Layout.createParallelGroup()
                                        .addComponent(label75, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label85, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                            .addGroup(panel5Layout.createParallelGroup()
                                .addComponent(label86, GroupLayout.Alignment.TRAILING)
                                .addComponent(label87, GroupLayout.Alignment.TRAILING)
                                .addComponent(scrollPane16, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                .addComponent(scrollPane17, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
                            .addGap(142, 142, 142)
                            .addGroup(panel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(button2)
                                .addComponent(button3))
                            .addGap(90, 90, 90))
                );
            }
            tabbedPane1.addTab("\u0627\u0637\u0644\u0627\u0639\u0627\u062a \u067e\u0631\u0648\u0627\u0646\u0647 3", panel5);

            //======== panel13 ========
            {
                panel13.setBackground(new Color(255, 204, 204));

                //======== scrollPane5 ========
                {

                    //---- table5 ----
                    table5.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                    table5.setBorder(new EtchedBorder(new Color(255, 153, 153), Color.black));
                    table5.setRowHeight(45);
                    table5.setRowMargin(4);
                    table5.setForeground(Color.black);
                    table5.setSelectionForeground(new Color(255, 153, 153));
                    table5.setGridColor(new Color(255, 204, 204));
                    table5.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                      table5.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                      if (e.getClickCount() == 1) {
                              JTable table5 = (JTable)e.getSource();
                              int row = table5.getSelectedRow();
                              int column =table5.getSelectedColumn();
                              Integer id= (Integer) table5.getValueAt(row, column);
                              showSahmiye(id);
                               
                              
      
    }
  }
});
                    scrollPane5.setViewportView(table5);
                }

                //---- button4 ----
                button4.setText("\u06af\u0632\u0627\u0631\u0634");
                button4.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                button4.setBackground(Color.black);
                button4.setForeground(new Color(255, 153, 153));
                button4.addActionListener(e-> actionPerformed4(e));

                GroupLayout panel13Layout = new GroupLayout(panel13);
                panel13.setLayout(panel13Layout);
                panel13Layout.setHorizontalGroup(
                    panel13Layout.createParallelGroup()
                        .addGroup(panel13Layout.createSequentialGroup()
                            .addContainerGap(54, Short.MAX_VALUE)
                            .addComponent(scrollPane5, GroupLayout.PREFERRED_SIZE, 1040, GroupLayout.PREFERRED_SIZE)
                            .addGap(85, 85, 85))
                        .addGroup(panel13Layout.createSequentialGroup()
                            .addGap(512, 512, 512)
                            .addComponent(button4, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(522, Short.MAX_VALUE))
                );
                panel13Layout.setVerticalGroup(
                    panel13Layout.createParallelGroup()
                        .addGroup(panel13Layout.createSequentialGroup()
                            .addGap(67, 67, 67)
                            .addComponent(scrollPane5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                            .addComponent(button4)
                            .addGap(43, 43, 43))
                );
            }
            tabbedPane1.addTab("\u0633\u0647\u0645\u06cc\u0647 ", panel13);

            //======== panel6 ========
            {
                panel6.setBackground(new Color(255, 204, 204));

                //======== scrollPane2 ========
                {

                    //---- table1 ----
                    table1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
                    table1.setBorder(new EtchedBorder(new Color(255, 153, 153), Color.black));
                    table1.setRowHeight(45);
                    table1.setRowMargin(4);
                    table1.setForeground(Color.black);
                    table1.setSelectionForeground(new Color(255, 153, 153));
                    table1.setGridColor(new Color(255, 204, 204));
                    table1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                     table1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                    table1.setBorder(new EtchedBorder(new Color(255, 153, 153), Color.black));
                    table1.setRowHeight(45);
                    table1.setRowMargin(4);
                    table1.setForeground(Color.black);
                    table1.setSelectionForeground(new Color(255, 153, 153));
                    table1.setGridColor(new Color(255, 204, 204));
                   table1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                     table1.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                      if (e.getClickCount() == 1) {
                              JTable table1 = (JTable)e.getSource();
                              int row = table1.getSelectedRow();
                              int column =table1.getSelectedColumn();
                              Integer id= (Integer) table1.getValueAt(row, column);
                              showFinance(id);
                               
                              
      
    }
  }
});
                    scrollPane2.setViewportView(table1);
                }

                //---- button7 ----
                button7.setText("ثبت سند");
                button7.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                button7.setBackground(Color.black);
                button7.setForeground(new Color(255, 153, 153));
                button7.addActionListener(e-> button7actionPerformed(e));

                //---- label30 ----
                label30.setText("\u0627\u0646\u062c\u0627\u0645 \u0634\u062f!!");
                label30.setForeground(Color.red);
                label30.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                label30.setVisible(false);

                //---- label32 ----
                label32.setText(" \u0628\u062f\u0647\u06a9\u0627\u0631\u06cc:");
                label32.setFont(new Font("B Zar", Font.PLAIN, 20));
                label32.setForeground(Color.black);

                //---- textField81 ----
                textField81.setHorizontalAlignment(SwingConstants.CENTER);
                textField81.setFont(new Font("Segoe UI", Font.PLAIN, 16));

                //---- label36 ----
                label36.setText("\u0631\u06cc\u0627\u0644");
                label36.setFont(new Font("B Nazanin", Font.PLAIN, 20));
                label36.setForeground(Color.black);

                //======== scrollPane12 ========
                {

                    //---- comboBox1 ----
                   comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                        "\u0639\u0636\u0648\u06cc\u062a \u0633\u0627\u0644\u06cc\u0627\u0646\u0647",
                        "\u062a\u0645\u062f\u06cc\u062f \u067e\u0631\u0648\u0627\u0646\u0647 \u0627\u0634\u062a\u063a\u0627\u0644",
                        "\u0635\u062f\u0648\u0631 \u067e\u0631\u0648\u0627\u0646\u0647 \u0627\u0634\u062a\u063a\u0627\u0644",
                        "\u062a\u063a\u06cc\u06cc\u0631 \u067e\u0627\u06cc\u0647 \u067e\u0631\u0648\u0627\u0646\u0647 \u0627\u0634\u062a\u063a\u0627\u0644",
                        "\u062d\u0642 \u0646\u0638\u0627\u0631\u062a",
                        "\u062d\u0642 \u0627\u062c\u0631\u0627",
                        "\u0622\u0645\u0648\u0632\u0634",
                        "\u0639\u062f\u0645 \u0639\u0636\u0648\u06cc\u062a",
                        "\u0644\u063a\u0648 \u0639\u0636\u0648\u06cc\u062a",
                        "\u06a9\u0627\u0631\u062a \u0639\u0636\u0648\u06cc\u062a",
                        "\u0639\u0636\u0648 \u062c\u062f\u06cc\u062f",
                        "\u0633\u0627\u06cc\u0631"
                    }));
                    comboBox1.setFont(new Font("B Zar", Font.PLAIN, 20));
                    scrollPane12.setViewportView(comboBox1);
                }

                //---- label33 ----
                label33.setText("\u0628\u0631\u062d\u0633\u0628:");
                label33.setFont(new Font("B Zar", Font.PLAIN, 20));
                label33.setForeground(Color.black);

                //---- button15 ----
                button15.setText("گزارش مالی");
                button15.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                button15.setBackground(Color.black);
                button15.setForeground(new Color(255, 153, 153));
                 button15.addActionListener(e-> button15actionPerformed(e));

                //---- button17 ----
                button17.setText("\u0628\u0647 \u0631\u0648\u0632 \u0631\u0633\u0627\u0646\u06cc");
                button17.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                button17.setBackground(Color.black);
                button17.setForeground(new Color(255, 153, 153));
                button17.addActionListener(e-> actionPerformed17(e));


                GroupLayout panel6Layout = new GroupLayout(panel6);
                panel6.setLayout(panel6Layout);
                panel6Layout.setHorizontalGroup(
                    panel6Layout.createParallelGroup()
                        .addGroup(panel6Layout.createSequentialGroup()
                            .addGroup(panel6Layout.createParallelGroup()
                                .addGroup(panel6Layout.createSequentialGroup()
                                    .addGap(92, 92, 92)
                                    .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 1018, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel6Layout.createSequentialGroup()
                                    .addGap(820, 820, 820)
                                    .addComponent(label30))
                                .addGroup(panel6Layout.createSequentialGroup()
                                    .addGroup(panel6Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(panel6Layout.createSequentialGroup()
                                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(label36)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(textField81, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(label32)
                                            .addGap(24, 24, 24))
                                        .addGroup(panel6Layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(button17, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                                            .addGap(34, 34, 34)
                                            .addComponent(button15, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                                            .addGap(32, 32, 32)
                                            .addComponent(button7, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)))
                                    .addGap(40, 40, 40)
                                    .addComponent(scrollPane12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(label33)
                                    .addGap(106, 106, 106)))
                            .addContainerGap(69, Short.MAX_VALUE))
                );
                panel6Layout.setVerticalGroup(
                    panel6Layout.createParallelGroup()
                        .addGroup(panel6Layout.createSequentialGroup()
                            .addGroup(panel6Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, panel6Layout.createSequentialGroup()
                                    .addContainerGap(379, Short.MAX_VALUE)
                                    .addGroup(panel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label32)
                                        .addComponent(textField81, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label36))
                                    .addGap(77, 77, 77)
                                    .addGroup(panel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(button7)
                                        .addComponent(button15)
                                        .addComponent(button17)))
                                .addGroup(panel6Layout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                                    .addGroup(panel6Layout.createParallelGroup()
                                        .addComponent(label33, GroupLayout.Alignment.TRAILING)
                                        .addComponent(scrollPane12, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                            .addGap(66, 66, 66)
                            .addComponent(label30)
                            .addGap(20, 20, 20))
                );
            }
            tabbedPane1.addTab(" \u0627\u0637\u0644\u0627\u0639\u0627\u062a \u0645\u0627\u0644\u06cc ", panel6);

            //======== panel10 ========
            {
                panel10.setBackground(new Color(255, 204, 204));

                //---- label127 ----
                label127.setText("\u0634\u0645\u0627\u0631\u0647 \u0628\u06cc\u0645\u0647 \u0646\u0627\u0645\u0647:");
                label127.setForeground(Color.black);
                label127.setFont(new Font("B Zar", Font.PLAIN, 20));

                //---- textField96 ----
                textField96.setHorizontalAlignment(SwingConstants.CENTER);
                textField96.setFont(new Font("Segoe UI", Font.PLAIN, 18));

                //---- label128 ----
                label128.setText("\u062a\u0627\u0631\u06cc\u062e \u0635\u062f\u0648\u0631:");
                label128.setForeground(Color.black);
                label128.setFont(new Font("B Zar", Font.PLAIN, 20));

                //---- textField99 ----
                textField99.setHorizontalAlignment(SwingConstants.CENTER);
                textField99.setFont(new Font("Segoe UI", Font.PLAIN, 18));

                //---- label129 ----
                label129.setText("\u062a\u0627\u0631\u06cc\u062e \u0627\u0646\u0642\u0636\u0627:");
                label129.setForeground(Color.black);
                label129.setFont(new Font("B Zar", Font.PLAIN, 20));

                //---- textField100 ----
                textField100.setHorizontalAlignment(SwingConstants.CENTER);
                textField100.setFont(new Font("Segoe UI", Font.PLAIN, 18));

                //---- label130 ----
                label130.setText("\u0645\u0628\u0644\u063a \u062e\u0627\u0644\u0635:");
                label130.setForeground(Color.black);
                label130.setFont(new Font("B Zar", Font.PLAIN, 20));

                //---- textField101 ----
                textField101.setHorizontalAlignment(SwingConstants.CENTER);
                textField101.setFont(new Font("Segoe UI", Font.PLAIN, 18));

                //---- label131 ----
                label131.setText("\u0645\u0628\u0644\u063a \u0646\u0627 \u062e\u0627\u0644\u0635:");
                label131.setForeground(Color.black);
                label131.setFont(new Font("B Zar", Font.PLAIN, 20));

                //---- textField102 ----
                textField102.setHorizontalAlignment(SwingConstants.CENTER);
                textField102.setFont(new Font("Segoe UI", Font.PLAIN, 18));

                //---- label132 ----
                label132.setText("\u0645\u062a\u0631\u0627\u0698 \u0645\u0635\u0631\u0641\u06cc:");
                label132.setForeground(Color.black);
                label132.setFont(new Font("B Zar", Font.PLAIN, 20));

                //---- textField103 ----
                textField103.setHorizontalAlignment(SwingConstants.CENTER);
                textField103.setFont(new Font("Segoe UI", Font.PLAIN, 18));

                //---- label133 ----
                label133.setText("\u0646\u0627\u0645 \u0634\u0631\u06a9\u062a:");
                label133.setForeground(Color.black);
                label133.setFont(new Font("B Zar", Font.PLAIN, 20));

                //---- textField104 ----
                textField104.setHorizontalAlignment(SwingConstants.CENTER);
                textField104.setFont(new Font("Segoe UI", Font.PLAIN, 18));

                //---- button14 ----
                button14.setText("\u062b\u0628\u062a");
                button14.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                button14.setBackground(Color.black);
                button14.setForeground(new Color(255, 153, 153));
                button14.addActionListener(e-> button14actionPerformed(e));

                //---- button16 ----
                button16.setText("\u0644\u063a\u0648");
                button16.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                button16.setBackground(Color.black);
                button16.setForeground(new Color(255, 153, 153));
                button16.addActionListener(e-> button16actionPerformed(e));

                GroupLayout panel10Layout = new GroupLayout(panel10);
                panel10.setLayout(panel10Layout);
                panel10Layout.setHorizontalGroup(
                    panel10Layout.createParallelGroup()
                        .addGroup(panel10Layout.createSequentialGroup()
                            .addGroup(panel10Layout.createParallelGroup()
                                .addGroup(panel10Layout.createSequentialGroup()
                                    .addContainerGap(187, Short.MAX_VALUE)
                                    .addGroup(panel10Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(panel10Layout.createSequentialGroup()
                                            .addComponent(textField100, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label129))
                                        .addGroup(panel10Layout.createSequentialGroup()
                                            .addComponent(textField103, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label132)))
                                    .addGap(103, 122, Short.MAX_VALUE))
                                .addGroup(GroupLayout.Alignment.TRAILING, panel10Layout.createSequentialGroup()
                                    .addContainerGap(350, Short.MAX_VALUE)
                                    .addComponent(button16, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)))
                            .addGroup(panel10Layout.createParallelGroup()
                                .addGroup(panel10Layout.createSequentialGroup()
                                    .addGroup(panel10Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(panel10Layout.createSequentialGroup()
                                            .addComponent(textField102, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label131))
                                        .addGroup(panel10Layout.createSequentialGroup()
                                            .addComponent(textField99)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label128)))
                                    .addGap(119, 119, 119)
                                    .addGroup(panel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(GroupLayout.Alignment.TRAILING, panel10Layout.createSequentialGroup()
                                            .addComponent(textField96)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label127))
                                        .addGroup(GroupLayout.Alignment.TRAILING, panel10Layout.createSequentialGroup()
                                            .addComponent(textField104)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label133))
                                        .addGroup(GroupLayout.Alignment.TRAILING, panel10Layout.createSequentialGroup()
                                            .addComponent(textField101, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label130))))
                                .addGroup(panel10Layout.createSequentialGroup()
                                    .addGap(140, 140, 140)
                                    .addComponent(button14, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)))
                            .addGap(104, 104, 104))
                );
                panel10Layout.setVerticalGroup(
                    panel10Layout.createParallelGroup()
                        .addGroup(panel10Layout.createSequentialGroup()
                            .addGap(84, 84, 84)
                            .addGroup(panel10Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label127)
                                .addComponent(label129)
                                .addComponent(label128)
                                .addComponent(textField96, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField99, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField100, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                            .addGap(94, 94, 94)
                            .addGroup(panel10Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label130)
                                .addComponent(label132)
                                .addComponent(label131)
                                .addComponent(textField101, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField102, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField103, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                            .addGap(94, 94, 94)
                            .addGroup(panel10Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label133)
                                .addComponent(textField104, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                            .addGroup(panel10Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(button14)
                                .addComponent(button16))
                            .addGap(96, 96, 96))
                );
            }
            tabbedPane1.addTab("\u0628\u06cc\u0645\u0647 ", panel10);

            //======== panel12 ========
            {
                panel12.setBackground(new Color(255, 204, 204));

                //======== scrollPane18 ========
                {

                    //---- table4 ----
                   table4.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                    table4.setBorder(new EtchedBorder(new Color(255, 153, 153), Color.black));
                    table4.setRowHeight(45);
                    table4.setRowMargin(4);
                    table4.setForeground(Color.black);
                    table4.setSelectionForeground(new Color(255, 153, 153));
                    table4.setGridColor(new Color(255, 204, 204));
                    table4.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                     table4.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                      if (e.getClickCount() == 1) {
                              JTable table4 = (JTable)e.getSource();
                              int row = table4.getSelectedRow();
                              int column =table4.getSelectedColumn();
                              Integer id= (Integer) table4.getValueAt(row, column);
                              showBime(id);
                               
                              
      
    }
  }
});
                    scrollPane18.setViewportView(table4);
                }

                GroupLayout panel12Layout = new GroupLayout(panel12);
                panel12.setLayout(panel12Layout);
                panel12Layout.setHorizontalGroup(
                    panel12Layout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, panel12Layout.createSequentialGroup()
                            .addContainerGap(41, Short.MAX_VALUE)
                            .addComponent(scrollPane18, GroupLayout.PREFERRED_SIZE, 1064, GroupLayout.PREFERRED_SIZE)
                            .addGap(74, 74, 74))
                );
                panel12Layout.setVerticalGroup(
                    panel12Layout.createParallelGroup()
                        .addGroup(panel12Layout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addComponent(scrollPane18, GroupLayout.PREFERRED_SIZE, 418, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(146, Short.MAX_VALUE))
                );
            }
            tabbedPane1.addTab("\u0633\u0648\u0627\u0628\u0642 \u0628\u06cc\u0645\u0647", panel12);

            //======== panel7 ========
            {
                panel7.setBackground(new Color(255, 204, 204));

                //---- label109 ----
                label109.setText("\u0646\u0627\u0645 \u062f\u0648\u0631\u0647 \u0622\u0645\u0648\u0632\u0634\u06cc:");
                label109.setForeground(Color.black);
                label109.setFont(new Font("B Zar", Font.PLAIN, 20));

                //---- textField83 ----
                textField83.setHorizontalAlignment(SwingConstants.CENTER);
                textField83.setFont(new Font("Segoe UI", Font.PLAIN, 16));

                //---- label112 ----
                label112.setText("\u062a\u0627\u0631\u06cc\u062e \u0634\u0631\u0648\u0639 \u062f\u0648\u0631\u0647:");
                label112.setForeground(Color.black);
                label112.setFont(new Font("B Zar", Font.PLAIN, 20));

                //---- textField84 ----
                textField84.setHorizontalAlignment(SwingConstants.CENTER);
                textField84.setFont(new Font("Segoe UI", Font.PLAIN, 16));

                //---- label113 ----
                label113.setText("\u062a\u0627\u0631\u06cc\u062e \u067e\u0627\u06cc\u0627\u0646 \u062f\u0648\u0631\u0647:");
                label113.setForeground(Color.black);
                label113.setFont(new Font("B Zar", Font.PLAIN, 20));

                //---- textField85 ----
                textField85.setHorizontalAlignment(SwingConstants.CENTER);
                textField85.setFont(new Font("Segoe UI", Font.PLAIN, 16));

                //---- label114 ----
                label114.setText("\u0637\u0648\u0644 \u062f\u0648\u0631\u0647 \u0622\u0645\u0648\u0632\u0634\u06cc:");
                label114.setForeground(Color.black);
                label114.setFont(new Font("B Zar", Font.PLAIN, 20));

                //---- textField86 ----
                textField86.setHorizontalAlignment(SwingConstants.CENTER);
                textField86.setFont(new Font("Segoe UI", Font.PLAIN, 16));

                //---- label115 ----
                label115.setText("\u0645\u062c\u0631\u06cc \u062f\u0648\u0631\u0647 \u0622\u0645\u0648\u0632\u0634\u06cc:");
                label115.setForeground(Color.black);
                label115.setFont(new Font("B Zar", Font.PLAIN, 20));

                //---- textField87 ----
                textField87.setHorizontalAlignment(SwingConstants.CENTER);
                textField87.setFont(new Font("Segoe UI", Font.PLAIN, 16));

                //---- label116 ----
                label116.setText("\u0645\u062f\u0631\u0633 \u062f\u0648\u0631\u0647:");
                label116.setForeground(Color.black);
                label116.setFont(new Font("B Zar", Font.PLAIN, 20));

                //---- textField88 ----
                textField88.setHorizontalAlignment(SwingConstants.CENTER);
                textField88.setFont(new Font("Segoe UI", Font.PLAIN, 16));

                //---- label117 ----
                label117.setText("\u0634\u0645\u0627\u0631\u0647 \u0645\u062c\u0648\u0632 \u0645\u062c\u0631\u06cc:");
                label117.setForeground(Color.black);
                label117.setFont(new Font("B Zar", Font.PLAIN, 20));

                //---- textField89 ----
                textField89.setHorizontalAlignment(SwingConstants.CENTER);
                textField89.setFont(new Font("Segoe UI", Font.PLAIN, 16));

                //---- label118 ----
                label118.setText("\u062a\u0627\u0631\u06cc\u062e \u0635\u062f\u0648\u0631 \u0645\u062c\u0648\u0632:");
                label118.setForeground(Color.black);
                label118.setFont(new Font("B Zar", Font.PLAIN, 20));

                //---- textField90 ----
                textField90.setHorizontalAlignment(SwingConstants.CENTER);
                textField90.setFont(new Font("Segoe UI", Font.PLAIN, 16));

                //---- label119 ----
                label119.setText("\u0633\u0627\u0632\u0645\u0627\u0646 :");
                label119.setForeground(Color.black);
                label119.setFont(new Font("B Zar", Font.PLAIN, 20));

                //---- textField91 ----
                textField91.setHorizontalAlignment(SwingConstants.CENTER);
                textField91.setFont(new Font("Segoe UI", Font.PLAIN, 16));

                //---- label122 ----
                label122.setText("\u062a\u0627\u0631\u06cc\u062e \u0622\u0632\u0645\u0648\u0646 \u067e\u0627\u06cc\u0627\u0646 \u062f\u0648\u0631\u0647:");
                label122.setForeground(Color.black);
                label122.setFont(new Font("B Zar", Font.PLAIN, 20));

                //---- textField92 ----
                textField92.setHorizontalAlignment(SwingConstants.CENTER);
                textField92.setFont(new Font("Segoe UI", Font.PLAIN, 16));

                //---- label123 ----
                label123.setText("\u067e\u0631\u0648\u0627\u0646\u0647 \u0627\u0634\u062a\u063a\u0627\u0644 \u0645\u062f\u0631\u0633 :");
                label123.setForeground(Color.black);
                label123.setFont(new Font("B Zar", Font.PLAIN, 20));

                //---- textField93 ----
                textField93.setHorizontalAlignment(SwingConstants.CENTER);
                textField93.setFont(new Font("Segoe UI", Font.PLAIN, 16));

                //---- label124 ----
                label124.setText("\u0634\u0645\u0627\u0631\u0647 \u062f\u0648\u0631\u0647:");
                label124.setForeground(Color.black);
                label124.setFont(new Font("B Zar", Font.PLAIN, 20));

                //---- textField94 ----
                textField94.setHorizontalAlignment(SwingConstants.CENTER);
                textField94.setFont(new Font("Segoe UI", Font.PLAIN, 16));

                //---- label34 ----
                label34.setText("\u0627\u0646\u062c\u0627\u0645 \u0634\u062f!!");
                label34.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                label34.setForeground(new Color(255, 51, 51));
                label34.setVisible(false);

                //---- button18 ----
                button18.setText("\u062b\u0628\u062a");
                button18.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                button18.setBackground(Color.black);
                button18.setForeground(new Color(255, 153, 153));
                button18.addActionListener(e-> button18actionPerformed(e));

                //---- button19 ----
                button19.setText("\u0644\u063a\u0648");
                button19.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                button19.setBackground(Color.black);
                button19.setForeground(new Color(255, 153, 153));
                button19.addActionListener(e-> button19actionPerformed(e));

                GroupLayout panel7Layout = new GroupLayout(panel7);
                panel7.setLayout(panel7Layout);
                panel7Layout.setHorizontalGroup(
                    panel7Layout.createParallelGroup()
                        .addGroup(panel7Layout.createSequentialGroup()
                            .addGroup(panel7Layout.createParallelGroup()
                                .addGroup(panel7Layout.createSequentialGroup()
                                    .addContainerGap(439, Short.MAX_VALUE)
                                    .addGroup(panel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(GroupLayout.Alignment.TRAILING, panel7Layout.createSequentialGroup()
                                            .addComponent(textField93)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label123))
                                        .addComponent(label34, GroupLayout.Alignment.TRAILING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, panel7Layout.createSequentialGroup()
                                            .addComponent(textField90, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label118)
                                            .addGap(12, 12, 12))
                                        .addGroup(panel7Layout.createSequentialGroup()
                                            .addGroup(panel7Layout.createParallelGroup()
                                                .addComponent(textField84, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(textField87, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(panel7Layout.createParallelGroup()
                                                .addComponent(label115)
                                                .addComponent(label112)))))
                                .addGroup(panel7Layout.createSequentialGroup()
                                    .addContainerGap(73, Short.MAX_VALUE)
                                    .addGroup(panel7Layout.createParallelGroup()
                                        .addGroup(panel7Layout.createSequentialGroup()
                                            .addComponent(textField85, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label113))
                                        .addGroup(panel7Layout.createSequentialGroup()
                                            .addGroup(panel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(textField91, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                                .addComponent(textField88, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                                .addComponent(textField94, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(panel7Layout.createParallelGroup()
                                                .addComponent(label119)
                                                .addComponent(label116)
                                                .addComponent(label124))))
                                    .addGap(0, 394, Short.MAX_VALUE)))
                            .addGap(106, 106, 106)
                            .addGroup(panel7Layout.createParallelGroup()
                                .addGroup(panel7Layout.createSequentialGroup()
                                    .addComponent(textField92, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label122))
                                .addGroup(panel7Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(panel7Layout.createSequentialGroup()
                                        .addComponent(textField83, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label109))
                                    .addGroup(GroupLayout.Alignment.LEADING, panel7Layout.createSequentialGroup()
                                        .addGroup(panel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(textField86, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                            .addComponent(textField89, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panel7Layout.createParallelGroup()
                                            .addComponent(label117)
                                            .addComponent(label114, GroupLayout.Alignment.TRAILING)))))
                            .addGap(61, 61, 61))
                        .addGroup(GroupLayout.Alignment.TRAILING, panel7Layout.createSequentialGroup()
                            .addGap(0, 323, Short.MAX_VALUE)
                            .addComponent(button19, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                            .addGap(189, 189, 189)
                            .addComponent(button18, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                            .addGap(379, 379, 379))
                );
                panel7Layout.setVerticalGroup(
                    panel7Layout.createParallelGroup()
                        .addGroup(panel7Layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addGroup(panel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label113)
                                .addComponent(textField85, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField84, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label112)
                                .addComponent(label109)
                                .addComponent(textField83, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                            .addGap(70, 70, 70)
                            .addGroup(panel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label115)
                                .addComponent(label116)
                                .addComponent(textField88, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField87, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label114)
                                .addComponent(textField86, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                            .addGap(70, 70, 70)
                            .addGroup(panel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label119)
                                .addComponent(textField91, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField90, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label118)
                                .addComponent(label117)
                                .addComponent(textField89, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                            .addGap(70, 70, 70)
                            .addGroup(panel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label123)
                                .addComponent(textField93, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label124)
                                .addComponent(textField94, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label122)
                                .addComponent(textField92, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                            .addGroup(panel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(button19)
                                .addComponent(button18))
                            .addGap(73, 73, 73)
                            .addComponent(label34))
                );
            }
            tabbedPane1.addTab("\u062b\u0628\u062a \u062f\u0648\u0631\u0647 \u0622\u0645\u0648\u0632\u0634\u06cc", panel7);

            //======== panel8 ========
            {
                panel8.setBackground(new Color(255, 204, 204));

                //======== scrollPane10 ========
                {

                    //---- table2 ----
                    table2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                    table2.setBorder(new EtchedBorder(new Color(255, 153, 153), Color.black));
                    table2.setRowHeight(45);
                    table2.setRowMargin(4);
                    table2.setForeground(Color.black);
                    table2.setSelectionForeground(new Color(255, 153, 153));
                    table2.setGridColor(new Color(255, 204, 204));
                    table2.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                     table2.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                      if (e.getClickCount() == 1) {
                              JTable table2= (JTable)e.getSource();
                              int row = table2.getSelectedRow();
                              int column =table2.getSelectedColumn();
                              Integer id= (Integer) table2.getValueAt(row, column);
                              showAmuzeshi(id);
                               
                              
      
    }
  }
});
                    scrollPane10.setViewportView(table2);
                }

                GroupLayout panel8Layout = new GroupLayout(panel8);
                panel8.setLayout(panel8Layout);
                panel8Layout.setHorizontalGroup(
                    panel8Layout.createParallelGroup()
                        .addGroup(panel8Layout.createSequentialGroup()
                            .addGap(73, 73, 73)
                            .addComponent(scrollPane10, GroupLayout.PREFERRED_SIZE, 1072, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(34, Short.MAX_VALUE))
                );
                panel8Layout.setVerticalGroup(
                    panel8Layout.createParallelGroup()
                        .addGroup(panel8Layout.createSequentialGroup()
                            .addGap(65, 65, 65)
                            .addComponent(scrollPane10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(135, Short.MAX_VALUE))
                );
            }
            tabbedPane1.addTab("\u0633\u0648\u0627\u0628\u0642 \u0622\u0645\u0648\u0632\u0634\u06cc", panel8);

            //======== panel9 ========
            {
                panel9.setBackground(new Color(255, 204, 204));

                //======== scrollPane11 ========
                {

                    //---- table3 ----
                   table3.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                    table3.setBorder(new EtchedBorder(new Color(255, 153, 153), Color.black));
                    table3.setRowHeight(45);
                    table3.setRowMargin(4);
                    table3.setForeground(Color.black);
                    table3.setSelectionForeground(new Color(255, 153, 153));
                    table3.setGridColor(new Color(255, 204, 204));
                    table3.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                    scrollPane11.setViewportView(table3);
                }

                //---- label125 ----
                label125.setText("\u062a\u0627\u0631\u06cc\u062e \u0628\u0631\u06af\u0632\u0627\u0631\u06cc \u0645\u062c\u0645\u0639:");
                label125.setForeground(Color.black);
                label125.setFont(new Font("B Zar", Font.PLAIN, 20));

                //---- textField95 ----
                textField95.setHorizontalAlignment(SwingConstants.CENTER);
                textField95.setFont(new Font("Segoe UI", Font.PLAIN, 18));

                //---- radioButton1 ----
                radioButton1.setText("\u0634\u0631\u06a9\u062a \u06a9\u0631\u062f\u0647 \u0627\u0633\u062a");
                radioButton1.setFont(new Font("B Nazanin", Font.PLAIN, 20));

                //---- radioButton2 ----
                radioButton2.setText("\u0634\u0631\u06a9\u062a \u0646\u06a9\u0631\u062f\u0647 \u0627\u0633\u062a");
                radioButton2.setFont(new Font("B Nazanin", Font.PLAIN, 20));

                //---- label35 ----
                label35.setText("\u0627\u0646\u062c\u0627\u0645 \u0634\u062f!!");
                label35.setFont(label35.getFont().deriveFont(label35.getFont().getSize() + 4f));
                label35.setForeground(new Color(255, 51, 51));
                label35.setVisible(false);

                //---- button20 ----
                button20.setText("\u062b\u0628\u062a");
                button20.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                button20.setBackground(Color.black);
                button20.setForeground(new Color(255, 153, 153));
                button20.addActionListener(e-> button20actionPerformed(e));

                //---- button21 ----
                button21.setText("\u0644\u063a\u0648");
                button21.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                button21.setBackground(Color.black);
                button21.setForeground(new Color(255, 153, 153));
                button21.addActionListener(e-> button21actionPerformed(e));

                GroupLayout panel9Layout = new GroupLayout(panel9);
                panel9.setLayout(panel9Layout);
                panel9Layout.setHorizontalGroup(
                    panel9Layout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, panel9Layout.createSequentialGroup()
                            .addContainerGap(203, Short.MAX_VALUE)
                            .addGroup(panel9Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, panel9Layout.createSequentialGroup()
                                    .addComponent(radioButton2)
                                    .addGap(58, 58, 58)
                                    .addComponent(radioButton1)
                                    .addGap(75, 75, 75))
                                .addGroup(GroupLayout.Alignment.TRAILING, panel9Layout.createSequentialGroup()
                                    .addComponent(button21, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                                    .addGap(133, 133, 133)))
                            .addGroup(panel9Layout.createParallelGroup()
                                .addGroup(panel9Layout.createSequentialGroup()
                                    .addComponent(textField95, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label125))
                                .addGroup(panel9Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(button20, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)))
                            .addGap(271, 271, 271))
                        .addGroup(panel9Layout.createSequentialGroup()
                            .addGroup(panel9Layout.createParallelGroup()
                                .addGroup(panel9Layout.createSequentialGroup()
                                    .addGap(576, 576, 576)
                                    .addComponent(label35))
                                .addGroup(panel9Layout.createSequentialGroup()
                                    .addGap(68, 68, 68)
                                    .addComponent(scrollPane11, GroupLayout.PREFERRED_SIZE, 1075, GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(36, Short.MAX_VALUE))
                );
                panel9Layout.setVerticalGroup(
                    panel9Layout.createParallelGroup()
                        .addGroup(panel9Layout.createSequentialGroup()
                            .addGap(55, 55, 55)
                            .addComponent(scrollPane11, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE)
                            .addGap(68, 68, 68)
                            .addGroup(panel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(radioButton2)
                                .addComponent(label125)
                                .addComponent(textField95, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(radioButton1))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                            .addGroup(panel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(button21)
                                .addComponent(button20))
                            .addGap(44, 44, 44)
                            .addComponent(label35)
                            .addGap(22, 22, 22))
                );
            }
            tabbedPane1.addTab("\u0645\u062c\u0645\u0639", panel9);

            //======== panel11 ========
            {
                panel11.setBackground(new Color(255, 204, 204));

                //======== scrollPane13 ========
                {

                    //---- textArea9 ----
                    textArea9.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                    textArea9.setBorder(new MatteBorder(1, 1, 1, 1, Color.black));
                    textArea9.setCaretColor(new Color(51, 51, 51));
                    textArea9.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                    textArea9.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
                    scrollPane13.setViewportView(textArea9);
                }

                //---- button13 ----
                button13.setText("\u062b\u0628\u062a");
                button13.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                button13.setBackground(Color.black);
                button13.setForeground(new Color(255, 153, 153));
                 button13.addActionListener(e-> actionPerformed13(e));

                //---- label38 ----
                label38.setText("\u0627\u0646\u062c\u0627\u0645 \u0634\u062f!!");
                label38.setFont(label38.getFont().deriveFont(label38.getFont().getSize() + 2f));
                label38.setForeground(new Color(255, 51, 51));
                label38.setVisible(false);

                GroupLayout panel11Layout = new GroupLayout(panel11);
                panel11.setLayout(panel11Layout);
                panel11Layout.setHorizontalGroup(
                    panel11Layout.createParallelGroup()
                        .addGroup(panel11Layout.createSequentialGroup()
                            .addGroup(panel11Layout.createParallelGroup()
                                .addGroup(panel11Layout.createSequentialGroup()
                                    .addGap(566, 566, 566)
                                    .addComponent(label38))
                                .addGroup(panel11Layout.createSequentialGroup()
                                    .addGap(508, 508, 508)
                                    .addComponent(button13, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel11Layout.createSequentialGroup()
                                    .addGap(93, 93, 93)
                                    .addComponent(scrollPane13, GroupLayout.PREFERRED_SIZE, 1011, GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(75, Short.MAX_VALUE))
                );
                panel11Layout.setVerticalGroup(
                    panel11Layout.createParallelGroup()
                        .addGroup(panel11Layout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addComponent(scrollPane13, GroupLayout.PREFERRED_SIZE, 365, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                            .addComponent(button13)
                            .addGap(31, 31, 31)
                            .addComponent(label38)
                            .addGap(38, 38, 38))
                );
            }
            tabbedPane1.addTab("\u0628\u06cc\u0648\u06af\u0631\u0627\u0641\u06cc", panel11);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tabbedPane1)
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(tabbedPane1, GroupLayout.Alignment.TRAILING)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - maryam koopaei
   
    

   
    public JTabbedPane tabbedPane1;
    public JPanel panel1;
    public JLabel label1;
    public JButton button1;
    public JLabel label31;
    public JButton button12;
    public JLabel label39;
    public JPanel panel2;
    public JLabel label2;
    public JTextField textField1;
    public JLabel label3;
    public JTextField textField2;
    public JLabel label1111;
    public JTextField textField3;
    public JLabel label4;
    public JTextField textField4;
    public JLabel label5;
    public JTextField textField5;
    public JLabel label9;
    public JTextField textField8;
    public JLabel label7;
    public JTextField textField6;
    public JLabel label12;
    public JTextField textField10;
    public JLabel label10;
    public JLabel label13;
    public JTextField textField11;
    public JLabel label14;
    public JTextField textField12;
    public JLabel label6;
    public JLabel label8;
    public JTextField textField7;
    public JLabel label22;
    public JLabel label11;
    public JTextField textField16;
    public JLabel label20;
    public JTextField textField17;
    public JLabel label17;
    public JLabel label18;
    public JTextField textField14;
    public JLabel label19;
    public JTextField textField15;
    public JTextField textField18;
    public JLabel label16;
    public JLabel label15;
    public JTextField textField19;
    public JTextField textField13;
    public JLabel label21;
    public JTextField textField20;
    public JLabel label23;
    public JLabel label24;
    public JTextField textField22;
    public JLabel label25;
    public JLabel label26;
    public JTextField textField24;
    public JLabel label27;
    public JTextField textField25;
    public JTextField textField26;
    public JScrollPane scrollPane1;
    public JTextArea textArea1;
    public JScrollPane scrollPane8;
    public JTextArea textArea2;
    public JScrollPane scrollPane9;
    public JTextArea textArea8;
    public JPanel panel3;
    public JLabel label50;
    public JTextField textField27;
    public JLabel label51;
    public JTextField textField28;
    public JLabel label52;
    public JTextField textField29;
    public JLabel label53;
    public JTextField textField30;
    public JLabel label55;
    public JTextField textField32;
    public JLabel label56;
    public JTextField textField33;
    public JLabel label57;
    public JTextField textField34;
    public JLabel label58;
    public JTextField textField35;
    public JLabel label59;
    public JTextField textField36;
    public JLabel label60;
    public JTextField textField37;
    public JLabel label61;
    public JTextField textField38;
    public JLabel label62;
    public JTextField textField39;
    public JLabel label63;
    public JTextField textField40;
    public JLabel label64;
    public JTextField textField41;
    public JLabel label66;
    public JTextField textField42;
    public JLabel label67;
    public JTextField textField43;
    public JLabel label68;
    public JTextField textField44;
    public JLabel label69;
    public JTextField textField45;
    public JLabel label70;
    public JTextField textField46;
    public JLabel label71;
    public JTextField textField48;
    public JLabel label72;
    public JTextField textField49;
    public JLabel label73;
    public JTextField textField50;
    public JLabel label54;
    public JTextField textField31;
    public JLabel label88;
    public JTextField textField47;
    public JPanel panel4;
    public JLabel label74;
    public JLabel label65;
    public JLabel label79;
    public JTextField textField56;
    public JLabel label80;
    public JTextField textField57;
    public JLabel label81;
    public JTextField textField58;
    public JLabel label82;
    public JTextField textField59;
    public JLabel label83;
    public JTextField textField60;
    public JLabel label84;
    public JTextField textField61;
    public JLabel label28;
    public JScrollPane scrollPane3;
    public JTextArea textArea3;
    public JLabel label76;
    public JLabel label77;
    public JTextField textField51;
    public JScrollPane scrollPane4;
    public JTextArea textArea4;
    public JMenuBar menuBar1;
    public JMenu menu1;
    public JCheckBoxMenuItem checkBoxMenuItem6;
    public JCheckBoxMenuItem checkBoxMenuItem4;
    public JCheckBoxMenuItem checkBoxMenuItem5;
    public JCheckBoxMenuItem checkBoxMenuItem7;
    public JLabel label78;
    public JPanel panel5;
    public JLabel label75;
    public JScrollPane scrollPane14;
    public JTextArea textArea10;
    public JLabel label85;
    public JLabel label86;
    public JScrollPane scrollPane16;
    public JTextArea textArea12;
    public JLabel label87;
    public JScrollPane scrollPane17;
    public JTextArea textArea13;
    public JButton button2;
    public JButton button3;
    public JScrollPane scrollPane15;
    public JTextArea textArea11;
    public JPanel panel13;
    public JScrollPane scrollPane5;
    public JTable table5;
    public JButton button4;
    public JPanel panel6;
    public JScrollPane scrollPane2;
    public JTable table1;
    public JButton button7;
    public JLabel label30;
    public JLabel label32;
    public JTextField textField81;
    public JLabel label36;
    public JScrollPane scrollPane12;
    public JComboBox<String> comboBox1;
    public JLabel label33;
    public JButton button15;
    public JButton button17;
    public JPanel panel10;
    public JLabel label127;
    public JTextField textField96;
    public JLabel label128;
    public JTextField textField99;
    public JLabel label129;
    public JTextField textField100;
    public JLabel label130;
    public JTextField textField101;
    public JLabel label131;
    public JTextField textField102;
    public JLabel label132;
    public JTextField textField103;
    public JLabel label133;
    public JTextField textField104;
    public JButton button14;
    public JButton button16;
    public JPanel panel12;
    public JScrollPane scrollPane18;
    public JTable table4;
    public JPanel panel7;
    public JLabel label109;
    public JTextField textField83;
    public JLabel label112;
    public JTextField textField84;
    public JLabel label113;
    public JTextField textField85;
    public JLabel label114;
    public JTextField textField86;
    public JLabel label115;
    public JTextField textField87;
    public JLabel label116;
    public JTextField textField88;
    public JLabel label117;
    public JTextField textField89;
    public JLabel label118;
    public JTextField textField90;
    public JLabel label119;
    public JTextField textField91;
    public JLabel label122;
    public JTextField textField92;
    public JLabel label123;
    public JTextField textField93;
    public JLabel label124;
    public JTextField textField94;
    public JLabel label34;
    public JButton button18;
    public JButton button19;
    public JPanel panel8;
    public JScrollPane scrollPane10;
    public JTable table2;
    public JPanel panel9;
    public JScrollPane scrollPane11;
    public JTable table3;
    public JLabel label125;
    public JTextField textField95;
    public JRadioButton radioButton1;
    public JRadioButton radioButton2;
    public JLabel label35;
    public JButton button20;
    public JButton button21;
    public JPanel panel11;
    public JScrollPane scrollPane13;
    public JTextArea textArea9;
    public JButton button13;
    public JLabel label38;
   
    
    
    private void button1actionPerformed(ActionEvent e) {
       String path=null;
       JFileChooser file = new JFileChooser();
       file.setCurrentDirectory(new File (System.getProperty("user.home")));
       FileNameExtensionFilter filter = new FileNameExtensionFilter("*.images", "jpg","gif","png");
       file.addChoosableFileFilter(filter);
       int result = file.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION){
            File selectedfile = file.getSelectedFile();
             path = selectedfile.getAbsolutePath();
           
             
        }
        
        ME.saveImage(path);
        
        
        
    }



  private void button2actionPerformed(ActionEvent e) {
       
        ME.editInfo();
        
    }

    private void button3actionPerformed(ActionEvent e) {
       this.setVisible(false);
    }

    private void button7actionPerformed(ActionEvent e) {
        String kind=null;
        kind=comboBox1.getSelectedItem().toString();
        if(kind.equals("عضویت سالیانه"))
        {
            ozviyat ot=new ozviyat(this.id);
            ot.setVisible(true);
        }
        else if(kind.equals("تمدید پروانه اشتغال"))
        {
            tamdidparvane tp=new tamdidparvane(this.id);
            tp.setVisible(true);
        }
          else if(kind.equals("کارت عضویت"))
        {
          kartozviyat kt=new kartozviyat(this.id);
            kt.setVisible(true);
        }
          else if(kind.equals("عضو جدید"))
        {
            ozvjadid oj=new ozvjadid(this.id);
            oj.setVisible(true);
        }
          
        else if(kind.equals("صدور پروانه اشتغال"))
        {
          sodurparvane sp=new sodurparvane(this.id);
          sp.setVisible(true);
        }
        else if(kind.equals("تغییر پایه پروانه اشتغال"))
        {
            taghirpaye tp=new taghirpaye(this.id);
            tp.setVisible(true);
        }
        else if(kind.equals("حق نظارت"))
        {
            haghnezarat hn=new haghnezarat(this.id);
            hn.setVisible(true);
        }
        else if(kind.equals("حق اجرا"))
        {
             haghejra he=new haghejra(this.id);
             he.setVisible(true);
        }
        else if(kind.equals("آموزش"))
        {
             amuzesh a=new amuzesh(this.id);
             a.setVisible(true);
        }
        else if(kind.equals("عدم عضویت"))
        {
             adamozviyat ao=new adamozviyat(this.id);
             ao.setVisible(true);
        }
         else if(kind.equals("لغو عضویت"))
        {
             laghvozviyat lo=new laghvozviyat(this.id);
             lo.setVisible(true);
        }
         else if(kind.equals("سایر"))
        {
            other th=new other(this.id);
              th.setVisible(true);
        }
    }

   

    private void button8actionPerformed(ActionEvent e) {
       this.setVisible(false);
    }

    private void actionPerformed12(ActionEvent e) {
        ME.removeImage();
    }

    private void actionPerformed13(ActionEvent e) {
        ME.saveBio();
    }

    private void button15actionPerformed(ActionEvent e) {//gozaresh bedehkari
        printFinance pf=new printFinance(table1,this.id,tempFinance);
        pf.generatePdf();
    }

    private void button14actionPerformed(ActionEvent e) {//sabt bime
       ME.saveBime();
    }

    private void button16actionPerformed(ActionEvent e) {//virayesh bime
      this.setVisible(false);
    }

    private void actionPerformed17(ActionEvent e) {
        
           Finance f=null;
         java.util.List finance=ME.listFinance();
         ArrayList<Finance> temp1=new ArrayList<>();
         DefaultTableModel tablemodel = new DefaultTableModel(columnName, 0);
         int idmain;
             for (int j=0;j<finance.size();j++)
         {
            f=(Finance) finance.get(j);
            idmain=(Integer) f.getIdMain();
             if (idmain==this.id)
             {
                  
                   temp1.add(f);
             }
           
                
         }
          int totalB=0;
        totalB=calculateTotalBedehkari(tempFinance);
        int totalP=0;
        totalP=calculateTotalPay(tempFinance);
        
        int totalLeft=0;totalLeft=totalB - totalP;
        String left=String.valueOf(totalLeft);
        textField81.setText(left);
         Object[] row = new Object[8];
         
         table1.setModel(tablemodel);
        for (int i = 0; i < temp1.size(); i++)
        {
            f =temp1.get(i);
           
            row[0] =i+1;
            row[1] = f.getId();
            row[2] = f.getRegisterdate();
            row[3] = f.getPardakhtdate();
            row[4]=f.getBedehkarikind();
            row[5]=f.getBedehkariamount();
            row[6]=f.getPay();
            row[7]=calculate(temp1,i);
            
            
            tablemodel.addRow(row);

        }

         
          DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment((int) JTable.CENTER_ALIGNMENT);
        for (int i=0; i<table1.getColumnCount();i++){
            table1.setDefaultRenderer(table1.getColumnClass(i),renderer);
       }
        table1.updateUI();
          

       
       
           
         
    }
    public int calculate(ArrayList<Finance> temp,int counter)
    {
        int bedehkari=0;
        int bestankari=0;
        Finance f;
        for(int i=0 ;i<= counter; i++)
        {
            f=temp.get(i);
            bedehkari+=f.getBedehkariamount();
            bestankari+=f.getPay();
        }
        int left=bedehkari - bestankari;
        return left;
    }

    private void actionPerformed4(ActionEvent e) {
       printSahmiye ps=new printSahmiye(table5);
       ps.generatePdf();
    }

    private void button18actionPerformed(ActionEvent e) {
        ME.saveAmuzesh();
    }

    private void button19actionPerformed(ActionEvent e) {
         this.setVisible(false);
    }

    private void button20actionPerformed(ActionEvent e) {
        ME.saveMajma();
    }

    private void button21actionPerformed(ActionEvent e) {
        this.setVisible(false);
    }
    
}
