import java.awt.*;
import java.awt.event.ActionEvent;
        import javax.swing.*;
        import javax.swing.GroupLayout;


public class page8 extends JFrame {
    
    manageEng me;
    public page8(manageEng me) {
        this.me=me;
        initComponents();
        
 
    }

      private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mohammad
        panel7 = new JPanel();
        label109 = new JLabel();
        textField83 = new JTextField();
        label112 = new JLabel();
        textField84 = new JTextField();
        label113 = new JLabel();
        textField85 = new JTextField();
        label114 = new JLabel();
        textField86 = new JTextField();
        label115 = new JLabel();
        textField87 = new JTextField();
        label116 = new JLabel();
        textField88 = new JTextField();
        label117 = new JLabel();
        textField89 = new JTextField();
        label118 = new JLabel();
        textField90 = new JTextField();
        label119 = new JLabel();
        textField91 = new JTextField();
        label122 = new JLabel();
        textField92 = new JTextField();
        label123 = new JLabel();
        textField93 = new JTextField();
        label124 = new JLabel();
        textField94 = new JTextField();
        label34 = new JLabel();
        button14 = new JButton();
        button15 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //======== panel7 ========
        {
            panel7.setBackground(new Color(255, 204, 204));
            panel7.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (
            new javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion"
            , javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM
            , new java .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 )
            , java. awt. Color. red) ,panel7. getBorder( )) ); panel7. addPropertyChangeListener (
            new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
            ) {if ("\u0062order" .equals (e .getPropertyName () )) throw new RuntimeException( )
            ; }} );

            //---- label109 ----
            label109.setText("\u0646\u0627\u0645 \u062f\u0648\u0631\u0647 \u0622\u0645\u0648\u0632\u0634\u06cc:");
            label109.setForeground(Color.black);
            label109.setFont(new Font("B Zar", Font.PLAIN, 20));

            //---- textField83 ----
            textField83.setHorizontalAlignment(SwingConstants.CENTER);
            textField83.setFont(new Font("Segoe UI", Font.PLAIN, 16));

            //---- label112 ----
            label112.setText("\u062a\u0627\u0631\u06cc\u062e \u0634\u0631\u0648\u0639 \u062f\u0648\u0631\u0647:");
            label112.setForeground(Color.black);
            label112.setFont(new Font("B Zar", Font.PLAIN, 20));

            //---- textField84 ----
            textField84.setHorizontalAlignment(SwingConstants.CENTER);
            textField84.setFont(new Font("Segoe UI", Font.PLAIN, 16));

            //---- label113 ----
            label113.setText("\u062a\u0627\u0631\u06cc\u062e \u067e\u0627\u06cc\u0627\u0646 \u062f\u0648\u0631\u0647:");
            label113.setForeground(Color.black);
            label113.setFont(new Font("B Zar", Font.PLAIN, 20));

            //---- textField85 ----
            textField85.setHorizontalAlignment(SwingConstants.CENTER);
            textField85.setFont(new Font("Segoe UI", Font.PLAIN, 16));

            //---- label114 ----
            label114.setText("\u0637\u0648\u0644 \u062f\u0648\u0631\u0647 \u0622\u0645\u0648\u0632\u0634\u06cc:");
            label114.setForeground(Color.black);
            label114.setFont(new Font("B Zar", Font.PLAIN, 20));

            //---- textField86 ----
            textField86.setHorizontalAlignment(SwingConstants.CENTER);
            textField86.setFont(new Font("Segoe UI", Font.PLAIN, 16));

            //---- label115 ----
            label115.setText("\u0645\u062c\u0631\u06cc \u062f\u0648\u0631\u0647 \u0622\u0645\u0648\u0632\u0634\u06cc:");
            label115.setForeground(Color.black);
            label115.setFont(new Font("B Zar", Font.PLAIN, 20));

            //---- textField87 ----
            textField87.setHorizontalAlignment(SwingConstants.CENTER);
            textField87.setFont(new Font("Segoe UI", Font.PLAIN, 16));

            //---- label116 ----
            label116.setText("\u0645\u062f\u0631\u0633 \u062f\u0648\u0631\u0647:");
            label116.setForeground(Color.black);
            label116.setFont(new Font("B Zar", Font.PLAIN, 20));

            //---- textField88 ----
            textField88.setHorizontalAlignment(SwingConstants.CENTER);
            textField88.setFont(new Font("Segoe UI", Font.PLAIN, 16));

            //---- label117 ----
            label117.setText("\u0634\u0645\u0627\u0631\u0647 \u0645\u062c\u0648\u0632 \u0645\u062c\u0631\u06cc:");
            label117.setForeground(Color.black);
            label117.setFont(new Font("B Zar", Font.PLAIN, 20));

            //---- textField89 ----
            textField89.setHorizontalAlignment(SwingConstants.CENTER);
            textField89.setFont(new Font("Segoe UI", Font.PLAIN, 16));

            //---- label118 ----
            label118.setText("\u062a\u0627\u0631\u06cc\u062e \u0635\u062f\u0648\u0631 \u0645\u062c\u0648\u0632:");
            label118.setForeground(Color.black);
            label118.setFont(new Font("B Zar", Font.PLAIN, 20));

            //---- textField90 ----
            textField90.setHorizontalAlignment(SwingConstants.CENTER);
            textField90.setFont(new Font("Segoe UI", Font.PLAIN, 16));

            //---- label119 ----
            label119.setText("\u0633\u0627\u0632\u0645\u0627\u0646 :");
            label119.setForeground(Color.black);
            label119.setFont(new Font("B Zar", Font.PLAIN, 20));

            //---- textField91 ----
            textField91.setHorizontalAlignment(SwingConstants.CENTER);
            textField91.setFont(new Font("Segoe UI", Font.PLAIN, 16));

            //---- label122 ----
            label122.setText("\u062a\u0627\u0631\u06cc\u062e \u0622\u0632\u0645\u0648\u0646 \u067e\u0627\u06cc\u0627\u0646 \u062f\u0648\u0631\u0647:");
            label122.setForeground(Color.black);
            label122.setFont(new Font("B Zar", Font.PLAIN, 20));

            //---- textField92 ----
            textField92.setHorizontalAlignment(SwingConstants.CENTER);
            textField92.setFont(new Font("Segoe UI", Font.PLAIN, 16));

            //---- label123 ----
            label123.setText("\u067e\u0631\u0648\u0627\u0646\u0647 \u0627\u0634\u062a\u063a\u0627\u0644 \u0645\u062f\u0631\u0633 :");
            label123.setForeground(Color.black);
            label123.setFont(new Font("B Zar", Font.PLAIN, 20));

            //---- textField93 ----
            textField93.setHorizontalAlignment(SwingConstants.CENTER);
            textField93.setFont(new Font("Segoe UI", Font.PLAIN, 16));

            //---- label124 ----
            label124.setText("\u0634\u0645\u0627\u0631\u0647 \u062f\u0648\u0631\u0647:");
            label124.setForeground(Color.black);
            label124.setFont(new Font("B Zar", Font.PLAIN, 20));

            //---- textField94 ----
            textField94.setHorizontalAlignment(SwingConstants.CENTER);
            textField94.setFont(new Font("Segoe UI", Font.PLAIN, 16));

            //---- label34 ----
            label34.setText("\u0627\u0646\u062c\u0627\u0645 \u0634\u062f!!");
            label34.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            label34.setForeground(new Color(255, 51, 51));
            label34.setVisible(false);

            //---- button14 ----
            button14.setText("\u0648\u06cc\u0631\u0627\u06cc\u0634");
            button14.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            button14.setBackground(Color.black);
            button14.setForeground(new Color(255, 153, 153));
                        button14.addActionListener(e-> actionPerformed14(e));


            //---- button15 ----
            button15.setText("\u0644\u063a\u0648");
            button15.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            button15.setBackground(Color.black);
            button15.setForeground(new Color(255, 153, 153));
                        button15.addActionListener(e-> actionPerformed15(e));

            GroupLayout panel7Layout = new GroupLayout(panel7);
            panel7.setLayout(panel7Layout);
            panel7Layout.setHorizontalGroup(
                panel7Layout.createParallelGroup()
                    .addGroup(panel7Layout.createSequentialGroup()
                        .addContainerGap(79, Short.MAX_VALUE)
                        .addGroup(panel7Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panel7Layout.createSequentialGroup()
                                .addGroup(panel7Layout.createParallelGroup()
                                    .addGroup(panel7Layout.createSequentialGroup()
                                        .addGroup(panel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(textField91, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                            .addComponent(textField94, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panel7Layout.createParallelGroup()
                                            .addComponent(label124)
                                            .addComponent(label119)))
                                    .addGroup(panel7Layout.createSequentialGroup()
                                        .addGroup(panel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(textField85, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                            .addComponent(textField88, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panel7Layout.createParallelGroup()
                                            .addComponent(label116)
                                            .addComponent(label113))))
                                .addGap(136, 136, 136)
                                .addGroup(panel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addGroup(GroupLayout.Alignment.TRAILING, panel7Layout.createSequentialGroup()
                                        .addComponent(textField93)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label123))
                                    .addGroup(panel7Layout.createSequentialGroup()
                                        .addComponent(textField84, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label112))
                                    .addGroup(panel7Layout.createSequentialGroup()
                                        .addGap(121, 121, 121)
                                        .addComponent(label34))
                                    .addGroup(panel7Layout.createSequentialGroup()
                                        .addGroup(panel7Layout.createParallelGroup()
                                            .addComponent(textField90, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textField87, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panel7Layout.createParallelGroup()
                                            .addComponent(label118)
                                            .addComponent(label115))))
                                .addGap(94, 94, 94)
                                .addGroup(panel7Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(panel7Layout.createParallelGroup()
                                        .addGroup(panel7Layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(textField83, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label109))
                                        .addGroup(panel7Layout.createSequentialGroup()
                                            .addGap(7, 7, 7)
                                            .addComponent(textField92, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label122))
                                        .addGroup(panel7Layout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addComponent(textField86, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label114)))
                                    .addGroup(panel7Layout.createSequentialGroup()
                                        .addComponent(textField89, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label117)
                                        .addGap(13, 13, 13)))
                                .addGap(82, 82, 82))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel7Layout.createSequentialGroup()
                                .addComponent(button15, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                                .addGap(226, 226, 226)
                                .addComponent(button14, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                                .addGap(372, 372, 372))))
            );
            panel7Layout.setVerticalGroup(
                panel7Layout.createParallelGroup()
                    .addGroup(panel7Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(panel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label109)
                            .addComponent(label112)
                            .addComponent(textField83, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label113)
                            .addComponent(textField85, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField84, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addGroup(panel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label115)
                            .addComponent(label114)
                            .addComponent(textField86, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField87, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label116)
                            .addComponent(textField88, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addGroup(panel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label117)
                            .addComponent(textField90, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label118)
                            .addComponent(textField89, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label119)
                            .addComponent(textField91, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel7Layout.createParallelGroup()
                            .addGroup(panel7Layout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label34)
                                .addGap(14, 14, 14))
                            .addGroup(panel7Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(panel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label123)
                                    .addComponent(label124)
                                    .addComponent(label122)
                                    .addComponent(textField92, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField94, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField93, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                                .addGroup(panel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(button14, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button15, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65))))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - maryam koopaei
    
     
     
    public JPanel panel7;
    public JLabel label109;
    public JTextField textField83;
    public JLabel label112;
    public JTextField textField84;
    public JLabel label113;
    public JTextField textField85;
    public JLabel label114;
    public JTextField textField86;
    public JLabel label115;
    public JTextField textField87;
    public JLabel label116;
    public JTextField textField88;
    public JLabel label117;
    public JTextField textField89;
    public JLabel label118;
    public JTextField textField90;
    public JLabel label119;
    public JTextField textField91;
    public JLabel label122;
    public JTextField textField92;
    public JLabel label123;
    public JTextField textField93;
    public JLabel label124;
    public JTextField textField94;
    public JLabel label34;
    public JButton button14;
    public JButton button15;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    
     private void actionPerformed14(ActionEvent e) {
        me.editAmuzeshi();
    }

    private void actionPerformed15(ActionEvent e) {
     this.setVisible(false);
    }
}

