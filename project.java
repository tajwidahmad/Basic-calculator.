import java.util.*;
public class project {
    public static int factorial(int n){
        int fact =1;
        int i;
        for(i=1;i<=n;i++){
            fact= fact*i;
           

        }
        return fact;
    }
    public static int random(int m) {
        int rndm = (int) (Math.random()*100);
        return rndm;
    }
    public static int bincoff(int n,int r) {
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int n_min_r=factorial(n-r);
        int bc=fact_n/(fact_r*n_min_r);
        return bc;
    }

    public static int rdm(int ran){
        int rand= (int)(Math.random()*100);
        return rand;
        
    }
    public static int bintodec(int bin) {
        int decimal= 0;
        int power  =0;
        while(bin>0){
            int lastdigit = bin%10;
            decimal = decimal+((int)Math.pow(2,power)*lastdigit);
            power++;
            bin=bin/10;
            
        }
        return decimal;
    }
    public static int exp(int a,int b) {
       int pow = (int)Math.pow(a,b);
        return pow;
        
    }

    
        



    


    public static void main(String[] args) {
        System.out.println("Hey there! Welcome to Calculudus! Lets get started!");
        while(1>0){
            System.out.print("\nI appreciate it if you could select the option that suits your needs\n1: PRESS 1 FOR CALCULATING BINOMIAL COEFFICIENT.\n2: PRESS 2 FOR CONVERTING ANY BINARY NUMBER TO DECIMAL NUMBER.\n3: PRESS 3 FOR CALCULATING THE FACTORIAL OF A NUMBER.\n4: PRESS 4 FOR FINDING EXPOENTS.\n5: PRESS 5 FOR CHECKING WEATHER THE NUMBER IS PRIME OR NOT\n6: PRESS 6 FOR CALCULATING THE VOLUME OF A CYLINDER.\n7: PRESS 7 FOR PLAY A RANDOM NUMBER GUESSING GAME WITH MACHINE");
            System.out.print("To proceed,please enter the appropriate number from the options provided: ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the total number of items.(n)");
                    int n =sc.nextInt();
                    System.out.print("Enter the number of items to be chosen.(r)");
                    int r = sc.nextInt();
                    int result = bincoff(n, r);
                    System.out.print("the binomial coefficient C(n,r)is: \n"+result);


                    break;
                case 2:
                System.out.print("Enter the binomial number that you want to convert: ");
                int bin = sc.nextInt();
                int deci = bintodec(bin);
                System.out.print("The decimal number is: \n"+deci);
                break;
                case 3:
                System.out.print("Enter any integer for which the factorial is required: ");
                int f = sc.nextInt();
                int fc = factorial(f);
                System.out.print("the factorial of the given number is:\n "+fc);
                break;
                case 4:
                System.out.print("Give the base of the number you want to calculate the expoent for: ");
                int base = sc.nextInt();
                System.out.print("Give the power:");
                int pow = sc.nextInt();
                int res = exp(base, pow);
                System.out.print("the result is:\n"+res);
                break;
                case 5:
                System.out.print("Enter the number you want to check: ");
                int n1 =sc.nextInt();
                int i;
                int counter=0;
                for(i=1;i<=n1;i++){
                if (n1%i==0){
                counter++;
                }
            }
                
            
        
                if (counter==2){
            System.out.print("the number given is prime number\n");
        }
        else{
            System.out.print("the number is not prime\n");
        }
        case 6:
        System.out.print("Enter the radius of the cylinder");
        float radius = sc.nextFloat();
        System.out.print("Enter the height of the  cylinder:");
        float height = sc.nextFloat();
        double volume = 3.14d*(radius*radius)*height;
        System.out.print("the volume of the cylinder is: \n"+ volume);
        break;
        case 7:
        System.out.print("guess any number between (1-100):");
      int guess = sc.nextInt();
      System.out.print("the number computer guesses is :"+rdm(guess));
      break;
      
      




            
                default:System.out.println("WE are still working on this project please choose from the given options only\n");
                    break;
            }

            
        }



        
      
    }
    
}
