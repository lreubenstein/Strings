package com.company;

public class Exercises {

	public static void main(String[] args) {

		System.out.println(scroll("Hello World"));
		System.out.println(scroll("happy"));
		System.out.println(scroll("h"));

		System.out.println(convertName(" Reubenstein, Lori Renee		"));
		System.out.println(convertName("Biden,Joe"));
		System.out.println(convertName("the Clown, Bozo"));

		System.out.println(negative("0010111001"));
		System.out.println(negative("11111111"));

		System.out.println("04/20/2014 becomes " + dateString("04/20/2014"));

	    System.out.println("04/20/2014 becomes" + dateString2("04/20/2014"));
	    System.out.println("4/20/2014 becomes" + dateString2("4/20/2014"));
	    System.out.println("04/2/2014 becomes" + dateString2("04/2/2014"));
	    System.out.println("4/2/2014 becomes" + dateString2("4/2/2014"));

		System.out.println("\nstartsWith");
		System.out.println(startsWith("architecture", "arch"));
		System.out.println(startsWith("architecture", "a"));
		System.out.println(startsWith("arch", "architecture"));
		System.out.println(startsWith("architecture", "rch"));
		System.out.println(startsWith("architecture", "architecture"));

		System.out.println("\nendsWith");
		System.out.println(endsWith("astronomy", "nomy"));
		System.out.println(endsWith("astronomy", "y"));
		System.out.println(endsWith("astronomy", "nom"));
		System.out.println(endsWith("nomy", "astronomy"));
		System.out.println(endsWith("astronomy", "astronomy"));

		System.out.println("\nremoveTag");
		System.out.println(removeTag("<b>Hello World</b>", "b"));
		System.out.println(removeTag("<b>Hello World</b>", "head"));
		System.out.println(removeTag("Hello World</b>", "b"));
		System.out.println(removeTag("<b>Hello World", "b"));
		System.out.println(removeTag("</img>Hello World<img>", "img"));
		System.out.println(removeTag("Happy Birthday <b>Hello World</b>", "b"));
		System.out.println(removeTag("<title>Hello World</title> Happy Birthday", "title"));
		System.out.println(removeTag("Happy <b>Hello World</b> Birthday", "b"));
	    
//	    String t = "tEsTer";
//	    System.out.println(t.toUpperCase());
//	    System.out.println(t.toLowerCase());
//
//	    String testString = "Hello World";
//	    System.out.println(testString.substring(t.indexOf("e")));
//	    System.out.println(testString.replace("H", "j").substring(0, 5));
//
//
//		System.out.println("123-456-7890 is " + removeSSN("123-456-7890"));
//		System.out.println(last5("4111 1234 7654 8795"));

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

public static boolean startsWith(String s, String pre){
		int x1 = pre.length();
		int x2 = s.length();
		if(x1>x2) return false;

		return s.substring(0,x1).equals(pre);
}

public static boolean endsWith(String s, String suf){
	int x1 = suf.length();
	int x2 = s.length();
	if(x1>x2) return false;

	return s.substring(x2-x1).equals(suf);
}

public static String removeTag(String s, String tag){
		String begTag = "<"+tag+">";
		String endTag = "</"+tag+">";
		int x = begTag.length();
		int start = s.indexOf(begTag);
		if(start == -1) return s;

		int end = s.indexOf(endTag, start+1);
		if(end == -1) return s;

		return s.substring(start+x,end);
}
}
//	ello WorldH
//	appyh
//			h
//	Lori Renee Reubenstein
//		Joe Biden
//		Bozo the Clown
//		1101000110
//		00000000
//		04/20/2014 becomes 20-04-2014
//		04/20/2014 becomes20-04-2014
//		4/20/2014 becomes20-04-2014
//		04/2/2014 becomes02-04-2014
//		4/2/2014 becomes02-04-2014
//
//		startsWith
//		true
//		true
//		false
//		false
//		true
//
//		endsWith
//		true
//		true
//		false
//		false
//		true
//
//		removeTag
//		Hello World
//<b>Hello World</b>
//		Hello World</b>
//<b>Hello World
//</img>Hello World<img>
//Hello World
//		Hello World
//		Hello World