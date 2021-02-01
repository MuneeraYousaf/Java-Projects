/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 15shi
 */
public class Manga_account extends javax.swing.JFrame {
 
    Connection connection = null;
    Statement statement =null;
    ResultSet result = null;
    PreparedStatement pst =null;
    int userID = login.id;
    
    
    public void setMyInfo() {
        String sql = String.format("SELECT uname, email, `mobile Number` FROM se WHERE id = %s ",userID);
            try
            {
                statement  = connection.createStatement();
                result = statement.executeQuery(sql);
                System.out.println(result);
                if(result.next()){
                    
                    usernamef.setText(result.getString("uname"));
                    mailf.setText(result.getString("email"));
                    phonef.setText(result.getString("mobile Number"));
                }
            }
            catch(SQLException se)
            { se.printStackTrace(); }
    }
    
    public void setBalance(){
        String sql = String.format("SELECT balance FROM se WHERE id = %s ",userID);
            try
            {
                statement  = connection.createStatement();
                result = statement.executeQuery(sql);
                if(result.next()){
                    String balance = result.getString("balance");
                    balancef.setText(balance);
                }
            }
            catch(SQLException se)
            { se.printStackTrace(); }
    }
    
    public Manga_account() {
        initComponents();
        try{
            String url ="jdbc:mysql://localhost:3306/sepro?useSSL=true";
            String username="root";
            String pass = "1234";
            connection = DriverManager.getConnection(url, username, pass);
             
            }
            catch(SQLException e){
            e.printStackTrace();
            }
    }
    private void FillListBox(){
        DefaultListModel m = new DefaultListModel();
        
        try{
            String sql = String.format("SELECT * FROM que WHERE wid = %s ",userID);
            pst = connection.prepareStatement(sql);
                    result = pst.executeQuery();
                    
            while(result.next()){
                String name = result.getString("title");
                m.addElement(name);
            }
        que_JL.setModel(m);
                    
        }
        catch(SQLException e){
            e.printStackTrace();}
        
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        maintp = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        accB = new javax.swing.JButton();
        balB = new javax.swing.JButton();
        queB = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        usernamef = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mailf = new javax.swing.JTextField();
        phonef = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        que_JL = new javax.swing.JList<>();
        delete_jl = new javax.swing.JButton();
        view_jl = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        qtp = new javax.swing.JTabbedPane();
        empty = new javax.swing.JPanel();
        add_tab = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        catg_lst = new javax.swing.JComboBox<>();
        titlef = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        desc_ar = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        rewf = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        add2b = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        yesb = new javax.swing.JButton();
        nob = new javax.swing.JButton();
        que_tp = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        edit_tab = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        catg_lst1 = new javax.swing.JComboBox<>();
        titlef1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        desc_ar1 = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        rewf1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        add_jl1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        balancef = new javax.swing.JTextField();
        loadb = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        titlelbl = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        desctxt = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        Rtable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        notetxt = new javax.swing.JLabel();
        titlelbl2 = new javax.swing.JLabel();
        rewardlbl = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 540, 40));

        maintp.setBackground(new java.awt.Color(51, 51, 51));
        maintp.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        maintp.setToolTipText("");
        maintp.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        accB.setBackground(new java.awt.Color(255, 255, 255));
        accB.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        accB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seprojectjuman/imageFolder/user.png"))); // NOI18N
        accB.setText("My account ");
        accB.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        accB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        accB.setIconTextGap(10);
        accB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accBActionPerformed(evt);
            }
        });

        balB.setBackground(new java.awt.Color(255, 255, 255));
        balB.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        balB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seprojectjuman/imageFolder/coin.png"))); // NOI18N
        balB.setText("Balance");
        balB.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        balB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        balB.setIconTextGap(10);
        balB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balBActionPerformed(evt);
            }
        });

        queB.setBackground(new java.awt.Color(255, 255, 255));
        queB.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        queB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seprojectjuman/imageFolder/setting.png"))); // NOI18N
        queB.setText("Manage questions");
        queB.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        queB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        queB.setIconTextGap(10);
        queB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queBActionPerformed(evt);
            }
        });

        jPanel13.setBackground(new java.awt.Color(37, 151, 151));

        jLabel1.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Account ");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(177, 177, 177))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(accB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(queB, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
            .addComponent(balB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(accB, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(queB, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(balB, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(291, Short.MAX_VALUE))
        );

        maintp.addTab("tab1", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(37, 151, 151));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Account Information");

        jButton1.setBackground(new java.awt.Color(37, 151, 151));
        jButton1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("<");
        jButton1.setBorder(null);
        jButton1.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel3.setText("Username ");

        usernamef.setEditable(false);
        usernamef.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        usernamef.setToolTipText("");
        usernamef.setAutoscrolls(false);
        usernamef.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        usernamef.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        usernamef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernamefActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel4.setText("E-mail");

        jLabel5.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel5.setText("Phone No.");

        mailf.setEditable(false);
        mailf.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        mailf.setToolTipText("");
        mailf.setAutoscrolls(false);
        mailf.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mailf.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        mailf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailfActionPerformed(evt);
            }
        });

        phonef.setEditable(false);
        phonef.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        phonef.setToolTipText("");
        phonef.setAutoscrolls(false);
        phonef.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        phonef.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        phonef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonefActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(phonef, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mailf, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(92, 92, 92)
                            .addComponent(usernamef, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernamef, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addGap(9, 9, 9)
                .addComponent(mailf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(phonef, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 222, Short.MAX_VALUE))
        );

        maintp.addTab("tab2", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(37, 151, 151));

        jLabel8.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("My questions ");

        jButton4.setBackground(new java.awt.Color(37, 151, 151));
        jButton4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("<");
        jButton4.setBorder(null);
        jButton4.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167)
                .addComponent(jLabel8)
                .addContainerGap(194, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8))
                .addContainerGap())
        );

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 535, -1));

        que_JL.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        que_JL.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        que_JL.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        que_JL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                que_JLMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(que_JL);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 380, 120));

        delete_jl.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        delete_jl.setText("Delete");
        delete_jl.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        delete_jl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_jlActionPerformed(evt);
            }
        });
        jPanel4.add(delete_jl, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 100, 30));

        view_jl.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        view_jl.setText("View");
        view_jl.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        view_jl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_jlActionPerformed(evt);
            }
        });
        jPanel4.add(view_jl, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 100, 30));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, 50));

        qtp.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);

        empty.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);

        javax.swing.GroupLayout emptyLayout = new javax.swing.GroupLayout(empty);
        empty.setLayout(emptyLayout);
        emptyLayout.setHorizontalGroup(
            emptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 505, Short.MAX_VALUE)
        );
        emptyLayout.setVerticalGroup(
            emptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        qtp.addTab("tab1", empty);

        add_tab.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(37, 151, 151));
        jLabel9.setText("Add Question ");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel10.setText("Title");

        jLabel11.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel11.setText("Describtion");

        jLabel12.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel12.setText("Category");

        catg_lst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "general", "math", "computer", "chemistry", "biology", "religion", " " }));
        catg_lst.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);

        titlef.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        titlef.setToolTipText("");
        titlef.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        titlef.setCaretColor(new java.awt.Color(102, 102, 102));
        titlef.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        titlef.setFocusCycleRoot(true);

        desc_ar.setColumns(20);
        desc_ar.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        desc_ar.setRows(5);
        desc_ar.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        jScrollPane2.setViewportView(desc_ar);

        jLabel13.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel13.setText("Reward");

        rewf.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        rewf.setToolTipText("");
        rewf.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rewf.setCaretColor(new java.awt.Color(102, 102, 102));
        rewf.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        rewf.setFocusCycleRoot(true);
        rewf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rewfActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel14.setText("SAR");

        add2b.setText("Add");
        add2b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2bActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout add_tabLayout = new javax.swing.GroupLayout(add_tab);
        add_tab.setLayout(add_tabLayout);
        add_tabLayout.setHorizontalGroup(
            add_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(add_tabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(add_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, add_tabLayout.createSequentialGroup()
                        .addGroup(add_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(add_tabLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(titlef, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
                            .addGroup(add_tabLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(add_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(add_tabLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rewf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14))
                            .addGroup(add_tabLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(catg_lst, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, add_tabLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(add2b, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        add_tabLayout.setVerticalGroup(
            add_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_tabLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(add_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(catg_lst, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titlef, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(add_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(rewf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(add2b, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        qtp.addTab("add", add_tab);

        jPanel10.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(37, 151, 151));
        jLabel15.setText("Remove Question");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(355, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel16.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel16.setText("Are you sure you want to delete the selected question ? ");

        yesb.setBackground(new java.awt.Color(255, 255, 255));
        yesb.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        yesb.setText("Yes");
        yesb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        yesb.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        yesb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesbActionPerformed(evt);
            }
        });

        nob.setBackground(new java.awt.Color(255, 255, 255));
        nob.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        nob.setText("No");
        nob.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nob.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        nob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nobActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(yesb, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nob, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel16)
                .addGap(48, 48, 48)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yesb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nob, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 127, Short.MAX_VALUE))
        );

        qtp.addTab("delete", jPanel10);

        que_tp.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        que_tp.setDoubleBuffered(false);

        jLabel17.setFont(new java.awt.Font("Candara", 1, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 0, 0));
        jLabel17.setText("Please select a question from the list");

        javax.swing.GroupLayout que_tpLayout = new javax.swing.GroupLayout(que_tp);
        que_tp.setLayout(que_tpLayout);
        que_tpLayout.setHorizontalGroup(
            que_tpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(que_tpLayout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        que_tpLayout.setVerticalGroup(
            que_tpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(que_tpLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel17)
                .addContainerGap(221, Short.MAX_VALUE))
        );

        qtp.addTab("warn", que_tp);

        edit_tab.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel21.setText("Edit Question ");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel22.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel22.setText("Title");

        jLabel23.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel23.setText("Describtion");

        jLabel24.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel24.setText("Category");

        catg_lst1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "general", "math", "computer", "chemistry", "biology", "religion", " " }));
        catg_lst1.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);

        titlef1.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        titlef1.setToolTipText("");
        titlef1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        titlef1.setCaretColor(new java.awt.Color(102, 102, 102));
        titlef1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        titlef1.setFocusCycleRoot(true);

        desc_ar1.setColumns(20);
        desc_ar1.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        desc_ar1.setRows(5);
        desc_ar1.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        jScrollPane3.setViewportView(desc_ar1);

        jLabel25.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel25.setText("Reward");

        rewf1.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        rewf1.setToolTipText("");
        rewf1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rewf1.setCaretColor(new java.awt.Color(102, 102, 102));
        rewf1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        rewf1.setFocusCycleRoot(true);
        rewf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rewf1ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel26.setText("SAR");

        jButton5.setText("submit");
        jButton5.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout edit_tabLayout = new javax.swing.GroupLayout(edit_tab);
        edit_tab.setLayout(edit_tabLayout);
        edit_tabLayout.setHorizontalGroup(
            edit_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(edit_tabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(edit_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, edit_tabLayout.createSequentialGroup()
                        .addGroup(edit_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(edit_tabLayout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(titlef1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
                            .addGroup(edit_tabLayout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(edit_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(edit_tabLayout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rewf1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel26))
                            .addGroup(edit_tabLayout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(catg_lst1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, edit_tabLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        edit_tabLayout.setVerticalGroup(
            edit_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edit_tabLayout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(edit_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel24)
                    .addComponent(catg_lst1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titlef1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(edit_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel25)
                    .addComponent(rewf1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        qtp.addTab("edit", edit_tab);

        jPanel4.add(qtp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 510, 350));

        add_jl1.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        add_jl1.setText("Add");
        add_jl1.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        add_jl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_jl1ActionPerformed(evt);
            }
        });
        jPanel4.add(add_jl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 70, 100, 30));

        maintp.addTab("tab4", jPanel4);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(37, 151, 151));

        jLabel6.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Balance");

        jButton2.setBackground(new java.awt.Color(37, 151, 151));
        jButton2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("<");
        jButton2.setBorder(null);
        jButton2.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel7.setText("Avalible Balance: ");

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jTextField2.setText("SAR");
        jTextField2.setToolTipText("");
        jTextField2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField2.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField2.setFocusCycleRoot(true);

        balancef.setEditable(false);
        balancef.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        balancef.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        balancef.setText("25");
        balancef.setToolTipText("");
        balancef.setAutoscrolls(false);
        balancef.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        balancef.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        balancef.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        balancef.setMargin(new java.awt.Insets(2, 5, 2, 10));

        loadb.setBackground(new java.awt.Color(218, 104, 104));
        loadb.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        loadb.setText("Load money");
        loadb.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        loadb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(loadb, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel7)
                        .addGap(37, 37, 37)
                        .addComponent(balancef, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(balancef, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(254, 254, 254)
                .addComponent(loadb, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        maintp.addTab("tab3", jPanel3);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        titlelbl.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        titlelbl.setText("title");

        jScrollPane4.setBorder(null);

        desctxt.setEditable(false);
        desctxt.setBackground(new java.awt.Color(240, 240, 240));
        desctxt.setColumns(20);
        desctxt.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        desctxt.setLineWrap(true);
        desctxt.setRows(4);
        desctxt.setText("545");
        desctxt.setToolTipText("");
        desctxt.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        jScrollPane4.setViewportView(desctxt);

        Rtable.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        Rtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Replay ID", "Writer ID ", "Reply"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Rtable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        Rtable.setColumnSelectionAllowed(true);
        Rtable.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        jScrollPane5.setViewportView(Rtable);
        Rtable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (Rtable.getColumnModel().getColumnCount() > 0) {
            Rtable.getColumnModel().getColumn(0).setMaxWidth(75);
            Rtable.getColumnModel().getColumn(1).setMaxWidth(75);
        }

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        notetxt.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        notetxt.setForeground(new java.awt.Color(0, 0, 255));
        notetxt.setText("if you found the answer you are looking for, reward its writer.");

        titlelbl2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        titlelbl2.setText("Question reward: ");

        rewardlbl.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(titlelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addComponent(notetxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(titlelbl2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rewardlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titlelbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titlelbl2)
                    .addComponent(rewardlbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notetxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton6.setText("<");
        jButton6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton6.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        jButton6.setFocusable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 554, Short.MAX_VALUE))
                .addContainerGap())
        );

        maintp.addTab("tab5", jPanel15);

        getContentPane().add(maintp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void balBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balBActionPerformed
        setBalance();
        maintp.setSelectedIndex(3);
    }//GEN-LAST:event_balBActionPerformed

    private void accBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accBActionPerformed
        setMyInfo();
        maintp.setSelectedIndex(1);
    }//GEN-LAST:event_accBActionPerformed

    private void queBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queBActionPerformed
        FillListBox();
        maintp.setSelectedIndex(2);
    }//GEN-LAST:event_queBActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        maintp.setSelectedIndex(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void mailfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailfActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        maintp.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void phonefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonefActionPerformed

    private void usernamefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernamefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernamefActionPerformed

    private void rewfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rewfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rewfActionPerformed

    private void yesbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesbActionPerformed
        // TODO add your handling code here:
        String title =(String) que_JL.getSelectedValue();
        String sql = String.format("delete from que where title = '%s';",title);

        try{
            Statement s = connection.createStatement();
            s.executeUpdate(sql);
        }

        catch(SQLException ex){
            ex.printStackTrace();
        }
        JOptionPane.showMessageDialog(rootPane, "Question has been deleted !");
        FillListBox();
    }//GEN-LAST:event_yesbActionPerformed

    private void nobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nobActionPerformed
        // TODO add your handling code here:
        qtp.setSelectedIndex(0);
    }//GEN-LAST:event_nobActionPerformed

    private void loadbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadbActionPerformed
        load  f = new  load();
        f.setVisible(true);
        f.setBalance2(balancef.getText());
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_loadbActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        maintp.setSelectedIndex(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void rewf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rewf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rewf1ActionPerformed

    private void add_jl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_jl1ActionPerformed
        qtp.setSelectedIndex(1);
    }//GEN-LAST:event_add_jl1ActionPerformed

    private void delete_jlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_jlActionPerformed
        if (que_JL.isSelectionEmpty()) qtp.setSelectedIndex(3);
        else qtp.setSelectedIndex(2);
    }//GEN-LAST:event_delete_jlActionPerformed

    private void view_jlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_jlActionPerformed
       
        if (que_JL.isSelectionEmpty()) qtp.setSelectedIndex(3);
       else { maintp.setSelectedIndex(4);
        int  selectedq = 0 ;
        String selectedTitle = (String) que_JL.getSelectedValue();
        titlelbl.setText(selectedTitle);
        String sql = String.format("SELECT qid , describ, reward FROM que WHERE title = '%s' ",selectedTitle);
        try{
            statement  = connection.createStatement();
                result = statement.executeQuery(sql);
                if(result.next()){
                    desctxt.setText(result.getString("describ"));
                    selectedq = result.getInt("qid");
                    rewardlbl.setText(result.getString("reward"));
                     }
                    
        }
        catch(SQLException e){
            e.printStackTrace();}
        DefaultTableModel table =  (DefaultTableModel)Rtable.getModel();
        table.getDataVector().removeAllElements();
        table.fireTableDataChanged(); 
    
        String sql1 = String.format("SELECT rid , writerid, text FROM replies WHERE qid = %s ",selectedq);
        try{
            //statement  = connection.createStatement();
                result = statement.executeQuery(sql1);
                if (!result.next()) notetxt.setText("No replies yet ..");
                else notetxt.setText("you found the answer you are looking for, reward its writer.");
                while(result.next()){
                    table.addRow(new Object[]{
                        result.getInt("rid"),
                        result.getString("writerid"),
                        result.getString("text"),
                        false
                          });
                     }
                Rtable.setModel(table);
                    
        }
        catch(SQLException e){
            e.printStackTrace();}}
        
    }//GEN-LAST:event_view_jlActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        maintp.setSelectedIndex(2);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void add2bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add2bActionPerformed
        String title= titlef.getText();
        int selectedin  = catg_lst.getSelectedIndex();
        String category = catg_lst.getItemAt(selectedin);
        String desc = desc_ar.getText();
        String reward = rewf.getText();
        
        String sql = String.format("INSERT INTO que (wid,title,catg,describ,reward) " ///// stoped here ////********/////
                + "values ('%s','%s','%s','%s','%s');",userID,title,category,desc,reward);
        
        try{
             Statement s = connection.createStatement();
             s.executeUpdate(sql);
             
            }
            catch(SQLException ex){
            ex.printStackTrace();
            }
        FillListBox();
    }//GEN-LAST:event_add2bActionPerformed

    private void que_JLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_que_JLMouseClicked
       
    }//GEN-LAST:event_que_JLMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int rowNumber = Rtable.getSelectedRow();
        JOptionPane.showMessageDialog(null, "Reward has been transformed to user number "+ Rtable.getValueAt(rowNumber, 1));
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Manga_account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manga_account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manga_account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manga_account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manga_account().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Rtable;
    private javax.swing.JButton accB;
    private javax.swing.JButton add2b;
    private javax.swing.JButton add_jl1;
    private javax.swing.JPanel add_tab;
    private javax.swing.JButton balB;
    public javax.swing.JTextField balancef;
    private javax.swing.JComboBox<String> catg_lst;
    private javax.swing.JComboBox<String> catg_lst1;
    private javax.swing.JButton delete_jl;
    private javax.swing.JTextArea desc_ar;
    private javax.swing.JTextArea desc_ar1;
    private javax.swing.JTextArea desctxt;
    private javax.swing.JPanel edit_tab;
    private javax.swing.JPanel empty;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton loadb;
    private javax.swing.JTextField mailf;
    private javax.swing.JTabbedPane maintp;
    private javax.swing.JButton nob;
    private javax.swing.JLabel notetxt;
    private javax.swing.JTextField phonef;
    private javax.swing.JTabbedPane qtp;
    private javax.swing.JButton queB;
    private javax.swing.JList<String> que_JL;
    private javax.swing.JPanel que_tp;
    private javax.swing.JLabel rewardlbl;
    private javax.swing.JTextField rewf;
    private javax.swing.JTextField rewf1;
    private javax.swing.JTextField titlef;
    private javax.swing.JTextField titlef1;
    private javax.swing.JLabel titlelbl;
    private javax.swing.JLabel titlelbl2;
    private javax.swing.JTextField usernamef;
    private javax.swing.JButton view_jl;
    private javax.swing.JButton yesb;
    // End of variables declaration//GEN-END:variables
}
