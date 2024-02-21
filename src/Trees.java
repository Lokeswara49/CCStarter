public class Trees {
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(12);
        root.left.left=new Node(2);
        root.left.right=new Node(8);
        root.right.left=new Node(11);
        root.right.right=new Node(14);
        System.out.println(findBST(root,true,Integer.MIN_VALUE,Integer.MAX_VALUE));

    }
    static boolean findBST(Node root,boolean flag,int min,int max){
        if(root==null){
            return true;
        }
        if(root.data>max || root.data<min){
            return false;
        }
        flag=flag && findBST(root.left,flag,min,root.data-1);
        flag=flag && findBST(root.right,flag,root.data+1,max);
        return flag;

    }
}
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
