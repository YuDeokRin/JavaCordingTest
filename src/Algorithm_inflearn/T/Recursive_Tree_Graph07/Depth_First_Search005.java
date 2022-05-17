package Algorithm_inflearn.T.Recursive_Tree_Graph07;
class Node{
    int data ;
    Node left , right; //인스턴스 변수는 노드라는 객체 주소를 저장하는 변수

    public Node(int val) {
        data=val;
        left=right=null;
    }
}



public class Depth_First_Search005 {
    Node root; //객체(node)에 주소를 저장하는 변수
    public void DFS(Node root){
        //노드(root)가 null이다 라는 말은 말단 노드에 도착했을 때이다.
        if (root == null) return;
        else { //노드가 null이 아닐 때
            System.out.print(root.data + " "); //1 2 4 5 3 6 7 (전위 순회)
            DFS(root.left);
            //System.out.print(root.data + " "); // 4 2 5 1 6 3 7(중위 순회)
            DFS(root.right);
            //System.out.print(root.data + " "); // 4 5 2 6 7 3 1 (후위 순회)
        }
    }
    public static void main(String[] args) {
        Depth_First_Search005 tree = new Depth_First_Search005();
        tree.root =new Node(1); //새로운 객체 Node(1)을 만들어서 tree.root에 넣어준다.

        tree.root.left = new Node(2);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.root.right = new Node(3);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        tree.DFS(tree.root);

    }
}
