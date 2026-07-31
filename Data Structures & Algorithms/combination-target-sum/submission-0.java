class Solution {
    public static void findComb(int ind,int []nums,int target,List<List<Integer>>res,List<Integer>ds){
        if(ind == nums.length){
            if(target==0){
                res.add(new ArrayList<>(ds));
            }
            return;
        }
        if(nums[ind]<=target){
            ds.add(nums[ind]);
            findComb(ind,nums,target-nums[ind],res,ds);
            ds.remove(ds.size()-1);
        }
        findComb(ind+1,nums,target,res,ds);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>>res = new ArrayList<>();
        findComb(0,nums,target,res,new ArrayList<>());
        return res;
    }
}
