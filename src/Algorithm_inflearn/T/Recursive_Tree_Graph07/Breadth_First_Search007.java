package Algorithm_inflearn.T.Recursive_Tree_Graph07;


import java.util.LinkedList;
import java.util.Queue;

class Node2{
    int data;
    Node2 left, right;

    public Node2(int val) {
        data = val;
        left = right = null;
    }
}
public class Breadth_First_Search007 {
    Node2 root;
    public void BFS(Node2 root){
        Queue<Node2> Q = new LinkedList<>();
        Q.offer(root); // 주소(100번지) Enqueue
        int L = 0; // 처음 level

        while(!Q.isEmpty()) { // Q가 비워져 있지 않으면 돌고 비워져있으면 멈춤
            int len = Q.size(); //Q에 원소가 몇 개 있는지 확인 , level에 원소의 길이
            System.out.print(L + " : ");
            for (int i = 0; i < len; i++) {
                //현재 노드는 꺼내 놓고 출력 해야한다.
                Node2 cur = Q.poll();
                System.out.print(cur.data + " ");
                //Q안에 있는 cur.data에 연관된 것들(왼쪽, 오른쪽 노드) 찾기
                if(cur.left != null) Q.offer(cur.left); // cur.date의 왼쪽 노드가 null아니면(왼쪽 자식이 있으면) Q에 cur.left를 넣어준다.
                if(cur.right != null) Q.offer(cur.right); // cur.date의 오른쪽  노드가 null아니면(오른쪽 자식이 있으면) Q에 cur.right를 넣어준다.
            }
            L++; //level을 1 증가
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Breadth_First_Search007 tree = new Breadth_First_Search007();
        tree.root = new Node2(1); //새로운 객체 Node(1)을 만들어서 tree.root에 넣어준다.
        tree.root.left = new Node2(2);
        tree.root.left.left = new Node2(4);
        tree.root.left.right = new Node2(5);

        tree.root.right = new Node2(3);
        tree.root.right.left = new Node2(6);
        tree.root.right.right = new Node2(7);

        tree.BFS(tree.root);
    }
}
