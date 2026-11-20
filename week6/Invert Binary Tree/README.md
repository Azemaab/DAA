Invert Binary Tree
Problem Description
Given the root of a binary tree, invert the tree and return its root. Inverting a binary tree means swapping the left and right children of every node.
Solution Approach
To solve this problem, I used recursion. First, I check if the current node is null. If it is null, the method returns null because there is nothing to invert.
If the node exists, I swap its left and right children using a temporary variable. After swapping, I recursively call the same method for the left and right subtrees. This process continues until all nodes in the tree are inverted.
Finally, I return the root of the modified tree.
Time Complexity
The time complexity is O(n), where n is the number of nodes in the binary tree, because every node is visited exactly once.
Space Complexity
The space complexity is O(h), where h is the height of the tree, because recursive calls use the call stack. In the worst case, the tree can be unbalanced, making the height equal to the number of nodes.
