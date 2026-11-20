Binary Tree Preorder Traversal
1. Problem
The task is to return the values of a binary tree using preorder traversal. In preorder traversal, we visit the root first, then the left subtree, and finally the right subtree.
2. Approach
I solved this problem using recursion. First, I create an empty list to store the node values. Then I check if the current node is null. If it is null, I stop the recursion. Otherwise, I add the current node value to the list, recursively visit the left child, and then recursively visit the right child.
Challenges and Testing
The main challenge was understanding the order of traversal. I needed to make sure that the root is added before visiting the left and right children. I tested the solution with an empty tree, a tree with one node, and a tree with multiple nodes to check if the values were added in the correct order.
3. Time Complexity
Time Complexity: O(n)
Each node is visited exactly once, and its value is added to the result list. Therefore, if the tree contains n nodes, the algorithm takes O(n) time.
Space Complexity: O(h)
The recursive call stack depends on the height of the tree. In the worst case, the tree can be unbalanced, so h can equal n. The result list also requires O(n) space to store all node values.
4. Reflection / Improvement
An iterative approach using a stack can also solve this problem. Instead of recursion, I would use a stack to visit the nodes. The time complexity would remain O(n), but it would avoid using the recursive call stack.
