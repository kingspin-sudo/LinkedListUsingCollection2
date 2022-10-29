import java.util.LinkedList;
import java.util.Scanner;
public class one extends Main {
    Main obj = new Main();
    Scanner input = new Scanner(System.in);
    private int number;
    private String s;
    private int d;
    private int n;
    LinkedList<Integer> list = new LinkedList<>();

    void message() {
        System.out.println("Enter Your values between 1-50");
        number = input.nextInt();
        check();
    }

    void check() {
        if (this.number < 51) {
            list.add(number);
            System.out.println("Wanna add More ? y for yes /n for no");
            s = input.next();
            condition();
        } else {
            System.out.println("You exceeded the limit . Please Try again :");
//            message();
        }
    }

    void condition() {
        if (s.equals("y") | s.equals("Y")) {
            message();
            check();
        } else {
            System.out.println("List : " + list);
            System.out.println("Size of your list : " + list.size());
            System.out.println("Delete nodes Greater than : ");
            delete();
        }


    }

        void delete()
        {
            Scanner sc = new Scanner(System.in);
            d = sc.nextInt();
            System.out.println(list);
                for (n = 0; n < list.size(); n++)
                    {
                        if (list.get(n) > d)
                            list.remove(n);
                    }
            System.out.println(list);
                exit();
        }
        void exit()
        {
            System.out.println("Thank Bye");
            System.exit(1);
        }
    }

