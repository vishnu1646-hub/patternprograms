package patterns16;

public class R1 {
	public static void main(String[] args) {
		int num=9;
		int space=-2;
		int x=0;
		for(int i=1;i<=4;i++){
			num=num-2;
			space=space+2;
			for(int j=1;j<=num;j++){
				if((i==1&&j<5)||(i==2&&j<4)||(i==3&&j<3)||i==4){
				System.out.print(++x);
				}else{
					System.out.print("$");
				}
			}
			System.out.println();
			x=0;
		}
	}

}
