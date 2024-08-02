package binaryTree;

import java.util.Scanner;

public class BinaryTree {
     private Node root;
    public  void populate(Scanner scanner){
    System.out.println("Enter the root node: ");
    int val = scanner.nextInt();
    root = new Node(val);
    populate(scanner , root);
    }
   
    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to Enter Left of" + node.val);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of the Left of" + node.val);
            int val = scanner.nextInt();
            node.left = new Node(val);
            populate(scanner , node.left);
        }
        System.out.println("Do you want to Enter right of" + node.val);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right of" + node.val);
            int val = scanner.nextInt();
            node.right = new Node(val);
            populate(scanner , node.right);
        }
    }
    static class Node{
        int val;
        Node left;
        Node right;
       
        Node(int val){
        this.val = val;
       
        }
        Node(int val , Node left, Node right){
        this.val = val;
        this.left = left;
        this.right = right; 
        }
    }
    // display
    public void display(){
        display(root, "");

    }
    private void display(Node node, String indent){
        if(node == null){
            return;
        }
        System.out.println(indent +  node.val);
        display(node.left, indent+"\t");
        display(node.right, indent + "\t");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(scanner);
        tree.display();

    }
}
