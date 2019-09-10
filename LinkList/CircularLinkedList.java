class SinglyLinkedList {
    Node firstNode;

    void addAtEnd(int data) {
        if (firstNode == null)
            firstNode = new Node(data);
        else {
            Node ptr = firstNode;
            while (ptr.next != firstNode)
                ptr = ptr.next;
            Node node = new Node(data);
            node.next = ptr.next;
            ptr.next = node;
        }
    }

    void addInMiddle(int data, int checkData) {
        if (firstNode == null)
            firstNode = new Node(data);
        else {
            Node ptr = firstNode;
            while (ptr.next != firstNode && ptr.data != checkData)
                ptr = ptr.next;
            Node node = new Node(data);
            node.next = ptr.next;
            ptr.next = node;
        }
    }

    void addAtBeginning(int data) {
        if (firstNode == null)
            firstNode = new Node(data);
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
        while (ptr != null) {
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
    }

    void delete(int data) {
        Node ptr = firstNode;
        while (ptr.next.next != firstNode && ptr.next.data != data)
            ptr = ptr.next;
        Node temp = ptr.next;
        ptr.next = temp.next;
        temp.next = null;
    }
}