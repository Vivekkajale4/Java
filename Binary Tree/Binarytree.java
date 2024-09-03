

public class Binarytree {
    // Node class
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree {
        static int idx = -1;
        public static Node buildtree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);
            return newNode;
        }
        public static void preorder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data+" ");
            //left subtree
            preorder(root.left);
            //rigth subtree
            preorder(root.right);
        }
        // Inorder traversal
        public static void inorder(Node root) {
            if (root == null) {
                return;
            }
            // Traverse the left subtree
            inorder(root.left);
        
            // Visit the root
            System.out.print(root.data + " ");
        
            // Traverse the right subtree
            inorder(root.right);
        }
        // Postorder traversal
        public static void postorder(Node root) {
            if (root == null) {
                return;
            }
            // Traverse the left subtree
            postorder(root.left);
        
            // Traverse the right subtree
            postorder(root.right);

            // Visit the root
            System.out.print(root.data + " ");
        }
        
    }
    
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(nodes);
        // System.out.println(root.data);
        // tree.preorder(root);
        // tree.inorder(root);
        tree.postorder(root);
    }
}
