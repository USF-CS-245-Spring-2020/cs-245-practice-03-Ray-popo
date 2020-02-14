public class SelectionSort implements Practice03Sort
{
    public void sort(int [] a)
    {
        int l = a.length;
        //one-by-one move
        for(int i = 0; i < l-1; i++)
        {//trying to find minimum value
            int minElement = i;
            for (int j=i+1; j<l;j++)
            {
                if (a[j]<a[minElement])
                    minElement = j;
            }//swap the minimum value with fist value
            int temp = a[minElement];
            a[minElement] = a[i];
            a[i] = temp;
        }
    }
}
