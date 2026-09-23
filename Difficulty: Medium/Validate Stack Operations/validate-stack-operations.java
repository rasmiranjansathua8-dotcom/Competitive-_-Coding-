import java.util.Stack;

class Solution {
    public boolean validateOp(int[] a, int[] b)  
       {
        
        if (a == null || b == null || a.length != b.length) {
            return false;
        }

        Stack<Integer> stack = new Stack<>();
        int popIndex = 0; 
        for (int element : a) {
            stack.push(element); 
            while (!stack.isEmpty() && stack.peek() == b[popIndex])
            {
                stack.pop(); 
                popIndex++;  
            }
        }
        return stack.isEmpty();
    }
}
