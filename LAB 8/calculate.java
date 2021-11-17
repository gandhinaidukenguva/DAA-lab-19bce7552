import java.util.*;
public class p1{
static Scanner in=new Scanner(System.in);
static ArrayList<Integer> sVal, count;
private static void calculate(int[] point, ArrayList<Integer> ar) {
for(int i=0;i<point.length;i++){
if(point[i]<=ar.get(1)&&point[i]>=ar.get(0)){
int temp=count.get(i);
count.set(i, ++temp);
//System.out.println("test"+temp);
}}}
private static int[] enterValues(int[] a, int p) {
for(int i=0;i<p;i++)
a[i]=in.nextInt();
return a;
}
public static void main(String[] args) {
System.out.println("No.of Segments: ");
int s=in.nextInt();
System.out.println("No.of Points: ");
int p=in.nextInt();
//input values in the array of segment and point
//int[] segment=new int[s];
int[] point=new int[p];
//segment=enterValues(segment,s);
System.out.println("Enter the values in point array: ");
point=enterValues(point,p);
//initialising the temp count array--output stored here
count=new ArrayList<Integer>();
for(int i=0;i<p;i++){
count.add(0);
}
sVal=new ArrayList<Integer>(s);
for(int i=0;i<s;i++)
{
System.out.println("Enter values for the segment: ");
for(int j=0;j<2;j++)
sVal.add(in.nextInt());
calculate(point,sVal);
sVal.clear();
} for(int i=0;i<p;i++)
System.out.print(count.get(i)+" ");
}}
