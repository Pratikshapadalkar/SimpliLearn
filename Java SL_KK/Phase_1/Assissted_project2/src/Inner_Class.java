//2.11 inner class
public class Inner_Class {
	

		 private String msg="Welcome to Java"; 
		 
		 class Inner{  
		  void hello(){System.out.println(msg+",  learninges Inner Class");}  
		 }  


		public static void main(String[] args) {

			Inner_Class obj=new Inner_Class();
			Inner_Class.Inner in=obj.new Inner();  
			in.hello();  
		}
	}


	 class innerClass {

	private String msg="Inner Classes";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  

	 
	public static void main(String[] args) {
		innerClass  ob=new innerClass ();  
		ob.display();  
		}
	}


	//anonymous inner class
	abstract class AnonymousInnerClass {
		   public abstract void display();
		}


		class innerClass1 {

		public static void main(String[] args) {
		AnonymousInnerClass i = new AnonymousInnerClass() {

		         public void display() {
		            System.out.println("Anonymous Inner Class");
		         }
		      };
		      i.display();
		   }
		}


