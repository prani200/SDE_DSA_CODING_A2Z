Longest common prefix

For example:

Input: ["flower", "flow", "flight"]

Output: "fl"

Remember this interview trick: Start with the first string as your prefix and keep shrinking it until every string starts with that prefix.

Let:
- N = Number of strings.
- M = Length of the shortest string.
Complexity	Analysis
Time Complexity	O(N × M)
Auxiliary Space	O(1)

Why O(N × M)?
- We compare each of the N strings.
- In the worst case, we examine up to M characters per string.
- Therefore, time complexity is O(N × M).
