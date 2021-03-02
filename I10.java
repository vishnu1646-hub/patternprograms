package patterns16;

public class I10 {

	public static void main(String[] args) {
		int star = 0;
		int space = 5;
		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				star++;
				space--;
			} else {
				star--;
				space++;
			}
			for (int z = 1; z <= space; z++) {
				System.out.print("  ");
			}
			for (int x = 1; x <= star; x++) {
				System.out.print("* ");
			}
			if ((i >= 1 && i <= 2) || (i >= 7 && i <= 9)) {
				for (int y = 1; y <= 5; y++) {
					System.out.print("  ");
				}
			} else {
				for (int y = 1; y <= 5; y++) {
					System.out.print("* ");
				}
			}
			System.out.println();

		}
	}

}
