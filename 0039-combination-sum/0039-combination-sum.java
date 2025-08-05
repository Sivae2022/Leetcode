class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    
    List<List<Integer>> ans=new ArrayList<>();
    printCombinationSum(0,candidates,target,ans,new ArrayList<>());
    return ans;
    }
    public void printCombinationSum(int index,int [] arr,int target,List<List<Integer>> ans,List<Integer> ds)
    {
        int n=arr.length;
            if(index==n)
            {
                if(target==0)
                {
                   ans.add(new ArrayList<>(ds)) ;
                }
                return;
            }
            if(arr[index]<=target)
            {
                ds.add(arr[index]);
                printCombinationSum(index,arr,target-arr[index],ans,ds);
                ds.remove(ds.size()-1);
            }
            printCombinationSum(index+1,arr,target,ans,ds);
    }
}