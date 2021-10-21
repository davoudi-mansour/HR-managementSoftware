import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Sun Dec 24 11:22:15 PST 2017
 */



/**
 * @author mansour davoudi
 */
public class about extends JFrame {
    public about() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mostafa shokri
        panel1 = new JPanel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        button1 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(255, 255, 153));
            
            button1.setIcon(new ImageIcon(getClass().getResource("/mansur.jpg")));
            

          

            //---- label2 ----
            label2.setText("\u0645\u0646\u0635\u0648\u0631 \u062f\u0627\u0648\u062f\u06cc");
            label2.setForeground(Color.black);
            label2.setFont(new Font("Segoe UI", Font.PLAIN, 16));

            //---- label3 ----
            label3.setText("\u062f\u0627\u0646\u0634\u062c\u0648\u06cc \u06a9\u0627\u0631\u0634\u0646\u0627\u0633\u06cc \u0631\u0634\u062a\u0647 \u0645\u0647\u0646\u062f\u0633\u06cc \u06a9\u0627\u0645\u067e\u06cc\u0648\u062a\u0631");
            label3.setForeground(Color.black);
            label3.setFont(new Font("Segoe UI", Font.PLAIN, 16));

            //---- label4 ----
            label4.setText("\u0634\u0645\u0627\u0631\u0647 \u0647\u0645\u0631\u0627\u0647:");
            label4.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            label4.setForeground(Color.black);

            //---- label5 ----
            label5.setText("09178236002");
            label5.setForeground(Color.black);
            label5.setFont(new Font("Segoe UI", Font.PLAIN, 16));

            //---- label6 ----
            label6.setText("\u0627\u06cc\u0645\u06cc\u0644:");
            label6.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            label6.setForeground(Color.black);

            //---- label7 ----
            label7.setText("davudimansur@gmail.com");
            label7.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            label7.setForeground(Color.black);

          

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(label2, GroupLayout.Alignment.TRAILING)
                            .addComponent(label3, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 274, GroupLayout.PREFERRED_SIZE)
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(label5)
                                .addGap(18, 18, 18)
                                .addComponent(label4))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(label7)
                                .addGap(18, 18, 18)
                                .addComponent(label6)))
                        .addGap(66, 66, 66))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(label2)
                                .addGap(26, 26, 26)
                                .addComponent(label3)
                                .addGap(37, 37, 37)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label4)
                                    .addComponent(label5))
                                .addGap(34, 34, 34)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label6)
                                    .addComponent(label7)))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(62, Short.MAX_VALUE))
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
    // Generated using JFormDesigner Evaluation license - mostafa shokri
    private JPanel panel1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
