public class BinaryIterativeSearch implements Practice03Search
{
    public String searchName()
    {
        return "BinaryIterativeSearch";
    }
    public int search (int [] arr, int target){
        //set up the searching space
        int left = 0;
        int right = arr.length - 1;
        //search element from space till the last one element
        while (left <= right)
        {
            int mid = (left +right)/2;
            //finding target value start from middle
            if (target == arr[mid])
            {
                return mid;
            }
            //divide all elements in 2 different parts
            //set into the right search space
            //include the mid element
            else if (target < arr[mid])
            {
                right = mid -1;
            }
            //set into the left search space
            //include the mid element
            else if (target > arr[mid])
            {
                left = mid +1;
            }
        }//if the number is not in the array
        return -1;
    }

}
