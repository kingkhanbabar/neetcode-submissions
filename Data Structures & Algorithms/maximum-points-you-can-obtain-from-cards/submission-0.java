class Solution {
    public int maxScore(int[] cardPoints, int k) {
      int n = cardPoints.length;
      int total=0;
      for(int i=0;i<k;i++){
        total +=cardPoints[i];
      }  
      int maxPoints = total;
      for(int i=0;i<k;i++){
        total -=cardPoints[k-i-1];

        total +=cardPoints[n-i-1];
        maxPoints = Math.max(maxPoints,total);
      }
      return maxPoints;
    }
}