public class LinearSearch implements Practice03Search
{
    public String searchName()
    {
        return "LinearSearch";
    }
    public int search (int [] arr, int target)
    {
        //finding an element within the list
        //one by one search from 1st index to the last one
        int l = arr.length;
        for (int i = 0; i < l; i++)
        {
            if(arr[i] == target)
                return i;
        }
        //if the number is not in the array list
        return -1;
    }
}
