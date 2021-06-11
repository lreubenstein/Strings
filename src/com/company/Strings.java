package com.company;

public class Strings {
	public static boolean isPalindrome(String input)
	  {
		  int len = input.length();
		  if(len == 0 || len == 1) return true;
		  
		  int last = len-1;
		  for(int i = 0; i < len/2; i++)
		  {
			  if(input.charAt(i)!=input.charAt(last-i))
				  return false;
		  }
		  return true;
	  }
	
	public static boolean isPalindrome2(String input)
	  {
		  int len = input.length();
		  if(len == 0 || len == 1) return true;
		  String forward = "";
		  String backward = "";
		  
		  
		  for(int i = 0; i < len; i++)
		  {
			  char c = input.charAt(i);
			  if(Character.isLetterOrDigit(c)){
				  c = Character.toLowerCase(c);
				  forward = forward + c;
				  backward = c + backward;
			  }
				 
		  }
		  return forward.equals(backward);
	  }
	
	public static boolean endsWith(String str, String ending)
	{
		int len = str.length();
		
		int len2 = ending.length();
		if(len < len2) return false;
		
		String test = str.substring(len-len2);
		return test.equals(ending);
	}
	
	public static int [] vowelCount(String str)
	{
	    int [] vowels = new int[5];
	    char [] v = {'a', 'e', 'i', 'o', 'u'};
	    
	    for(int i = 0; i < 5; i++) {
	      vowels[i] = count(str, v[i]);
	    }
	    
	    return vowels;
	}
	public static int count(String str, char c)
	{
	    int  count = 0;
	    int index = str.indexOf(c);
	    
	    while (index != -1) {
	        count ++;
	        index = str.indexOf(c, index + 1);
	    }
	    return count;
	}
	public static int count(String str, String c)
	{
	    int  count = 0;
	    int index = str.indexOf(c);
	    
	    while (index != -1) {
	        count ++;
	        index = str.indexOf(c, index + 1);
	    }
	    return count;
	}
	public static String reverseString(String s)
	{
		String r = "";

		while (s.length() > 0)
		{
			r = s.charAt(0) + r;
			s = s.substring(1);
		}
		return r;
	}
	
	public static String removeTag(String str, String tag){
		String beg = "<" + tag + ">";
		String end = "</" + tag + ">";
		
		int index1 = str.indexOf(beg);
		int index2 = str.indexOf(end);
		
		if(index1 == -1 || index2 == -1)
			return str;
		if(index1 > index2) return str;
		
		index1 += tag.length() + 2;
		return str.substring(index1, index2);
	}

	public static String mirror(String str){
		String image = str;
		for(int i=str.length()-1; i>=0; i--){
			image += str.charAt(i);
		}
		return image;
	}
	
	
	public static String swapEnds(String phrase) {
		int x = phrase.length();
		return phrase.substring(x-1) + phrase.substring(1, x-1) + phrase.charAt(0);
	}
	
	public static boolean redInTheMiddle(String phrase) {
		if (phrase.length() < 3) return false;
		int x = phrase.length()/2;
		return phrase.substring(x-1,x+2).equals("red");
	}

	public static String nTwice(String str, int n) {
		String newstr = "";
		int len = str.length();
		if(n > len) return newstr;

		newstr+=str.substring(0,n);
		newstr += str.substring(len-n, len);
		return newstr;
	}
	
	public static void main(String[] args) {
		System.out.println(count("Happy Nap on my cap.", "ap"));
		System.out.println(count("Happy Nap on my cap.", "lap"));
		System.out.println("Yellow " + swapEnds("Yellow"));
		System.out.println("meow " + swapEnds("meow"));
		System.out.println("The rain in Spain " + swapEnds("The rain in Spain"));
		System.out.println("blueredpink " + redInTheMiddle("blueredpink"));
		System.out.println("redzone " + redInTheMiddle("redzone"));
		System.out.println("blueredgreen " + redInTheMiddle("blueredgreen"));
		System.out.println("greenredblue " + redInTheMiddle("greenredblue"));
		System.out.println("Happy Birthday " + "day " + endsWith("Happy Birthday", "day"));
		System.out.println("Happy Birthday " + "days " + endsWith("Happy Birthday", "days"));
		System.out.println("day " + "days " + endsWith("day", "days"));
		
		System.out.println("kayak");
		System.out.println(isPalindrome("kayak"));

		System.out.println("KAyak");
		System.out.println(isPalindrome("KAyak"));
		
		System.out.println("kayaks");
		System.out.println(isPalindrome("kayaks"));
		
		System.out.println("was a saw");
		System.out.println(isPalindrome("was a saw"));
		
		System.out.println("A man, a plan, a canal: Panama");
		System.out.println(isPalindrome2("A man, a plan, a canal: Panama"));
		
		System.out.println("i think therefore i am");
		System.out.println();
		
		System.out.println("Peanut");
		System.out.println(mirror("Peanut"));
		System.out.println("stapler");
		System.out.println(mirror("stapler"));
		String xxxx = "kayak";
		System.out.println("kayak");
		System.out.println(mirror("kayak") + " " +xxxx);
		
		String s1 = "Brains";
		String s2 = "cow";
		String s3 = "Chair";
		System.out.println(s1.substring(s3.indexOf('h'), 5) + s2.replace('c', 'b'));
		
		String f = "Fahrenheit ";
		int x = 4, y = 5, z = 1;
		System.out.println(f + x + y + z);
		System.out.println(x + y + z + f);
		
		System.out.println(removeTag("<b>Hello World </b>", "b"));
		System.out.println(removeTag("xxx<body>Hello World </body>", "body"));
		System.out.println(removeTag("<body>Hello World", "body"));
		System.out.println(removeTag("</div>Hello World <div>", "div"));
		
		System.out.println(reverseString("hello world"));
		
		String s4 = "scrub";
		System.out.println(s4.substring(2) + "i" + s4.charAt(1) + s4.substring(0,2) + "ube");
		
		int a = 7, b = 6;
		String s5 = "bone";
		String s6 = "chrome";
		System.out.println(a+b+s6.replace("ch", "T").substring(0,4) + s5 + "s");
		
		String s7 = "breath";
		String s8 = "Halloween";
		System.out.println(s7.replace("br", "D") + "ly " + s8.substring(0, s7.length()) + "s");
		
		String s9 = "crocodile";
		String s10 = "latch";
		System.out.println(s10.substring(3)+s9.substring(s10.length()/2, s10.length()) 
				+ s10.substring(0,3) + "e");
		
		String s11 = "ice cream";
		String s12 = "dream team";
		System.out.println(s11.replace(" ",  "d").substring(0, 4) + " "
				+ s12.substring(s11.lastIndexOf("e"), 9));
		
		String s13 = "Glorious theory";
		String s14 = "going offline";
		System.out.println(s13.substring(1,4)+ "d " + s14.substring(s13.indexOf("us"),8) + " " +
				s13.substring(9, s13.length()-3) + " " + s14.substring(8,11) + "es");
		
		String s15 = "wollow";
		String s16 = "Apple";
		int g=10,h=3;
		System.out.println(s16.substring(0, s16.lastIndexOf("pl")) +
				s15.substring(1, s15.length()-1) + " " + g + h);
	
		String s19 = "kool";
		String s17 = "cucumber";
		String s18 = "best";
		System.out.println(s17.substring(0,s18.indexOf("t")) + 
				s19.substring(0,s19.length()-1) + "'s n" +	s18.substring(1));
		
		String s20 = "ache";
		String s21 = "massive use";
		String s22 = "abcdeabcde";
		System.out.println(s21.substring(0,s21.indexOf("i")) + s20.substring(0,3) + 
				s21.substring(s22.lastIndexOf("d")) + "tts");
		
		String s23 = "fanta";
		String s24 = "unstick";
		int j = 2;
		System.out.println(s23 + s24.substring(1).replace('k', ' ') + (j+j));
		
		String s25 = "duplicate";
		String s26 = "catsup";
		String s27 = "perfect";
		System.out.println((s26.substring(3)+s27.substring(0,s26.indexOf("s"))+
				" "+s25.substring(0,3)+s27.substring(0,s26.indexOf("s"))).replace("pp", "p"));

		String s28 = "hemoglobin";
		String s29 = "material";
		String s30 = "range";
		String s31 = "climb";
		System.out.println(s28.substring(4,8)+ s29.substring(s29.length()-2) + " "+
				s31.substring(0,3)+	s29.substring(0,  s29.length()/2) + s30.replace("r"," ch"));
		
		int c = 1;
		int d = 6;
		String s32 = "Candy";
		String s33 = "scruples";
		System.out.println(c + d + " " + s32.substring(0,s33.length()-4) + s33.substring(5));

		String s34 = "exert";
		String s35 = "likewise";
		String s36 = s34.substring(0,s34.length()-1)+s35.substring(4) +" b" + s35.substring(s34.indexOf("x"),4);
		s36=s36.replace('w', 'c');
		System.out.println(s36);

		String s37 = "Hello World";
		s37.replace('l','m');
		s37.toUpperCase();
		System.out.println(s37);

		int xx=9;
		String s39 = "amen";
		String s40 = "swollen";
		String s41 = "litter";
		String s42 = s41.substring(0,xx/2)+ "le " + s40.substring(1,xx/3) + s39.substring(1);
		System.out.println(s42);

		System.out.println(nTwice("Chocolate", 3));
		System.out.println(nTwice("Chocolate", 15));
		System.out.println(nTwice("Chocolate", 1));
	}

}
