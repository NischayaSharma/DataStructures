import java.util.Scanner;

class Demo{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the Stack you want to make: ");
        int max = in.nextInt();
        Stack stack = new Stack(max);
        int choice = 5;
        while(choice!=0){
            System.out.print("Enter \n1. Peak\n2. Display\n3. Push\n4. Pop\n0. Exit\n");
            choice = in.nextInt();
            switch(choice){
                case 1:
                    stack.peak();
                    break;
                case 2:
                    stack.display();
                    break;
                case 3:
                    System.out.print("Enter the number to enter: ");
                    int num = in.nextInt();
                    stack.push(num);
                    stack.display();
                    break;
                case 4:
                    stack.pop();
                    stack.display();
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