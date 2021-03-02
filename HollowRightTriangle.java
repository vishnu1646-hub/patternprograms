package patterns16;

public class HollowRightTriangle {

	public static void main(String[] args) {
		int star = 0;
		int spacei = 0;
		for (int i = 1; i <= 7; i++) {
            if(i==1||i==2||i==7){
            	spacei=0;
            }else{
            	spacei++;
            }
			if (i == 1) {
				star = 1;
			} else if ((i >= 2) && (i <= 6)) {
				star = 2;
			} else if (i == 7) {
				star = 7;
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
				for (int s = 1; s <= spacei; s++) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
