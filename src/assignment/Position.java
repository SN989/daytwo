package assignment;



public class Position {


    public int Max(int[] array) {
        int max = array[0];
        int p=0;

        for (int i = 0; i < array.length; i++) {
          if (array[i] > max) {
       	   
                max=array[i];
               	p=i;	 
                 }
          
        }
        return p;
    }

    public static void main(String args[]) {
        int[] myArray = { 23, 92, 56, 100, 93 };
        Position m = new Position();

        System.out.println("Minimum value in the array is::" + m.Max(myArray));
        


    }
}

