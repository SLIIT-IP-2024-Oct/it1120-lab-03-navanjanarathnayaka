import java.util.Scanner;
public class IT24104248Lab3Q4
{
public static void main(String[]args)
{
Scanner scanner=new Scanner(System.in);
System.out.print("Enter a fiv-digit number:");
int number=scanner.nextInt();
int num1,num2,num3,num4,num5;

num1=number/10000;
int rest=number%10000;
System.out.print(num1+" ");

num2=rest/1000;
rest=rest%1000;
System.out.print(num2+" ");

num3=rest/100;
rest=rest%100;
System.out.print(num3+" ");

num4=rest/10;
rest=rest%10;
System.out.print(num4+" ");

System.out.println(rest);

scanner.close();
}
}
