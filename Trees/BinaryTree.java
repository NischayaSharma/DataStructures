class BinaryTree {
    Node root = null;
    void makeTree(int data){
        if(root == null){
            root = new Node(data);
            root.left = null;
            root.right = null;
            root.parent = null;
        }
        else {
            Node nodeA = root;
            boolean leftNull = false;
            boolean rightNull = false;
            int counter = 0;
            while(nodeA.left!=null || nodeA.right!=null){
                counter++;
                if(nodeA.left==null){
                    leftNull = true;
                    break;
                }
                else if(nodeA.right==null) {
                    rightNull = true;
                    break;
                }
                else {
                    nodeA = (counter%2==0)? nodeA.left:nodeA.right;
                }
            }
            if(leftNull){
                nodeA.left = new Node(data);
                nodeA.left.parent = nodeA;
            }
            else{
                nodeA.right = new Node(data);
                nodeA.right.parent = nodeA;
            }
        }
    }
}