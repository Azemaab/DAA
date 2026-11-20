Path Sum
1. Problem
The task is to check whether a binary tree has a root-to-leaf path where the sum of all node values equals the given targetSum. A leaf is a node that has no children.
2. Approach
I solved this problem using recursion. First, I check if the node is null. If it is null, I return false. Then I check if the current node is a leaf. If it is a leaf, I compare its value with targetSum. If they are equal, I return true. Otherwise, I subtract the current node value from targetSum and recursively check the left and right subtrees. If either path returns true, the result is true.
Challenges and Testing
The main challenge was understanding that I need to subtract the current node's value from targetSum at every step instead of calculating the full sum separately. I also needed to check that the path ends at a leaf, not just at any node. I tested the solution with an empty tree, a single node, a path with the correct sum, and paths with incorrect sums.
3. Time Complexity
Time Complexity: O(n)
In the worst case, the algorithm visits every node in the tree until it finds a valid path or finishes checking all possible paths.
Space Complexity: O(h)
The recursive call stack depends on the height of the tree. In the worst case, the tree can be unbalanced, making the height equal to n.
4. Reflection / Improvement
An iterative approach using a stack could also solve this problem by storing each node and its remaining sum. The time complexity would still be O(n), but it would avoid using recursive calls.
