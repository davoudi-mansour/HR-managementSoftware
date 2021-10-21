import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Tue May 15 00:34:20 PDT 2018
 */



/**
 * @author mansour davoudi
 */
public class sahmiyeEdit extends JFrame {
    manageEng me=null;
    public sahmiyeEdit(manageEng me) {
        this.me=me;
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mohsen afshin
        panel1 = new JPanel();
        label134 = new JLabel();
        textField47 = new JTextField();
        label135 = new JLabel();
        comboBox1 = new JComboBox<>();
        label132 = new JLabel();
        textField45 = new JTextField();
        label133 = new JLabel();
        textField46 = new JTextField();
        label130 = new JLabel();
        textField43 = new JTextField();
        label131 = new JLabel();
        textField44 = new JTextField();
        button14 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(255, 204, 204));

          

            //---- label134 ----
            label134.setText("\u0634\u0646\u0627\u0633\u0647:");
            label134.setForeground(Color.black);
            label134.setFont(new Font("B Zar", Font.PLAIN, 20));
 
            //---- textField47 ----
            textField47.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            textField47.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label135 ----
            label135.setText("\u0646\u0648\u0639:");
            label135.setForeground(Color.black);
            label135.setFont(new Font("B Zar", Font.PLAIN, 20));

            //---- comboBox1 ----
            comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                "\u0646\u0638\u0627\u0631\u062a",
                "\u0637\u0631\u0627\u062d\u06cc",
                "\u0627\u062c\u0631\u0627"
            }));
            comboBox1.setFont(new Font("B Zar", Font.PLAIN, 20));
            comboBox1.setEditable(true);
            comboBox1.setEnabled(true);

            //---- label132 ----
            label132.setText("\u0633\u0627\u0644 \u062c\u0627\u0631\u06cc:");
            label132.setForeground(Color.black);
            label132.setFont(new Font("B Zar", Font.PLAIN, 20));

            //---- textField45 ----
            textField45.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            textField45.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label133 ----
            label133.setText("\u0645\u062d\u0644 \u0646\u0638\u0627\u0631\u062a:");
            label133.setForeground(Color.black);
            label133.setFont(new Font("B Zar", Font.PLAIN, 20));

            //---- textField46 ----
            textField46.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            textField46.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label130 ----
            label130.setText("\u0633\u0647\u0645\u06cc\u0647 \u06a9\u0644:");
            label130.setForeground(Color.black);
            label130.setFont(new Font("B Zar", Font.PLAIN, 20));

            //---- textField43 ----
            textField43.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            textField43.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label131 ----
            label131.setText("\u0633\u0647\u0645\u06cc\u0647 \u0645\u0635\u0631\u0641\u06cc:");
            label131.setForeground(Color.black);
            label131.setFont(new Font("B Zar", Font.PLAIN, 20));

            //---- textField44 ----
            textField44.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            textField44.setHorizontalAlignment(SwingConstants.CENTER);

            //---- button14 ----
            button14.setText("\u0648\u06cc\u0631\u0627\u06cc\u0634");
            button14.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            button14.setBackground(Color.black);
            button14.setForeground(new Color(255, 153, 153));
            button14.addActionListener(e->actionPerformed14(e));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap(58, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textField46)
                                    .addComponent(comboBox1, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(label135)
                                    .addComponent(label133)))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(textField44, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label131)))
                        .addGap(69, 69, 69)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(textField43)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label130))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(textField47, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField45, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(label132)
                                    .addComponent(label134))))
                        .addGap(38, 38, 38))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(button14, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label135, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField47, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label134, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                            .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label132, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField45, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label133, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField46, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(textField43, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label130, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label131, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField44, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(button14)
                        .addGap(41, 41, 41))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - mohsen afshin
    
    public JPanel panel1;
    public JLabel label134;
    public JTextField textField47;
    public JLabel label135;
    public JComboBox<String> comboBox1;
    public JLabel label132;
    public JTextField textField45;
    public JLabel label133;
    public JTextField textField46;
    public JLabel label130;
    public JTextField textField43;
    public JLabel label131;
    public JTextField textField44;
    public JButton button14;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private void actionPerformed14(ActionEvent e) {
       me.editSahmiye();
    }
}
