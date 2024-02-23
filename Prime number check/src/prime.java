import java.util.Scanner;
public class prime {
    public static void main(String[] args)  {
        try(Scanner input= new Scanner(System.in)){
            System.out.println("Enter a number to check if it is a prime number");
            int x=input.nextInt();
          
            if(x==0){
                System.out.println(+x+" is not a prime number");
            

            }
            for(int i=1;i<x/2;++i){

                if(x%i==0){
                  System.out.println(+x+" is not a prime number");
                  break;
                }
                else System.out.println(+x+" is a prime number");
            
            }

        }

       
    }
}
