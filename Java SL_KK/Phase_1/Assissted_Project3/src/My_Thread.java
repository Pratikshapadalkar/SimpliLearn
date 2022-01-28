//3.3 thread
public class My_Thread extends Thread {
	
	
	 	public void run()
	 	{
	  		System.out.println("concurrent thread started running..");
	}
	 	public static void main( String args[] )
	 	{
	  		My_Thread mt = new  My_Thread();
	  		mt.start();
	 	}
	}



