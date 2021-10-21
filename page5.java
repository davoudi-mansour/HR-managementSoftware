import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Sun Jul 30 00:26:16 PDT 2017
 */



/**
 * @author mansour davoudi
 */
public class page5 extends JFrame {
    manageEng ME=null;
    public page5() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mojgan koopaei
        panel1 = new JPanel();
        textField3 = new JTextField();
        label121 = new JLabel();
        button6 = new JButton();
        label1 = new JLabel();
        this.addWindowFocusListener(new WindowAdapter() {
    public void windowGainedFocus(WindowEvent e) {
        textField3.requestFocusInWindow();
    }
});

        //======== this ========
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(255, 204, 204));

           
            //---- textField3 ----
            textField3.setHorizontalAlignment(SwingConstants.CENTER);
            textField3.setFont(new Font("Segoe UI", Font.PLAIN, 16));

            //---- label121 ----
            label121.setText("\u0634\u0646\u0627\u0633\u0647:");
            label121.setForeground(Color.black);
            label121.setFont(new Font("B Zar", Font.PLAIN, 20));

            //---- button6 ----
            button6.setText("\u062d\u0630\u0641");
            button6.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            button6.setBackground(Color.black);
            button6.setForeground(new Color(255, 153, 153));
            button6.addActionListener(e -> button6actionPerformed(e));

            //---- label1 ----
            label1.setText("\u0627\u0646\u062c\u0627\u0645 \u0634\u062f!!");
            label1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            label1.setForeground(new Color(255, 51, 51));
            label1.setVisible(false);

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap(265, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(label121)
                                .addGap(87, 87, 87))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(button6, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                .addGap(259, 259, 259))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(label1)
                        .addGap(0, 299, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label121)
                            .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                        .addComponent(button6)
                        .addGap(40, 40, 40)
                        .addComponent(label1)
                        .addGap(44, 44, 44))
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
    // Generated using JFormDesigner Evaluation license - mojgan koopaei
    
    public JPanel panel1;
    public JTextField textField3;
    public JLabel label121;
    public JButton button6;
    public JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private void button6actionPerformed(ActionEvent e) 
    {
        ME =new manageEng();
        ME.removeEng(this);
    }
}
