class Stack {
    int max=1000;
    int[] arr = new int[max];
    int top = -1;
    Stack(int maximumElements){
        max = maximumElements;
        for(int i=0 ; i<maximumElements ; i++){
            arr[i]=-1;
        }
    }
    void peak(){
        System.out.println((top>=0)? ("The Topmost Element is "+arr[top]):"Underflow(The Stack is empty)");
    }
    void push(int num){
        if(top<max-1){
            arr[top+1]=num;
            top += 1;
        }
        else
            System.out.println("Overflow(The stack is full)");
    }
    void pop(){
        if(top>=0){
            arr[top]=-1;
            top -= 1;
        }
        else
            System.out.println("Underflow(The Stack is empty)");
    }
    void display(){
        for(int i=0 ; i<=top ; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }
}