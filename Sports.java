/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sports;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author User
 */

import javax.swing.*;
public class Sports implements ActionListener {
    JFrame f;
    JPanel p;
    JLabel l;
        JLabel l2;

    
    JButton  b, b1,b3;


    Sports() {
        
        f=new JFrame("sports");
            Container c = f.getContentPane();

        f.setVisible(true);
        f.setBounds(300, 200, 400, 350);
        f.setTitle("SPORTS");
        
        
        c.setBackground(Color.BLACK);
        
        
        
       // p = new JPanel();
        //c.add(p);
       // p.setBackground(Color.yellow);
        //p.setLayout(new FlowLayout(FlowLayout.CENTER, 400,200));
        
        
        l = new JLabel("BOOK YOUR SPORTS VENUE");
        c.add(l);

        l.setForeground(Color.WHITE);
        Font Label = new Font("Book Antiqua", Font.BOLD, 40);
        //53 is the size of label Sports
        l.setFont(Label);
        l.setBounds(350, 45, 600, 100);
        c.setLayout(null);

 l2 = new JLabel("CHOOSE YOUR SPORT");
        c.add(l2);

       l2.setForeground(Color.CYAN);
        Font Label2 = new Font("Algeria", Font.BOLD, 30);
        //53 is the size of label Sports
        l2.setFont(Label2);
        l2.setBounds(420, 150, 600, 100);
        c.setLayout(null);
       
                
         b = new JButton("Cricket");
         c.add(b);
          Font cricket = new Font("Leelawadee UI Semilight", Font.PLAIN, 24);
        b.setFont(cricket);
        b.setBounds(450, 280, 150, 80);
        b.setLayout(null);
               b.setForeground(Color.BLACK);
        b.addActionListener((ActionListener) this);

         
       
         b1 = new JButton("Football");
         c.add(b1);
          Font football = new Font("Leelawadee UI Semilight", Font.PLAIN, 24);
        b1.setFont(football);
        b1.setBounds(610, 280, 150, 80);
        b1.setForeground(Color.BLACK);
        b1.addActionListener((ActionListener) this);
         
        
        b3 = new JButton("FOR ANY QUERIES CLICKED HERE  ");
         c.add(b3);
         c.add(b);
          Font query = new Font("Leelawadee UI Semilight", Font.PLAIN, 24);
        b3.setFont(football);
        b3.setBounds(420, 400, 400, 80);
       // Color fgcolor_name = new Color(25,25,112);
        b3.setForeground(Color.BLACK);
        b3.addActionListener((ActionListener) this);
        b3.setBackground(Color.PINK);
         

    }            
            
 
    
     @Override
             public void actionPerformed(ActionEvent e){
        if(e.getSource() == b){
 Cricket c =  new Cricket();
           c.cricket_details();
        }
        else if (e.getSource() == b1){
            Football f = new Football();
            f.football_details();
        }
            else if (e.getSource() == b3){
            Details d = new Details();
            
            
            d.Add_details();


        }
      
             }
 
    

    

    public static void main(String[] args) {
    new Sports();
  
    
        
    }
}
