import java.util.Scanner;
public class IT24104248Lab3Q1B
{
public static void main(String[]args)
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the price of 1kg of rice");
double price=input.nextDouble();
System.out.println("Enter the number of kilograms you want");
double nokg=input.nextDouble();
double amount=price*nokg;
double discount=amount*0.1;
double withdiscount=amount-discount;
System.out.println("The total amount with 10% discount is:"+withdiscount);
}
}
