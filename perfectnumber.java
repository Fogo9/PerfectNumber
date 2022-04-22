import java.util.Scanner;

public class perfectnumber{
    public static void main(String[] args) {

        int i, number, total = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Number : ");

        number = input.nextInt();


        for(i = 1; i < number; i++){

            if(number % i == 0){

                total += i;

            }

        }

        if(total == number){

            System.out.println(number + " is The Perfect Number. ");

        }else{

            System.out.println(number + " is not a Perfect Number. ");

        }
    }
}
