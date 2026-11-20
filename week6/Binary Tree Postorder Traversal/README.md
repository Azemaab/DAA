Binary Tree Postorder Traversal
Problem
Given the root of a binary tree, return the postorder traversal of its nodes' values.
Approach
Postorder traversal follows the order Left, Right, Root.
First, visit the left subtree. Then visit the right subtree. Finally, add the current node's value to the list.
We use recursion to traverse the tree. If the current node is null, we stop. Otherwise, we recursively visit the left and right children, then add the node's value to the result list.
Time Complexity
O(n), because each node is visited exactly once.
Space Complexity
O(n), because the result list stores all node values and recursion uses additional stack space.
