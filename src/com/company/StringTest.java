package com.company;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
//import java.text.DecimalFormat;

public class StringTest extends JFrame
        implements ActionListener
{
  private JTextField input, result;

  public StringTest()
  {
    super("String test");
    Box box1 = Box.createVerticalBox();
    box1.add(new JLabel("Input:"));
    box1.add(Box.createVerticalStrut(10));
    box1.add(new JLabel("Result:"));

    input = new JTextField(20);
    input.setBackground(Color.WHITE);
    input.addActionListener(this);
    input.selectAll();

    result = new JTextField(20);
    result.setBackground(Color.WHITE);
    result.setEditable(false);

    Box box2 = Box.createVerticalBox();
    box2.add(input);
    box2.add(Box.createVerticalStrut(10));
    box2.add(result);

    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(box1);
    c.add(box2);
    input.requestFocus();
  }

  public static String removeDash(String ssn)
  {
	  String clean = ssn.substring(0,3) + ssn.substring(4,6) + ssn.substring(7);
	  return clean;
  }
  
	public static String removeSSN(String ssn)
	{
		int index = ssn.indexOf('-');
		int index2 = ssn.indexOf('-', index+1);
		
		ssn = ssn.substring(0,index) + ssn.substring(index+1, index2) + ssn.substring(index2+1);
		return ssn;
	}
  
  public static String dateString(String datestr)
  {
	  int first = datestr.indexOf('/');
	  int second = datestr.indexOf('/', first+1);
	  
	  String newdate = datestr.substring(first + 1, second) + "-" + datestr.substring(0, first)
			  + "-" + datestr.substring(second + 1);
	  return newdate;
	 
  }
  
  public static String dateString2(String datestr)
  {
	  	  
	  int first = datestr.indexOf('/');
	  int second = datestr.indexOf('/', first+1);
	  
	  int xxxx = datestr.indexOf("xxx");
	  System.out.println(xxxx);
	  String day, month;
	  if(second - first == 2)
		  day = "0" + datestr.substring(first + 1, second);
	  else
		  day = datestr.substring(first + 1, second);
	  
	  if(first == 1)
		  month = "0" + datestr.substring(0, first);
	  else
		  month = datestr.substring(0, first);
	  
	  
	  String newdate = day + "-" + month + "-" + datestr.substring(second + 1);
	  return newdate;
	 
  }
  
  public static String last4(String ccn)
  {
	  int sp = ccn.lastIndexOf(' ');
	  String ret = ccn.substring(sp + 1);
	  return ret;
  }
  
  public static String last5(String ccn)
  {
	  int sp = ccn.lastIndexOf(' ');
	  String ret = ccn.charAt(sp - 1) + ccn.substring(sp + 1);
	  return ret;
  }
  
  public static String scroll(String input)
  {
	  String out = input.substring(1) + input.charAt(0);
	  return out;
  }
  
  public static String convertName(String name)
  {
	  int c = name.indexOf(',');
	  
	  String first = name.substring(c + 1).trim();
	  String last = name.substring(0, c).trim();
	  
	  return first + " " + last;
  }
  
  public static String negative(String input)
  {
	  String output = input.replace("1", "X");
	  output = output.replace("0", "1");
	  output = output.replace("X", "0");
	  
	  return output;
  }
  
  
  

  
  public void actionPerformed(ActionEvent e)
  {
    String str = input.getText();

    // ... insert code to process str or call a method here
    // str = _______________________________ ;
    //str = removeDash(str);
    //str = dateString2(str);
    //str = last5(str);
    
    //str = scroll(str);
    //str = convertName(str);
    str = negative(str);
    

    result.setText(str);
    input.selectAll();
  }

  public static void main(String[] args)
  {
    StringTest window = new StringTest();
    window.setBounds(100, 100, 300, 100);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setVisible(true);
  }
}

