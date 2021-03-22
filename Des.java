import java.io.*;
class Des{
public static void main(String[] agr) throws IOException {
BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
int n,temp=0;
System.out.println("enter the val of n");
n=Integer.parseInt(br.readLine());
int a[]= new int[n];
for(int i=0;i<=n;i++){
System.out.println("enter the values");
a[i]=Integer.parseInt(br.readLine());
}
for(int i=0;i<n;i++){
 for(int j=i+1;j<n;j++){
  if(a[i]<a[j]){
   temp=a[i];
   a[i]=a[j];
   a[j]=temp;
  }
 }
}
System.out.println("descending order");
for (int i = 0; i < n-1 ; i++) 
        {
            System.out.print(a[i] + ",");
        }
      System.out.println(a[n-1]);
        
    }
}
