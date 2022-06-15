package Algorithm_inflearn.Me.Recursive_Tree_Graph;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

/*
10. Tree 말단노드까지의 가장 짧은 경로(BFS)

 */
class Node2{
    int data;
    Node2 lt, rt; // Node에서 left, right

    public Node2(int val) {
        data = val;
        lt=rt=null;
    }
}
public class Tree말단노드까지의최단거리10 {
    Node2 root;

    public int BFS(Node2 root) {
        Queue<Node2> Q = new LinkedList<>();
        Q.offer(root);
        int L =  0; //초기 level
        while (!Q.isEmpty()) { //Q가 비워있을 때까지 반목문
            // level의 길이를 구한다.
            int len = Q.size(); //Q의 사이즈를 구한다.
            for (int i = 0; i < len; i++) { // for문은 Q.size() 만큼 반복
                Node2 cur = Q.poll(); // 현재 노드(current node)
                if (cur.lt == null && cur.rt==null) return L; // 왼쪽자식노드, 오른쪽 자식노드가 없으면 그 level을 return해준다.
                if(cur.lt != null) Q.offer(cur.lt); //현재노드가 왼쪽 자식이 있으면 Queue에 왼쪽 자식노드 추가
                if(cur.rt != null) Q.offer(cur.rt); //현재노드가 오른쪽 자식이 있으면 Queue에 오른쪽 자식노드 추가
            } // 자식을 다 넣고 그 레벨의 노드는 끝났다. 다음 레벨로 넘어가야한다.
            L++; // 다음 레벨로 넘어 가기위해서 for문 끝나는 곳에서 추가 해준다.
        }
        return 0;
    }

    public static void main(String[] args) {
        Tree말단노드까지의최단거리10 tree = new Tree말단노드까지의최단거리10();
        tree.root = new Node2(1);
        tree.root.lt=new Node2(2);
        tree.root.rt=new Node2(3);
        tree.root.lt.lt=new Node2(4);
        tree.root.lt.rt=new Node2(5);
        System.out.println(tree.BFS(tree.root));


    }
}
