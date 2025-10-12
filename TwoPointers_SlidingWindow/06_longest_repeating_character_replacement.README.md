Problem Statement: Given an integer k and a string s, any character in the string can be selected and changed to any other uppercase English character. This operation can be performed up to k times. After completing these steps, return the length of the longest substring that contains the same letter.

Examples
Input: s = "BAABAABBBAAA", k = 2  
Output: 6  
Explanation: We can change the B at index 0 and 3 (0-based indexing) to A. The new string becomes "AAAAAABBBAAA". The substring "AAAAAA" is the longest substring with the same letter, and its length is 6. 


Input: s = "AABABBA", k = 1  
Output: 4  
Explanation: We can change one character to get the new string "AABBBBA". The substring "BBBB" is the longest with the same character. There are other ways to achieve this result as well.
