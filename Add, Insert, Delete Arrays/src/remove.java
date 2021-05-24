public class remove {

    //deletes an element from an array

    static void deleteMethod(int[] myArray, int index){

        int[] myNums = {0, 1, 2};

        System.out.println("Original Array:");
        for (int i = 0; i < myNums.length; i++){
            myNums[i] = i;
            System.out.print(myNums[i] + " ");
        }
        System.out.println();
        System.out.println("Modified Array:");
        int delete = 2;
        for (int i = 0; i < index; i++){
            myNums[i] = i;
            System.out.print(myNums[i] + " ");
        }

    }

    public static void main(String[] args) {
        int[] myNums = {0, 1, 2};
        int delete = 2;
        deleteMethod(myNums, delete);

    }

}


