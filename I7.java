package patterns16;

public class I7 {

	public static void main(String[] args) {
		int star=-1;
		int space=10;
		for(int i=1;i<=5;i++){
			star=star+2;
			space=space-2;
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int z=1;z<=star;z++){
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
