package patterns16;

public class I8 {

	public static void main(String[] args) {
		int star = 0;
		int space = 5;
		for (int i = 1; i <= 9; i++) {
			if (i > 5) {
				space++;
				star--;
			} else {
				star++;
				space--;
			}
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
