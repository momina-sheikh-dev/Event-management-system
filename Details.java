/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sports;

/**
 *
 * @author User
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Arrays;
import javax.swing.*;

public class Details extends JFrame implements ActionListener{
    
JFrame frame = new JFrame();
    JLabel label = new JLabel(" DROP US A LINE  ");
    Container c = frame.getContentPane();
   
    JLabel name = new JLabel("Your Name ");
    JTextField t1 = new JTextField();
   
    JLabel gender = new JLabel("Gender ");
    JRadioButton rb1 = new JRadioButton("Male");
   
    JRadioButton rb2 = new JRadioButton("Female");
   
    ButtonGroup gen = new ButtonGroup();
   
    JLabel email = new JLabel("Email ");
    JTextField t2 = new JTextField();
   
    JLabel number = new JLabel("Phone Number ");
    JTextField t3 = new JTextField();
   
    JLabel message = new JLabel("Any Question or mesaage  ");
    JTextField t4 = new JTextField();
   
    
    JLabel customer = new JLabel(" Are you an existing customer ");
   JRadioButton R1 = new JRadioButton("YES");
   
    JRadioButton R2 = new JRadioButton("NO");
   
    ButtonGroup CUS = new ButtonGroup();
//for more information 
        JLabel info = new JLabel("FOR GROUND BOOKING MORE INFO ");
                JTextArea i = new JTextArea("If you have any questions or queries a member of"
                        + "\n" +'\r' + "staff always be happy to help "+"\n"+
                                       " feel free to contact us."+                  
                                        "Mr sufyan(Manager sport)" +"\n"+
                                         "Tel:o32-54368742  Mail: sportsevent12345gmail.com");

        

    JButton btn = new JButton("Back");
   
   
    JButton addbtn = new JButton("Add");
   
   
   

       
    void Add_details(){
       
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 800, 700);
        frame.setTitle("Any query");
        frame.setResizable(true);
       
       
        c.setBackground(Color.pink);
        Font Label = new Font("Algerian", Font.BOLD, 37);
        //53 is the size of label Sports
        label.setFont(Label);
        c.setLayout(null);
        label.setBounds(165, 45, 500, 100);
       
       //info
       Font namefont = new Font("Leelawadee UI Semilight", Font.PLAIN, 24);
        name.setFont(namefont);
        name.setBounds(90, 170, 150, 30);
        name.setLayout(null);
        Color fgcolor_name = new Color(25,25,112);
        name.setForeground(fgcolor_name);
        t1.setBounds(250, 170, 270, 28);
       

               
        Font fo = new Font("Algerian", Font.BOLD, 24);
        info.setFont(fo);
        info.setBounds(700, 170, 400, 30);
        info.setLayout(null);
        Color fgcolor_info = new Color(25,25,112);
        info.setForeground(fgcolor_info);
       
       //mesaage                
        Font m = new Font("Leelawadee UI Semilight", Font.BOLD, 24);
        i.setFont(m);
        i.setBounds(700, 200, 600, 200);
        i.setLayout(null);
        i.setBackground(Color.darkGray);
        i.setForeground(Color.WHITE);
        
       
        Font genderfont = new Font("Leelawadee UI Semilight", Font.PLAIN, 24);
        gender.setFont(genderfont);
        gender.setBounds(90, 230, 90, 30);
        gender.setLayout(null);
        Color fgcolor_gender = new Color(25,25,112);
        gender.setForeground(fgcolor_gender);
        Color bgcolor_gender = new Color(216,191,216);
        gender.setBackground(bgcolor_gender);
        gender.setFocusable(false);
       
       
        Font rb1font = new Font("Leelawadee UI Semilight", Font.PLAIN, 24);
        rb1.setFont(rb1font);
        rb1.setBounds(225, 230, 80, 30);
        rb1.setLayout(null);
        rb1.setForeground(Color.WHITE);;
        rb1.setBackground(Color.darkGray);
        rb1.setFocusable(false);
       
       
        Font rb2font = new Font("Leelawadee UI Semilight", Font.PLAIN, 24);
        rb2.setFont(rb2font);
        rb2.setBounds(330, 230, 100, 30);
        rb2.setLayout(null);
        rb2.setForeground(Color.WHITE);
        rb2.setBackground(Color.darkGray);
        rb2.setFocusable(false);
       
       
        gen.add(rb1);
        gen.add(rb2);
       
       
       
       
       
        Font addressfont = new Font("Leelawadee UI Semilight", Font.PLAIN, 24);
        email.setFont(addressfont);
        email.setBounds(90, 300, 150, 30);
        email.setLayout(null);
        Color fgcolor_address = new Color(25,50,112);
        email.setForeground(fgcolor_address);
        t2.setBounds(190, 300, 270, 28);
       
       
       
   
        Font numberfont = new Font("Leelawadee UI Semilight", Font.PLAIN, 24);
        number.setFont(numberfont);
        number.setBounds(90, 380, 190, 30);
        number.setLayout(null);
        Color fgcolor_number = new Color(25,25,112);
        number.setForeground(fgcolor_number);
        t3.setBounds(265, 380, 210, 28);        
       
       
       
       
       
        Font designationfont = new Font("Leelawadee UI Semilight", Font.PLAIN, 24);
        message.setFont(designationfont);
        message.setBounds(90, 440, 300, 70);
        message.setLayout(null);
        Color fgcolor_msg = new Color(25,25,112);
        message.setForeground(fgcolor_msg);
        t4.setBounds(390, 460, 400, 28);
       
       
         Font screen = new Font("Leelawadee UI Semilight", Font.PLAIN, 22);
        customer.setFont(screen);
        customer.setBounds(100, 540, 350, 30);
        customer.setLayout(null);
        
        customer.setForeground(Color.black);
        customer.setFocusable(false);
       
       
        Font y = new Font("Leelawadee UI Semilight", Font.PLAIN, 20);
        R1.setFont(y);
        R1.setBounds(100, 590,100, 30);
        R1.setLayout(null);
        R1.setForeground(Color.WHITE);
        R1.setBackground(Color.BLACK);
        R1.setFocusable(false);
       
       
        Font n = new Font("Leelawadee UI Semilight", Font.PLAIN, 20);
        R2.setFont(n);
        R2.setBounds(330, 590, 100, 30);
        R2.setLayout(null);
        R2.setForeground(Color.WHITE);
        R2.setBackground(Color.BLACK);
        R2.setFocusable(false);
       
       
        CUS.add(R1);
        CUS.add(R2);
       
       

        btn.setSize(100, 30);
        btn.setLocation(545, 700);
        Font button1 = new Font("Leelawadee UI Semilight", Font.BOLD, 17);
        btn.setFont(button1);
       
        Color fgcolorBtn1 = new Color(135,206,235);
        btn.setForeground(fgcolorBtn1);
        Color bgcolorBtn1 = new Color(25,25,112);
        btn.setBackground(bgcolorBtn1);

        btn.addActionListener(this);
        btn.setFocusable(false);
        Cursor cur1 = new Cursor(Cursor.HAND_CURSOR);
        btn.setCursor(cur1);
       
       
       
        addbtn.setSize(100, 30);
        addbtn.setLocation(440, 700);
        Font button2 = new Font("Leelawadee UI Semilight", Font.BOLD, 17);
        addbtn.setFont(button2);
       
        Color fgcolorBtn2 = new Color(135,206,235);
        addbtn.setForeground(fgcolorBtn2);
        Color bgcolorBtn2 = new Color(25,25,112);
        addbtn.setBackground(bgcolorBtn2);

        addbtn.addActionListener(this);
        addbtn.setFocusable(false);
        Cursor cur2 = new Cursor(Cursor.HAND_CURSOR);
        addbtn.setCursor(cur2);
       
 
       
        c.add(label);
        c.add(name);
        c.add(t1);
        c.add(email);
        c.add(t2);
        c.add(number);
        c.add(t3);
        c.add(message);
        c.add(t4);
        c.add(btn);
        c.add(addbtn);
        c.add(gender);
        c.add(rb1);
        c.add(rb2);
        c.add(customer);
        c.add(R1);
        c.add(R2);
        c.add(info);
        c.add(i);
       
    }
   
       
   
    @Override
    public void actionPerformed(ActionEvent e){
       
        if(e.getSource() == btn){
           
            frame.dispose();
        }
       
        else if(e.getSource() == addbtn){
           
        String n = t1.getText(), addr = t2.getText(), num = t3.getText(), desg = t4.getText();
           
       
        try {
           
           
            BufferedWriter writer = new BufferedWriter(new FileWriter(n +"_Querydetails.txt"));
            writer.write(name.getText() + ": "+ n +"\n\n" +
                    number.getText()+ ": "+ num +"\n\n"
                + email.getText() + ": "+ addr +"\n\n"+ message.getText() + ": "+ desg );
 
             if(rb1.isSelected()){
                        writer.write("\n\n" + gender.getText() +": Male"  );
                    }
                   
                    else if(rb2.isSelected()){
                       
                        writer.write("\n\n" + customer.getText() +": Female"  );
                    }
              if(R1.isSelected()){
                        writer.write("\n\n" + customer.getText() +": Male"  );
                    }
                   
                    else if(R2.isSelected()){
                       
                        writer.write("\n\n" + customer.getText() +": Female"  );
                    }
            writer.close();

            
        }
       
        catch (IOException ex) {
            System.out.println("An Error occured in input....");
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
       
       
           
        }
        
           
           

            
            
}
 public static void main(String[] args){
     Details obj=  new Details();
     obj.Add_details();
     
     
   }
    
}    