import java.util.*;

class Demo{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        int i=0;
        while(i<7){
            System.out.print("Enter a number to add in the tree: ");
            int data = in.nextInt();
            tree.makeTree(data);
            i++;
        }
        tree.display();
    }
}