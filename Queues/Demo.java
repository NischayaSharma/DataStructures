import java.util.Scanner;
class Demo{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements you want in a queue: ");
        int numOfElements = in.nextInt();
        Queue q = new Queue(numOfElements);
        int choice = 5;
        while(choice!=0){
            System.out.print("Enter \n1. Display\n2. Push\n3. Pop\n0. Exit\n");
            choice = in.nextInt();
            switch(choice){
                case 1:
                    q.display();
                    break;
                case 2:
                    System.out.print("Enter the number to enter: ");
                    int num = in.nextInt();
                    q.push(num);
                    q.display();
                    break;
                case 3:
                    q.pop();
                    q.display();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Wrong Choice !!!!!");
                    break;
            }
        }
    }
}