import java.util.Scanner;

class Task9  {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner s = new Scanner(System.in);
System.out.println("Welcome to Withholding Tax Calculator");
		
		System.out.println("Enter Employee Monthly Salary: ");
		/*Variable Declaration for Activity
		 */
		float netwage = s.nextFloat();
        double salary; 
		double sss;
		double contribution;
		double percent;
        double pagibig;
        double total;
        double with;
        double tax;
        double taxrate;
        double truetotal;
       double withholdingtax;
       double income;
       double taxratee;
       double add;
       double last;
        percent = (netwage * 0.03 );
		pagibig = (netwage * 0.04);
		with = (0.2);
		tax = (0.25);
	    total = (percent + pagibig);
		/*If else statement because the results have ranges to compute
		 * Everything is based on the monthly salary of workers because all 
		 * examples in sheets always use the monthly salary
		 * The Lowest Montly Salary of workers in MOTORPH are 22500
		 * The Highest Montly Salary of workers in MOTORPH are 63500
		 * PhilHealth has a flat rate of 3% whether how much the salary of the worker is.
		 * Pag Ibig has  a flat rate of 4% divided by employer and employee share that is 2% combined
		 * The SSS has ranges of how much contribution you pay for the entered salary
		 * WithholdingTax computes after deducting all sss, pagibig, philhealth
		 * and computes after a specific range
		 * No tax if the taxable income falls lower than 20833
		 * But if greater than 20833 and lesser than 33333
		 * compute  20% of withholding tax
		 * if the range of taxable income is within 33333 and 66667 
		 * then taxable income minus 33333 multiplied by 25% then add 2500 returns the result
		 * Following PEMDAS rule Parenthesis Exponents Multiplication Division Addition Subtraction
		 * Ex. taxable income is 45000 =  2500 + (45000 - 33333) * 25%
		 * */
 
		if (netwage > 0 && netwage <= 22250) {
			System.out.println("Invalid Number, Try 22500 or higher ");
		}
	
		else if (netwage > 22251 && netwage <= 22750) {
			System.out.print("Your SSS Contribution is 1,012.50");
			sss = (1012.50);
			taxrate = (20833);
			contribution = (netwage - sss - percent - pagibig);
			total = (percent + pagibig + sss);
			withholdingtax = (contribution - taxrate );
			truetotal = (withholdingtax * with);
			income = (contribution - truetotal);
			System.out.println("Your Philhealth Contribution is: " + percent);
			System.out.println("Your PagIbig Contribution is: " + pagibig);
			System.out.println("Your Total Deductions are: " + total);
			System.out.println("============================================");
			System.out.println("\nYour Taxable Income is: " + contribution);
			System.out.println("Your Income Tax is " + truetotal);
			System.out.println("Your Income is: " + income);
			System.out.println("============================================");
		}
		
			else if (netwage > 22751 && netwage <= 23250) {
			System.out.print("Your SSS Contribution is 1,035.00");
			sss = (1035.00);
			taxrate = (20833);
			contribution = (netwage - sss - percent - pagibig);
			total = (percent + pagibig + sss);
			withholdingtax = (contribution - taxrate );
			truetotal = (withholdingtax * with);
			income = (contribution - truetotal);
			System.out.println("Your Philhealth Contribution is: " + percent);
			System.out.println("Your PagIbig Contribution is: " + pagibig);
			System.out.println("Your Total Deductions are: " + total);
			System.out.println("============================================");
			System.out.println("\nYour Taxable Income is: " + contribution);
			System.out.println("Your Income Tax is " + truetotal);
			System.out.println("Your Income is: " + income);
			System.out.println("============================================");
		}
		
			else if (netwage > 23251 && netwage <= 23750) {
			System.out.print("Your SSS Contribution is 1,057.50");
			sss = (1057.50);
			taxrate = (20833);
			contribution = (netwage - sss - percent - pagibig);
			total = (percent + pagibig + sss);
			withholdingtax = (contribution - taxrate );
			truetotal = (withholdingtax * with);
			income = (contribution - truetotal);
			System.out.println("Your Philhealth Contribution is: " + percent);
			System.out.println("Your PagIbig Contribution is: " + pagibig);
			System.out.println("============================================");
			System.out.println("Your Total Deductions are: " + total);
			System.out.println("\nYour Taxable Income is: " + contribution);
			System.out.println("Your Income Tax is " + truetotal);
			System.out.println("Your Income is: " + income);
			System.out.println("============================================");
		}
		
			else if (netwage > 23751 && netwage <= 24250) {
			System.out.print("Your SSS Contribution is 1,080.00");
			sss = (1080.00);
			taxrate = (20833);
			contribution = (netwage - sss - percent - pagibig);
			total = (percent + pagibig + sss);
			withholdingtax = (contribution - taxrate );
			truetotal = (withholdingtax * with);
			income = (contribution - truetotal);
			System.out.println("Your Philhealth Contribution is: " + percent);
			System.out.println("Your PagIbig Contribution is: " + pagibig);
			System.out.println("Your Total Deductions are: " + total);
			System.out.println("============================================");
			System.out.println("\nYour Taxable Income is: " + contribution);
			System.out.println("Your Income Tax is " + truetotal);
			System.out.println("Your Income is: " + income);
			System.out.println("============================================");
		}
		
			else if (netwage > 24251 && netwage <= 24750) {
			System.out.print("Your SSS Contribution is 1,102.50");
			sss = (1102.50);
			taxrate = (20833);
			contribution = (netwage - sss - percent - pagibig);
			total = (percent + pagibig + sss);
			withholdingtax = (contribution - taxrate );
			truetotal = (withholdingtax * with);
			income = (contribution - truetotal);
			System.out.println("Your Philhealth Contribution is: " + percent);
			System.out.println("Your PagIbig Contribution is: " + pagibig);
			System.out.println("Your Total Deductions are: " + total);
			System.out.println("============================================");
			System.out.println("\nYour Taxable Income is: " + contribution);
			System.out.println("Your Income Tax is " + truetotal);
			System.out.println("Your Income is: " + income);
			System.out.println("============================================");
		}
		
		
		
			else if (netwage > 24750 && netwage <= 33333) {
			System.out.print("Your SSS Contribution is 1,125 ");
			sss = (1125.00);
			taxrate = (20833);
			contribution = (netwage - sss - percent - pagibig);
			total = (percent + pagibig + sss);
			withholdingtax = (contribution - taxrate );
			truetotal = (withholdingtax * with);
			income = (contribution - truetotal);
			System.out.println("Your Philhealth Contribution is: " + percent);
			System.out.println("Your PagIbig Contribution is: " + pagibig);
			System.out.println("Your Total Deductions are: " + total);
			System.out.println("============================================");
			System.out.println("\nYour Taxable Income is: " + contribution);
			System.out.println("Your Income Tax is " + truetotal);
			System.out.println("Your Income is: " + income);
			System.out.println("============================================");
			}
		
			else if (netwage > 33334 && netwage <= 66667) {
				System.out.println("Your SSS Contribution is 1,125 ");
				sss = (1125.00);
				taxratee = (33333);
				add = (2500);
				contribution = (netwage - sss - percent - pagibig);
				total = (percent + pagibig + sss);
				withholdingtax = (contribution - taxratee );
				truetotal = (withholdingtax * with);
				income = (contribution - truetotal);
				last = (add + (contribution - taxratee) * tax);
				salary = (contribution - last);
				System.out.println("Your Philhealth Contribution is: " + percent);
				System.out.println("Your PagIbig Contribution is: " + pagibig);
				System.out.println("Your Total Deductions are: " + total);
				System.out.println("============================================");
				System.out.println("\nYour Taxable Income is: " + contribution);
				System.out.println("Your Income Tax is " + last);
				System.out.println("Your Income is: " + salary);
				System.out.println("============================================");
			}
	}
			
	
}