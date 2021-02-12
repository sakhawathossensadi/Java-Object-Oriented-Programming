public class AnonymousArray {

    public void sum(int[] arr)
    {
        int sum=0,val=0;
        //for loop
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }     
        System.out.println("Sum : "+sum);
        //for each loop
        for(int x : arr)
        {
            val=val+x;
        }
        System.out.println("Summation : "+val);
    }

    public static void main(String[] args) {
        AnonymousArray anonymousArray = new AnonymousArray();
        anonymousArray.sum(new int[] {1,2,3,4,5});
    }
    
}
