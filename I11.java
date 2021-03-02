package patterns16;

public class I11 {

	public static void main(String[] args) {
		int star = -1;
		int space = 10;
		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				star = star + 2;
				space--;
			} else {
				star = star - 2;
				space++;
			}
			for (int z = 1; z <= space; z++) {
				System.out.print(" ");
			}
			for (int x = 1; x <= star; x++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
