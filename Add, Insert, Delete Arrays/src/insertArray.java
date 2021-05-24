import java.util.Arrays;

public class insertArray {
    /*
    adds an element to the end of an array:
     */
    public static int[] insertX(int n, int arr[], int x, int pos) {
        int i;

        // create a new array of size n+1
        int moreNums[] = new int[n + 1];
/*
        insert the elements from
        the old array into the new array
        insert all elements till pos
        then insert x at pos
        then insert rest of the elements

 */
        for (i = 0; i < n + 1; i++) {
            if (i < pos - 1)
                moreNums[i] = arr[i];
            else if (i == pos - 1)
                moreNums[i] = x;
            else
                moreNums[i] = arr[i - 1];
        }
        return moreNums;
    }

    // Driver code
    public static void main(String[] args)
    {

        int n = 4;
        int i;

        // initial array of size 10
        int[] myNums = { 1, 2, 3, 4};

        // print the original array
        System.out.println("Initial Array:\n" + Arrays.toString(myNums));
        System.out.println();

        // element to be inserted
        int x = 5;

        // position at which element
        // is to be inserted
        int pos = 2;

        // call the method to insert x
        // in myNums at position pos
        myNums = insertX(n, myNums, x, pos);

        // print the updated array
        System.out.println("Modified Array: ");
        System.out.print(Arrays.toString(myNums));
    }

}
