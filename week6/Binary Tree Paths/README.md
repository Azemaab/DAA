Binary Tree Paths
Problem Description
Given the root of a binary tree, return all root-to-leaf paths in any order. A root-to-leaf path starts at the root node and ends at a leaf node.
A leaf is a node that has no children.
Solution Approach
To solve this problem, I use recursion to traverse the binary tree and find all paths from the root to the leaf nodes.
I start from the root and keep track of the current path. At each node, I add its value to the path. If the node is a leaf, I convert the path into a string and add it to the result list.
If the node has children, I continue recursively to the left and right subtrees. I use backtracking to remove the current node from the path after exploring its children, so that the next path can be created correctly.
When all paths have been found, I return the result list.
Time Complexity
The time complexity is O(n), where n is the number of nodes in the tree, because each node is visited once.
Space Complexity
The space complexity is O(n), because we store the paths in the result list and use additional space for recursion and the current path.
