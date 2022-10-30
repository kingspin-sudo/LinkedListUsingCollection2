import java.util.LinkedList;
import java.util.Scanner;
public class one{
    Scanner input = new Scanner(System.in);
    int number = 0;
    LinkedList<Integer> list = new LinkedList<>();
    void message() {
        System.out.println("Note: Enter Your values one by one between 1-50 \n >>> Press any non-number or character to end the inputs");
        number = input.nextInt();
        check();
        delete();
        exit();
    }
    void check() {
        while(number < 51) {
            if (input.hasNextInt()) {
                list.add(number);
                number = input.nextInt();
            } else {
                break;
            }}
        System.out.println("List : " + list);
        System.out.println("Size of List : " + list.size());
    }
    void delete() {
        System.out.println("Delete nodes Greater than the value : ");
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n=0;
        while(n < list.size()) {
            if(list.get(n) > d) {
                list.remove(n);
                n--;
            }n++;
        }
        System.out.println("Final Linked List: " + list);
    }
        void exit()
        {
            System.out.println("Thanks Bye");
            System.exit(1);
        }
}