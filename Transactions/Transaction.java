package Transactions;
import java.util.Scanner;

public class Transaction{
    public static void main(String [] args){
        //Target1: Input size of array
        System.out.print("Enter number of transactions:");
        Scanner sc = new Scanner(System.in);
        int length= sc.nextInt();
        int[] input = new int[length];

        //Target2: Take array elements input from user
        System.out.printf("Enter %d numbers:", length);
        for(int i=0; i<length; i++){
            input[i]=sc.nextInt();
        }

        //Target3: Take count of target values
        System.out.print("Enter the total no of targets that needs to be achieved: ");
        int target_count=sc.nextInt();

        int target, sum,flag;

        for(int i=0; i<target_count; i++){
            // Target4: Take target value input
            System.out.print("Enter target value: ");
            target=sc.nextInt();
            sum=0;
            flag=0;
            for(int j=0; j<length; j++){
                sum += input[j];
                if(sum>=target){
                    //Target5: display result
                    System.out.printf("Target is achieved after %d transaction.\n",(j+1));
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                System.out.printf("Target is not achieved.\n");
        }
        sc.close();  
    }
}