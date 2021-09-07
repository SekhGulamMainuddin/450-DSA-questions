import java.io.*;
public class DSA2 {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int arr[]=new int[50];
        System.out.print("Enter the total number of elements : ");
        int n=Integer.parseInt(br.readLine());
        System.out.println("Enter the elements one by one : ");
        int i;int min=0,max=0;
        for(i=0;i<n;i++){
            arr[i]=Integer.parseInt(br.readLine());
            if(i==0){
                min=arr[i];
                max=arr[i];
            }
            if(arr[i]<min)min=arr[i];
            if(arr[i]>max)max=arr[i];
        }
        System.out.println("Maximum is : "+max+"\nMinimum is : "+min);
    }
}
