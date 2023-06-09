class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums,0,nums.length-1);
        return nums;
    }
    public void quickSort(int[] nums,int low,int high) {
        int pi = partioning(nums,low,high);
        if(low < pi-1) {
            quickSort(nums,low,pi-1);
        } 
        if(high > pi) {
            quickSort(nums,pi,high);
        }
    }
    public int partioning(int[] nums,int low,int high) {
        int pivot = nums[(low+high)/2];
        while(low <= high) {
            while(nums[low] < pivot) {
                low++;
            }
            while(nums[high] > pivot) {
                high--;
            }
            if(low <= high) {
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
                low++;
                high--;
            }
        }
        return low;
    }
}




class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;

            for(int i=0;i<mat.length;i++)
              {                                                
              for(int j=0;j<mat[0].length;j++)
                 {
                     if(i==j||i+j==mat.length-1)
                     {
                         
                        sum=sum+mat[i][j];
                     
                     }
                      
              }
                
            }
            return sum;
        
    }
}
