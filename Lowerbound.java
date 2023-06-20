class Lowerbound{
    public static void main(String[] args) {
        int arr[]={10,20,30,40,40,40,50,60};
        int n=arr.length;
        int x=40;
        System.out.println(lowerBound(arr,n,x));
    }
    public static int lowerBound(int []arr, int n, int x) {
        // Write your code here
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}