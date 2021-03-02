package patterns16;

public class HallowDiamond {

	public static void main(String[] args) {
		int star=0;
		int space=0;
		int space0=4;
		for(int i=1;i<=7;i++){
			if(i<=4)
				space0--;
			else
				space0++;
			
				if(i==1||i==7){
					star=1;
					space=0;
				}
				else if(i==2||i==6){
					space=1;
				    star=2;
				}
				else if(i==3||i==5){
					space=3;
				    star=2;
				}
				else if(i==4){
				    space=5;
		            star=2;
				}
			for(int j=1;j<=space0;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++){
				System.out.print("*");
				for(int s=1;s<=space;s++){
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
