import java.util.*;
public class DSA5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements separated by a single space");
        String el=sc.nextLine();
        String arr[]=el.trim().split(" ");
        int elements[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            elements[i]=Integer.parseInt(arr[i]);
        }
        int temp;
        for(int i=0;i<elements.length-1;i++){
            for(int j=i;j<elements.length-1;j++){
                if(elements[j+1]<elements[j]){
                    temp=elements[j];
                    elements[j]=elements[j+1];
                    elements[j+1]=temp;
                }
            }
        }
        for(int i=0;i<elements.length;i++){
            System.out.print(elements[i]+" ");
        }
    }
}
