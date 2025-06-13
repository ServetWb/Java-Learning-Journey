package Lesson24_Arrays;

public class L01_ArrayCreation {

    public static void main(String[] args) {


        // Arrays can be created in two ways

        // 1- Directly assigning values
        //    In this case, the array takes the number of assigned elements as its length
        int[] arr1 = {1, 4, 5};

        // 2- Creating an empty array with default values
        //    and assigning values later on

        String[] arr2 = new String[4]; // [null, null, null, null]

        // If we don't put [] when defining an array,
        // Java will not recognize it as an array
        // and expects only a single value to be assigned
        // String arr3 = {"Heaven", "Samet", "Eren"};  ❌ Invalid

        String[] arr3 = {"Heaven", "Samet", "Eren"};  // ✅ Valid

        // The data type of arr3 is "array"
        // "String" is the data type of the elements inside the array
        // So, arr3 is an ARRAY that contains String elements
    }
}

