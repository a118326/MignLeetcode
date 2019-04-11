/*Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [?231,  231 ? 1]. 
For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
*/

class Solution {
    public int reverse(int x) {
         return Long.parseLong(new StringBuilder(Long.toString(x)).reverse().toString().replaceAll("-", ""))>Integer.MAX_VALUE||
	            -Long.parseLong(new StringBuilder(Long.toString(x)).reverse().toString().replaceAll("-", ""))<Integer.MIN_VALUE?
	                    0:(x>0?Integer.parseInt(new StringBuilder(Integer.toString(x)).reverse().toString()):-Integer.parseInt(new StringBuilder(Integer.toString(x)).reverse().toString().replaceAll("-", "")));
  
    }
}

//Long.parseLong(new StringBuilder(Long.toString(x)).reverse().toString().replaceAll("-", ""))>Integer.MAX_VALUE||
//-Long.parseLong(new StringBuilder(Long.toString(x)).reverse().toString().replaceAll("-", ""))<Integer.MIN_VALUE?
//checking overflow after reverse
//(x>0?Integer.parseInt(new StringBuilder(Integer.toString(x)).reverse().toString()):-Integer.parseInt(new StringBuilder(Integer.toString(x)).reverse().toString().replaceAll("-", "")))
//1.Greater than 0?
//1.1 reverse and return
//2.1 reverse, remove - sign and add one before integer
