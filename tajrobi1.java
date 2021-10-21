import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import nezam.Main;
import nezam.Tajrobi;
/*
 * Created by JFormDesigner on Sun Aug 20 06:27:52 PDT 2017
 */



/**
 * @author mansour davoudi
 */
public class tajrobi1 extends JFrame {
        int id;
        manageEng MG=null;
        String columnName[]={"\u0634\u0645\u0627\u0631\u0647 \u0647\u0645\u0631\u0627\u0647","\u06a9\u062f \u0645\u0644\u06cc ","\u0646\u0627\u0645 \u067e\u062f\u0631 ","\u0646\u0627\u0645 \u062e\u0627\u0646\u0648\u0627\u062f\u06af\u06cc","\u0646\u0627\u0645","\u0634\u0646\u0627\u0633\u0647","\u0631\u062f\u06cc\u0641"};

    public tajrobi1() {
        initComponents();
    }
   public void saveId(int id)
   {
       this.id=id;
       String name="tajrobi";
       MG=new manageEng(id, name);
       MG.showTajrobi();
   }
   public void fillTable()
   {
        DefaultTableModel tablemodel = new DefaultTableModel(columnName, 0);
         MG=new manageEng();
        java.util.List eng=MG.listTajrobi();
        Object[] row = new Object[7];
        table1.setModel(tablemodel);
        int count=1;
        for (int i = 0; i < eng.size(); i++)
        {
            Tajrobi user =(Tajrobi)  eng.get(i);
            row[0] = user.getHphone();
            row[1] = user.getMcode();
            row[2] = user.getFname();
            row[3] = user.getLname();
            row[4] = user.getName();
            row[5]=user.getId();
            row[6]=count;
            tablemodel.addRow(row);
            count++;


        }
          DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment((int) JTable.CENTER_ALIGNMENT);
        for (int j=0; j<table1.getColumnCount(); j++){
            table1.setDefaultRenderer(table1.getColumnClass(j),renderer);
       }
        table1.updateUI();
       
   }
    private void initComponents() {
        
        panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        comboBox1 = new JComboBox<>();
        textField83 = new JTextField();
        button3 = new JButton();
        label1 = new JLabel();
           this.addWindowFocusListener(new WindowAdapter() {
    public void windowGainedFocus(WindowEvent e) {
        textField83.requestFocusInWindow();
    }
});

        //======== this ========
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(255, 255, 153));

           

            //======== scrollPane1 ========
            {

                //---- table1 ----
                table1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
                table1.setBorder(new EtchedBorder(Color.yellow, Color.black));
                table1.setRowHeight(35);
                table1.setRowMargin(4);
                table1.setForeground(Color.black);
                table1.setSelectionForeground(new Color(255, 255, 102));
                table1.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                      if (e.getClickCount() == 1) {
                              JTable table1 = (JTable)e.getSource();
                              int row = table1.getSelectedRow();
                              int column =table1.getSelectedColumn();
                              Integer id= (Integer) table1.getValueAt(row, column);
                              saveId(id);
                               
                              
      // do some action if appropriate column
    }
  }
});
                fillTable();
                scrollPane1.setViewportView(table1);
            }

            //---- comboBox1 ----
            comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                "\u0646\u0627\u0645",
                "\u0646\u0627\u0645 \u062e\u0627\u0646\u0648\u0627\u062f\u06af\u06cc ",
                "\u0634\u0645\u0627\u0631\u0647 \u0634\u0646\u0627\u0633\u0646\u0627\u0645\u0647",
                "\u062a\u0644\u0641\u0646 \u0647\u0645\u0631\u0627\u0647"
            }));
            comboBox1.setFont(new Font("B Zar", Font.PLAIN, 20));

            //---- textField83 ----
            textField83.setHorizontalAlignment(SwingConstants.CENTER);
            textField83.setFont(new Font("Segoe UI", Font.PLAIN, 16));

            //---- button3 ----
            button3.setText("\u062c\u0633\u062a\u062c\u0648");
            button3.setFont(new Font("Segoe UI", Font.PLAIN, 15));
            button3.setForeground(Color.black);
            button3.setBackground(new Color(255, 255, 102));
            button3.addActionListener(e-> button3actionPerformed(e));

            //---- label1 ----
            label1.setText("\u0627\u0637\u0644\u0627\u0639\u0627\u062a \u0645\u0639\u0645\u0627\u0631\u0627\u0646 \u062a\u062c\u0631\u0628\u06cc");
            label1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
            label1.setForeground(Color.black);

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap(396, Short.MAX_VALUE)
                        .addComponent(button3)
                        .addGap(18, 18, 18)
                        .addComponent(textField83, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(426, 426, 426))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 1018, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(488, 488, 488)
                                .addComponent(label1)))
                        .addContainerGap(93, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(label1)
                        .addGap(37, 37, 37)
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 418, GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboBox1)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(button3)
                                .addComponent(textField83, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(60, Short.MAX_VALUE))
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
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    private JPanel panel1;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JComboBox<String> comboBox1;
    private JTextField textField83;
    private JButton button3;
    private JLabel label1;

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - ali mohseni
   
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private void button3actionPerformed(ActionEvent e) {
         Tajrobi user;
        MG=new manageEng();
        String name,kind;
        name=textField83.getText();
        kind=comboBox1.getSelectedItem().toString();
        ArrayList<Tajrobi>temp=new ArrayList<>();
        DefaultTableModel tablemodel = new DefaultTableModel(columnName, 0);
         java.util.List eng=MG.listTajrobi();
         if(kind.equals("نام"))
         {
              for (int j=0;j<eng.size();j++)
         {
             user=(Tajrobi) eng.get(j);
             if(user.getName() !=null)
             {
                  if (user.getName().startsWith(name))
                   temp.add(user);
             }
           
                
         }
        Object[] row = new Object[7];
        table1.setModel(tablemodel);
        int count=1;
        for (int i = 0; i < temp.size(); i++)
        {
             user =(Tajrobi)  temp.get(i);
            row[0] = user.getHphone();
            row[1] = user.getMcode();
            row[2] = user.getFname();
            row[3] = user.getLname();
            row[4] = user.getName();
            row[5]=user.getId();
            row[6]=count;
            tablemodel.addRow(row);
            count++;


        }
             
         }
       
         if(kind.equals("نام خانوادگی "))
         {
              for (int j=0;j<eng.size();j++)
         {
             user=(Tajrobi) eng.get(j);
             if(user.getLname() !=null)
             {
                  if (user.getLname().startsWith(name))
                   temp.add(user);
             }
           
                
         }
        Object[] row = new Object[7];
        table1.setModel(tablemodel);
        int count=1;
        for (int i = 0; i < temp.size(); i++)
        {
             user =(Tajrobi)  temp.get(i);
            row[0] = user.getHphone();
            row[1] = user.getMcode();
            row[2] = user.getFname();
            row[3] = user.getLname();
            row[4] = user.getName();
            row[5]=user.getId();
            row[6]=count;
            tablemodel.addRow(row);
            count++;


        }
             
         }
            if(kind.equals("کد ملی"))
            {
              for (int j=0;j<eng.size();j++)
         {
             user=(Tajrobi) eng.get(j);
             if(user.getMcode() !=null)
             {
                  if (user.getMcode().startsWith(name))
                   temp.add(user);
             }
           
                
         }
        Object[] row = new Object[7];
        table1.setModel(tablemodel);
        int count=1;
        for (int i = 0; i < temp.size(); i++)
        {
             user =(Tajrobi)  temp.get(i);
            row[0] = user.getHphone();
            row[1] = user.getMcode();
            row[2] = user.getFname();
            row[3] = user.getLname();
            row[4] = user.getName();
            row[5]=user.getId();
            row[6]=count;
            tablemodel.addRow(row);
            count++;


        }
             
         }
                        if(kind.equals("تلفن همراه"))
            {
              for (int j=0;j<eng.size();j++)
         {
             user=(Tajrobi) eng.get(j);
             if(user.getHphone() !=null)
             {
                  if (user.getHphone().startsWith(name))
                   temp.add(user);
             }
           
                
         }
        Object[] row = new Object[7];
        table1.setModel(tablemodel);
        int count=1;
        for (int i = 0; i < temp.size(); i++)
        {
             user =(Tajrobi)  temp.get(i);
            row[0] = user.getHphone();
            row[1] = user.getMcode();
            row[2] = user.getFname();
            row[3] = user.getLname();
            row[4] = user.getName();
            row[5]=user.getId();
            row[6]=count;
            tablemodel.addRow(row);
            count++;


        }
             
         }
       
         
    }
}
