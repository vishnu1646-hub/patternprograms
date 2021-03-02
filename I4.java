package patterns16;

public class I4 {
	public static void main(String[] args) {
		 int star=6;
		 int space=-1;
		 for(int i=1;i<=5;i++){
			 star--;
			 space++;
			 for(int j=1;j<=space;j++){
				 System.out.print(" ");
			 }
			 for(int z=1;z<=star;z++){
				 System.out.print("*");
			 }
			 System.out.println();
		 }

		}

}
