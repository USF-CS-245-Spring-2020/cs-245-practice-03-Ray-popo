
public class BinaryRecursiveSearch implements Practice03Search
{
    public String searchName()
    {
        return "BinaryRecursiveSearch";
    }
    public int search(int [] arr, int target)
    {
        //call to helper function
        //set up the starting and ending for the array
        return search( arr, 0, arr.length - 1, target);
    }
    //helper function
    public int search(int [] a, int start, int end, int target)
    {
        //base case
        int mid = (start + end) / 2;
        if ( start >= end)
        {
            if (a[end]==target){
                return end;
            }
            else {
                return -1;
            }
        }
        //compare the value between mid and target
        if (target == a[mid])
        {
            return mid;
        }
        //recursive call
        else if (target < a[mid])
        {
            return search(a, start, mid, target);
        }
        //recursive call
        else
        {
            return search(a, mid +1, end, target);
        }

    }
}
