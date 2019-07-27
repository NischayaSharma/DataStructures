class CircularQueue {
    private int rear = -1, front = -1, max;
    private int[] arr = new int[10000];

    CircularQueue(int maximumElements) {
        max = maximumElements;
        for (int i = 0; i < maximumElements; i++) {
            arr[i] = -1;
        }
    }

    void qInsert(int data) {
        if ((front == 0 && rear == max - 1) || front == rear + 1)
            System.out.println("The Queue is Full(Overflow)");
        else {
            if (front == -1) {
                front = 0;
                rear = 0;
            } else if (rear == max - 1) {
                rear = 0;
            } else {
                rear += 1;
            }
            arr[rear] = data;
        }
    }

    void qDelete() {
        if (front == -1) {
            System.out.println("The Queue is empty(Underflow)");
        } else {
            arr[front] = -1;
            if (front == rear) {
                front = -1;
                rear = -1;
            } else if (front == max - 1) {
                front = 0;
            } else {
                front += 1;
            }
        }
    }

    void display() {
        if (front <= rear) {
            if (front == -1) {
                System.out.println("The Queue is empty.");
            } else {
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        } else {
            for(int i = front; i<max; i++){
                System.out.print(arr[i] + " ");
            }
            for(int i = 0; i<=rear; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}