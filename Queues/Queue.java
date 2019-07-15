class Queue{
    int rear=1000;
    int[] arr = new int[rear];
    int front=-1;
    Queue(int maximumElements){
        rear = maximumElements;
        front = maximumElements;
        for(int i=0 ; i<maximumElements ; i++){
            arr[i]=-1;
        }
    }
    void push(int data){
        if(front!=0){
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            arr[rear-1]=data;
            front -= 1;
        }
        else {
            System.out.println("The Queue is full(Overflow)");
        }
    }
    void pop(){
        if(front!=rear){
            arr[front] = -1;
            front += 1;
        }
        else {
            System.out.println("The Queue is Empty(Underflow)");
        }
    }
    void display(){
        for(int i=front ; i<rear ; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }
}