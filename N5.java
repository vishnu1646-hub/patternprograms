package patterns16;

public class N5 {
	public static void main(String[] args) {
		int star=0;
	    int space=5;
		for(int i=1;i<=5;i++){
			star++;
			space--;
			for(int k=1;k<=space;k++){
				System.out.print(" ");
			}
			
	        for(int j=1;j<=star;j++){
	        	System.out.print("* ");
	        }
             System.out.println();	        
         }  
	}

}
