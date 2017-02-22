import java.util.Scanner;
public class Average {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] arr= new int[10];
		Average myAverage=new Average();
		System.out.println("Average is: "+myAverage.average(arr));
		
	}
	double average(int []num){
	System.out.println("Enter 10 digits: ");
	int sum=0;
	for(int i=0;i<10;i++){
		num[i]=sc.nextInt();
		sum+=num[i];
	}
	for(int j:num){
		System.out.print(j+" ");
	}
	System.out.println(" ");
	double average=(double)sum/num.length;
	return average;
	
	}
}
