package Algorithm_inflearn.T.Recursive_Tree_Graph07;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 10. Tree 말단노드까지의 까장 짧은 경로(BFS)
 *
 * 설명 : root노드에서 말단노드까지의 길이 중 가장 짧은 길이를 구하는 프로그램을 작성
 *       각 경로의 길이는 root노드 에서 말단노드까지 가는데 이동하는 횟수를 즉 간선(엣지)의 개수를 길이로 한다.
 *
 *   원래는 가장 짧은 거리 구하는 것은 BFS를 사용한다.
 *   이유 : level 탐색을 하기 때문에 짧은 거리를 구할때 장점이 있다.
 *
 */

class Node4{
    int data;
    Node4 left, right;

    public Node4(int val){
       data = val;
       left=right=null;
    }
}
public class Shortest_distance_from_root_to_end_node_BFS_009 {
    Node4 root;
    public int BFS(Node4 root){
        Queue<Node4> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;

        //Level의 길이를 구한다.
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                Node4 cur = Q.poll(); // 하나 꺼낸다. 꺼내서 말단 노드인지 확인해본다.

                if (cur.left == null && cur.right == null ) return L;
                if (cur.left != null) Q.offer(cur.left);
                if (cur.right != null) Q.offer(cur.right);
            }
            L++;
        }
        return 0;
    }
    public static void main(String[] args) {
        Shortest_distance_from_root_to_end_node_BFS_009 tree = new Shortest_distance_from_root_to_end_node_BFS_009();
        tree.root = new Node4(1);
        tree.root.left = new Node4(2);
        tree.root.right = new Node4(3);
        tree.root.left.left = new Node4(4);
        tree.root.left.right = new Node4(5);
        System.out.println(tree.BFS(tree.root));

    }
}
