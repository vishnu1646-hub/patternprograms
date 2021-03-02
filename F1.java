package patterns16;

public class F1 {

	public static void main(String[] args) {
		int star = 6;
		int space = 0;
		int a = 1;
		for (int i = 1; i <= 5; i++) {
			star--;
			space++;
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");

			}
			for (int j = 1; j <= star; j++) {

				System.out.print(a+" ");
				a++;

			}
			System.out.println();
			a = 1;
		}
	}

}
