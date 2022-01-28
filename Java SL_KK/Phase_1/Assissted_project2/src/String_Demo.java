//2.13 String
public class String_Demo {
	

		public static void main(String[] args) {
			//methods of strings
			System.out.println("String");
			
			String sl=new String("Hello World");
			System.out.println(sl.length());

			//substring
			String sub=new String("Welcome");
			System.out.println(sub.substring(2));

			//String Comparison
			String s1="Hello";
			String s2="Hi";
			System.out.println(s1.compareTo(s2));

			//IsEmpty
			String s4="";
			System.out.println(s4.isEmpty());

			//toLowerCase
			String s5="Hello";
			System.out.println(s1.toLowerCase());
			
			//replace
			String s6="Hie";
			String replace=s2.replace('e', 'i');
			System.out.println(replace);

			//equals
			String x="Welcome to Java";
			String y="WeLcOmE tO JaVa";
			System.out.println(x.equals(y));
	 
			System.out.println("\n");
			System.out.println("Creating StringBuffer");
			//Creating StringBuffer and append method
			StringBuffer s=new StringBuffer("Welcome to Java!");
			s.append("learning");
			System.out.println(s);

			//insert method
			s.insert(0, 'w');
			System.out.println(s);

			//replace method
			StringBuffer sb=new StringBuffer("Hello");
			sb.replace(0, 2, "hEl");
			System.out.println(sb);

		
			sb.delete(0, 1);
			System.out.println(sb);
			
		
			System.out.println("\n");
			System.out.println("Creating StringBuilder");
			StringBuilder sb1=new StringBuilder("Happy");
			sb1.append("Learning");
			System.out.println(sb1);

			System.out.println(sb1.delete(0, 1));

			System.out.println(sb1.insert(1, "Welcome"));

			System.out.println(sb1.reverse());
					
			
			System.out.println("\n");
			System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
			
			String str = "Hello"; 
	        
	     
	        StringBuffer sbr = new StringBuffer(str); 
	        sbr.reverse(); 
	        System.out.println("String to StringBuffer");
	        System.out.println(sbr); 
	          
	        
	        StringBuilder sbl = new StringBuilder(str); 
	        sbl.append("world"); 
	        System.out.println("String to StringBuilder");
	        System.out.println(sbl);              		
		}

}
