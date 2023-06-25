package exception;
import java.util.*;
/**
 * @class Das folgende Programm liest von der Console die Angestelltennummer, den Stundenlohn und die 
 * w�chentliche Arbeitszeit ein. Anschliessend wird der Name, w�chentliche Verdienst sowie die �berstunden
 * ausgegeben.
 */

public class EmployeeSalary {
	
	

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		long employeeNumber = 0;
		String employeeName;
		double hourlySalary = 0.00;
		double weeklyTime = 0.00;
		double regularTime, overtime;
		double regularPay, overtimePay, netPay;

		
		System.out.print("Enter Employee Number (00000): ");
		try
		{
		employeeNumber = scnr.nextLong();
		
		if(employeeNumber < 0)
			throw new IsNegativeException();
		}
		
		catch(InputMismatchException e)
		{
			System.out.println("Fehler: Bitte einen Long-Wert eingeben");
			System.exit(1);
		}
		
		 catch(IsNegativeException e)
		{
			System.out.println("Fehler: Keine negativen Werte eingeben");
			System.exit(1);
		} 
		catch(Exception e)
		{
			System.out.println("Fehler: Internal Error");
			System.exit(1);
		}
		
		if (employeeNumber == 82500)
			employeeName = "Peter Baker";
		else if (employeeNumber == 92746)
			employeeName = "John Kouma";
		else if (employeeNumber == 54080)
			employeeName = "Steg Larson";
		else if (employeeNumber == 86285)
			employeeName = "Gertrude Monay";
		else
			employeeName = "Unknown";
		try
		{
		System.out.print("Enter Hourly Salary: ");
		hourlySalary = scnr.nextDouble();
		if(hourlySalary < 0)
			throw new IsNegativeException();
		System.out.print("Enter Weekly Time: ");
		weeklyTime = scnr.nextDouble();
		scnr.close();
		if(weeklyTime <0)
			throw new IsNegativeException();
		
		} 
		catch(InputMismatchException e)
		{
			System.out.println("Fehler: Bitte einen Double-Wert eingeben");
			System.exit(1);
		}
		catch(IsNegativeException e)
		{
			System.out.println("Fehler: Keine negativen Werte eingeben");
			System.exit(1);
		}
		catch(Exception e)
		{
			System.out.println("Fehler: Internal Error");
			System.exit(1);
		}
		finally {
			scnr.close();
		}
		if (weeklyTime < 40) {
			regularTime = weeklyTime;
			overtime = 0;
			regularPay = hourlySalary * regularTime;
			overtimePay = 0;
			netPay = regularPay;
		} else {
			regularTime = 40;
			overtime = weeklyTime - 40;
			regularPay = hourlySalary * 40;
			overtimePay = hourlySalary * overtime;
			netPay = regularPay + overtimePay;
		}

		System.out.println("======================");
		System.out.println("==-=-= Employee Payroll =-=-==");
		System.out.println("-------------------------------------------");
		System.out.printf("Employee #:    %d\n", employeeNumber);
		System.out.printf("Employee Name: %s\n", employeeName);
		System.out.printf("Hourly Salary: %.2f\n", hourlySalary);
		System.out.printf("Weekly Time:   %.2f\n", weeklyTime);
		System.out.printf("Regular Pay:   %.2f\n", regularPay);
		System.out.printf("Overtime Pay:  %.2f\n", overtimePay);
		System.out.printf("Total Pay:     %.2f\n", netPay);
		System.out.println("======================");
		
	}
	
	

}