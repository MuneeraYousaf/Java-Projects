package pse;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.scene.paint.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class login extends JFrame implements ActionListener{
    static int id;
    String usenames;
    ImageIcon img=new ImageIcon(getClass().getResource("img.jpg"));
    JLabel lbimg=new JLabel(img);
    JPanel panel=new JPanel();
    JButton bt=new JButton("Sign up");
    JButton btn=new JButton("Sign in");
    JButton btn2=new JButton("Visitor");
    JLabel lb=new JLabel("User Name");
    JLabel lb2=new JLabel("Password");
    JTextField username=new JTextField(30);
    JPasswordField pass=new JPasswordField(30);
    
     Connection con = null;
    PreparedStatement p= null;
    
     JPanel p1=new JPanel();
    public login() {
        super("Ask & Learn");
        p1.setBackground(new java.awt.Color (37,151,151));
        //setLayout(new FlowLayout());
        lbimg.setSize(200, 200);
        lbimg.setBounds(0,0,500,420);
        add(lbimg);
        lb.setBounds(10,450,100,20);
        lb.setFont(new Font("Arial", Font.BOLD, 15));
         add(lb);
        username.setBounds(150,450,250,22);
       
        add(username);
        lb2.setBounds(10,480,150,20);
        pass.setBounds(150,480,250,22);
        lb2.setFont(new Font("Arial", Font.BOLD, 15));
       
        add(lb2);
        add(pass);
        bt.setBounds(70,510,100,30);
     
        btn.setBounds(200,510,100,30);
        btn2.setBounds(330,510,100,30);
        btn2.setBackground(new java.awt.Color (218,104,104));
        btn.setBackground(new java.awt.Color (218,104,104));
        bt.setBackground(new java.awt.Color (218,104,104));
        add(bt);
        add(btn);
        add(btn2);
        add(p1);
        bt.addActionListener(this);
        btn.addActionListener(this);
        btn2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
       if(e.getSource()==bt){
           
       ask a=new ask();
//       a.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//       a.setSize(500,500);
       a.setVisible(true);
       }
    
    else if(e.getSource()==btn){
       String user=username.getText(); 
       String password=pass.getText();
            
            try{
            con=DriverManager.getConnection("jdbc:mysql://localhost/sepro?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root","1234");
            Statement s=con.createStatement();
            Statement s2=con.createStatement();
            String query =String.format("SELECT * FROM sepro.se WHERE uname ='%s' AND pass='%s'",user,password);
            String query2 =String.format("SELECT * FROM sepro.tutor2 WHERE uname ='%s' AND pass='%s'",user,password);
            ResultSet res=s.executeQuery(query);
            ResultSet res2=s2.executeQuery(query2);
            if(res.next()){
              id = res.getInt(1);
              System.out.println("ID"+id);
            //JOptionPane.showMessageDialog(rootPane, "Welcome", "Massage", JOptionPane.INFORMATION_MESSAGE); 

              MainPages a=new MainPages();
              a.setVisible(true);
        
            }
            else if(res2.next()){
              id = res2.getInt(1);
              System.out.println("ID"+id);
            //JOptionPane.showMessageDialog(rootPane, "Welcome", "Massage", JOptionPane.INFORMATION_MESSAGE); 

              MainPages a=new MainPages();
              a.setVisible(true);
        
            }
            else{
                 JOptionPane.showMessageDialog(rootPane, "Wrong input", "Massage", JOptionPane.ERROR_MESSAGE); 
            }
          
            con.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex); 
            }
        }
       if(e.getSource()==btn2){
           MainPage mn=new MainPage();
           mn.setVisible(true);
       }
       
    }}


    


