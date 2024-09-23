public class array{
    public static void main(String arg[]){
        int arr[] = {1,2,3};
        System.out.print(arr[0]);
        
        int nums[] = new int[5];
        nums[0]=1;
        nums[4]=2;
        for(int i=0;i<5;i++)
        {
            System.out.print(nums[i]);
        }

        System.out.println();

        //Enhanced For Loop in Java
        for(int element: nums){
            System.out.print(element + " ");
        }
    }
}