import java.util.Scanner;
public class IT24104248Lab3Q2
{
public static void main(String[]args)
{
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the monthly salary");
double monthly=scanner.nextDouble();
System.out.println("Enter the the number of OT hours");
double hours=scanner.nextDouble();
System.out.println("Enter the OT hourly rate");
double rate=scanner.nextDouble();
double OTAmount=hours*rate;
double Totalsalary=monthly+OTAmount;
System.out.println("The total salary including OT is:"+Totalsalary);
scanner.close();
}
}

