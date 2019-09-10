import java.util.*;
class Demo {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        CircularLinkedList linkList = new CircularLinkedList();
        int choice = 5;
        while (choice!=0) {
            System.out.println("Enter:\n1. To print the existing link list\n2. To add elements in link list\n3. To remove elements from link list\n4. To update the data of a node in link list\n0. Exit");
            choice = in.nextInt();
            switch(choice) {
                case 0:
                    break;
                case 1:
                    linkList.displayList();
                    break;
                case 2:
                    linkList.displayList();
                    System.out.print("Enter the data: ");
                    int data = in.nextInt();
                    System.out.println("");
                    System.out.print("Enter:\n1. To add at the beginning\n2. To add in the Middle\n3. To add at the end\n");
                    int choice1 = in.nextInt();
                    System.out.println();
                    switch(choice1){
                        case 1:
                            linkList.addAtBeginning(data);
                            linkList.displayList();
                            break;
                        case 2:
                            System.out.println("Enter the data after which you want to enter your data:");
                            int checkData = in.nextInt();
                            System.out.println();
                            linkList.addInMiddle(data, checkData);
                            linkList.displayList();
                            break;
                        case 3:
                            linkList.addAtEnd(data);
                            linkList.displayList();
                    }
                    break;
                case 3:
                    linkList.displayList();
                    System.out.print("Enter the data to delete: ");
                    data  = in.nextInt();
                    linkList.delete(data);
                // case 4:
                //     linkList.displayList();
                //     System.out.print("Enter the data you want to change: ");
                //     data = in.nextInt();
                //     System.out.print("Enter the new data: ");
                //     int newData = in.nextInt();
                //     linkList.updateData(data, newData);
                //     System.out.println();
                //     linkList.displayList();
            }
        }      
    }
}