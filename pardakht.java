import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Mon Dec 18 23:37:53 PST 2017
 */



/**
 * @author mansour davoudi
 */
public class pardakht extends JFrame {
    public pardakht() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mostafa shokri
        panel1 = new JPanel();
        label33 = new JLabel();
        textField82 = new JTextField();
        label34 = new JLabel();
        textField83 = new JTextField();
        button7 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(255, 204, 204));

          

            //---- label33 ----
            label33.setText("\u0634\u0646\u0627\u0633\u0647:");
            label33.setFont(new Font("B Zar", Font.PLAIN, 20));
            label33.setForeground(Color.black);

            //---- textField82 ----
            textField82.setHorizontalAlignment(SwingConstants.CENTER);
            textField82.setFont(new Font("Segoe UI", Font.PLAIN, 16));

            //---- label34 ----
            label34.setText("\u062a\u0627\u0631\u06cc\u062e \u067e\u0631\u062f\u0627\u062e\u062a:");
            label34.setFont(new Font("B Zar", Font.PLAIN, 20));
            label34.setForeground(Color.black);

            //---- textField83 ----
            textField83.setHorizontalAlignment(SwingConstants.CENTER);
            textField83.setFont(new Font("Segoe UI", Font.PLAIN, 16));

            //---- button7 ----
            button7.setText("\u062b\u0628\u062a");
            button7.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            button7.setBackground(Color.black);
            button7.setForeground(new Color(255, 153, 153));
            button7.addActionListener(e-> button7action(e));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap(62, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(textField83, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label34)
                                .addGap(105, 105, 105)
                                .addComponent(textField82, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label33)
                                .addGap(55, 55, 55))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(button7, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                                .addGap(240, 240, 240))))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(textField82, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label33)
                            .addComponent(textField83, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label34))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addComponent(button7)
                        .addGap(59, 59, 59))
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
    // Generated using JFormDesigner Evaluation license - mostafa shokri
    private JPanel panel1;
    private JLabel label33;
    public JTextField textField82;
    private JLabel label34;
    public JTextField textField83;
    private JButton button7;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private void button7action(ActionEvent e) {
        manageEng m=new manageEng();
        m.editPardakhtDate(this);
    }
}
