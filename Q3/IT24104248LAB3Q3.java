import java.util.Scanner;
public class IT24104248LAB3Q3
{
public static void main(String[]args)
{
Scanner scanner=new Scanner(System.in);
System.out.print("Enter the Rupee amount:");
int amount=scanner.nextInt();
int count5000=amount/5000;
amount=amount%5000;
int count1000=amount/1000;
amount=amount%1000;
int count500=amount/500;
amount=amount%500;
int count200=amount/200;
amount=amount%200; 
int count100=amount/100;
amount=amount%100;
int count50=amount/50;
amount=amount%50;
int count20=amount/20;
amount=amount%20;
int count10=amount/10;
amount=amount%10;
int count05=amount/05;
amount=amount%05;
int count02=amount/02;
amount=amount%02;
int count01=amount/01;
amount=amount%01;
System.out.println("Notes5000:"+count5000);
System.out.println("Notes1000:"+count1000);
System.out.println("Notes500:"+count500);
System.out.println("Notes200:"+count200);
System.out.println("Notes100:"+count100);
System.out.println("Notes50:"+count50);
System.out.println("Notes20:"+count20);
System.out.println("Notes10:"+count10);
System.out.println("coins05:"+count05);
System.out.println("coins02:"+count02);
System.out.println("coins01:"+count01);

scanner.close();
}
}