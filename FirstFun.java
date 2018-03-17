import java.util.Scanner;
public class FirstFun {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a;
	int b;
	int sum;
	int sub;
	System.out.println("Input the first number");
	a=input.nextInt();
	System.out.println("Input the second number");
	b=input.nextInt();
	sum=a+b;
	sub=a-b;
	System.out.println("The sum of the two numbers:\n"+sum);
	System.out.println("The subtration of the two numbers\n:"+sub);
	input.close();
}
}