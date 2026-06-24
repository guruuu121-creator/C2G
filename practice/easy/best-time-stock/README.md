# Best Time to Buy and Sell Stock

## Difficulty: Easy

## Description
### Description
You are given an array **prices** where **prices[i]** is the price of a given stock on the $i$-th day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

### Input Format
- The first line contains an integer **N** (number of days).
- The second line contains **N** space-separated integers representing daily prices.

### Output Format
Print a single integer representing the maximum profit.

### Constraints
* $1 \le N \le 10^4$
* $0 \le \text{prices}[i] \le 10^4$

### Examples
**Example 1:**
Input:
\`\`\`
6
7 1 5 3 6 4
\`\`\`
Output:
\`\`\`
5
\`\`\`
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6 - 1 = 5.

**Example 2:**
Input:
\`\`\`
5
7 6 4 3 1
\`\`\`
Output:
\`\`\`
0
\`\`\`
Explanation: In this case, no transactions are done and the max profit = 0.


---

## Submission Report
- **Status:** 🟢 Solved
- **Score:** 1 / 1 points
- **Test Cases:** 5 / 5 passed
- **Date Submitted:** 6/24/2026, 9:16:08 AM (IST)

*Generated automatically by Code-to-Grade (C2G) Assessment Platform.*
