package assignments;

import java.util.Scanner;

public class Arithmetic_calculator {

	public static void main(String[] args) {
		int n1, n2 , ch , cal;
		System.out.println("Welcome to arthematic operations");
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the values ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		System.out.println("Select operations 1='Sub' 2='add' 3='mul' 4='div' 5='modulus'");
		ch= sc.nextInt();
		
		if(ch ==1)
		{
			cal =n1+n2;
			System.out.println("Addition :"+ ch);
			
		}
		else if(ch==2){
			cal =n1-n2;
			System.out.println("Substraction :"+ ch);
			
		}
		else if(ch==3){
			cal =n1*n2;
			System.out.println("Multiplication :"+ ch);
			
		}
		else if(ch==4){
			cal =n1/n2;
			System.out.println("Division :"+ ch);
			
		}
		else if(ch==5){
			cal =n1%n2;
			System.out.println("Modulus :"+ ch);
			
		}
		
	}

}
