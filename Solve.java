package IncubyteAssessment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solve {

    public static int add(String number){
        int sum = 0;
        // split sting into a array of strings
        String arr[] = number.split("\n|,|;|//|:");

        // creating a list to store all the negative numbers
        List<Integer> negativeNumbers = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            int num;
            // converting string to integer checking string should not be empty
            if(arr[i] != "")
                num = Integer.parseInt(arr[i].trim());
            else
                continue;
            // checking it it is a negative number 
            if(num < 0)
                negativeNumbers.add(num);
            else
                sum += num;
        }
        // if there is any negative number throw error 
        if(negativeNumbers.size() > 0)
            throw new ArithmeticException("negative numbers not allowed " + negativeNumbers );
        
        // if there is not any negative number return the result
        return sum;
    }
    
    
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // taking input from the user 
        String str = sc.nextLine();
        
        // int sm = add("-1\n2,3;-4//21");

        int sm = add(str);
        
        // printing the sum
        System.out.println("The sum is " + sm);
    }

}
