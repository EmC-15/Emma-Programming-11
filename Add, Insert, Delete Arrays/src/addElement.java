public class addElement {
    /*
    adds an element to the end of an array:
     */
    static void addMethod(int[] myArray, int index){

        //defines the array of integers
        int[] myNums = {0 , 1 , 2};


        for (int i = 0; i < myNums.length; i++){
            myNums[i] = i;
            System.out.print(myNums[i] + " ");
        }

        //all good already: (prints 3)
        int[] moreNums = {0, 1, 2, 3};
        int single = moreNums[3];
        System.out.print(single);
    }

    public static void main(String[] args) {

        int[] myNums = {0 , 1 , 2};
        int[] moreNums = {0, 1, 2, 3};


        System.out.print("original array: ");
        System.out.println();
        for (int i = 0; i < myNums.length; i++){
            myNums[i] = i;
            System.out.print(myNums[i] + " ");
        }
        System.out.println();
        System.out.println("Modified array:");
        addMethod(myNums, moreNums[3]);
    }

}