class Solution {
    public int climbStairs(int n) {
        if(n==0 || n==1) return 1;
        int f=1,s=1,c=0;
        for(int i=2;i<=n;i++){
            c=f+s;
            f=s;
            s=c;
        }
        return c;
    }
}
