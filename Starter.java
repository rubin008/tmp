package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Starter {

    public static void main(String[] args) {

//       Client client=new Client();
  //     client.start();

        System.out.println("Full List of Books:");

        List<Kniga> books = new ArrayList<Kniga>();
        Kniga tmp = new Kniga("1", "Odyssey", "Homer", "Springer", 1990, 500, 332, false);
        books.add(tmp);
        Kniga tmp1 = new Kniga("2", "Iliada", "Homer", "Springer", 1990, 500, 332, false);
        books.add(tmp1);
        Kniga tmp2 = new Kniga("3", "Mathematics", "Sobolev", "Elsevier", 1966, 400, 112, false);
        books.add(tmp2);
        Kniga tmp3 = new Kniga("4", "Physics", "Ivanov", "Nauka", 1954, 460, 32, false);
        books.add(tmp3);
        Kniga tmp4 = new Kniga("5", "Contemporary Art", "Golder", "Zimmer Publisher", 2019, 150, 75, false);
        books.add(tmp4);
        Kniga tmp5 = new Kniga("6", "Fairy Tails", "Timberlace", "Gold Publishing", 1982, 110, 42, false);
        books.add(tmp5);

        for (int i = 0; i < 6; i = i + 1) {
            System.out.println(books.get(i));
        }
        List<Libraryvisitor> users = new ArrayList<Libraryvisitor>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("input your name");
            String name = sc.nextLine();

            System.out.println(name);
            if (users.size() == 0){
            Libraryvisitor newUser = visitor(name);
            System.out.println(newUser.toString());
            users.add(newUser);}

        //    System.out.println(users.get(1).getName());
        //    else if (users.size() != 0)
          //  {for (int i=0; i< users.size();i++)
            //{}
          //  {if (name.equals(getName(users.get(i))))}
            System.out.println("chislo chitatelej"+users.size());
        }


    }


    //////////////////////////////
    private static Libraryvisitor visitor(String name) {
       Scanner scn = new Scanner(System.in);
       System.out.println("input your age");
            int age = scn.nextInt();
        System.out.println("input your address");
        String address  = scn.nextLine();
        address = scn.nextLine();
        Libraryvisitor result = new Libraryvisitor(name, age, address);
        return result;
    }
////

}