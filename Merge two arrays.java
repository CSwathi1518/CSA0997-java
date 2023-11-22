import java.util.Scanner;
public class mergearray{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the  first array size: ");
        int n1=input.nextInt();
        int i;
        int a[]=new int[n1];
        System.out.println("Enter the first array elements: ");
        for(i=0;i<n1;i++){
            a[i]=input.nextInt();
        }
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the second array size: ");
        int n2=input.nextInt();
        int b[]=new int[n2];
        System.out.println("Enter the second array elements: ");
        for(i=0;i<n2;i++){
            b[i]=input.nextInt();
        }
        System.out.println("Merged array is: ");
        for(i=0;i<n1;i++){
            System.out.print(a[i]+" ");
        }
        for(i=0;i<n2;i++){
            System.out.print(b[i]+" ");
        }
    }
}
