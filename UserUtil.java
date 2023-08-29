import java.util.Scanner;

public class UserUtil {


    Scanner sc = new Scanner(System.in);

    int n = 1;
    int id = 0;

    User createContact(){

        User user = new User();
            int n=1;
        while (n==1){
            System.out.println("Enter id");
            id = sc.nextInt();
            for (User u:UserIServiceImpl.getUserList()){
                if (u.getId()==id){
                    n = 0;
                    System.out.println("This id is already exit Please enter another Id");
                    break;
                }
            }
            if(n==0) {
                n = 1;
            }
            else {
                n = 0;
            }
        }


            System.out.println("Enter name");
            String name = sc.next();

            System.out.println("Enter email");
            String email = sc.next();

            System.out.println("Enter phone number");
            String pn = sc.next();

            System.out.println("Select catagory by enter number");
            System.out.println("0 Personal");
            System.out.println("1 Business");
            int catagory = sc.nextInt();

            if (catagory==0)
                user.setCatagory("Personal");
            else
                user.setCatagory("Business");

            user.setId(id);
            user.setName(name);
            user.setEmail(email);
            user.setPhone_number(pn);

            return user;

    }



}
