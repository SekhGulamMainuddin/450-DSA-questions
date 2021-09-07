import java.io.*;
import java.util.Arrays;
public class DSA3 {
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the total number of elements : ");
        int n=Integer.parseInt(br.readLine());
        int arr[]=new int[n];
        System.out.println("Enter the elements one by one : ");
        int i;
        for(i=0;i<n;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        System.out.print("Enter the Kth smallest number to be searched : ");
        int k=Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        System.out.println(k+"th smallest number is : "+arr[k-1]);
    }
}
