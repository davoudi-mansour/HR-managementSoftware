import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Sat Oct 21 01:31:05 PDT 2017
 */



/**
 * @author mansour davoudi
 */
public class bime extends JFrame {
    manageEng me;
    public bime(manageEng me) {
        this.me=me;
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - saman habiby
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

        //======== this ========
        Container contentPane = getContentPane();

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
            label133.setText("\u0634\u0631\u06a9\u062a \u0628\u06cc\u0645\u0647 \u0634\u062f\u0647:");
            label133.setForeground(Color.black);
            label133.setFont(new Font("B Zar", Font.PLAIN, 20));

            //---- textField104 ----
            textField104.setHorizontalAlignment(SwingConstants.CENTER);
            textField104.setFont(new Font("Segoe UI", Font.PLAIN, 18));

            //---- button14 ----
            button14.setText("\u0648\u06cc\u0631\u0627\u06cc\u0634");
            button14.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            button14.setBackground(Color.black);
            button14.setForeground(new Color(255, 153, 153));
            button14.addActionListener(e->actionPerformed14(e));

            //---- button16 ----
            button16.setText("\u0644\u063a\u0648");
            button16.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            button16.setBackground(Color.black);
            button16.setForeground(new Color(255, 153, 153));
            button16.addActionListener(e-> actionPerformed16(e));

            GroupLayout panel10Layout = new GroupLayout(panel10);
            panel10.setLayout(panel10Layout);
            panel10Layout.setHorizontalGroup(
                panel10Layout.createParallelGroup()
                    .addGroup(panel10Layout.createSequentialGroup()
                        .addContainerGap(180, Short.MAX_VALUE)
                        .addGroup(panel10Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(panel10Layout.createSequentialGroup()
                                .addComponent(textField104, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label133))
                            .addGroup(panel10Layout.createSequentialGroup()
                                .addGroup(panel10Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(panel10Layout.createSequentialGroup()
                                        .addComponent(textField100)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(label129))
                                    .addGroup(panel10Layout.createSequentialGroup()
                                        .addComponent(textField103, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(label132)))
                                .addGap(84, 84, 84)
                                .addGroup(panel10Layout.createParallelGroup()
                                    .addGroup(GroupLayout.Alignment.TRAILING, panel10Layout.createSequentialGroup()
                                        .addComponent(textField99, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(label128))
                                    .addGroup(GroupLayout.Alignment.TRAILING, panel10Layout.createSequentialGroup()
                                        .addComponent(textField102, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(label131)))
                                .addGap(89, 89, 89)
                                .addGroup(panel10Layout.createParallelGroup()
                                    .addGroup(GroupLayout.Alignment.TRAILING, panel10Layout.createSequentialGroup()
                                        .addComponent(textField96, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(label127))
                                    .addGroup(GroupLayout.Alignment.TRAILING, panel10Layout.createSequentialGroup()
                                        .addComponent(textField101, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(label130))))
                            .addGroup(GroupLayout.Alignment.LEADING, panel10Layout.createSequentialGroup()
                                .addGap(522, 522, 522)
                                .addComponent(button14, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
                            .addGroup(GroupLayout.Alignment.LEADING, panel10Layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addComponent(button16, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)))
                        .addGap(104, 104, 104))
            );
            panel10Layout.setVerticalGroup(
                panel10Layout.createParallelGroup()
                    .addGroup(panel10Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(panel10Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label127)
                            .addComponent(textField96, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label128)
                            .addComponent(textField99, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label129)
                            .addComponent(textField100, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 94, 94)
                        .addGroup(panel10Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label130)
                            .addComponent(textField101, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label131)
                            .addComponent(textField102, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label132)
                            .addComponent(textField103, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addGroup(panel10Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label133)
                            .addComponent(textField104, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                        .addGroup(panel10Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button14)
                            .addComponent(button16))
                        .addGap(96, 96, 96))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createParallelGroup()
                    .addComponent(panel10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 1203, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createParallelGroup()
                    .addComponent(panel10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 648, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - saman habiby
    
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
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private void actionPerformed14(ActionEvent e) {
        me.editBime();
    }

    private void actionPerformed16(ActionEvent e) {
     this.setVisible(false);
    }
}
