import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        UserIServiceImpl userIService = new UserIServiceImpl();

        Scanner sc = new Scanner(System.in);

        int id = 0;

        int n = 0;


        while (true) {

            System.out.println("Enter number as per Service");

            System.out.println("1 Creating Contact");
            System.out.println("2 Updating Contact");
            System.out.println("3 Viewing Contact");
            System.out.println("4 Removing Contact");
            System.out.println("5 Shorting Contact");

            n = sc.nextInt();


            switch (n) {
                case 1:
                    userIService.createUser();
                    break;
                case 2:
                    userIService.updateUser();
                    break;
                case 3:
                    userIService.viewUser();
                    break;
                case 4:
                    userIService.deleteUser();
                    break;
                case 5:
                    userIService.userSort();
                    break;
                default:
                    System.out.println("Please enter a valid number");
            }
        }

    }
}
