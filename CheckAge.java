package Day4Challange;

import java.util.Scanner;

public class CheckAge {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter your age: ");
                int userAge=scanner.nextInt();

                if(userAge >1 && userAge<=13)
                {
                    System.out.println("You're a child.");
                }
                else if(userAge >13 && userAge<=30)
                {
                    System.out.println("You're young.");
                }
                else if(userAge >30 && userAge<=50)
                {
                    System.out.println("You're middle aged.");
                }
                else if(userAge >50 && userAge<=100)
                {
                    System.out.println("You're old.");
                }
                else if(userAge <=0 || userAge>100)
                {
                    System.out.println("Please enter a valid age.");
                }

                scanner.close();


    }
}
