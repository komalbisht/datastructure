class Solution {
    public static long sumUnderModulo(long a, long b){
            long M = 1000000007 ; 
            return ((a%M + b%M)%M);
    }   
}