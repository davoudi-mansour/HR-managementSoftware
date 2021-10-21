import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import nezam.Finance;
/*
 * Created by JFormDesigner on Sun Aug 20 22:34:42 PDT 2017
 */



/**
 * @author mansour davoudi
 */
public class tajrobiform extends JFrame {
     manageEng MG;
      Integer id;
      ArrayList<Finance> temp1;
      ArrayList<Finance> tempFinance;
       public String columnName[]={"ردیف","شناسه","تاریخ ثبت","تاریخ پرداخت","نوع سند","بدهکاری","پرداختی","مانده"};

    
    public tajrobiform(manageEng MG,Integer id) {
        this.MG=MG;
        this.id=id;
        
        initComponents();
        
    }

   
   public void showFinance(Integer id)
    {
        MG.showFinance(id);
    }
    
     public void fillTable()
    {
        int i;
        
         Finance f=null;
         java.util.List finance=MG.listFinance();
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
         int totalB=0;
        totalB=calculateTotalBedehkari(tempFinance);
        int totalP=0;
        totalP=calculateTotalPay(tempFinance);
        int totalLeft=0;totalLeft=totalB - totalP;
        String left=String.valueOf(totalLeft);
        textField81.setText(left);
        
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
     
   private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mary
        tabbedPane1 = new JTabbedPane();
        panel1 = new JPanel();
        label2 = new JLabel();
        textField71 = new JTextField();
        label3 = new JLabel();
        textField72 = new JTextField();
        label4 = new JLabel();
        textField73 = new JTextField();
        label5 = new JLabel();
        textField74 = new JTextField();
        label7 = new JLabel();
        textField75 = new JTextField();
        label9 = new JLabel();
        textField76 = new JTextField();
        label13 = new JLabel();
        textField77 = new JTextField();
        label14 = new JLabel();
        textField78 = new JTextField();
        label12 = new JLabel();
        textField79 = new JTextField();
        label1 = new JLabel();
        textField80 = new JTextField();
        label35 = new JLabel();
        textField81 = new JTextField();
        label8 = new JLabel();
        textField82 = new JTextField();
        label37 = new JLabel();
        textField83 = new JTextField();
        textField84 = new JTextField();
        label15 = new JLabel();
        label16 = new JLabel();
        textField85 = new JTextField();
        label6 = new JLabel();
        textField86 = new JTextField();
        button2 = new JButton();
        button3 = new JButton();
        label10 = new JLabel();
        label11 = new JLabel();
        scrollPane8 = new JScrollPane();
        textArea2 = new JTextArea();
        panel6 = new JPanel();
        scrollPane2 = new JScrollPane();
        table1 = new JTable();
        button7 = new JButton();
        label30 = new JLabel();
        label32 = new JLabel();
        textField87 = new JTextField();
        label36 = new JLabel();
        scrollPane12 = new JScrollPane();
        comboBox1 = new JComboBox<>();
        label33 = new JLabel();
        button15 = new JButton();
        button8 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //======== tabbedPane1 ========
        {
            tabbedPane1.setFont(new Font("Segoe UI", Font.PLAIN, 14));

            //======== panel1 ========
            {
                panel1.setBackground(new Color(255, 204, 204));

              

                //---- label2 ----
                label2.setText("\u0646\u0627\u0645 :");
                label2.setFont(new Font("B Zar", Font.PLAIN, 20));
                label2.setHorizontalAlignment(SwingConstants.CENTER);
                label2.setForeground(Color.black);

                //---- textField71 ----
                textField71.setHorizontalAlignment(SwingConstants.CENTER);
                textField71.setFont(new Font("Segoe UI", Font.PLAIN, 16));

                //---- label3 ----
                label3.setText("\u0646\u0627\u0645 \u062e\u0627\u0646\u0648\u0627\u062f\u06af\u06cc :");
                label3.setHorizontalAlignment(SwingConstants.CENTER);
                label3.setFont(new Font("B Zar", Font.PLAIN, 20));
                label3.setForeground(Color.black);

                //---- textField72 ----
                textField72.setHorizontalAlignment(SwingConstants.CENTER);
                textField72.setFont(new Font("Segoe UI", Font.PLAIN, 16));

                //---- label4 ----
                label4.setText("\u0646\u0627\u0645 \u067e\u062f\u0631 :");
                label4.setHorizontalAlignment(SwingConstants.CENTER);
                label4.setFont(new Font("B Zar", Font.PLAIN, 20));
                label4.setForeground(Color.black);

                //---- textField73 ----
                textField73.setHorizontalAlignment(SwingConstants.CENTER);
                textField73.setFont(new Font("Segoe UI", Font.PLAIN, 16));

                //---- label5 ----
                label5.setText("\u0634\u0645\u0627\u0631\u0647 \u0634\u0646\u0627\u0633\u0646\u0627\u0645\u0647 :");
                label5.setHorizontalAlignment(SwingConstants.CENTER);
                label5.setFont(new Font("B Zar", Font.PLAIN, 20));
                label5.setForeground(Color.black);

                //---- textField74 ----
                textField74.setHorizontalAlignment(SwingConstants.CENTER);
                textField74.setFont(new Font("Segoe UI", Font.PLAIN, 16));

                //---- label7 ----
                label7.setText("\u06a9\u062f \u0645\u0644\u06cc :");
                label7.setHorizontalAlignment(SwingConstants.CENTER);
                label7.setFont(new Font("B Zar", Font.PLAIN, 20));
                label7.setForeground(Color.black);

                //---- textField75 ----
                textField75.setHorizontalAlignment(SwingConstants.CENTER);
                textField75.setFont(new Font("Segoe UI", Font.PLAIN, 16));

                //---- label9 ----
                label9.setText("\u0633\u0627\u0644 \u062a\u0648\u0644\u062f :");
                label9.setHorizontalAlignment(SwingConstants.CENTER);
                label9.setFont(new Font("B Zar", Font.PLAIN, 20));
                label9.setForeground(Color.black);

                //---- textField76 ----
                textField76.setHorizontalAlignment(SwingConstants.CENTER);
                textField76.setFont(new Font("Segoe UI", Font.PLAIN, 16));

                //---- label13 ----
                label13.setText("\u0634\u0645\u0627\u0631\u0647 \u0647\u0645\u0631\u0627\u0647 :");
                label13.setHorizontalAlignment(SwingConstants.CENTER);
                label13.setFont(new Font("B Zar", Font.PLAIN, 20));
                label13.setForeground(Color.black);

                //---- textField77 ----
                textField77.setHorizontalAlignment(SwingConstants.CENTER);
                textField77.setFont(new Font("Segoe UI", Font.PLAIN, 16));

                //---- label14 ----
                label14.setText("\u0634\u0645\u0627\u0631\u0647 \u062b\u0627\u0628\u062a :");
                label14.setHorizontalAlignment(SwingConstants.CENTER);
                label14.setFont(new Font("B Zar", Font.PLAIN, 20));
                label14.setForeground(Color.black);

                //---- textField78 ----
                textField78.setHorizontalAlignment(SwingConstants.CENTER);
                textField78.setFont(new Font("Segoe UI", Font.PLAIN, 16));

                //---- label12 ----
                label12.setText("\u06a9\u062f \u067e\u0633\u062a\u06cc :");
                label12.setHorizontalAlignment(SwingConstants.CENTER);
                label12.setFont(new Font("B Zar", Font.PLAIN, 20));
                label12.setForeground(Color.black);

                //---- textField79 ----
                textField79.setHorizontalAlignment(SwingConstants.CENTER);
                textField79.setFont(new Font("Segoe UI", Font.PLAIN, 16));

                //---- label1 ----
                label1.setText("\u0634\u0645\u0627\u0631\u0647 \u067e\u0631\u0648\u0627\u0646\u0647 :");
                label1.setFont(new Font("B Zar", Font.PLAIN, 20));
                label1.setForeground(Color.black);

                //---- textField80 ----
                textField80.setHorizontalAlignment(SwingConstants.CENTER);
                textField80.setFont(new Font("Segoe UI", Font.PLAIN, 16));

                //---- label35 ----
                label35.setText("\u062a\u0627\u0631\u06cc\u062e \u0635\u062f\u0648\u0631 \u067e\u0631\u0648\u0627\u0646\u0647 :");
                label35.setFont(new Font("B Zar", Font.PLAIN, 20));
                label35.setForeground(Color.black);

                //---- textField81 ----
                textField81.setHorizontalAlignment(SwingConstants.CENTER);
                textField81.setFont(new Font("Segoe UI", Font.PLAIN, 14));

                //---- label8 ----
                label8.setText("\u062a\u0627\u0631\u06cc\u062e \u067e\u0627\u06cc\u0627\u0646 \u0627\u0639\u062a\u0628\u0627\u0631 \u067e\u0631\u0648\u0627\u0646\u0647:");
                label8.setForeground(Color.black);
                label8.setFont(new Font("B Zar", Font.PLAIN, 20));

                //---- textField82 ----
                textField82.setHorizontalAlignment(SwingConstants.CENTER);
                textField82.setFont(new Font("Segoe UI", Font.PLAIN, 14));

                //---- label37 ----
                label37.setText("\u06a9\u062f \u0628\u0627\u06cc\u06af\u0627\u0646\u06cc :");
                label37.setFont(new Font("B Zar", Font.PLAIN, 20));
                label37.setForeground(Color.black);

                //---- textField83 ----
                textField83.setHorizontalAlignment(SwingConstants.CENTER);
                textField83.setFont(new Font("Segoe UI", Font.PLAIN, 16));

                //---- textField84 ----
                textField84.setHorizontalAlignment(SwingConstants.CENTER);
                textField84.setFont(new Font("Segoe UI", Font.PLAIN, 16));

                //---- label15 ----
                label15.setText("\u0646\u0627\u0645\u0647 \u0627\u062c\u0631\u0627:");
                label15.setFont(new Font("B Zar", Font.PLAIN, 20));
                label15.setForeground(Color.black);

                //---- label16 ----
                label16.setText("\u062a\u0627\u0631\u06cc\u062e \u0646\u0627\u0645\u0647 \u0627\u062c\u0631\u0627:");
                label16.setFont(new Font("B Zar", Font.PLAIN, 20));
                label16.setForeground(Color.black);

                //---- textField85 ----
                textField85.setHorizontalAlignment(SwingConstants.CENTER);
                textField85.setFont(new Font("Segoe UI", Font.PLAIN, 16));

                //---- label6 ----
                label6.setText("\u067e\u0627\u06cc\u0647:");
                label6.setForeground(Color.black);
                label6.setFont(new Font("B Zar", Font.PLAIN, 20));
                label6.setHorizontalAlignment(SwingConstants.RIGHT);

                //---- textField86 ----
                textField86.setHorizontalAlignment(SwingConstants.CENTER);
                textField86.setFont(new Font("Segoe UI", Font.PLAIN, 16));

                //---- button2 ----
                button2.setText("\u0648\u06cc\u0631\u0627\u06cc\u0634 \u0627\u0637\u0644\u0627\u0639\u0627\u062a");
                button2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                button2.setBackground(Color.black);
                button2.setForeground(new Color(255, 153, 153));
                button2.addActionListener(e->  actionPerformed2(e) );
                

                //---- button3 ----
                button3.setText("\u0644\u063a\u0648");
                button3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                button3.setBackground(Color.black);
                button3.setForeground(new Color(255, 153, 153));
                 button3.addActionListener(e->  actionPerformed3(e) );

                //---- label10 ----
                label10.setText("\u0627\u0646\u062c\u0627\u0645 \u0634\u062f!!");
                label10.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                label10.setForeground(new Color(255, 51, 51));
                label10.setVisible(false);

                //---- label11 ----
                label11.setText("\u0622\u062f\u0631\u0633:");
                label11.setForeground(Color.black);
                label11.setFont(new Font("B Zar", Font.PLAIN, 20));
                label11.setHorizontalAlignment(SwingConstants.RIGHT);

                //======== scrollPane8 ========
                {

                    //---- textArea2 ----
                    textArea2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
                    textArea2.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                    scrollPane8.setViewportView(textArea2);
                }

                GroupLayout panel1Layout = new GroupLayout(panel1);
                panel1.setLayout(panel1Layout);
                panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addContainerGap(126, Short.MAX_VALUE)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                    .addComponent(label10)
                                    .addGap(753, 753, 753))
                                .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addGroup(panel1Layout.createParallelGroup()
                                                .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGroup(panel1Layout.createParallelGroup()
                                                        .addGroup(panel1Layout.createSequentialGroup()
                                                            .addComponent(textField82)
                                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(label8))
                                                        .addGroup(panel1Layout.createSequentialGroup()
                                                            .addComponent(textField85, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(label16)
                                                            .addGap(0, 0, Short.MAX_VALUE)))
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(panel1Layout.createParallelGroup()
                                                        .addGroup(panel1Layout.createSequentialGroup()
                                                            .addComponent(textField84, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(label15))
                                                        .addGroup(panel1Layout.createSequentialGroup()
                                                            .addComponent(textField81, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(label35)))
                                                    .addGap(18, 18, 18)
                                                    .addComponent(textField80, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(label1))
                                                .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                    .addComponent(textField83, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(label37)))
                                            .addGap(18, 18, 18)
                                            .addGroup(panel1Layout.createParallelGroup()
                                                .addGroup(panel1Layout.createSequentialGroup()
                                                    .addComponent(textField79, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(label12))
                                                .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGap(45, 45, 45)
                                                    .addComponent(textField86, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(panel1Layout.createSequentialGroup()
                                                            .addComponent(textField74, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(label5))
                                                        .addGroup(panel1Layout.createSequentialGroup()
                                                            .addComponent(textField78)
                                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(label14)))
                                                    .addGap(26, 26, 26)
                                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addGroup(panel1Layout.createSequentialGroup()
                                                            .addComponent(textField73, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(label4))
                                                        .addGroup(panel1Layout.createSequentialGroup()
                                                            .addComponent(textField77, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(label13)))
                                                    .addGap(38, 38, 38)
                                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addGroup(panel1Layout.createSequentialGroup()
                                                            .addComponent(textField72, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(label3)
                                                            .addGap(24, 24, 24)
                                                            .addComponent(textField71, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(label2))
                                                        .addGroup(panel1Layout.createSequentialGroup()
                                                            .addComponent(textField76, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(label9)
                                                            .addGap(61, 61, 61)
                                                            .addComponent(textField75, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(label7))))
                                                .addGroup(panel1Layout.createSequentialGroup()
                                                    .addComponent(scrollPane8, GroupLayout.PREFERRED_SIZE, 935, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(panel1Layout.createParallelGroup()
                                                        .addComponent(label6)
                                                        .addComponent(label11))))))
                                    .addGap(86, 86, 86))))
                        .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                            .addGap(308, 308, 308)
                            .addComponent(button3, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                            .addGap(248, 248, 248)
                            .addComponent(button2)
                            .addContainerGap(379, Short.MAX_VALUE))
                );
                panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField72, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField71, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField73, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField74, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                            .addGap(71, 71, 71)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label7, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label9, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label13, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label14, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField76, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField75, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField77, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField78, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                            .addGap(71, 71, 71)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label12, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label35, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label8)
                                .addComponent(textField80, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField79, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField81, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField82, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                            .addGap(71, 71, 71)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label16)
                                .addComponent(label15)
                                .addComponent(label6)
                                .addComponent(textField84, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField85, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField86, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label37, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField83, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createParallelGroup()
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(52, 52, 52)
                                    .addComponent(label11))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(37, 37, 37)
                                    .addComponent(scrollPane8, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                                    .addGap(48, 48, 48)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(button3)
                                        .addComponent(button2))))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                            .addComponent(label10)
                            .addContainerGap())
                );
            }
            tabbedPane1.addTab("\u0627\u0637\u0644\u0627\u0639\u0627\u062a \u0634\u062e\u0635\u06cc", panel1);

            //======== panel6 ========
            {
                panel6.setBackground(new Color(255, 204, 204));

                //======== scrollPane2 ========
                {

                    //---- table1 ----
                    table1.setFont(new Font("Segoe UI", Font.PLAIN,15));
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
                button7.setText("\u062b\u0628\u062a \u0628\u062f\u0647\u06a9\u0627\u0631\u06cc");
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

                //---- textField87 ----
                textField87.setHorizontalAlignment(SwingConstants.CENTER);
                textField87.setFont(new Font("Segoe UI", Font.PLAIN, 16));

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
                        "\u0639\u0636\u0648 \u062c\u062f\u06cc\u062f"
                    }));
                    comboBox1.setFont(new Font("B Zar", Font.PLAIN, 20));
                    scrollPane12.setViewportView(comboBox1);
                }

                //---- label33 ----
                label33.setText("\u0628\u0631\u062d\u0633\u0628:");
                label33.setFont(new Font("B Zar", Font.PLAIN, 20));
                label33.setForeground(Color.black);

                //---- button15 ----
                button15.setText("\u06af\u0632\u0627\u0631\u0634 \u0628\u062f\u0647\u06a9\u0627\u0631\u06cc");
                button15.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                button15.setBackground(Color.black);
                button15.setForeground(new Color(255, 153, 153));
                  button15.addActionListener(e-> actionPerformed15(e));

                //---- button8 ----
                button8.setText("\u0628\u0647 \u0631\u0648\u0632 \u0631\u0633\u0627\u0646\u06cc");
                button8.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                button8.setBackground(Color.black);
                button8.setForeground(new Color(255, 153, 153));
                button8.addActionListener(e->actionPerformed8(e));

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
                                .addGroup(panel6Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(panel6Layout.createSequentialGroup()
                                        .addContainerGap(479, Short.MAX_VALUE)
                                        .addComponent(label36)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textField87, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(label32)
                                        .addGap(369, 369, 369))
                                    .addGroup(panel6Layout.createSequentialGroup()
                                        .addGap(0, 261, Short.MAX_VALUE)
                                        .addComponent(button8, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(button15, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(button7, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                                        .addGap(61, 61, 61)
                                        .addComponent(scrollPane12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(label33)
                                        .addGap(74, 74, 74))))
                            .addContainerGap(89, Short.MAX_VALUE))
                );
                panel6Layout.setVerticalGroup(
                    panel6Layout.createParallelGroup()
                        .addGroup(panel6Layout.createSequentialGroup()
                            .addGroup(panel6Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, panel6Layout.createSequentialGroup()
                                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(panel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(button8)
                                        .addComponent(button15)
                                        .addComponent(button7)))
                                .addGroup(panel6Layout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel6Layout.createParallelGroup()
                                        .addGroup(panel6Layout.createSequentialGroup()
                                            .addGap(40, 40, 40)
                                            .addGroup(panel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(label32)
                                                .addComponent(textField87, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label36))
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                            .addComponent(scrollPane12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel6Layout.createSequentialGroup()
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                                            .addComponent(label33)))))
                            .addGap(81, 81, 81)
                            .addComponent(label30)
                            .addGap(20, 20, 20))
                );
            }
            tabbedPane1.addTab(" \u0627\u0637\u0644\u0627\u0639\u0627\u062a \u0645\u0627\u0644\u06cc ", panel6);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(tabbedPane1)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(tabbedPane1, GroupLayout.Alignment.TRAILING)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    
     public JTabbedPane tabbedPane1;
    public JPanel panel1;
    public JLabel label2;
    public JTextField textField71;
    public JLabel label3;
    public JTextField textField72;
    public JLabel label4;
    public JTextField textField73;
    public JLabel label5;
    public JTextField textField74;
    public JLabel label7;
    public JTextField textField75;
    public JLabel label9;
    public JTextField textField76;
    public JLabel label13;
    public JTextField textField77;
    public JLabel label14;
    public JTextField textField78;
    public JLabel label12;
    public JTextField textField79;
    public JLabel label1;
    public JTextField textField80;
    public JLabel label35;
    public JTextField textField81;
    public JLabel label8;
    public JTextField textField82;
    public JLabel label37;
    public JTextField textField83;
    public JTextField textField84;
    public JLabel label15;
    public JLabel label16;
    public JTextField textField85;
    public JLabel label6;
    public JTextField textField86;
    public JButton button2;
    public JButton button3;
    public JLabel label10;
    public JTextField textField88;
    public JLabel label11;
    public JPanel panel6;
    public JScrollPane scrollPane2;
    public JTable table1;
    public JButton button7;
    public JLabel label30;
    public JLabel label32;
    public JTextField textField87;
    public JLabel label36;
    public JScrollPane scrollPane12;
    public JComboBox<String> comboBox1;
    public JLabel label33;
    public JButton button15;
    private JScrollPane scrollPane8;
    public JTextArea textArea2;
    public JButton button8;
    
    
    public void button7actionPerformed(ActionEvent e) {
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
             haghejra hj=new haghejra(this.id);
             hj.setVisible(true);
             //
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
         else if(kind.equals("عضو جدید"))
        {
           ozvjadid oj=new ozvjadid(this.id);
             oj.setVisible(true);
        }
          else if(kind.equals("کارت عضویت"))
        {
           kartozviyat ko=new kartozviyat(this.id);
             ko.setVisible(true);
        }
        
    }

    private void actionPerformed2(ActionEvent e) {
        MG.editTajrobi();
    }
     private void actionPerformed3(ActionEvent e) {
        this.setVisible(false);
    }

    private void actionPerformed15(ActionEvent e) {
       printFinance pf=new printFinance(table1,this.id,tempFinance);
        pf.generatePdf();
    }

    private void actionPerformed8(ActionEvent e) {
        {
        
           Finance f=null;
         java.util.List finance=MG.listFinance();
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
//        int total=0;
//        for(int j=0;j<temp1.size();j++)
//        {
//            f=temp1.get(j);
//            total+=f.getBedehkariamount();
//        }
//        String Toatal=String.valueOf(total);
//        textField81.setText(Toatal);

         int totalB=0;
        totalB=calculateTotalBedehkari(tempFinance);
        int totalP=0;
        totalP=calculateTotalPay(tempFinance);
        
        int totalLeft=0;totalLeft=totalB - totalP;
        String left=String.valueOf(totalLeft);
        textField81.setText(left);
          DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment((int) JTable.CENTER_ALIGNMENT);
        for (int i=0; i<table1.getColumnCount();i++){
            table1.setDefaultRenderer(table1.getColumnClass(i),renderer);
       }
        table1.updateUI();
           

       
       
           
         
    }
    }
   
}
