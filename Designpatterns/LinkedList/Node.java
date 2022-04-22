package Designpatterns.LinkedList;

public class  Node <T> {

    private T t;

    public Node<T> next;

    public Node(T object){
        this.t = object;
    }

    public T getData(){
        return this.t;
    }
    
}
