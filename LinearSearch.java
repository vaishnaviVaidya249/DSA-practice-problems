public class LinearSearch {
    public static int linearSearch(int n, int num, int []arr){
        // Write your code here.
       
        for(int i=0;i<n;i++){
            if(num==arr[i]){
                return i;
                
            }
            
        }
        return -1;
       
    }
    
}
