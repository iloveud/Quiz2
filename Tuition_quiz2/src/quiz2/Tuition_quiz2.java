package quiz2;

import java.util.Scanner;

public class Tuition_quiz2 {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
		System.out.print("Enter the current tuition rate:");

		double rate = input.nextDouble();
		double sum = 12432+12342*(1 + rate/100)+12342*(1+rate/100)*(1+rate/100)+12342*(1+rate/100)*(1+rate/100)*(1+rate/100);
		
	
		System.out.print("The tuition will be :"+sum);
	}

}
