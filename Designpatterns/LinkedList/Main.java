package Designpatterns.LinkedList;


public class Main {

    public static void main(String[] args) {

        List list = new List(new Node<>("This is the root element"));

        list.appendNode("This is the seccond element");
        list.appendNode("This is the third element");
        list.appendNode("This is the fourth element");

        list.printList();
        System.out.println(list.getCount());

        list.remove("This is the fourth element");
        
        list.printList();

        list.clear();
        System.out.println(list.getCount());
        list.printList();

        list.appendNode("This is the seccond element");
        list.appendNode("This is the third element");
        list.appendNode("This is the fourth element");
        
        System.out.println(list.contains("This is the root element"));
        System.out.println(list.contains("This is the fourth element"));
    }
}
