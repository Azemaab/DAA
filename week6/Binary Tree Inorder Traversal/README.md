Binary Tree Inorder Traversal
1. Problem
The task is to return the values of a binary tree in inorder traversal. In inorder traversal, we visit the left subtree first, then the current node, and finally the right subtree.
The order is: **Left → Root → Right**.
2. Approach
I used recursion to solve this problem. First, I created an empty list to store the values.
Then I called a helper method that checks if the current node is null. If it is null, the method stops. Otherwise, it first visits the left child, adds the current node's value to the list, and then visits the right child.
Example
Input:
text
    1
     \
      2
     /
    3

Step-by-step:
1. Start at node 1 and check its left child. It is null.
2. Add 1 to the list.
3. Go to the right child, node 2.
4. Go to the left child of node 2, node 3.
5. Add 3 to the list.
6. Return to node 2 and add 2.

Output:
text
[1, 3, 2]
Challenges and Testing
The main challenge was understanding the order of recursive calls. At first, it was confusing why the current node is added between the left and right recursive calls.
I tested the solution with an empty tree, a tree containing only one node, and a tree with multiple nodes. These cases helped me understand how the base case works and how recursion returns to the previous node.
3. Time Complexity
Time Complexity: O(n)
Each node is visited exactly once. If the tree contains n nodes, the algorithm performs the traversal for all n nodes, so the time complexity is O(n).
Space Complexity: O(n)
The result list stores all n node values. The recursive call stack requires O(h) additional space, where h is the height of the tree. In the worst case, h can equal n.
 4. Reflection / Improvement
The recursive solution is already efficient because every node must be visited once.
Another approach is iterative inorder traversal using a stack instead of recursion. This would avoid recursive calls, but the time complexity would still be O(n). The iterative approach may be useful for very deep trees to avoid stack overflow.
