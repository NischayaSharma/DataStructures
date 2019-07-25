class CircularQueue {
    private int rear = -1, front = -1, max;
    private int[] arr = new int[rear];

    Queue(int maximumElements){
        max = maximumElements;
        for(int i=0 ; i<maximumElements ; i++){
            arr[i]=-1;
        }
    }

    void qInsert(int data) {
        if (rear < max) {
            if (rear == -1 && front == -1) {
                front += 1;
            }
            rear += 1;
            arr[rear] = data;
        } else {
            System.out.println("The Queue is full(Overflow)");
        }
    }

    void qDelete() {
        if (rear == -1 && front == -1) {
            arr[front] = -1;
            front += 1;
        } else {
            System.out.println("The Queue is Empty(Underflow)");
        }
    }

    void display() {
        for (int i = front; i < rear; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
}