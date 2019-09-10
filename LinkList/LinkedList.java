class LinkedList {
    Node firstNode;

    // void addNode(int data) {
    // if(firstNode==null)
    // firstNode = new Node(data);
    // else {
    // Node nodeA = firstNode;
    // while(nodeA.next!=null && nodeA.data<data)
    // nodeA = nodeA.next;
    // Node node = new Node(data);
    // if(nodeA.prev==null && data<nodeA.data){
    // nodeA.prev=node;
    // node.next=nodeA;
    // firstNode=node;
    // }
    // else {
    // if(nodeA.next==null && nodeA.data>data && nodeA!=firstNode){
    // nodeA.prev.next=node;
    // node.next=nodeA;
    // nodeA.prev=node;
    // }
    // else {
    // if(nodeA.next==null){
    // nodeA.next = node;
    // node.prev = nodeA;
    // }
    // else {
    // node.prev = nodeA.prev;
    // nodeA.prev.next = node;
    // node.next = nodeA;
    // nodeA.prev = node;
    // }
    // }
    // }
    // }
    // }

    void addAtBeginning(int data) {
        if (firstNode == null) {
            firstNode = new Node(data);
            firstNode.prev = null;
            firstNode.next = null;
        } else {
            Node node = new Node(data);
            node.next = firstNode;
            firstNode.prev = node;
            firstNode = node;

        }
    }

    void addInMiddle(int data, int checkData) {
        if (firstNode == null)
            firstNode = new Node(data);
        else {
            Node ptr = firstNode;
            while (ptr.next != null && ptr.data != checkData) {
                ptr = ptr.next;
            }
            Node node = new Node(data);
            node.next = ptr.next;
            node.prev = ptr;
            ptr.next = node;
        }
    }

    void addAtEnd(int data) {
        if (firstNode == null)
            firstNode = new Node(data);
        else {
            Node ptr = firstNode;
            while (ptr.next != null)
                ptr = ptr.next;
            Node node = new Node(data);
            node.next = null;
            node.prev = ptr;
            ptr.next = node;
        }
    }

    void displayList() {
        Node ptr = firstNode;
        while (ptr != null) {
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
    }

    void updateData(int data, int newData) {
        Node ptr = firstNode;
        while (ptr.next != null && ptr.data != data) {
            ptr = ptr.next;
        }
        ptr.data = newData;
    }

    void delete(int data) {
        Node ptr = firstNode;
        while (ptr.next.next != null && ptr.next.data != data)
            ptr = ptr.next;
        Node temp = ptr.next;
        ptr.next = temp.next;
        if (ptr != firstNode)
            temp.next.prev = ptr;
        temp.next = null;
        temp.prev = null;
    }
}