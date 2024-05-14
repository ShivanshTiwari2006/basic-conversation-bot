import java.util.Scanner;

public class Main {
    public static void  main(String[] args){

        Scanner scanner= new Scanner(System.in);
        System.out.println("What is your name?  :- ");
        String name= scanner.nextLine();
        System.out.println("How old are You?  :- ");
        int age=scanner.nextInt();
        scanner.nextLine();                                      //This Line is Added inorder to not break the user conversation in between or lese it must create an error//

        System.out.println("Which food you like?? :- ");
        String food= scanner.nextLine();
        System.out.println("What is your hobby?? :- ");
        String hobby= scanner.nextLine();

        System.out.println("Hello:"+ name);
        System.out.println("And you Are "+age+" years Old");
        System.out.println("Thats greet that You Like "+ food);
        System.out.println("Well i Love "+ hobby+"it is a great Hobby!!");

    }
}
