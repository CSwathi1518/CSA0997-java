import java.util.*;
class denominations{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int amount=0;
        for(int i=1;i<=4;i++){
            System.out.print("Enter the "+i+" Denomination: ");
            int d=input.nextInt();
            System.out.print("Enter the "+i+" Denomination number of notes: ");
            int n=input.nextInt();
            amount=amount+(d*n);
        }
        System.out.println("Total Available Balance in ATM: "+amount);
    }
}
