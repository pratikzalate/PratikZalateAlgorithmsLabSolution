package Project2;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Denomination{
    public static void main(String [] args){

        int i, size,notes,payAmount;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of currancy values: ");
        size = sc.nextInt();
        Integer[] currancyValue = new Integer[size];

        System.out.printf("Enter %d currancy values: \n",size);        
        for(i=0; i<size; i++){
            currancyValue[i] = sc.nextInt();
        }
        // Sort this currancyValue array in descending order
        Arrays.sort(currancyValue, Collections.reverseOrder());
        // Take amount need to pay as a input from user
        System.out.print("Enter amount you want to pay: ");
        payAmount = sc.nextInt();
        sc.close();

        System.out.println("Payment approach in order to give minimum no of notes will be: ");
        for(i=0; i<size; i++){
            // finding count of notes requied of different currancies to sum up for amount need to pay
            notes = payAmount/currancyValue[i];
            if(notes>0){
                System.out.println(currancyValue[i]+" : "+notes);
            }
            payAmount %= currancyValue[i];
            if(payAmount == 0)
                break;
            if(i==size-1 && payAmount>0){
                System.out.println("Further Denomination of Rs "+payAmount+" is not possible.");
                break;
            }
        }
    }
}
