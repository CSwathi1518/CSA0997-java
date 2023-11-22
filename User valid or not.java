import java.util.*;
class username{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the user name: ");
        String a=input.nextLine();
        System.out.print("Reenter the user name: ");
        String b=input.nextLine();
        if(a==b){
            System.out.print("User name is valid");
        }
        else{
            System.out.print("User name is Invalid");
        }
    }
}
