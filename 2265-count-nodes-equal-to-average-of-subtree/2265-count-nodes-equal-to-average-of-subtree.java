class Solution {

    int ans = 0;

    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return ans;
    }

    public int[] dfs(TreeNode root) {

        if (root == null) {
            return new int[]{0, 0};
        }

        // Get sum and count from left subtree
        int[] left = dfs(root.left);

        // Get sum and count from right subtree
        int[] right = dfs(root.right);

        // Calculate total sum
        int sum = left[0] + right[0] + root.val;

        // Calculate total number of nodes
        int count = left[1] + right[1] + 1;

        // Check average
        if (root.val == sum / count) {
            ans++;
        }

        return new int[]{sum, count};
    }
}