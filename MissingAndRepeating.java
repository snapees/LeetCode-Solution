// Java program to Find the repeating
// and missing elements

// using array


class MissingAndRepeating {

    static void printTwoElements(int arr[], int size)
    {
        int i;
        System.out.print("The repeating element is ");

        for (i = 0; i < size; i++) {
            int abs_val = Math.abs(arr[i]);
//            System.out.println(abs_val);
            if (arr[abs_val - 1] > 0)
                arr[abs_val - 1] = -arr[abs_val - 1];
            else
                System.out.println(abs_val);
        }

        System.out.print("and the missing element is ");
        for (i = 0; i < size; i++) {
            if (arr[i] > 0)
                System.out.println(i + 1);
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 3, 1, 2, 5, 3 };
        int n = arr.length;
        printTwoElements(arr, n);
    }
}

