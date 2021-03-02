package patterns16;

public class I9 {

	public static void main(String[] args) {
		int star=0;
		for(int i=1;i<=9;i++){
			if(i<=5)
				star++;
			else
				star--;
			if((i>=1&&i<=3)||(i>=8&&i<=9)){
				for(int z=1;z<=5;z++){
					System.out.print("  ");
				}
			}
			else{
				for(int x=1;x<=5;x++){
					System.out.print("* ");
				}
			}
			
			for(int j=1;j<=star;j++){
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
