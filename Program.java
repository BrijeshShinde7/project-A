package linked_list;

import java.util.Scanner;
class Program{
public static void main(String[] args) {
    int ch, e;
    Scanner sc = new Scanner(System.in);
    CircularDoublyLinkedList obj = new CircularDoublyLinkedList();
    obj.createList();
    do {
        System.out.println(".Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print List\n0.Exit\n:");
        ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter data:");
                e = sc.nextInt();
                obj.insertLeft(e);
                break;
            case 2:
                System.out.println("Enter data:");
                e = sc.nextInt();
                obj.insertRight(e);
                break;
            case 3:
                obj.deleteLeft();
                break;
            case 4:
                obj.deleteRight();
                break;
            case 5:
                obj.printList();
                break;
            case 0:
                System.out.println("Exiting.....");
                break;
            default:
                System.out.println("Wrong option selected");
                break;
        }
    } while (ch != 0);
}
}

