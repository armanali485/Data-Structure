
import java.util.Stack;



public class BinaryTree{


    static int index=-1;
    public static Node buildTree(int[] arr){
       index++;
        if( index==arr.length || arr[index] == -1)
            return null;
            
        Node newNode = new Node(arr[index]);
        newNode.left=buildTree(arr);
        newNode.right=buildTree(arr);
        return newNode;
    }

    


    public static  void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
        
    }
     public static  void inOrder(Node root){
        if(root==null){
            return;
        }
        
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
        
        
    }

     public static  void postOrder(Node root){
        if(root==null){
            return;
        }
        
        postOrder(root.left);
        
        postOrder(root.right);
        System.out.print(root.data+" ");
        
        
    }

    public static int countNodes(Node root) {
        return root==null?0:countNodes(root.left)+countNodes(root.right)+1;
    }

    public static int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=sumOfNodes(root.left);
        int rightSum=sumOfNodes(root.right);
        return rightSum+leftSum+root.data; 
    }

    


    public static int heightOfTree(Node root){
        if(root==null)
            return 0;
        int leftHeight=heightOfTree(root.left);
        int rightHeight=heightOfTree(root.right);
        return 1+Math.max(leftHeight, rightHeight);
    }

    public static void printLeafNode(Node root){
        if(root==null)
            return;
       
        printLeafNode(root.left);
        printLeafNode(root.right);
        if(root.left==null && root.right==null)
            System.out.print(root.data+" ");
        
    }
    public static int sumOfLeafNode(Node root){
        if(root==null)
            return 0;
       
        int leftLeafNodeSum=sumOfLeafNode(root.left);
        int rightLeafNodeSum=sumOfLeafNode(root.right);
        if(root.left==null && root.right==null)
            return root.data;
        return leftLeafNodeSum+rightLeafNodeSum; 
        
    }


    public static int findMinNode(Node root){
        try {
            int leftSmall = findMinNode(root.left);
            int rightSmall = findMinNode(root.right);
            return leftSmall<rightSmall?(leftSmall<root.data?leftSmall:root.data):(rightSmall<root.data?rightSmall:root.data);
            
        } catch (NullPointerException e) {
            return Integer.MAX_VALUE;
        }
    }

    public static int findMaxNode(Node root){
        return root==null?Integer.MIN_VALUE:(Math.max(Math.max(findMaxNode(root.left), findMaxNode(root.right)),root.data));
    }

    public static boolean checkIdentical(Node root1,Node root2){
        if(root1==null && root2==null){
            return true;
        }
        if(root1==null || root2==null)
            return false;

        return (checkIdentical(root1.left, root2.left) && checkIdentical(root1.right, root2.right) )&& (root1.data==root2.data);
        
    }


    
    public static void preOrderLoop(Node root){
        if(root==null)
            return;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node pop=stack.pop();
            System.err.print(pop.data+" ");
            if(pop.right!=null)
                stack.push(pop.right);
            if(pop.left!=null)
                stack.push(pop.left);
        }
    }


     

    public static void main(String[] args) {
        int[] arr1 ={5,9,7,-1,-1,8,-1,-1,10,11,-1,-1,-1};
         
      /*   
                                  5
                                /   \
                               9     10
                              / \    /
                             7   8  11               
    */
        // int[] arr2={5,3,4,-1,-1,5,6,-1,-1,-1,2,-1,9,-1,-1};
        /*
                           5
                          / \
                         3   2
                        / \    \
                       4   5    9
                          /
                         6
        */

       int[] arr2 ={5,9,7,-1,-1,8,-1,-1,10,11,-1,-1,-1};
        Node  root = buildTree(arr1);
        index=-1;
        Node root1=buildTree(arr2);
        System.out.print("PreOrder: ");
        preOrder(root);
        System.out.println();
        System.out.print("InOrder: ");
        inOrder(root);
        System.out.println();
        System.out.print("PostOrder: ");
        postOrder(root);
        System.out.println();
        System.out.println("Number of Nodes: "+countNodes(root));
        System.out.println("Sum of Nodes: "+sumOfNodes(root));
        System.out.println("Height of Tree: "+heightOfTree(root));
        System.out.print("Leaf Nodes: ");
        printLeafNode(root);
        System.err.println();
        System.err.println("Sum of Leaf Node: "+sumOfLeafNode(root));
        preOrderLoop(root);
        System.out.println();  
        System.err.println("Minimum Node Element in Tree: " +findMinNode(root));   
        System.out.println("Maximum Node Element in Tree: "+findMaxNode(root));
        System.out.println(checkIdentical(root, root1));

        LevelOrder.levelOrderTraversal(root);
    }

    
}


