import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Sat Oct 21 05:23:07 PDT 2017
 */



/**
 * @author mansour davoudi
 */
public class haghnezarat extends JFrame {
    int mainId;
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
    public haghnezarat(int mainId) {
         this.mainId=mainId;
        initComponents();
    }

       private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mahshad
        panel1 = new JPanel();
        panel2 = new JPanel();
        label43 = new JLabel();
        textField82 = new JTextField();
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
        label34 = new JLabel();
        label35 = new JLabel();
        textField88 = new JTextField();
        label37 = new JLabel();
        textField89 = new JTextField();

        //======== this ========
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(255, 204, 204));
              //---- textarea1----------
            textArea1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                        textArea1.setFont(new Font("Segoe UI", Font.PLAIN, 16));


            // JFormDesigner evaluation mark
          

            //======== panel2 ========
            {
                panel2.setBackground(new Color(255, 204, 204));

                //---- label43 ----
                label43.setText("\u062a\u0627\u0631\u06cc\u062e \u062b\u0628\u062a:");
                label43.setFont(new Font("B Zar", Font.PLAIN, 20));
                label43.setForeground(Color.black);

                //---- textField82 ----
                textField82.setHorizontalAlignment(SwingConstants.CENTER);
                textField82.setFont(new Font("Segoe UI", Font.PLAIN, 16));

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

                //---- label34 ----
                label34.setText("\u062d\u0642 \u0646\u0638\u0627\u0631\u062a:");
                label34.setFont(new Font("B Zar", Font.PLAIN, 20));
                label34.setForeground(Color.black);

                //---- label35 ----
                label35.setText("\u0645\u0642\u062f\u0627\u0631 \u06a9\u0627\u0631\u06a9\u0631\u062f:");
                label35.setFont(new Font("B Zar", Font.PLAIN, 20));
                label35.setForeground(Color.black);

                //---- textField88 ----
                textField88.setHorizontalAlignment(SwingConstants.CENTER);
                textField88.setFont(new Font("Segoe UI", Font.PLAIN, 16));

                //---- label37 ----
                label37.setText("\u062f\u0631\u0635\u062f \u0633\u0627\u0632\u0645\u0627\u0646:");
                label37.setFont(new Font("B Zar", Font.PLAIN, 20));
                label37.setForeground(Color.black);

                //---- textField89 ----
                textField89.setHorizontalAlignment(SwingConstants.CENTER);
                textField89.setFont(new Font("Segoe UI", Font.PLAIN, 16));

                GroupLayout panel2Layout = new GroupLayout(panel2);
                panel2.setLayout(panel2Layout);
                panel2Layout.setHorizontalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGap(69, 69, Short.MAX_VALUE)
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addComponent(comboBox5, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label39)
                                    .addGap(269, 269, 269)
                                    .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 594, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addGroup(panel2Layout.createParallelGroup()
                                        .addGroup(panel2Layout.createSequentialGroup()
                                            .addComponent(textField89, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label37))
                                        .addGroup(panel2Layout.createSequentialGroup()
                                            .addComponent(textField83, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label34))
                                        .addGroup(panel2Layout.createSequentialGroup()
                                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(textField85, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                                .addComponent(textField87, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(panel2Layout.createParallelGroup()
                                                .addComponent(label46)
                                                .addComponent(label42))))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                                    .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(textField86, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField84, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                        .addComponent(textField88, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                        .addComponent(textField82, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel2Layout.createParallelGroup()
                                .addComponent(label41)
                                .addComponent(label47)
                                .addComponent(label35)
                                .addComponent(label43)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(label45)
                                    .addComponent(label44)))
                            .addGap(40, 40, 40))
                        .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                            .addGap(80, 327, Short.MAX_VALUE)
                            .addComponent(button7, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                            .addGap(326, 326, 326))
                );
                panel2Layout.setVerticalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label43)
                                .addComponent(textField82, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField83, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label34))
                            .addGap(37, 37, 37)
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label37)
                                .addComponent(textField89, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label35)
                                .addComponent(textField88, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                            .addGap(45, 45, 45)
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(label44)
                                .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboBox5, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label39))
                            .addGap(40, 40, 40)
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label45)
                                .addComponent(textField84, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField85, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label46))
                            .addGap(40, 40, 40)
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label41)
                                .addComponent(textField86, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField87, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label42))
                            .addGap(64, 64, 64)
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label47))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                            .addComponent(button7)
                            .addGap(33, 33, 33))
                );
            }

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createParallelGroup()
                        .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(0, 797, Short.MAX_VALUE)
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createParallelGroup()
                        .addComponent(panel2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(0, 673, Short.MAX_VALUE)
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
 
       
       
      private JPanel panel1;
    private JPanel panel2;
    private JLabel label43;
    private JTextField textField82;
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
    private JLabel label34;
    private JLabel label35;
    private JTextField textField88;
    private JLabel label37;
    private JTextField textField89;

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - ali arab
    

    private void actionPerformed7(ActionEvent e) {
       int nezarat=0;
        if( ! textField83.getText().equals(""))
        {
            nezarat=Integer.parseInt(textField83.getText());
        }
      
        double karkard=0;
        double darsad=0;
        if( ! textField88.getText().equals(""))
        {
             karkard=Double.parseDouble(textField88.getText());
        }
          if( ! textField89.getText().equals(""))
        {
             darsad=Double.parseDouble(textField89.getText());
        }
       
       
       Double d=new Double(nezarat*(darsad/100));
       Double value=new Double(Math.ceil(d));
       Double value1= new Double(value*karkard);
       int result =value1.intValue();
       
       
       int pay=0;
     
          if( ! textField86.getText().equals("") )
      {
         pay=Integer.parseInt(textField86.getText());
       }
       
        int id=this.mainId;
        Date regDate=null;
         if  (! textField82.getText().equals("") )
         {
         try
        {
                 regDate=formatter.parse(textField82.getText());
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
        
       String kind=" حق نظارت";
        
        manageEng ME=new manageEng();
        
        ME.saveFinanceAsNezarat(id,result,pay,regDate,payDate,paykind,fishnumber,checknumber,bank,extra,kind,nezarat,karkard,darsad);
      
       
     
    }
}
