import java.util.*;


public class NumberSytem{
    public static void main(String[]args){

  int Choose_ = MainMenu();
    CalculateNumber( Choose_);




    }


    public static int  MainMenu(){

        System.out.println("Choose your desire conversion (In number): \n");
      
        System.out.println(" 1)\t Binary to Octal");
        System.out.println(" 2)\t Binary to Decimal");
        System.out.println(" 3)\t Binary to Hexadecimal");
        System.out.println(" 1)\t Octal to Binary");
        System.out.println(" 2)\t Octal to Decimal");
        System.out.println(" 3)\t Octal to Hexadecimal");
        System.out.println(" 4)\t Decimal to Binary");
        System.out.println(" 5)\t Decimal to Octal");
        System.out.println(" 6)\t Decimal to Hexadecimal");
        System.out.println(" 4)\t Hexadecimal to Binary");
        System.out.println(" 5)\t Hexadecimal to Octal");
        System.out.println(" 6)\t Binary to Decimal");

        Scanner input = new Scanner(System.in) ;


        int Choose = input.nextInt();
    return Choose;
    }

    public static void CalculateNumber(int Choose_){
int integer = 0; 
double point = 0;
        System.out.println("Enter your Number :");
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();


        integer = (int) num ;
        point = num - integer;

        

        switch(Choose_){

        case 1: 
            break;

        case 2:
            



            break;

        








        }


    }

}