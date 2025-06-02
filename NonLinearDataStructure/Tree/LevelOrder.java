
import java.util.LinkedList;
import java.util.Queue;



public class LevelOrder{


    public static void levelOrderTraversal(Node root){
        if(root==null)
            return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()){

            Node current = queue.remove();
            if(current==null){
                if(queue.isEmpty())
                    break;
                else
                {
                    System.out.println();
                    queue.add(null);
                }

            }
            else{
                System.out.print(current.data+" ");
                if(current.left!=null) queue.add(current.left);
                if(current.right!=null) queue.add(current.right);
            }

        }

    }

}