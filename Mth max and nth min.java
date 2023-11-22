import java.util.Scanner;
public class maxmin{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int s=input.nextInt();
        int i,j,temp;
        int a[]=new int[s];
        System.out.println("Enter the array elements: ");
        for(i=0;i<s;i++){
            a[i]=input.nextInt();
        }
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter M value: ");
        int m=sc.nextInt();
        System.out.print("Enter N value: ");
        int n=sc.nextInt();
        for(i=0;i<s;i++){
            for(j=i+1;j<s;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(m+" maximum element is: "+(a[s-m]));
        System.out.println(n+" minimum element is: "+a[n-1]);
    }
}
