import java.util.*;
public class Main {
static int FibRecurs(int n){
if(n<=1){
return n;
}
else{
return FibRecurs(n-1)+FibRecurs(n-2);
}
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.print("Time complexity of the given number is " + FibRecurs(n));
}
}
