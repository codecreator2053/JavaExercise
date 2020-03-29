import java.util.Scanner;
import java.lang.Math;

public class Exercises{
	public static void main(String args[]){
		System.out.println("Hello World");
		int mark = 69;
        System.out.println("The obtained marks is " + mark);
        if(mark >= 60) {
            System.out.println();
            System.out.println("you have passed");
        }
        else{
            System.out.println();
            System.out.println("you have failed");
        }
        check_odd_even(90);
        print_number_in_word(3);

        series_sum(100);
        harmonic_mean();
        fibonacci();
        // input();
        // area();
        get_tax();

	}


	private static void check_odd_even(int a){
		if( a % 2 == 0 ){
			System.out.println(a + " is even.");
		}
		else{
			System.out.println(a + " is odd.");
		}
	} 
	public static void print_number_in_word(int a){
		int number = 5;
		switch(a){
			case 1: 
			System.out.println("one");
			case 2:
			System.out.println("two");
			case 3:
			System.out.println("three");
		}
	}

	public static void series_sum(int a){
		int sum = 0;
		for(int i=1; i<=a; i++){
			sum += i;
		}

		System.out.println("the avg of first " + a + " numbers is " + (double)sum/(double)a);
	}

	public static void harmonic_mean(){
		int rangeMax = 50000;
		double L2R_Mean = 0;
		double R2L_Mean = 0;
		for(int i = 1; i<=rangeMax;i++){
			L2R_Mean += 1/(double)i;
		}

		System.out.println("The left to right harmonic mean is " + L2R_Mean);

		for(int j = rangeMax; j>0; j--){
			R2L_Mean += 1/(double)j;
		}
		System.out.println(R2L_Mean - L2R_Mean);
		System.out.println("The right to left harmonic mean is " + R2L_Mean);
	}


	public static void fibonacci(){
		int nMax = 20;
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.print(b);
		while (nMax > 0){
			c = b + a;
			System.out.print( " "+c);
			a = b;
			b = c;

			nMax = nMax - 1;
		}
	}

	public static void input(){
				System.out.println();

		int first = 0, second = 0, sum = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		first = in.nextInt();
		System.out.print("Enter second integer: ");
		second = in.nextInt();

		sum = first + second;
		System.out.println("The sum is " + sum);
	}

	public static void area(){
		double radius, diameter, circumference, area;
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the radius: ");
		radius = in.nextDouble();
		diameter = 2 * radius;
		area = Math.PI * radius * radius;
		System.out.printf("Diameter: %.2f%n", diameter);
		System.out.printf("area: %.2f%n", area);
		System.out.printf("Circumference: %.2f%n", Math.PI * diameter);
	}

	public static void get_tax(){
		double tax_Start = 20000;
		double first_Bracket = 40000, first_Rate = 0.1;
		double second_Bracket = 60000, second_Rate = 0.2;
		double final_Rate = 0.4;
		double tax_Payable = 0;
		System.out.println();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your income: ");
		double income = in.nextDouble();
		double taxable_Amount = income - tax_Start;

		if (taxable_Amount > 0){
			tax_Payable += Math.min((income - tax_Start), (first_Bracket - tax_Start)) * first_Rate;
			System.out.println(tax_Payable);
			taxable_Amount = income - first_Bracket;
		}
		if (taxable_Amount > 0){
			System.out.println(tax_Payable);
			tax_Payable +=  Math.min((income - first_Bracket), (second_Bracket - first_Bracket)) * second_Rate;
			System.out.println(tax_Payable);
			taxable_Amount = income - second_Bracket;
		}
		if (taxable_Amount > 0){
			System.out.println(tax_Payable);
			tax_Payable += (income - second_Bracket) * final_Rate;
			System.out.println(tax_Payable);
		}

		System.out.printf("Your tax payable is: %.2f%n", tax_Payable);

	}

}