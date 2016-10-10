/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

/**
 *
 * @author v-xuzhon
 */
public class Div {

    public int div(int A, int B) {
        int start = 0;
        
        if (A == 0) {
            return 0;
        }
        int end = Math.abs(A);
        int singA = (A > 0) ? 1 : -1;
        int singB = (B > 0) ? 1 : -1;

        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (Math.abs(mid * B) > Math.abs(A)) {
                end = mid;
            } else {
                start = mid;
            }
        }

        if (end * B == A) {
            return end;
        }

        return singA * singB * start;
    }
    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
             return dividend >= 0? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        
        if (dividend == 0) {
            return 0;
        }
        
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        boolean isNegative = (dividend < 0 && divisor > 0) || 
                             (dividend > 0 && divisor < 0);
                             
        long a = Math.abs((long)dividend);
        long b = Math.abs((long)divisor);
        int result = 0;
        while(a >= b){
            int shift = 0;
            while(a >= (b << shift)){
                shift++;
            }
            a -= b << (shift - 1);
            result += 1 << (shift - 1);
        }
        return isNegative? -result: result;
    }

    public static void Test() {
//       Div d = new Div();
//       d.div(0, 0)
        System.out.println(0);
    }
}
