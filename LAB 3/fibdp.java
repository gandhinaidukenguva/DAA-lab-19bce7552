import java.util.*;
public class Main{
static int Fibarr(int n){
int f[]=new int[n+2];
int i;
f[0]=0;
f[1]=1;
for(i=2;i<=n;i++){
f[i]=f[i-1]+f[i-2];
}
return f[n];
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int X=sc.nextInt();
System.out.println("The time complexity is " + Fibarr(X) + " ");
}
}
