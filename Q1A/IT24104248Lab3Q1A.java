import java.util.Scanner;
public class IT24104248Lab3Q1A
{
 public static void main(String[]args)
{

Scanner input=new Scanner(System.in);
System.out.println("Enter the price of 1kg of rice");
double priceof1kg=input.nextDouble();
System.out.println("Enter the number of kilograms you want to buy");
double Noofkg=input.nextDouble();
double amount=Noofkg*priceof1kg;
System.out.println("The total amount is:"+amount);
}
}