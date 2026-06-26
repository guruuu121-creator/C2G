# 3Sum

## Difficulty: Medium

## Description
### Description
Given an integer array **nums**, return all unique triplets $[nums[i], nums[j], nums[k]]$ such that $i \ne j, i \ne k, j \ne k$, and $nums[i] + nums[j] + nums[k] == 0$.

The triplets must be output such that:
1. Each triplet $[a, b, c]$ has $a \le b \le c$.
2. Triplets are printed in ascending order: first sorted by $a$, then $b$, then $c$.
3. Each unique triplet is printed on a new line with elements space-separated. If there are no such triplets, print nothing.

### Input Format
- The first line contains an integer **N** (array size).
- The second line contains **N** space-separated integers representing the array elements.

### Output Format
Print each triplet on a new line, elements sorted ascending and space-separated. Triplets themselves must be sorted.

### Constraints
* $3 \le N \le 3000$
* $-10^5 \le \text{nums}[i] \le 10^5$

### Examples
**Example 1:**
Input:
\`\`\`
6
-1 0 1 2 -1 -4
\`\`\`
Output:
\`\`\`
-1 -1 2
-1 0 1
\`\`\`
Explanation:
The distinct triplets are:
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The unique triplets are [-1, -1, 2] and [-1, 0, 1]. They are sorted and printed on new lines.


---

## Submission Report
- **Status:** 🟢 Solved
- **Score:** 2 / 2 points
- **Test Cases:** 5 / 5 passed
- **Date Submitted:** 6/26/2026, 10:41:39 AM (IST)

*Generated automatically by Code-to-Grade (C2G) Assessment Platform.*
