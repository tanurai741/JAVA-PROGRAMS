import java.io.*;
class Mul{
public static void main(String[] args) throws IOException{
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
int a,b,c;
System.out.println("enter the value of a");
a= Integer.parseInt(br.readLine());
System.out.println("enter the value of b");
b= Integer.parseInt(br.readLine());
c= a*b;
System.out.println("c=" +c);
}
}
