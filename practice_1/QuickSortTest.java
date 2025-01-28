package me.Gyojun.practice.practice_1;

class QuickSort{

    int i;
    public int partitioning(int[] a, int begin, int end){
        int pivot;
        int temp;
        int left, right;

        left = begin;
        right = end;
        pivot = right;

        System.out.printf("\n [QuickSort %d Step : pivot=%d ]\n", ++i,a[pivot]);

        while(left < right){

            while((a[left] < a[pivot]) && (left < right)) left++;
            while((a[right] >= a[pivot]) && (left < right)) right--;
            if(left < right){
                temp = a[left];
                a[left] = a[right];
                a[right] = temp;
            }
        }
        temp = a[pivot];
        a[pivot] = a[right];
        a[right] = temp;

        for(int j=0; j<a.length; j++)
            System.out.printf("%3d  ", a[j]);
        System.out.println();
        return right;

    }



    public void quickSort(int[] a, int begin, int end){

        if(begin < end){
            int p;
            p = partitioning(a, begin, end);
            quickSort(a, begin,p-1);
            quickSort(a,p+1,end);


        }



    }


}



public class QuickSortTest {

    public static void main(String[] args) {

        int arr[] = {80,50,70,10,60,20,40,30};
        QuickSort s = new QuickSort();

        s.quickSort(arr,0,7);
    }
}
