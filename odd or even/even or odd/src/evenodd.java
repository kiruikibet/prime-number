import java.util.Scanner;

public class evenodd {
    public static void main(String[] args)  {
        try(Scanner input=new Scanner(System.in)){
            System.out.println("Enter number to check if it is even or odd ");
            int x = input.nextInt();
            if(x%2==0){
                System.out.println(+x+"  is an even number");
            }
            else 
        System.out.println(+x+" is an odd number");
        }

      
    }
}
