import org.w3c.dom.Node;

import java.util.*;

public class UserIServiceImpl implements UserService{


    UserUtil util = new UserUtil();

    HashMap<Integer, User> hashMap = new HashMap<>();

    TreeMap<Integer, User> treeMap = new TreeMap<>();

    static List<User> userList = new ArrayList<>();

    UserSortByName userSortByName = new UserSortByName();


    public static List<User> getUserList() {
        return userList;
    }

    public UserIServiceImpl() {
        userList.add(new User(1,"Aman","aman.gmail","7017233221","Personal"));
        userList.add(new User(4,"Gaurav","gaurav.gmail","749573957395","Business"));
        userList.add(new User(3,"Ram","ram.gmail","9475969643","Business"));
        userList.add(new User(2,"Rahul","rahul.gmail","8990332044","Personal"));

        hashMap.put(1, new User(1,"Aman","aman.gmail","7017233221","Personal"));
        hashMap.put(4, new User(4,"Gaurav","gaurav.gmail","749573957395","Business"));
        hashMap.put(3, new User(3,"Ram","ram.gmail","9475969643","Business"));
        hashMap.put(2, new User(2,"Rahul","rahul.gmail","8990332044","Personal"));

    }




    Scanner sc = new Scanner(System.in);


    @Override
    public void createUser() {

        int n = 1;
        while (n==1) {
            User user = util.createContact();
            userList.add(user);
            hashMap.put(user.getId(), user);
            System.out.println("enter 1 for add contant 0 for not");

            n = sc.nextInt();
            while (n != 0 && n != 1) {
                System.out.println("Please Enter a valid number");
                n = sc.nextInt();
            }
        }
    }



    @Override
    public void updateUser() {

        System.out.println("Please enter id");
        int id = sc.nextInt();
        boolean flag = false;

        System.out.println("id : "+id);

        for (Map.Entry<Integer, User> entry: hashMap.entrySet()) {
            if (entry.getKey()==id){
                hashMap.put(id, util.createContact());
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("It is invalid id");
            this.updateUser();
        }

    }




    @Override
    public void deleteUser() {

        boolean flag = false;

        System.out.println("Please enter id");
        int id = sc.nextInt();

        for (User u:userList){
            if (u.getId()==id){
                userList.remove(u);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("It is invalid id");
            this.deleteUser();
        }
    }





    @Override
    public void viewUser() {

        System.out.println("1 view all");
        System.out.println("2 view by id");
        int n = sc.nextInt();
        if (n==1)
            for (User u:userList){
                System.out.println(u);
            }
        else{
            System.out.println("Please enter id");
            int id = sc.nextInt();
            boolean flag = false;
            for (Map.Entry<Integer, User> entry: hashMap.entrySet()) {
                if (entry.getKey()==id){
                    System.out.println(entry.getValue());
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("It is invalid id");
                this.viewUser();
            }
        }
    }





    @Override
    public void userSort() {

        System.out.println("1 Sort By Name");
        System.out.println("2 Sort By Id");
        int n = sc.nextInt();
        if (n==2)
            Collections.sort(userList,(u1,u2)-> u1.getId()> u2.getId()? +1:-1);

        else
            Collections.sort(userList, new UserSortByName());
    }

}
