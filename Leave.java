package payrollmanagement;
/*import java.applet.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;*/

import java.applet.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.sql.DriverManager;
import java.util.Scanner;
import java.io.*;
import java.sql.*;
import java.util.Scanner;



public class Leave extends JApplet implements ActionListener,ItemListener
{

	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2;
	public Leave()
	{
		JFrame f=new JFrame();
		f.setLayout(null);
		//f.setLayout(new FlowLayout());
		f.setSize(400, 500);
		f.getContentPane().setBackground(Color.PINK);
		Font myFont=new Font("Arial",Font.CENTER_BASELINE,16);
		l1=new JLabel("LEAVE FORM");
		l1.setBounds(60, 10, 180, 20);
		f.add(l1);
		l2=new JLabel("Employee Name");
		l2.setBounds(10,45,100,30);
		f.add(l2);
		t1=new JTextField();
		t1.setBounds(110,50,100,20);
		f.add(t1);
		l3=new JLabel("Employee Id");
		l3.setBounds(10,75,100,30);
		f.add(l3);
		t2=new JTextField();
		t2.setBounds(100,80,70,20);
		f.add(t2);
		l4=new JLabel("Leave Type");
		l4.setBounds(10,110, 130, 30);
		t3=new JTextField();
		t3.setBounds(100,115,100,20);
		f.add(t3);
		f.add(l4);
		l5=new JLabel("Starting Date");
		l5.setBounds(10,145, 150, 30);
		f.add(l5);
		t4=new JTextField();
		t4.setBounds(100,150,80,20);
		f.add(t4);
		l6=new JLabel("Ending Date");
		l6.setBounds(10,185, 150, 30);
		f.add(l6);
		t5=new JTextField();
		t5.setBounds(100,190,80,20);
		f.add(t5);
		b1=new JButton("Submit");
		b1.setBounds(100,225, 80, 20);
		f.add(b1);
		b1.addActionListener(this);
		b2=new JButton("Next");
		b2.setBounds(100,255, 80, 20);
		f.add(b2);
		b2.addActionListener(this);
		f.setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) 
     {
            if(ae.getActionCommand().equals("Next"))
				{
		    thank t=new thank();
				}

		 Connection con=null;
		    Statement st=null;
		    ResultSet rs=null;
            try
			{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		st=con.createStatement();
       st.execute("create table if not exists leave (name varchar(50),id varchar(20),ltype varchar(30),strdate varchar(50),enddate varchar(30))");
           //inserting values in to the table//
       if(ae.getActionCommand().equals("Submit"))
       {
    	   st.execute("insert into leave values('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"')");
       }
       /*if(ae.getActionCommand().equals(""))
       {
    	   
       }*/
           }
            catch(Exception e)
            {
            	System.out.println(e);
            }
}
	
	}


		
	}
}

