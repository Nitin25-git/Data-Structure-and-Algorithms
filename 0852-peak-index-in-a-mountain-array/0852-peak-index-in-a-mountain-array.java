class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int i=0;
        int peakindex=0;
        while(i<arr.length-1)
        {
            if(arr[i]<arr[i+1])
            {
                int start=i;
                while(i<arr.length-1 && arr[i]<arr[i+1])
                {
                    i++;
                    
                }
                return i;
            }
        }
        return 0;
        
    }
}