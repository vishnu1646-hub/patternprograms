package patterns16;

public class HollowSpaceTriangle {

	public static void main(String[] args) {
		pattern();

	}
	public static void pattern(){
		int space=4;
		int star=0;
		int space1=0;
		for(int i=1;i<=7;i++){
			if(i<=4)
				space--;
			else
				space++;
			if(i==1||i==7)
				star=0;
			else
				star=1;
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++){
				System.out.print("*");
			}
			if(i==3||i==5){
				space1=1;
			}else if(i==4){
				space1=2;
			}
			for(int x=1;x<=space1;x++){
				System.out.print(" ");
			}
			for(int z=1;z<=1;z++){
				System.out.print("*");
			}
			System.out.println();
			space1=0;
		}
	}

}
