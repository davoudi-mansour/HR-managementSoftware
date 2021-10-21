import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Sun Oct 01 11:51:28 PDT 2017
 */



/**
 * @author mansour davoudi
 */
public class page9 extends JFrame {
    public page9() {
        initComponents();
    }

     private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mohsen afshin
        panel1 = new JPanel();
        button9 = new JButton();
        label126 = new JLabel();
        textField84 = new JTextField();
        button10 = new JButton();
        button11 = new JButton();
        button12 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(255, 204, 204));


            //---- button9 ----
            button9.setText("\u0627\u0637\u0644\u0627\u0639\u0627\u062a \u0634\u062e\u0635\u06cc");
            button9.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            button9.setBackground(Color.black);
            button9.setForeground(new Color(255, 153, 153));
            button9.addActionListener(e-> actionPerformed9(e));

            //---- label126 ----
            label126.setText("\u0634\u0646\u0627\u0633\u0647 :");
            label126.setForeground(Color.black);
            label126.setFont(new Font("B Zar", Font.PLAIN, 20));

            //---- textField84 ----
            textField84.setHorizontalAlignment(SwingConstants.CENTER);
            textField84.setFont(new Font("Segoe UI", Font.PLAIN, 16));

            //---- button10 ----
            button10.setText("\u067e\u06cc\u0634 \u067e\u0631\u0648\u0627\u0646\u0647");
            button10.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            button10.setBackground(Color.black);
            button10.setForeground(new Color(255, 153, 153));
            button10.addActionListener(e-> actionPerformed10(e));

            //---- button11 ----
            button11.setText("\u0631\u0648\u06cc \u067e\u0631\u0648\u0627\u0646\u0647");
            button11.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            button11.setBackground(Color.black);
            button11.setForeground(new Color(255, 153, 153));
            button11.addActionListener(e-> actionPerformed11(e));

            //---- button12 ----
            button12.setText("\u067e\u0634\u062a \u067e\u0631\u0648\u0627\u0646\u0647");
            button12.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            button12.setBackground(Color.black);
            button12.setForeground(new Color(255, 153, 153));
            button12.addActionListener(e-> actionPerformed12(e));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(button11, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button12, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(button10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button9, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                        .addGap(111, 111, 111))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(textField84, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label126)
                        .addContainerGap(223, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label126)
                            .addComponent(textField84, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button9, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button11, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button10, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button12, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(62, Short.MAX_VALUE))
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
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - ali arab
    private JPanel panel1;
    private JButton button9;
    private JLabel label126;
    public JTextField textField84;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private void actionPerformed9(ActionEvent e) {
        personal p=new personal(this);
        p.generatePdf();
    }

    private void actionPerformed10(ActionEvent e) {
        parvane1 p1=new parvane1(this);
        p1.generatePdf();
    }

    private void actionPerformed11(ActionEvent e) {
        parvane2 p2=new parvane2(this);
        p2.generatePdf();
    }

    private void actionPerformed12(ActionEvent e) {
        parvane3 p3=new parvane3(this);
        p3.generatePdf();
    }
}
