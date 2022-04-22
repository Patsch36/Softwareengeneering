package Designpatterns.LinkedList;

public class List {

    private Node root;
    private int count;

    public List(Node root){
        this.root = root;
        this.count = 1;
    }

    public void printList(){

        if(this.root != null){
            Node iterationNode = this.root;

            // System.out.println(root.next.next.getData());

            do{
                System.out.println(iterationNode.getData());
                iterationNode = iterationNode.next;
            }while(iterationNode.next != null);
            
            System.out.println(iterationNode.getData());
        }else{
            System.out.println("Empty List");
        }
        
    }

    public<T> void appendNode(T nodeData){

        if(this.root == null){
            this.root = new Node<>(nodeData);
            return;
        }

        Node iterationNode = this.root;

        while(iterationNode.next != null){
            iterationNode = iterationNode.next;
        }

        iterationNode.next = new Node<>(nodeData);
        this.count++;
    }

    public int getCount(){
        return this.count;
    }
    
    public<T> void remove(T nodeData){

        Node nodeIterator = root;
        Node buff = root;

        do{
            if(nodeData == nodeIterator.getData()){
                buff.next = nodeIterator.next;
                nodeIterator = null;
                this.count--;
                break;
            }
            buff = nodeIterator;
            nodeIterator = nodeIterator.next;
        }while(nodeIterator.next != null);

        if(nodeData == nodeIterator.getData()){
            buff.next = nodeIterator.next;
            nodeIterator = null;
            this.count--;
        }
    }
    
    public void clear(){
        root = null;        // Garbage Collector should delete all nodes afterwards
        this.count = 0;
    }

    public<T> boolean contains(T nodeData){
        
        Node nodeIterator = root;

        do{
            if(nodeData == nodeIterator.getData()){
                return true;
            }
            nodeIterator = nodeIterator.next;
        }while(nodeIterator.next != null);

        if(nodeData == nodeIterator.getData()){
            return true;
        }

        return false;
    }

}
