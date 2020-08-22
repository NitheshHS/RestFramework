package exception;

import java.util.Scanner;

public class SalaryException extends RuntimeException{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter employee name");
		String empName=scan.next();
		System.out.println("enter employee salary");
		int sal=scan.nextInt();
		SalaryException.employee(empName, sal);
		if(sal>1500) {
			throw new SalaryException();
		}
		else
		{
			System.out.println(empName+"->"+sal);
		}
		scan.close();
	}
	String empName;
	int sal;
	public static void employee(String empName, int sal)
	{
		System.out.println(empName+"->"+sal);
	}
	

}
