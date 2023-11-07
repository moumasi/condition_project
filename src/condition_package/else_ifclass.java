package condition_package;

public class else_ifclass {

	public static void main(String[] args) {
      int i= 200;
       if(i>500 && i>=1) {
    	   System.out.println("its a two digit number");
       }
       else if(i<300 && i>=100) {
    	   System.out.println("its a three digit number");
       }
       else if(i>700 && i>=100) {
    	   System.out.println("its a four digit number");
       }
       else {
    	   System.out.println("its not a number");
       }
	}

}
