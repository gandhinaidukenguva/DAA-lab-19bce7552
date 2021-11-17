import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
public class randomAd {
public static void main(String[] args) {
int s=0;
Scanner in=new Scanner(System.in);
System.out.println("Size of the array");
int n=in.nextInt();
Integer [] a= new Integer[n];
Integer [] b= new Integer[n];
Random rd=new Random();
System.out.println("Enter the profits per click");
for(int i=0;i<n;i++)
a[i]=in.nextInt();
for(int i=0;i<n;i++)
b[i]=rd.nextInt();
System.out.println("Average no.of clicks per day");
for(int i=0;i<n;i++)
System.out.print(b[i]+" ");
Arrays.sort(a,Collections.reverseOrder());
Arrays.sort(b,Collections.reverseOrder());
for(int i=0;i<n;i++){
s=s+a[i]*b[i];
}
System.out.println("Maximum: "+s);
}
}
