import java.util.*;
class Demo {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        LinkedList linkList = new LinkedList();
        // for(int i=0;i<=10;i++){
        //     linkList.addNode(i);
        // }
        boolean bool = true;
        while (bool) {
            System.out.println("Enter:\n1. To print the existing link list\n2. To add elements in link list\n3. To remove elements from link list\n0. Exit");
            int choice = in.nextInt();
            switch(choice) {
                case 0:
                    bool = false;
                    break;
                case 1:
                    linkList.displayList();
                    break;
                case 2:
                    System.out.print("Enter the data you want to add: ");
                    int data = in.nextInt();
                    linkList.addNode(data);
                    linkList.displayList();
                    break;
            }
        }      
    }
}