import java.util.Scanner;
public class ten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]numbers=new int[10];		
		
		Scanner V=new Scanner(System.in);		
		System.out.println("Type ten numbers");		
		numbers[0]=V.nextInt();		
		numbers[1]=V.nextInt();			
		numbers[2]=V.nextInt();		
		numbers[3]=V.nextInt();			
		numbers[4]=V.nextInt();	
		numbers[5]=V.nextInt();		
		numbers[6]=V.nextInt();			
		numbers[7]=V.nextInt();		
		numbers[8]=V.nextInt();			
		numbers[9]=V.nextInt();
	int sum=0;
		for(int i=0;i<numbers.length;i++){	
			
	sum=sum+numbers[i];		
			
			
			
		}
		
	System.out.println(sum);
	
	}

}
