import java.util.*;
public class Main
{
static int GCD(int a,int b)
{
int maximum=Math.max(a,b);
int currentNumber=maximum-1;
while(currentNumber>1){
if((a%currentNumber==0)&&(b%currentNumber==0))
{
return currentNumber;
}
else
{
currentNumber--;
}
}
return 1;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println(GCD(a,b));
}
}
