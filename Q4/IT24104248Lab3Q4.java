import java.util.Scanner;
public class IT24104248Lab3Q4
{
public static void main(String[]args)
{
Scanner scanner=new Scanner(System.in);
System.out.print("Enter a fiv-digit number:");
int number=scanner.nextInt();
   
   String numberStr=String.valueOf(number);
   for(int i=0;i<numberStr.length();i++){
  System.out.print(numberStr.charAt(i)+" ");
}
}
}
  