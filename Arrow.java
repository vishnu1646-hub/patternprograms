package patterns16;

public class Arrow {

	public static void main(String[] args) {
		int star=0;
		int space=4;
		for(int i=1;i<=7;i++){
			if(i<=4){
				star++;
				space--;
			}
			else{
				star--;
				space++;
			}
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++){
				System.out.print("*");
			}
			for(int s=1;s<=3;s++){
				if((i>=1&&i<=2)||(i>=6&&i<=7)){
					System.out.print(" ");
				}
				else{
					System.out.print("*");
				}
			}
			for(int a=1;a<=star;a++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
