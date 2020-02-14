public class BubbleSort implements Practice03Sort
{
    public void sort(int [] a)
    {
        int l = a.length;
        //check one by one from array
        for (int i = 0; i < l-1; i++ )
            for (int j = 0; j<l-i-1; j++)
                if (a[j]>a[j+1])
                {
                    //swap index of i and j+1
                    int temp  = a [j];
                    a[j] = a [j+1];
                    a[j+1] = temp;
                }
    }

}
