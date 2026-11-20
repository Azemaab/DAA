1. Problem
The task is to find the sum of all left leaves in a binary tree. A leaf is a node that has no children. A left leaf is a node that has no children and is also the left child of its parent.
We need to check the tree, find all left leaves, and add their values together. If there are no left leaves, the answer should be 0.
2. Approach
I solved this problem using recursion. I start from the root and check its left and right subtrees.
First, I check whether the current node is null. If it is null, I return 0 because there is nothing to calculate.
Then I check the left child. If it exists and has no left or right children, it is a left leaf, so I add its value to the sum.
If the left child is not a leaf, I continue searching inside its subtree recursively.
After that, I recursively check the right subtree as well, because it can also contain left leaves belonging to its own nodes.
Finally, I return the total sum.
Tracing the example
Input: [3,9,20,null,null,15,7]
The tree contains the following nodes:
Root: 3
Left child of 3: 9
Right child of 3: 20
Left child of 20: 15
Right child of 20: 7
Step 1. I start at node 3 and check its left child, which is 9.
Step 2. Node 9 has no children, so it is a leaf and is located on the left side. I add 9 to the sum.
Current sum = 9.
Step 3. I check the right subtree of node 3, which starts at node 20.
Step 4. Node 20 has a left child, 15. Node 15 has no children, so it is a left leaf. I add 15 to the sum.
Current sum = 9 + 15 = 24.
Step 5. I check node 7. It is a leaf, but it is the right child of node 20, so it is not counted.
Final answer = 24.
Challenges
The main difficulty was understanding that not every leaf should be added to the sum. Only leaves that are located on the left side of their parent count.
For example, node 7 is also a leaf, but it is a right leaf, so it must be ignored. Another important case is when a left child has its own children. It cannot be counted immediately; instead, I must continue searching inside that subtree.
I would test the solution with a tree containing only one node, a tree with no left leaves, a tree with several left leaves, and a tree where the left child is not a leaf. These cases help make sure that the algorithm counts only the correct nodes.
3. Time Complexity
Time Complexity: O(n)
In the worst case, the algorithm visits every node in the binary tree once. At each node, it performs a few constant-time checks, such as checking whether the node is null and whether its children exist.
If the tree contains n nodes, the total number of operations grows proportionally to n.
Space Complexity: O(h)
The recursive calls use memory on the call stack. The maximum number of calls depends on the height of the tree.
In a balanced tree, the height is approximately log n, so the space complexity is O(log n). In the worst case, when the tree is completely unbalanced, the height can be n, resulting in O(n) space.
4. Reflection / Improvement
The solution is already efficient because every node is visited at most once. There is no need to repeatedly traverse the same nodes.
I could also solve this problem iteratively using a stack instead of recursion. This would avoid using the recursive call stack, but I would still need to store nodes to visit.
The time complexity would remain O(n), and the space complexity would still be O(h) in the worst case because the stack would store nodes that need to be processed.
For this problem, I think recursion is a simple and readable solution because it follows the structure of the binary tree naturally.
