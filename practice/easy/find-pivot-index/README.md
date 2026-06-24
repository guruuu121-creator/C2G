# Find Pivot Index

## Difficulty: Easy

## Description
### Description
Given an array of integers **nums**, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right. If no such index exists, return `-1`. If there are multiple pivot indexes, you should return the left-most pivot index.

### Input Format
- The first line contains an integer **N** (size of the array).
- The second line contains **N** space-separated integers.

### Output Format
Print the left-most pivot index, or `-1` if none exists.

### Constraints
* $1 \le N \le 10^4$
* $-1000 \le \text{nums}[i] \le 1000$

### Examples
**Example 1:**
Input:
\`\`\`
6
1 7 3 6 5 6
\`\`\`
Output:
\`\`\`
3
\`\`\`
Explanation: The pivot index is 3. Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11. Right sum = nums[4] + nums[5] = 5 + 6 = 11.


---

## Submission Report
- **Status:** 🟢 Solved
- **Score:** 1 / 1 points
- **Test Cases:** 5 / 5 passed
- **Date Submitted:** 6/24/2026, 2:11:15 PM (IST)

*Generated automatically by Code-to-Grade (C2G) Assessment Platform.*
