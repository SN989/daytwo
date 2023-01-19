package assignment;


public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i= 0; i<=11 ; i++)
	    {
	        for (int j=0; j<=i; j++)
	        {
	            System.out.print(" ");
	        }
	        for (int k=0; k<=11-i; k++)
	        {
	            System.out.print("*" + " ");
	        }
	        System.out.println();
	    }
	    
	}
}


