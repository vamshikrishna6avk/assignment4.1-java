/*program to finding highest among the given 3 numbers*/

package session4;// here I have created a package as session4
import java.util.Scanner;//import scanner class is in util folder inside the java folder
//util contains utility classes
//scanner is a predefined class for taking inputs from user

public class HighestNumber {//declares a class called HighestNumber
	//classes are the basics of opps(object oriented programming)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);//scanner is a predefined class for taking inputs from user

		System.out.println("Input first number: ");
		int a = in.nextInt();//here nextInt() method are used for getinteger type value from keyboard

		System.out.println("Input second number: ");
		int b = in.nextInt();//here nextInt() method are used for getinteger type value from keyboard

		System.out.println("Input third number: ");
		int c = in.nextInt();

		int max=0;
		/*if statement executes a single statement or a block of statements if a boolean expresion evaluates to true
	       boolean expression a java expression that when evaluated,returns a boolean value true or false,conditional statements such as if,whileand switch*/
		if (a > b && a > c) {
			max = a;
		}
		if (b > a && b > c) {
			max = b;
		}

		if (c > a && c > b) {
			max = c;
		}
		
		
		System.out.println("the greatest no is:" + max);//system is used to return code
	     //out is a static member
		//Println is used to print text and gives output

	}

}
