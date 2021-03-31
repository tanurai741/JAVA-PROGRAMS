import java.io.*;
class Age{
public static void main(String[]arg) throws IOException{
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
int age;
System.out.println("enter age");
age=Integer.parseInt(br.readLine());
if (age>=18){
System.out.println("the person is an adult");
}
else{
int x = 18-age;
System.out.println("the person will become an adult in" +x+ "years");
}
}
}