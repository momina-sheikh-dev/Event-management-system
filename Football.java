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

public class Football extends JFrame implements ActionListener {

    double amount = 0;
    String msg = "";

    JFrame frame = new JFrame();
    JLabel label = new JLabel("welcome in Football's world");

    Container c = frame.getContentPane();

    JLabel heading = new JLabel("ITEMS                QUANTITY                   PRICE");
    JLabel m1 = new JLabel("    FootBalls         ----------------------- 50 -------------------------");
    JLabel m2 = new JLabel("    Mouth guards       ----------------------- 100---------------------");
    JLabel m3 = new JLabel("    Shoulder pads ----------------------- 100 -------------------------");
    JLabel m4 = new JLabel("    Neck collar     ----------------------- 100 -------------------------");
    JLabel m5 = new JLabel("    Helmet      ----------------------- 100 ------------------------------");
    JLabel m6 = new JLabel("    Boundary Flags -------------------- 800 ------------------------");
    JLabel m7 = new JLabel("    Sports wear ----------------------- 100 -------------------------");

    JCheckBox t1 = new JCheckBox("75,000");
    JCheckBox t2 = new JCheckBox("10,500");
    JCheckBox t3 = new JCheckBox("12,000");
    JCheckBox t4 = new JCheckBox("10,000");
    JCheckBox t5 = new JCheckBox("80,000");
    JCheckBox t6 = new JCheckBox("8000");
    JCheckBox t7 = new JCheckBox("90,000");

    JButton button = new JButton("CALCULATE: ");
    JTextField tname = new JTextField("");

    //sound system
    
    
    JLabel Soundsystem = new JLabel("SOUND SYSTEM ");
    JRadioButton rb1 = new JRadioButton("yes");

    JRadioButton rb2 = new JRadioButton("No");
    ButtonGroup gen = new ButtonGroup();

    JLabel LED = new JLabel("SPORT LED VIDEO DISPLAY");
    JRadioButton r = new JRadioButton("yes");

    JRadioButton r2 = new JRadioButton("No");
    ButtonGroup led = new ButtonGroup();

    JLabel seats = new JLabel("SEATS BOOKING");
    JTextArea ta = new JTextArea("write number of seats you want to book");

    JLabel brand = new JLabel("CHOOSE BRAND FOR AN ITEM :");
    JRadioButton N = new JRadioButton("Nike");

    JRadioButton a = new JRadioButton("Adidas");

    JRadioButton P = new JRadioButton("Puma");

    JRadioButton B = new JRadioButton("Brooks");
    ButtonGroup BG = new ButtonGroup();

    //booking
    JLabel booking = new JLabel("booking");

    JLabel BL = new JLabel("Ground rent");

    JCheckBox bookingradio = new JCheckBox("2 lack ");

//recepit
    JTextArea text = new JTextArea();
    //recepit
    JButton rp = new JButton("recepit: ");

    JButton btn = new JButton("Back");

    JButton addbtn = new JButton("Add");

    void football_details() {

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 800, 600);
        frame.setTitle("cricket");
        frame.setResizable(true);

        c.setBackground(Color.blue);
        Font Label = new Font("Book Antiqua", Font.BOLD, 53);
        label.setFont(Label);
        c.setLayout(null);
        label.setBounds(280, 20, 905, 40);
        label.setForeground(Color.BLACK);

        //items,price ,...
        Font namefont = new Font("Algerian", Font.BOLD, 24);
        heading.setFont(namefont);
        heading.setBounds(100, 100, 900, 30);
        heading.setLayout(null);
        heading.setForeground(Color.CYAN);

        //footballs items :
        Font bat = new Font("Algerian", Font.PLAIN, 15);
        m1.setFont(bat);
        m1.setBounds(100, 100, 1000, 100);
        m1.setLayout(null);

        //mouthguard items
        Font ball = new Font("Algerian", Font.PLAIN, 15);
        m2.setFont(ball);
        m2.setBounds(100, 110, 1000, 140);
        m2.setLayout(null);

        //shoulder pads
        Font bp = new Font("Algerian", Font.PLAIN, 15);
        m3.setFont(bp);
        m3.setBounds(100, 120, 1000, 180);
        m3.setLayout(null);
        
        //neck collar
        Font gloves = new Font("Algerian", Font.PLAIN, 15);
        m4.setFont(gloves);
        m4.setBounds(100, 140, 1000, 200);
        m4.setLayout(null);
        //helmet
        Font helmet = new Font("Algerian", Font.PLAIN, 15);
        m5.setFont(helmet);
        m5.setBounds(100, 155, 1000, 230);
        m5.setLayout(null);
        
        //boundaryFlags
        Font bf = new Font("Algerian", Font.PLAIN, 15);
        m6.setFont(bf);
        m6.setBounds(100, 180, 1000, 250);
        m6.setLayout(null);
        
        //sports waer
        Font shirts = new Font("Algerian", Font.PLAIN, 15);
        m7.setFont(shirts);
        m7.setBounds(100, 205, 1000, 270);
        m7.setLayout(null);

        t1.setBounds(500, 140, 80, 20);
        t2.setBounds(500, 170, 80, 20);
        t3.setBounds(500, 200, 80, 20);
        t4.setBounds(500, 230, 80, 20);
        t5.setBounds(500, 260, 80, 20);
        t6.setBounds(500, 295, 80, 20);
        t7.setBounds(500, 330, 80, 20);
        // t8.setBounds(200, 510, 180, 30);

        //sound system
        Font sound = new Font("Algerian", Font.BOLD, 23);
        Soundsystem.setFont(sound);
        Soundsystem.setBounds(100, 370, 190, 30);
        Soundsystem.setLayout(null);
        Soundsystem.setForeground(Color.CYAN);
        Soundsystem.setBackground(Color.BLACK);
        Soundsystem.setFocusable(false);
        
        //SOUND SYSTEM BUTTON
        Font rb1font = new Font("Leelawadee UI Semilight", Font.PLAIN, 20);
        rb1.setFont(rb1font);
        rb1.setBounds(100, 405, 80, 30);
        rb1.setLayout(null);
        rb1.setForeground(Color.WHITE);
        rb1.setBackground(Color.BLACK);
        rb1.setFocusable(false);
        
        //SOUND SYSTEM BUTTON
        Font rb2font = new Font("Leelawadee UI Semilight", Font.PLAIN, 20);
        rb2.setFont(rb2font);
        rb2.setBounds(330, 405, 100, 30);
        rb2.setLayout(null);
        rb2.setForeground(Color.WHITE);
        rb2.setBackground(Color.black);
        rb2.setFocusable(false);

        gen.add(rb1);
        gen.add(rb2);
        
         //LED SCREEN
        Font screen = new Font("Algerian", Font.BOLD, 23);
        LED.setFont(screen);
        LED.setBounds(100, 440, 320, 30);
        LED.setLayout(null);

        LED.setForeground(Color.CYAN);
        LED.setFocusable(false);
        //led button
        Font y = new Font("Leelawadee UI Semilight", Font.PLAIN, 20);
        r.setFont(y);
        r.setBounds(100, 470, 80, 30);
        r.setLayout(null);
        r.setForeground(Color.WHITE);
        r.setBackground(Color.BLACK);
        r.setFocusable(false);
        
        //led button
        Font n = new Font("Leelawadee UI Semilight", Font.PLAIN, 20);
        r2.setFont(n);
        r2.setBounds(330, 470, 100, 30);
        r2.setLayout(null);
        r2.setForeground(Color.WHITE);
        r2.setBackground(Color.BLACK);
        r2.setFocusable(false);

        led.add(r);
        led.add(r2);

        //number of seats
        Font Snumberfont = new Font("Algerian", Font.BOLD, 23);
        seats.setFont(Snumberfont);
        seats.setBounds(90, 510, 220, 30);
        seats.setLayout(null);
        seats.setForeground(Color.CYAN);
        //work for text area of seats 
        ta.setBounds(280, 510, 230, 30);

        //brand
        Font b = new Font("Algerian", Font.BOLD, 23);
        brand.setFont(b);
        brand.setBounds(100, 560, 500, 30);
        brand.setLayout(null);
        brand.setForeground(Color.CYAN);
        brand.setFocusable(false);

        Font nike = new Font("Leelawadee UI Semilight", Font.PLAIN, 20);
        N.setFont(nike);
        N.setBounds(100, 600, 100, 30);
        N.setLayout(null);
        N.setForeground(Color.WHITE);
        N.setBackground(Color.BLACK);
        N.setFocusable(false);

        Font adidas = new Font("Leelawadee UI Semilight", Font.PLAIN, 20);
        a.setFont(adidas);
        a.setBounds(330, 600, 100, 30);
        a.setLayout(null);
        a.setForeground(Color.WHITE);
        a.setBackground(Color.BLACK);
        a.setFocusable(false);

        Font puma = new Font("Leelawadee UI Semilight", Font.PLAIN, 20);
        P.setFont(puma);
        P.setBounds(100, 640, 100, 30);
        P.setLayout(null);
        P.setForeground(Color.WHITE);
        P.setBackground(Color.BLACK);
        P.setFocusable(false);

        Font brooks = new Font("Leelawadee UI Semilight", Font.PLAIN, 20);
        B.setFont(brooks);
        B.setBounds(330, 640, 100, 30);
        B.setLayout(null);
        B.setForeground(Color.WHITE);
        B.setBackground(Color.BLACK);
        B.setFocusable(false);

        BG.add(N);
        BG.add(a);
        BG.add(P);

        BG.add(B);

        //CALCULATOR
        Font nt = new Font("Algerian", Font.PLAIN, 15);
        button.setFont(nt);
        button.setBounds(100, 690, 150, 30);

        Color fgcolorB = new Color(135, 206, 235);
        button.setForeground(fgcolorB);
        Color bgcolorB = new Color(25, 25, 112);
        button.setBackground(bgcolorB);
        button.setLayout(null);
        button.addActionListener(this);
        //textfield of calcultor
        tname.setBounds(260, 688, 110, 28);
        tname.setForeground(Color.BLACK);
        tname.setLayout(null);
        tname.setForeground(Color.white);
        tname.addActionListener(this);

        //booking
        Font book = new Font("Algerian", Font.BOLD, 24);
        booking.setFont(book);
        booking.setBounds(800, 80, 900, 30);
        booking.setForeground(Color.cyan);
        booking.setLayout(null);
        booking.setBackground(Color.PINK);

        //booking label 1 ground booking
        Font L = new Font("Algerian", Font.BOLD, 20);
        BL.setFont(L);
        BL.setBounds(800, 110, 200, 30);
        BL.setForeground(Color.BLACK);
        BL.setLayout(null);
        
        //booking radio button
        Font op = new Font("Leelawadee UI Semilight", Font.PLAIN, 20);
        bookingradio.setFont(op);
        bookingradio.setBounds(800, 150, 200, 25);
        bookingradio.setForeground(Color.BLACK);
        bookingradio.setLayout(null);

        //RECEPIT
        Font o = new Font("Leelawadee UI Semilight", Font.BOLD, 18);
        text.setFont(o);
        text.setBounds(700, 190, 550, 400);
        text.setLayout(null);
        text.setForeground(Color.black);
        text.setBackground(Color.white);

        //back button work
        btn.setSize(100, 30);
        btn.setLocation(900, 650);
        Font button1 = new Font("Leelawadee UI Semilight", Font.BOLD, 17);
        btn.setFont(button1);
        
        btn.addActionListener(this);
        btn.setFocusable(false);
        Cursor cur1 = new Cursor(Cursor.HAND_CURSOR);
        btn.setCursor(cur1);
        Color fgcolorBtn1 = new Color(135, 206, 235);
        btn.setForeground(fgcolorBtn1);
        Color bgcolorBtn1 = new Color(25, 25, 112);
        btn.setBackground(bgcolorBtn1);

      //add button work
        addbtn.setSize(100, 30);
        addbtn.setLocation(700, 650);
        Font button2 = new Font("Leelawadee UI Semilight", Font.BOLD, 17);
        addbtn.setFont(button2);
        Color fgcolorBtn2 = new Color(135, 206, 235);
        addbtn.setForeground(fgcolorBtn2);
        Color bgcolorBtn2 = new Color(25, 25, 112);
        addbtn.setBackground(bgcolorBtn2);
        
        addbtn.addActionListener(this);
        addbtn.setFocusable(false);
        Cursor cur2 = new Cursor(Cursor.HAND_CURSOR);
        addbtn.setCursor(cur2);
        
        //adding in a container
        c.add(label);
        c.add(heading);
        c.add(btn);
        c.add(addbtn);
        c.add(m1);
        c.add(m2);
        c.add(m3);
        c.add(m4);
        c.add(m5);
        c.add(m6);
        c.add(m7);
        c.add(t1);
        c.add(t2);
        c.add(t3);
        c.add(t4);
        c.add(t5);
        c.add(t6);
        c.add(t7);
        c.add(button);
        c.add(button);
        c.add(Soundsystem);
        c.add(rb1);
        c.add(rb2);
        c.add(LED);
        c.add(r);
        c.add(r2);
        c.add(tname);
        c.add(seats);
        c.add(ta);
        c.add(brand);
        c.add(N);
        c.add(a);
        c.add(P);
        c.add(B);
        c.add(booking);
        c.add(BL);
        c.add(bookingradio);
        c.add(text);
        c.add(rp);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {

            //calculation work
            if (bookingradio.isSelected()) {

                amount = amount + 200000;
                msg += "the ground rent  is :2 lack(200,000)\n";
            } else {
                amount = 0;
            }

            if (t1.isSelected()) {

                amount = amount + 75000;
                msg += " Total Football price:75000\n";

            }
            if (t2.isSelected()) {
                amount = amount + 10500;
                msg += " Total Mouth guards price:10500\n";
            }
            if (t3.isSelected()) {
                amount = amount + 12000;
                msg += " Total shoulder pads price:12000\n";

            }
            if (t4.isSelected()) {
                amount = amount + 10000;
                msg += " Total Neck collar price:10000\n";

            }

            if (t5.isSelected()) {
                amount = amount + 80000;
                msg += " Total Helmet price:80000\n";

            }

            if (t6.isSelected()) {
                amount = amount + 8000;
                msg += " Total Boundary Flags price:8000\n";

            }

            if (t7.isSelected()) {
                amount = amount + 90000;
                msg += "SPORTS WEAR:90000\n";
            }

            JOptionPane.showMessageDialog(this, msg + " The total bill " + amount);
            tname.setText(Double.toString(amount));
        }
        if (e.getSource() == btn) {

            frame.dispose();
        } else if (e.getSource() == addbtn) {

            //receipt work 
            String n = ta.getText(), addr = tname.getText();
            String sound = "NO";
            if (rb1.isSelected()) {
                sound = "YES";
            }
            String l = "NO";
            if (r.isSelected()) {
                l = "YES";
            }
            String br = "Nike";
            if (a.isSelected()) {
                br = "Adidas";
            }
            if (P.isSelected()) {
                br = "Puma";
            }
            if (B.isSelected()) {
                br = "Brooks";
            }

            try {
                text.setText("***********************RECEIPT *************************" + '\n'
                        + "  Total amount is : " + amount + "\n"
                        + "  Total number of seats : " + n + "\n"
                        + "  Sport LED video Display : " + l
                        + "\n" + "  Sound System  : " + sound
                        + "\n" + "   Brand name: " + br);
                //receipt work completed filing work start 

                BufferedWriter writer = new BufferedWriter(new FileWriter("_football.txt"));
                writer.write("This is the total bill of items with rent" + button.getText() + ": " 
                        + addr + "\n\n"
                        + "Total  No seats you booked :" + n);

                //for sound system
                if (rb1.isSelected()) {
                    writer.write("\n\n" + Soundsystem.getText() + ": yes");
                } else if (rb2.isSelected()) {

                    writer.write("\n\n" + Soundsystem.getText() + ": No");
                }

                //for led button
                if (r.isSelected()) {
                    writer.write("\n\n" + LED.getText() + ": yes");
                } else if (r2.isSelected()) {

                    writer.write("\n\n" + LED.getText() + ": No");
                }

                //for brand
                if (N.isSelected()) {
                    writer.write("\n\n" + brand.getText() + ": NIKE");
                } else if (a.isSelected()) {

                    writer.write("\n\n" + brand.getText() + ": ADIDAS");
                } else if (P.isSelected()) {

                    writer.write("\n\n" + brand.getText() + ": PUMA");
                } else if (B.isSelected()) {

                    writer.write("\n\n" + brand.getText() + ": BROOKS");
                }

                writer.close();

            } catch (IOException ex) {
                System.out.println("An Error occured in input....");
                System.out.println(Arrays.toString(ex.getStackTrace()));
            }

        }

    }

    public static void main(String args[]) {
        Football obj = new Football();
        obj.football_details();

    }

}


