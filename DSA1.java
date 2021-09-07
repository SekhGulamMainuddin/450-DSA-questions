import java.io.*;
public class DSA1{
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int arr[]=new int[20];
        System.out.print("Enter the total number of elements : ");
        int n=Integer.parseInt(br.readLine());
        System.out.println("Enter the elements one by one : ");
        int i;
        for(i=0;i<n;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        for(i=n-1;i>((n)/2);i--){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}