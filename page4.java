
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Sat Jul 29 06:29:13 PDT 2017
 */



/**
 * @author mansour davoudi
 */
public class page4 extends JFrame {
     manageEng ME=null;
    public page4() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - ali mohseni
        panel1 = new JPanel();
        label100 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        textField3 = new JTextField();
        label4 = new JLabel();
        textField4 = new JTextField();
        label7 = new JLabel();
        textField5 = new JTextField();
        label13 = new JLabel();
        textField6 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        label1 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(255, 204, 204));

          
             this.addWindowFocusListener(new WindowAdapter() {
    public void windowGainedFocus(WindowEvent e) {
        textField1.requestFocusInWindow();
    }
});
            //---- label100 ----
            label100.setText("\u0634\u0646\u0627\u0633\u0647 :");
            label100.setForeground(Color.black);
            label100.setFont(new Font("B Zar", Font.PLAIN, 20));

            //---- textField1 ----
            textField1.setHorizontalAlignment(SwingConstants.CENTER);
            textField1.setFont(new Font("Segoe UI", Font.PLAIN, 18));

            //---- label2 ----
            label2.setText("\u0646\u0627\u0645 :");
            label2.setFont(new Font("B Zar", Font.PLAIN, 20));
            label2.setHorizontalAlignment(SwingConstants.CENTER);
            label2.setForeground(Color.black);

            //---- textField2 ----
            textField2.setHorizontalAlignment(SwingConstants.CENTER);
            textField2.setFont(new Font("Segoe UI", Font.PLAIN, 18));

            //---- label3 ----
            label3.setText("\u0646\u0627\u0645 \u062e\u0627\u0646\u0648\u0627\u062f\u06af\u06cc :");
            label3.setHorizontalAlignment(SwingConstants.CENTER);
            label3.setFont(new Font("B Zar", Font.PLAIN, 20));
            label3.setForeground(Color.black);

            //---- textField3 ----
            textField3.setHorizontalAlignment(SwingConstants.CENTER);
            textField3.setFont(new Font("Segoe UI", Font.PLAIN, 18));

            //---- label4 ----
            label4.setText("\u0646\u0627\u0645 \u067e\u062f\u0631 :");
            label4.setHorizontalAlignment(SwingConstants.CENTER);
            label4.setFont(new Font("B Zar", Font.PLAIN, 20));
            label4.setForeground(Color.black);

            //---- textField4 ----
            textField4.setHorizontalAlignment(SwingConstants.CENTER);
            textField4.setFont(new Font("Segoe UI", Font.PLAIN, 18));

            //---- label7 ----
            label7.setText("\u06a9\u062f \u0645\u0644\u06cc :");
            label7.setHorizontalAlignment(SwingConstants.CENTER);
            label7.setFont(new Font("B Zar", Font.PLAIN, 20));
            label7.setForeground(Color.black);

            //---- textField5 ----
            textField5.setHorizontalAlignment(SwingConstants.CENTER);
            textField5.setFont(new Font("Segoe UI", Font.PLAIN, 18));

            //---- label13 ----
            label13.setText("\u0634\u0645\u0627\u0631\u0647 \u0647\u0645\u0631\u0627\u0647 :");
            label13.setHorizontalAlignment(SwingConstants.CENTER);
            label13.setFont(new Font("B Zar", Font.PLAIN, 20));
            label13.setForeground(Color.black);

            //---- textField6 ----
            textField6.setHorizontalAlignment(SwingConstants.CENTER);
            textField6.setFont(new Font("Segoe UI", Font.PLAIN, 18));

            //---- button1 ----
            button1.setText("\u062b\u0628\u062a \u0627\u0637\u0644\u0627\u0639\u0627\u062a");
            button1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            button1.setBackground(Color.black);
            button1.setForeground(new Color(255, 153, 153));
             button1.addActionListener(e -> button1actionPerformed(e));

            //---- button2 ----
            button2.setText("\u0644\u063a\u0648");
            button2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            button2.setBackground(Color.black);
            button2.setForeground(new Color(255, 153, 153));
            button2.addActionListener(e -> button2actionPerformed(e));

            //---- label1 ----
            label1.setText("\u0627\u0646\u062c\u0627\u0645 \u0634\u062f !!");
            label1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            label1.setForeground(new Color(255, 51, 0));
            label1.setVisible(false);

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(textField3, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label3))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(textField6, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label13)))
                                .addGap(132, 132, 132)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textField2, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                    .addComponent(textField5, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(button1)
                                .addGap(195, 195, 195)
                                .addComponent(label1)
                                .addGap(9, 9, 9)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(label2)
                                    .addComponent(label7))
                                .addGap(102, 102, 102)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label100))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(textField4)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label4))))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(button2, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(196, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label100)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(150, 150, 150)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label7, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label13, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label1)
                            .addComponent(button2)
                            .addComponent(button1))
                        .addGap(119, 119, 119))
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
    // Generated using JFormDesigner Evaluation license - ali mohseni
    
    public JPanel panel1;
    public JLabel label100;
    public JTextField textField1;
    public JLabel label2;
    public JTextField textField2;
    public JLabel label3;
    public JTextField textField3;
    public JLabel label4;
    public JTextField textField4;
    public JLabel label7;
    public JTextField textField5;
    public JLabel label13;
    public JTextField textField6;
    public JButton button1;
    public JButton button2;
    public JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
     private void button2actionPerformed(ActionEvent e) {
        this.setVisible(false);
    }

    private void button1actionPerformed(ActionEvent e) {
        ME =new manageEng();
        ME.saveNewEng(this);
    }
}





