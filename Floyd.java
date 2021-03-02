package patterns16;

public class Floyd {

	public static void main(String[] args) {
		int star=0;
		int spaces=5;
		int a=1;
		for (int i = 1; i <=5; i++) {
			star++;
			spaces--;
			
			for (int j = 1; j <=spaces; j++) {
				System.out.print("  ");
				
			}
			for (int j = 1; j <=star; j++) {
				System.out.print(a+"  ");
				a++;
				
			}
			System.out.println();
			
		}
		

	}

}
