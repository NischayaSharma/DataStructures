class CircularLinkedList {
    Node firstNode;

    void addAtEnd(int data) {
        if (firstNode == null) {
            firstNode = new Node(data);
            firstNode.next = firstNode;
        } else {
            Node ptr = firstNode;
            while (ptr.next != firstNode)
                ptr = ptr.next;
            Node node = new Node(data);
            node.next = ptr.next;
            ptr.next = node;
        }
    }

    void addInMiddle(int data, int checkData) {
        if (firstNode == null) {
            firstNode = new Node(data);
            firstNode.next = firstNode;
        } else {
            Node ptr = firstNode;
            while (ptr.next != firstNode && ptr.data != checkData)
                ptr = ptr.next;
            Node node = new Node(data);
            node.next = ptr.next;
            ptr.next = node;
        }
    }

    void addAtBeginning(int data) {
        if (firstNode == null) {
            firstNode = new Node(data);
            firstNode.next = firstNode;
        }

        else {
            Node node = new Node(data);
            Node ptr = firstNode;
            while (ptr.next != firstNode)
                ptr = ptr.next;
            node.next = firstNode;
            ptr.next = node;
            firstNode = node;
        }
    }

    void displayList() {
        Node ptr = firstNode;
        if (firstNode == null)
            System.out.println("The list is empty.");
        else {
            while (ptr.next != firstNode) {
                System.out.println(ptr.data);
                ptr = ptr.next;
            }
            System.out.println(ptr.data);
        }
    }

    void delete(int data) {
        Node ptr = firstNode;
        while (ptr.next.data != data)
            ptr = ptr.next;
        Node temp = ptr.next;
        ptr.next = temp.next;
        temp.next = null;
        if(temp == firstNode)
            firstNode = ptr.next;
    }
}