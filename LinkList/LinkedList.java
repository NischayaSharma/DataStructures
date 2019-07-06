class LinkedList {
    Node firstNode;
   
    void addNode(int data) {
        if(firstNode==null)
            firstNode = new Node(data);
        else {
            Node nodeA = firstNode;
            while(nodeA.next!=null && nodeA.data<data)
                nodeA = nodeA.next;
            Node node = new Node(data);
            if(nodeA.prev==null && data<nodeA.data){
                nodeA.prev=node;
                node.next=nodeA;
                firstNode=node;
            }
            else {
                if(nodeA.next==null && nodeA.data>data && nodeA!=firstNode){
                    nodeA.prev.next=node;
                    node.next=nodeA;
                    nodeA.prev=node;
                }
                else {
                    if(nodeA.next==null){
                        nodeA.next = node;
                        node.prev = nodeA;
                    }
                    else {
                        node.prev = nodeA.prev;
                        nodeA.prev.next = node;
                        node.next = nodeA;
                        nodeA.prev = node;
                    }
                }
            }
        }
    }
    
    void displayList(){
        Node nodeA = firstNode;
        while(nodeA!=null){
           System.out.println(nodeA.data);
           nodeA = nodeA.next;
       }
    }
   
    int sum(){
       int sum = 0;
       Node nodeA = firstNode;
       while(nodeA!=null){
           sum += nodeA.data;
           nodeA = nodeA.next;
       }
       return sum;
    }
}