package Algorithm_inflearn.T.Recursive_Tree_Graph07;

/**
 * 9. Tree 말단노드까지의 까장 짧은 경로(DFS)
 *
 * 설명 : root노드에서 말단노드까지의 길이 중 가장 짧은 길이를 구하는 프로그램을 작성
 *       각 경로의 길이는 root노드 에서 말단노드까지 가는데 이동하는 횟수를 즉 간선(엣지)의 개수를 길이로 한다.
 *
 *  원래는 가장 짧은 거리 구하는 것은 BFS를 사용한다.
 *  하지만 DFS로도 구할 수 있지만 조건이 필요하다.
 *  조건 1. 트리의 구조가 각 노드 당 자식의 노드를 아예 갖고 있지 않는 노드 가
 *  조건 2. 노드가 자식 노드를 하나만 갖고 있어서는 안된다.
 *
 */

class Node3{
    int data;
    Node3 left, right;

    public Node3(int val) {
        data = val;
        left=right=null;
    }
}

public class Shortest_distance_from_root_to_end_node_DFS_009 {
    Node3 root;
    public int DFS(int L, Node3 root){
        if (root.left == null && root.right == null) return L; // 가리키는 root에 왼쪽 오른쪽이 null인가 확인 한다.
        else return Math.min(DFS(L + 1, root.left),DFS(L + 1, root.right));  // 노드에서 이제 뻗어나간다. return 받은 값중 작은 값
    }

    public static void main(String[] args) {
        Shortest_distance_from_root_to_end_node_DFS_009 tree = new Shortest_distance_from_root_to_end_node_DFS_009();
        tree.root = new Node3(1);
        tree.root.left = new Node3(2);
        tree.root.right = new Node3(3);
        tree.root.left.left = new Node3(4);
        tree.root.left.right = new Node3(5);
        System.out.println(tree.DFS(0, tree.root));
    }
}
