class Lowerbound{
    public static void main(String[] args) {
        int arr[]={10,20,30,40,40,40,50,60};
        int n=arr.length;
        int x=40;
        System.out.println(upperBound(arr,n,x));
    }
    public static int upperBound(int []arr, int x, int n){
        // Write your code here.
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]<=x){
                low=mid+1;
            }
            else{
                ans=mid;
                high=mid-1;
            }
        }
        return ans;
    }
}