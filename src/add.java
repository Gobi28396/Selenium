import java.util.Scanner;

public class add {
	public static void main(String[] args) {            
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int r = s.nextInt();
		int temp=r;
		int sum=0,n1,n2;
		while(r>0) {
			n1=r%10;
			r=r/10;
			sum=sum+(n1*n1*n1);
			
			
		}
		System.out.println(sum);
		
       if (temp==sum) {
		System.out.println("amstrong number");
	}	
       else {
    	   System.out.println(" not a amstrong number");
	}
		
		
}
}
