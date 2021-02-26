package algorithm.tree;

import java.util.ArrayList;
import java.util.List;

public class GenerateTrees {

    /**
     * 卡特兰数
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(generateTrees(3).size());
    }

    public static List<TreeNode> generateTrees(int n) {
        return generateTrees(1, n);
    }

    public static List<TreeNode> generateTrees(int start, int end) {
        List<TreeNode> allTrees = new ArrayList<>();
        if (start > end) {
            allTrees.add(null);
            return allTrees;
        }
        for (int i = start; i <= end; i++) {
            List<TreeNode> lefts = generateTrees(start, i - 1);
            List<TreeNode> rights = generateTrees(i + 1, end);

            for (TreeNode left : lefts) {
                for (TreeNode right : rights) {
                    TreeNode node = new TreeNode(i);
                    node.left = left;
                    node.right = right;
                    allTrees.add(node);
                }
            }

        }
        return allTrees;
    }
}
