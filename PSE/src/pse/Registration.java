
package pse;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author munee
 */
public class Registration extends JFrame implements ActionListener{
    
         
          
    JLabel name=new JLabel("UserName");
    JLabel title=new JLabel("Registration Form");
    static int id;
   JTextField tf =new JTextField();

   //password
    JLabel password=new JLabel("Password");
    JPasswordField pass=new JPasswordField(30);
    

    
    JLabel names=new JLabel("Name");
    JTextField tname=new JTextField();
    
    //mobile number
    JLabel number=new JLabel("Mobile Number");
    JTextField tnum=new JTextField();
    
    //email
    JLabel email=new JLabel("E-mail");
    JTextField temail=new JTextField();
    
    //major
    JLabel major=new JLabel("Major");
    JTextField tmajor=new JTextField();
    //id card 
    JLabel card =new JLabel("ID Card");
    JTextField tcard =new JTextField();
     JLabel about =new JLabel("About");
    JTextArea tabout =new JTextArea();
    
    //button
    JButton btn=new JButton("Register");
    
    Connection con = null;
    PreparedStatement p= null;
    
    JPanel p1=new JPanel();
    public Registration(){
        super("Registration Form");
       // p1.setBounds(600,300,15,20);
        p1.setBackground(new Color (37,151,151));
        
        //title
        title.setFont(new Font("Monospaced", Font.BOLD, 30)); 
        title.setBounds(90, 20,400,40); 
        add(title);
        
        //name
        names.setFont(new Font("Arial", Font.PLAIN+Font.BOLD, 12));
        names.setBounds(100,80,150,40);
        add(names);
        tname.setBounds(250,90,150,20);
        add(tname);
        
        //major
        major.setFont(new Font("Arial", Font.PLAIN+Font.BOLD, 12));
        major.setBounds(100,120,150,40);
        add(major);
        tmajor.setBounds(250,130,150,20);
        add(tmajor);
        
        //username
         name.setFont(new Font("Arial", Font.PLAIN+Font.BOLD, 12));
        name.setBounds(100,155,150,40);
        add(name);
        tf.setBounds(250,170,150,20);
        add(tf);
        
        //pssword
        password.setFont(new Font("Arial", Font.PLAIN+Font.BOLD, 12));
        password.setBounds(99, 195, 150, 40);
        pass.setBounds(250,210,150,20);
        add(password);
        add(pass);
        
   
        //mobile
        number.setBounds(99, 240, 150, 40);
        tnum.setBounds(250,250,150,20);
        add(number);
        add(tnum);
        
        //emile
         email.setBounds(99, 270, 150, 40);
        temail.setBounds(250,280,150,20);
        add(email);
        add(temail);
  
 
        //id card
        card.setBounds(99, 300, 150, 40);
        card.setFont(new Font("Arial", Font.PLAIN+Font.BOLD, 12));
        tcard.setBounds(250,310,150,20);
        add(card);
        add(tcard);
        about.setBounds(99, 340, 150, 40);
        about.setFont(new Font("Arial", Font.PLAIN+Font.BOLD, 12));
        tabout.setBounds(250,350,150,80);
        add(about);
        add(tabout);
        
        //button
        btn.setBounds(150,450, 100, 40);
        add(btn);
        
        btn.setBackground(new Color (218,104,104));
        add(p1);
        btn.addActionListener(this);
        
}
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String url= "jdbc:mysql://localhost:3306/sepro"; 
        
   if(e.getSource()==btn){
            
            try{
           
            String query = String.format("INSERT INTO `sepro`.`tutor2` (`name`, `major`, `mail`, `about_tutor`, `phone`, `ID card`, `uname`, `pass`) VALUES (?,?,?,?,?,?,?,?);");
            
           con= DriverManager.getConnection(url,"root","1234");
           p=con.prepareStatement(query);
              if ( (tf.getText().isEmpty())||(pass.getText().isEmpty())||(temail.getText().isEmpty())||(tcard.getText().isEmpty())||(tnum.getText().isEmpty())||(tmajor.getText().isEmpty()))
             JOptionPane.showMessageDialog(null, "You have to Complete your information!!!","Erorr", JOptionPane.ERROR_MESSAGE);
       
             else
             {
                
            p.setString(1, tname.getText());
            p.setString(2, tmajor.getText());
            p.setString(3, temail.getText());
            p.setString(4, tabout.getText());
            p.setString(5, tnum.getText());
            p.setString(6, tcard.getText());
            p.setString(7, tf.getText());
            p.setString(8, pass.getText());
            p.executeUpdate();
           JOptionPane.showMessageDialog(rootPane, "Data are Registered successfully", "Massage", JOptionPane.INFORMATION_MESSAGE);
           this.dispose();
           
            login frm=new login();
            frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frm.setSize(500,600);
            frm.setVisible(true);
            this.dispose();
             }
            con.close();  
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex); 
            }
 
   }
        }
    
      
}

