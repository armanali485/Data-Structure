
public class BinarySearchTree {

    static int index = -1;

    public static Node buildBinaryTree(int arr[]) {
        index++;
        if (arr.length == index - 1 || arr.length <= 0) {
            return null; 
        }else {

            Node root = new Node(arr[index]);

            if (root.data > arr[index + 1]) {
                root.right = buildBinaryTree(arr);
            } else if (root.data < arr[index + 1]) {
                root.left = buildBinaryTree(arr);
            }

            return root;
        }
    }

    public static Node insertInBinaryTree(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (root.data > data) {
            root.left = insertInBinaryTree(root.left, data);
        } else if (root.data < data) {
            root.right = insertInBinaryTree(root.right, data);
        }
        return root;
    }

    public static int minValue(Node root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        int min = minValue(root.left);
        return Math.min(min, root.data);
    }

    public static int maxValue(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int min = maxValue(root.right);
        return Math.max(min, root.data);
    }

    public static boolean isAvailable(Node root, int data) {
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true; 
        }else if (data < root.data) {
            return isAvailable(root.left, data);
        } else {
            return isAvailable(root.right, data);
        }
    }

    public static Node deleteNode(Node root, int data) {
        if (root == null) {
            return null;
        }
        if (data < root.data) {
            root.left = deleteNode(root.left, data); 
        }else if (data > root.data) {
            root.right = deleteNode(root.right, data); 
        }
        else {
            if (root.left == null && root.right == null) {
                return null; 
            }else if (root.left == null) {
                return root.right; 
            }else if (root.right == null) {
                return root.left; 
            }else {
                int min = minValue(root.right);
                root.data = min;
                root.right = deleteNode(root.right, min);
            }
            

        }
        return root;
    }

    public static void main(String[] args) {
        int[] arr = {10, 8, 1, 6, 11, 7, 5, 9, 13, 7};
        Node root = null;
        for (int i : arr) {
            root = insertInBinaryTree(root, i);
        }
        BinaryTree.inOrder(root);
        System.err.println();
        BinaryTree.preOrder(root);
        System.out.println();
        BinaryTree.postOrder(root);
        System.err.println();
        LevelOrder.levelOrderTraversal(root);
        System.out.println();
        System.err.println(minValue(root));
        System.out.println(maxValue(root));
        System.err.println(isAvailable(root, 13));
        deleteNode(root, 10);
        BinaryTree.inOrder(root);
    }

}
