import java.util.*;
class vote{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int n=input.nextInt();
        int a;
        if(n>=18){
            System.out.print("You are eligible to vote");
        }
        else if(n<18 && n>0){
            a=18-n;
            System.out.print("Your are eligible to vote after "+a+" years");
        }
        else{
            System.out.print("Invalid age");
        }
    }
}
