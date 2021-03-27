import java.io.*;
class Div{
public static void main(String[] arg) throws IOException{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
int a,b,c;
System.out.println("enter value of a");
a = Integer.parseInt(br.readLine());
System.out.println("enter value of b");
b= Integer.parseInt(br.readLine());
c= a/b;
System.out.println("value of c=" +c);
}
}
