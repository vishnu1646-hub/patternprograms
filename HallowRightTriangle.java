package patterns16;

public class HallowRightTriangle {

	public static void main(String[] args) {
		int star=0;
		int space=0;
		int star1=0;
		for(int i=1;i<=15;i++){
			if(i==3||i==13)
				star1=1;
			else
				star1=2;
			if(i==1||i==15)
				star=1;
			else
				star=2;
			
			if(i>=5&&i<=8)
				space++;
			else if(i>=9&&i<=11)
				space--;
			for(int j=1;j<=star;j++){
				System.out.print("*");
			}
			if(i>=3&&i<=13){
				if(i>=5&&i<=11){
					for(int l=1;l<=space;l++){
						System.out.print(" ");
					}
				}
				for(int k=1;k<=star1;k++){
					System.out.print("*");
				}
				
			}
			System.out.println();
			
		}

	}

}
