package user;

import java.util.Scanner;

public class UserService {
    private static UserService instance;
    private Scanner scanner;

    private UserRepository repository;

    private UserService() {
        repository = new UserRepository();
        scanner = new Scanner(System.in);
    }
    public void goToStartMenu() {
        while(true) {
            System.out.println("input your name");
            String name = scanner.nextLine();
            Libraryvisitor newUser = UserService.getInstance().getVisitor(name);
            System.out.println(newUser.toString());
            repository.addUser(newUser);

            //    System.out.println(users.get(1).getName());
            //    else if (users.size() != 0)
            //  {for (int i=0; i< users.size();i++)
            //{}
            //  {if (name.equals(getName(users.get(i))))}
            System.out.println("chislo chitatelej"+ repository.getAllUsers().size());
        }
    }
    public Libraryvisitor getVisitor(String name) {
        System.out.println("input your age");
        int age = scanner.nextInt();
        System.out.println("input your address");
        String address  = scanner.nextLine();
        address = scanner.nextLine();
        Libraryvisitor result = new Libraryvisitor(name, age, address);
        return result;
    }


    public static UserService getInstance() {
        if (instance == null) {
            instance = new UserService();
        }
        return instance;
    }

}
