public class InsertionSort implements Practice03Sort
{
    public void sort(int [] a)
    {
        int l = a.length;
        for (int i = 1; i < l; i++)
        {
            int piovt = a[i];
            int j = i-1;
            //move the element, if the element greater than target
            //so move the element ahead to the "current" position
            while ((j>-1) && (a[j]>piovt))
            {
                a[j+1] = a[i];
                j--;
            }
            a[j+1] = piovt;
        }
    }
}
