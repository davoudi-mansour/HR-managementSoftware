import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.DefaultTableModel;
import nezam.Finance;
/*
 * Created by JFormDesigner on Tue Aug 14 07:36:48 PDT 2018
 */
/**
 * @author mansour davoudi
 */
public class tasviye extends JFrame {
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
    public tasviye() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mahshad
        panel1 = new JPanel();
        label43 = new JLabel();
        textField82 = new JTextField();
        label32 = new JLabel();
        textField83 = new JTextField();
        label44 = new JLabel();
        label39 = new JLabel();
        label45 = new JLabel();
        textField84 = new JTextField();
        label46 = new JLabel();
        textField85 = new JTextField();
        label41 = new JLabel();
        textField86 = new JTextField();
        label42 = new JLabel();
        textField87 = new JTextField();
        label47 = new JLabel();
        button7 = new JButton();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        comboBox1 = new JComboBox<>();
        comboBox5 = new JComboBox<>();

        //======== this ========
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(255, 204, 204));

         

            //---- label43 ----
            label43.setText("\u0634\u0646\u0627\u0633\u0647:");
            label43.setFont(new Font("B Zar", Font.PLAIN, 20));
            label43.setForeground(Color.black);

            
            //---- textField82 ----
            textField82.setHorizontalAlignment(SwingConstants.CENTER);
            textField82.setFont(new Font("Segoe UI", Font.PLAIN, 16));

            //---- label32 ----
            label32.setText("\u062a\u0627\u0631\u06cc\u062e \u062b\u0628\u062a:");
            label32.setFont(new Font("B Zar", Font.PLAIN, 20));
            label32.setForeground(Color.black);

            //---- textField83 ----
            textField83.setHorizontalAlignment(SwingConstants.CENTER);
            textField83.setFont(new Font("Segoe UI", Font.PLAIN, 16));

            //---- label44 ----
            label44.setText("\u0646\u0648\u0639 \u067e\u0631\u062f\u0627\u062e\u062a:");
            label44.setFont(new Font("B Zar", Font.PLAIN, 20));
            label44.setForeground(Color.black);

            //---- label39 ----
            label39.setText("\u0646\u0627\u0645 \u0628\u0627\u0646\u06a9:");
            label39.setFont(new Font("B Zar", Font.PLAIN, 20));
            label39.setForeground(Color.black);

            //---- label45 ----
            label45.setText("\u0634\u0645\u0627\u0631\u0647 \u0641\u06cc\u0634:");
            label45.setFont(new Font("B Zar", Font.PLAIN, 20));
            label45.setForeground(Color.black);

            //---- textField84 ----
            textField84.setHorizontalAlignment(SwingConstants.CENTER);
            textField84.setFont(new Font("Segoe UI", Font.PLAIN, 16));

            //---- label46 ----
            label46.setText("\u0634\u0645\u0627\u0631\u0647 \u0686\u06a9:");
            label46.setFont(new Font("B Zar", Font.PLAIN, 20));
            label46.setForeground(Color.black);

            //---- textField85 ----
            textField85.setHorizontalAlignment(SwingConstants.CENTER);
            textField85.setFont(new Font("Segoe UI", Font.PLAIN, 16));

            //---- label41 ----
            label41.setText("\u0645\u0642\u062f\u0627\u0631 \u067e\u0631\u062f\u0627\u062e\u062a\u06cc:");
            label41.setFont(new Font("B Zar", Font.PLAIN, 20));
            label41.setForeground(Color.black);

            //---- textField86 ----
            textField86.setHorizontalAlignment(SwingConstants.CENTER);
            textField86.setFont(new Font("Segoe UI", Font.PLAIN, 16));

            //---- label42 ----
            label42.setText("\u062a\u0627\u0631\u06cc\u062e \u067e\u0631\u062f\u0627\u062e\u062a:");
            label42.setFont(new Font("B Zar", Font.PLAIN, 20));
            label42.setForeground(Color.black);

            //---- textField87 ----
            textField87.setHorizontalAlignment(SwingConstants.CENTER);
            textField87.setFont(new Font("Segoe UI", Font.PLAIN, 16));

            //---- label47 ----
            label47.setText("\u062a\u0648\u0636\u06cc\u062d\u0627\u062a:");
            label47.setFont(new Font("B Zar", Font.PLAIN, 20));
            label47.setForeground(Color.black);

            //---- button7 ----
            button7.setText("\u062b\u0628\u062a");
            button7.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            button7.setBackground(Color.black);
            button7.setForeground(new Color(255, 153, 153));
            button7.addActionListener(e->actionPerformed7(e));

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(textArea1);
            }

            //---- comboBox1 ----
            comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                "\u0646\u0642\u062f\u06cc",
                "\u0686\u06a9"
            }));
            comboBox1.setFont(new Font("B Zar", Font.PLAIN, 20));

            //---- comboBox5 ----
            comboBox5.setModel(new DefaultComboBoxModel<>(new String[] {
                "\u0645\u0644\u062a",
                "\u0645\u0644\u06cc",
                "\u062a\u062c\u0627\u0631\u062a",
                "\u0645\u0633\u06a9\u0646",
                "\u0633\u067e\u0647",
                "\u0635\u0627\u062f\u0631\u0627\u062a",
                "\u0627\u0642\u062a\u0635\u0627\u062f \u0646\u0648\u06cc\u0646",
                "\u067e\u0627\u0631\u0633\u06cc\u0627\u0646",
                "\u0633\u0627\u06cc\u0631"
            }));
            comboBox5.setFont(new Font("B Zar", Font.PLAIN, 20));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 597, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 142, Short.MAX_VALUE))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(label43))
                                    .addComponent(label44))
                                .addGap(84, 84, 84))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGap(0, 608, Short.MAX_VALUE)
                                        .addComponent(label47))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGroup(panel1Layout.createParallelGroup()
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(textField85, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(textField83)
                                                    .addComponent(comboBox5, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(panel1Layout.createParallelGroup()
                                                    .addComponent(label46)
                                                    .addComponent(label32)
                                                    .addComponent(label39)))
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                .addComponent(textField87, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(label42)))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textField82, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                            .addComponent(textField84, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                            .addComponent(textField86, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panel1Layout.createParallelGroup()
                                            .addComponent(label41)
                                            .addComponent(label45))))
                                .addGap(67, 67, 67))))
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap(346, Short.MAX_VALUE)
                        .addComponent(button7, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                        .addGap(318, 318, 318))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label32)
                            .addComponent(textField83, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label43)
                            .addComponent(textField82, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(label44)
                            .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBox5, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label39))
                        .addGap(70, 70, 70)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label45)
                            .addComponent(textField85, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label46)
                            .addComponent(textField84, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label41)
                            .addComponent(textField87, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label42)
                            .addComponent(textField86, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(label47)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(button7)
                        .addGap(31, 31, 31))
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
    // Generated using JFormDesigner Evaluation license - mahshad
    private JPanel panel1;
    private JLabel label43;
    private JTextField textField82;
    private JLabel label32;
    private JTextField textField83;
    private JLabel label44;
    private JLabel label39;
    private JLabel label45;
    private JTextField textField84;
    private JLabel label46;
    private JTextField textField85;
    private JLabel label41;
    private JTextField textField86;
    private JLabel label42;
    private JTextField textField87;
    private JLabel label47;
    private JButton button7;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JComboBox<String> comboBox1;
    private JComboBox<String> comboBox5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private void actionPerformed7(ActionEvent e) {
        manageEng me=new manageEng();
         Finance f=null;
         java.util.List finance=me.listFinance();
         
         int id;
         int idmain=Integer.parseInt(textField82.getText());
             for (int j=0;j<finance.size();j++)
         {
            f=(Finance) finance.get(j);
            id=(Integer) f.getIdMain();
             if (idmain==id && f.getBedehkariamount() != 0)
             {
             
         
                 int ids=f.getId();
                 me.updateFinanceStatus(ids);
                  
                 
             }
         }
       int value=0;
       int pay=0;
      
          if( ! textField86.getText().equals("") )
      {
         pay=Integer.parseInt(textField86.getText());
       }
       
       
        Date regDate=null;
         if  (! textField83.getText().equals("") )
         {
         try
        {
                 regDate=formatter.parse(textField83.getText());
        }
           catch(Exception ee){}
         
         }
      
    String fishnumber=null;
    String checknumber=null;
    String paykind=comboBox1.getSelectedItem().toString();
    if(paykind.equals("نقدی"))
    {
        fishnumber=textField84.getText();
    }
    else if(paykind.equals("چک"))
    {
        checknumber=textField85.getText();
    }
    String bank=comboBox5.getSelectedItem().toString();
       Date payDate=null;
      if  (! textField87.getText().equals("") )
      {
             try
        {
                payDate=formatter.parse(textField87.getText());
        }
           catch(Exception ee){}
      }
      String extra=textArea1.getText();
        
           
       
        
        String kind="تسویه حساب";
        me.saveFinance(idmain,value,pay,regDate,payDate,paykind,fishnumber,checknumber,bank,extra,kind); 

                
         }
    
}
