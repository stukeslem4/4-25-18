import java.util.Scanner;
public class Div {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int[]nums=new int[5];		
		
Scanner A=new Scanner(System.in);		
System.out.println("Type five numbers");		
nums[0]=A.nextInt();		
nums[1]=A.nextInt();			
nums[2]=A.nextInt();		
nums[3]=A.nextInt();			
nums[4]=A.nextInt();	

for(int i=0;i<nums.length;i++){
	
if(nums[i]>10 && nums[i]%5==0 && nums[i]%4==0){
	
	System.out.println(nums[i]);
}
	
	
	
}





	}

}
