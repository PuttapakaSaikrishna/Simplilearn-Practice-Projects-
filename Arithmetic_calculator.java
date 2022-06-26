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
		System.out.println("Select operations 1='add' 2='sub' 3='mul' 4='div' 5='modulus'");
		ch= sc.nextInt();

		
		switch (ch) {

	      // performs addition between numbers
	      case  1:
	        cal = n1 + n2;
	        System.out.println(n1 + " + " + n2 + " = " + cal);
	        break;

	      // performs subtraction between numbers
	      case 2:
	    	  cal = n1 - n2;;
	    	  System.out.println(n1 + " - " + n2 + " = " + cal);
	        break;

	      // performs multiplication between numbers
	      case '3':
	    	  cal = n1 * n2;;
	    	  System.out.println(n1 + " * " + n2 + " = " + cal);
	        break;

	      // performs division between numbers
	      case 4:
	    	  cal = n1 / n2;;
	        System.out.println(n1 + " / " + n2 + " = " + cal);
	        break;
	        
	      case 5:
	    	  cal = n1 % n2;;
	        System.out.println(n1 + " % " + n2 + " = " + cal);
	        break;

	      default:
	    	  System.out.println("Invalid operator!");
	          break;
	      }

}
