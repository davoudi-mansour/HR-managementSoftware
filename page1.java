import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Wed Jun 14 05:58:00 PDT 2017
 */



/**
 * @author mansour davoudi
 */
public class page1 extends JFrame {
    identify identy;

    int i,num=0;
    Thread t1=null;
    Runnable r=new Runnable() {
        @Override
        public void run() {
            while(i<5000)
            {
                progressBar1.setValue(i);
                i=i+50;
                try{t1.sleep(300);}catch(Exception e){}
                //progressBar1.setValue(0);
                //progressBar1.setStringPainted(true);
               // t1=new Thread(r);
                //t1.start();
            }
            fin();

        }
    };
   
    public void fin()
    {
        this.setVisible(false);
    }
    public void allowEnter()
    {
          String user;
        String pass;
        boolean result=false;
       user= textField1.getText();
       pass=passwordField1.getText();
       identy=new identify();
       identy.init();
        result= identy.check(user, pass);
        if(result)
        {
            page2 p=new page2();
            p.setVisible(true);
            this.setVisible(false);
        }
        else 
        {
            panel1.invalidate();
            label1.setVisible(true);
            
        }
    }
        
  public void button2ActionPerformed(ActionEvent e)
    {
        String user;
        String pass;
        boolean result=false;
       user= textField1.getText();
       pass=passwordField1.getText();
       identy=new identify();
       identy.init();
        result= identy.check(user, pass);
        if(result)
        {
            page2 p=new page2();
            p.setVisible(true);
            this.setVisible(false);
        }
        else 
        {
            panel1.invalidate();
            label1.setVisible(true);
            
        }
       
       
    }

    public page1() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - reza alipor
        panel1 = new JPanel();
        label3 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField();
        label4 = new JLabel();
        progressBar1 = new JProgressBar(0,5000);
        button1 = new JButton();
        passwordField1 = new JPasswordField();
        button2 = new JButton();
        label1 = new JLabel();
        this.addWindowFocusListener(new WindowAdapter() {
    public void windowGainedFocus(WindowEvent e) {
        textField1.requestFocusInWindow();
    }
});

        //======== this ========
        setIconImage(new ImageIcon(getClass().getResource("/header_02.jpg")).getImage());
        setTitle("WelCome");
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(255, 255, 153));

        

            //---- label3 ----
            label3.setText("\u0633\u0627\u0632\u0645\u0627\u0646 \u0646\u0638\u0627\u0645  \u06a9\u0627\u0631\u062f\u0627\u0646\u06cc \u0633\u0627\u062e\u062a\u0645\u0627\u0646 \u0627\u0633\u062a\u0627\u0646 \u0641\u0627\u0631\u0633");
            label3.setFont(new Font("B Elham", Font.PLAIN, 20));

            //---- label2 ----
            label2.setText("username:");
            label2.setBackground(Color.black);
            label2.setFont(new Font("Agency FB", Font.PLAIN, 20));

            //---- textField1 ----
            textField1.setSelectedTextColor(Color.black);
            textField1.setBackground(new Color(255, 255, 153));
            textField1.setForeground(Color.black);
            textField1.setToolTipText("enter your username, please");
            textField1.setNextFocusableComponent(passwordField1);
            textField1.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
            

            //---- label4 ----
            label4.setText("password:");
            label4.setFont(new Font("Agency FB", Font.PLAIN, 20));

            //---- progressBar1 ----
             passwordField1.setBackground(new Color(255, 255, 153));
            passwordField1.setToolTipText("enter your password");
            progressBar1.setValue(0);
            progressBar1.setStringPainted(true);
            t1=new Thread(r);
            t1.start();

            //---- button1 ----
            button1.setIcon(new ImageIcon(getClass().getResource("/header_02.jpg")));
            button1.setBackground(new Color(255, 255, 153));

            //---- passwordField1 ----
            passwordField1.setBackground(new Color(255, 255, 153));
            passwordField1.setToolTipText("enter your password");
            passwordField1.addKeyListener(new KeyAdapter() {
                 public void keyPressed(KeyEvent e) {
            if (e.getKeyCode()==KeyEvent.VK_ENTER) {
               allowEnter();
            }
         }
                
});

            //---- button2 ----
            button2.setText("OK");
            button2.setForeground(Color.black);
            button2.setBackground(new Color(255, 255, 153));
            button2.addActionListener(e -> button2ActionPerformed(e));
           

            //---- label1 ----
            label1.setText("\u0631\u0645\u0632 \u06cc\u0627 \u06a9\u062f \u06a9\u0627\u0631\u0628\u0631\u06cc \u0627\u0634\u062a\u0628\u0627\u0647 \u0627\u0633\u062a!");
            label1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            label1.setForeground(Color.black);
            label1.setVisible(false);

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(221, 221, 221)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(progressBar1, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                        .addComponent(label2)
                                        .addGap(18, 18, 18))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(label4)
                                        .addGap(20, 20, 20)))
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(passwordField1, GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                                .addGap(37, 37, 37)
                                .addComponent(button2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(140, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(0, 180, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(label3)
                                .addGap(174, 174, 174))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(label1)
                                .addGap(230, 230, 230))))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(label3)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label2)
                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label4)
                                    .addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(label1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                                .addComponent(button2)
                                .addGap(85, 85, 85)))
                        .addComponent(progressBar1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
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
    // Generated using JFormDesigner Evaluation license - reza alipor
    private JPanel panel1;
    private JLabel label3;
    private JLabel label2;
    private JTextField textField1;
    private JLabel label4;
    private JProgressBar progressBar1;
    private JButton button1;
    private JPasswordField passwordField1;
    private JButton button2;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    
}
