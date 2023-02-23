import java.util.Scanner;
class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner get = new Scanner(System.in);
				
		int empID;
		
		
		
		do { 
		System.out.println("\t");
		System.out.println("Employee ID Numbers are 10001-10025 ");
		//Input Statements
		System.out.print("Enter the Employee ID: ");
		
		
		
		 empID = get.nextInt(); 
		 switch (empID) {
		/*Switch case when a specific number is entered 
		 * it will display the employees details
		 * */
		case 10001:
		System.out.println("Name: Crisostomo Jose ");
		System.out.println("Status: Regular ");
		System.out.println("Position: HR Manager ");
		System.out.println("Immediate Supervisor: N/A ");
		System.out.println("Basic Salary: 62,670 ");
		System.out.println("Rice Subsidy: 1500 ");
		System.out.println("Phone Allowance: 1000 ");
		System.out.println("Clothing Allowance: 1000 ");
		System.out.println("Gross Semi Monthly Rate: 31,335 ");
		System.out.println("Hourly Rate: 373.04 ");
		
		break;

		case 10002:
			System.out.println("Name: Christian Mata ");
			System.out.println("Status: Regular ");
			System.out.println("Position: Account Team Leader ");
			System.out.println("Immediate Supervisor: Romualdez, Fredrick ");
			System.out.println("Basic Salary: 42,975 ");
			System.out.println("Rice Subsidy: 1500 ");
			System.out.println("Phone Allowance: 800 ");
			System.out.println("Clothing Allowance: 800 ");
			System.out.println("Gross Semi Monthly Rate: 21,488 ");
			System.out.println("Hourly Rate: 255.80 ");
			
			break;
			
		case 10003:
			System.out.println("Name: Brad San Jose ");
			System.out.println("Status: Regular");
			System.out.println("Position: HR Team Leader");
			System.out.println("Immediate Supervisor: Crisostomo Jose");
			System.out.println("Basic Salary: 42,975 ");
			System.out.println("Rice Subsidy: 1500 ");
			System.out.println("Phone Allowance: 800 ");
			System.out.println("Clothing Allowance: 800 ");
			System.out.println("Gross Semi Monthly Rate: 21,488 ");
			System.out.println("Hourly Rate: 255.80 ");
			
			break;
			
		case 10004:
			System.out.println("Name: Anthony Salcedo ");
			System.out.println("Status: Regular");
			System.out.println("Position: Payroll Manager");
			System.out.println("Immediate Supervisor: Crisostomo Jose ");
			System.out.println("Basic Salary: 60,825 ");
			System.out.println("Rice Subsidy: 1500");
			System.out.println("Phone Allowance: 1000 ");
			System.out.println("Clothing Allowance: 1000 ");
			System.out.println("Gross Semi Monthly Rate: 30,413 ");
			System.out.println("Hourly Rate: 362.05 ");
			
			break;
			
		case 10005:
			System.out.println("Name: Alice Romualdez ");
			System.out.println("Status: Regular ");
			System.out.println("Position: HR Rank and File ");
			System.out.println("Immediate Supervisor: San Jose, Brad ");
			System.out.println("Basic Salary: 22,500 ");
			System.out.println("Rice Subsidy: 1500 ");
			System.out.println("Phone Allowance: 500");
			System.out.println("Clothing Allowance: 500 ");
			System.out.println("Gross Semi Monthly Rate: 11,250 ");
			System.out.println("Hourly Rate: 133.93");
			
			break;
			
		case 10006:
			System.out.println("Name: Rosie Atienza ");
			System.out.println("Status: Regular ");
			System.out.println("Position: HR Rank and File");
			System.out.println("Immediate Supervisor: San Jose, Brad ");
			System.out.println("Basic Salary: 22,500 ");
			System.out.println("Rice Subsidy: 1500 ");
			System.out.println("Phone Allowance: 500 ");
			System.out.println("Clothing Allowance: 500 ");
			System.out.println("Gross Semi Monthly Rate: 11,250 ");
			System.out.println("Hourly Rate: 133. 93");
			
			break;
			
		case 10007:
			System.out.println("Name: Martha Farala ");
			System.out.println("Status: Regular ");
			System.out.println("Position: Payroll Rank and File");
			System.out.println("Immediate Supervisor: Farala, Martha");
			System.out.println("Basic Salary: 24,000 ");
			System.out.println("Rice Subsidy: 1500 ");
			System.out.println("Phone Allowance: 500 ");
			System.out.println("Clothing Allowance: 500 ");
			System.out.println("Gross Semi Monthly Rate: 12,000 ");
			System.out.println("Hourly Rate: 142.86 ");
			
			break;
			
		case 10008:
			System.out.println("Name: Leila Martinez");
			System.out.println("Status: Regular ");
			System.out.println("Position: Payroll Rank and File");
			System.out.println("Immediate Supervisor: Farala, Martha ");
			System.out.println("Basic Salary: 24,000 ");
			System.out.println("Rice Subsidy: 1500 ");
			System.out.println("Phone Allowance: 500 ");
			System.out.println("Clothing Allowance: 500 ");
			System.out.println("Gross Semi Monthly Rate: 12,000 ");
			System.out.println("Hourly Rate: 142.86 ");
			
			break;
			
		case 10009:
			System.out.println("Name: Allison San Jose");
			System.out.println("Status: Regular ");
			System.out.println("Position: Account Rank and File");
			System.out.println("Immediate Supervisor: Mata, Christian ");
			System.out.println("Basic Salary: 22,500 ");
			System.out.println("Rice Subsidy: 1500 ");
			System.out.println("Phone Allowance: 500 ");
			System.out.println("Clothing Allowance: 500 ");
			System.out.println("Gross Semi Monthly Rate: 11,250 ");
			System.out.println("Hourly Rate: 133.93 ");
			
			break;
			
		case 10010:
			System.out.println("Name: Cydney Rosario ");
			System.out.println("Status: Regular ");
			System.out.println("Position: Account Rank and File");
			System.out.println("Immediate Supervisor: Mata, Christian ");
			System.out.println("Basic Salary: 22,500 ");
			System.out.println("Rice Subsidy: 1500 ");
			System.out.println("Phone Allowance: 500 ");
			System.out.println("Clothing Allowance: 500 ");
			System.out.println("Gross Semi Monthly Rate: 11,250 ");
			System.out.println("Hourly Rate: 133.93 ");
			
			break;
			
		case 10011:
			System.out.println("Name: Josie Lopez ");
			System.out.println("Status: Regular ");
			System.out.println("Position: Payroll Team Leader ");
			System.out.println("Immediate Supervisor: Salcedo, Anthony ");
			System.out.println("Basic Salary: 38,475 ");
			System.out.println("Rice Subsidy: 1500 ");
			System.out.println("Phone Allowance: 800 ");
			System.out.println("Clothing Allowance: 800 ");
			System.out.println("Gross Semi Monthly Rate: 19,238 ");
			System.out.println("Hourly Rate: 229.02 ");
			
			break;
			
		case 10012:
			System.out.println("Name: Selena De Leon ");
			System.out.println("Status: Regular ");
			System.out.println("Position: Account Team Leader ");
			System.out.println("Immediate Supervisor: Romualdez, Fredrick");
			System.out.println("Basic Salary: 41, 850 ");
			System.out.println("Rice Subsidy: 1500 ");
			System.out.println("Phone Allowance: 800 ");
			System.out.println("Clothing Allowance: 800 ");
			System.out.println("Gross Semi Monthly Rate: 20,925 ");
			System.out.println("Hourly Rate: 249.11 ");
			
			break;
			
		case 10013:
			System.out.println("Name: Fredrick Romualdez ");
			System.out.println("Status: Regular ");
			System.out.println("Position: Account Manager ");
			System.out.println("Immediate Supervisor: Crisostomo, Jose ");
			System.out.println("Basic Salary: 63,500 ");
			System.out.println("Rice Subsidy: 1500 ");
			System.out.println("Phone Allowance: 1000 ");
			System.out.println("Clothing Allowance: 1000 ");
			System.out.println("Gross Semi Monthly Rate: 31,750 ");
			System.out.println("Hourly Rate: 377.98 ");
			
			break;
			
		case 10014:
			System.out.println("Name: Mark Bautista ");
			System.out.println("Status: Regular");
			System.out.println("Position: Account Rank and File ");
			System.out.println("Immediate Supervisor: Mata, Christian ");
			System.out.println("Basic Salary: 23,250 ");
			System.out.println("Rice Subsidy: 1500 ");
			System.out.println("Phone Allowance: 500 ");
			System.out.println("Clothing Allowance: 500 ");
			System.out.println("Gross Semi Monthly Rate: 11,625 ");
			System.out.println("Hourly Rate: 138.39 ");
			
			break;
			
		case 10015:
			System.out.println("Name: Darlene Lazaro ");
			System.out.println("Status: Probationary");
			System.out.println("Position: Account Rank and File ");
			System.out.println("Immediate Supervisor: Mata, Christian ");
			System.out.println("Basic Salary: 23,250 ");
			System.out.println("Rice Subsidy: 0 ");
			System.out.println("Phone Allowance: 0 ");
			System.out.println("Clothing Allowance: 0 ");
			System.out.println("Gross Semi Monthly Rate: 11,625 ");
			System.out.println("Hourly Rate: 138.39 ");
			
			break;
			
		case 10016:
			System.out.println("Name: Kolby Delos Santos ");
			System.out.println("Status: Probationary ");
			System.out.println("Position: Account Rank and File");
			System.out.println("Immediate Supervisor: Mata, Christian ");
			System.out.println("Basic Salary: 24,000 ");
			System.out.println("Rice Subsidy: 0 ");
			System.out.println("Phone Allowance: 0 ");
			System.out.println("Clothing Allowance: 0 ");
			System.out.println("Gross Semi Monthly Rate: 12,000 ");
			System.out.println("Hourly Rate: 142.86 ");
			
			break;
			
		case 10017:
			System.out.println("Name: Vella Santos ");
			System.out.println("Status: Probationary ");
			System.out.println("Position:  Account Rank and File ");
			System.out.println("Immediate Supervisor: Mata, Christian ");
			System.out.println("Basic Salary: 22,500 ");
			System.out.println("Rice Subsidy: 0 ");
			System.out.println("Phone Allowance: 0 ");
			System.out.println("Clothing Allowance: 0 ");
			System.out.println("Gross Semi Monthly Rate: 11,250 ");
			System.out.println("Hourly Rate: 133.93 ");
			
			break;
			
		case 10018:
			System.out.println("Name: Tomas Del Rosario ");
			System.out.println("Status: Probationary ");
			System.out.println("Position:  Account Rank and File ");
			System.out.println("Immediate Supervisor: Mata, Christian ");
			System.out.println("Basic Salary: 22,500 ");
			System.out.println("Rice Subsidy: 0 ");
			System.out.println("Phone Allowance: 0 ");
			System.out.println("Clothing Allowance: 0 ");
			System.out.println("Gross Semi Monthly Rate: 11,250  ");
			System.out.println("Hourly Rate: 133.93 ");
			
			break;
			
		case 10019:
			System.out.println("Name: Jacklyn Tolentino");
			System.out.println("Status: Probationary ");
			System.out.println("Position:  Account Rank and File ");
			System.out.println("Immediate Supervisor: De Leon, Selena");
			System.out.println("Basic Salary: 24,000 ");
			System.out.println("Rice Subsidy: 0 ");
			System.out.println("Phone Allowance: 0 ");
			System.out.println("Clothing Allowance: 0 ");
			System.out.println("Gross Semi Monthly Rate: 12,000 ");
			System.out.println("Hourly Rate: 142.86 ");
			
			break;
			
		case 10020:
			System.out.println("Name: Percival Gutierrez ");
			System.out.println("Status: Probationary ");
			System.out.println("Position:  Account Rank and File ");
			System.out.println("Immediate Supervisor: De Leon, Selena ");
			System.out.println("Basic Salary: 24, 750 ");
			System.out.println("Rice Subsidy: 0 ");
			System.out.println("Phone Allowance: 0 ");
			System.out.println("Clothing Allowance: 0 ");
			System.out.println("Gross Semi Monthly Rate: 12,375 ");
			System.out.println("Hourly Rate: 147.32 ");
			
			break;
			
		case 10021:
			System.out.println("Name: Garfield Manalaysay ");
			System.out.println("Status: Probationary ");
			System.out.println("Position:  Account Rank and File ");
			System.out.println("Immediate Supervisor: De Leon, Selena ");
			System.out.println("Basic Salary: 24,750 ");
			System.out.println("Rice Subsidy: 0 ");
			System.out.println("Phone Allowance: 0 ");
			System.out.println("Clothing Allowance: 0 ");
			System.out.println("Gross Semi Monthly Rate: 12,375 ");
			System.out.println("Hourly Rate: 147.32  ");
			
			break;
			
		case 10022:
			System.out.println("Name: Lizeth Villegas");
			System.out.println("Status: Probationary ");
			System.out.println("Position:  Account Rank and File ");
			System.out.println("Immediate Supervisor: De Leon, Selena");
			System.out.println("Basic Salary: 24,000 ");
			System.out.println("Rice Subsidy: 0 ");
			System.out.println("Phone Allowance: 0 ");
			System.out.println("Clothing Allowance: 0 ");
			System.out.println("Gross Semi Monthly Rate: 12,000 ");
			System.out.println("Hourly Rate: 142.86 ");
			
			break;
			
		case 10023:
			System.out.println("Name: Carol Ramos ");
			System.out.println("Status: Probationary ");
			System.out.println("Position:  Account Rank and File ");
			System.out.println("Immediate Supervisor: De Leon, Selena ");
			System.out.println("Basic Salary: 22,500 ");
			System.out.println("Rice Subsidy: 0 ");
			System.out.println("Phone Allowance: 0 ");
			System.out.println("Clothing Allowance: 0 ");
			System.out.println("Gross Semi Monthly Rate: 11,250 ");
			System.out.println("Hourly Rate: 133.93 ");
			
			break;
			
		case 10024:
			System.out.println("Name: Emelia Maceda ");
			System.out.println("Status: Probationary ");
			System.out.println("Position:  Account Rank and File ");
			System.out.println("Immediate Supervisor: De Leon, Selena ");
			System.out.println("Basic Salary: 22,500 ");
			System.out.println("Rice Subsidy: 0 ");
			System.out.println("Phone Allowance: 0 ");
			System.out.println("Clothing Allowance: 0 ");
			System.out.println("Gross Semi Monthly Rate: 11,250 ");
			System.out.println("Hourly Rate: 133.93");
			
			break;
			
		case 10025:
			System.out.println("Name: Delia Aguilar ");
			System.out.println("Status: Probationary ");
			System.out.println("Position:  Account Rank and File ");
			System.out.println("Immediate Supervisor: De Leon, Selena ");
			System.out.println("Basic Salary: 22,500 ");
			System.out.println("Rice Subsidy: 0 ");
			System.out.println("Phone Allowance: 0 ");
			System.out.println("Clothing Allowance: 0 ");
			System.out.println("Gross Semi Monthly Rate: 11,250 ");
			System.out.println("Hourly Rate: 133.93");
			
		 } 
		}  
		while (empID < 10026);    
		System.out.println("Invalid Employee Number");	
		
		
			
			
		 }
			
			
		
			    
		 
		 
		 
	
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

		 
		
		 
		 
		
		 
		 
		 
		 
		 }


