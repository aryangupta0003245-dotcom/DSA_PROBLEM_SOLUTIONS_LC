class Solution {
public:
    int rangeSumBST(TreeNode* root, int low, int high) {
        if (root == NULL) {
            return 0;
        }

        if (root->val < low) {
            int ans = rangeSumBST(root->right, low, high);
            return ans;
        }

        if (root->val > high) {
            int ans = rangeSumBST(root->left, low, high);
            return ans;
        }

        int leftSum = rangeSumBST(root->left, low, high);
        int rightSum = rangeSumBST(root->right, low, high);

        int total = root->val + leftSum + rightSum;

        return total;
    }
};