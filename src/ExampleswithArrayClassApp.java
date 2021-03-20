import java.util.Arrays;

public class ExampleswithArrayClassApp {
    public static void main(String[] args) {


        int[] arr = {
                98, 97, 87, 86, 3, 81, 77, 74, 72, 69, 68, 65, 61,
                51, 52, 59, 97, 47, 111, 42, 38, 51, 37, 29, 24, 81,
                12, 29, 2, 17, 8, 0};

        System.out.println("arr.length = " + arr.length);

        System.out.println("findSmallestNumber(arr) = " + findSmallestNumber(arr));

        System.out.println("findBiggestNumber(arr) = " + findBiggestNumber(arr));
        System.out.println("findSumm(arr) = " + findSumm(arr));
        System.out.println("findAverage(arr) = " + findAverage(arr));
        System.out.println("findValueAverage(arr) = " + findValueAverage(arr));
        System.out.println("Arrays.toString(findDuplicatedInArray(arr)) = " + Arrays.toString(findDuplicatedInArray(arr)));
        System.out.println("findIndexNumber(arr,97) = " + findIndexNumber(arr, 97));
        replace(arr,97,111111);
        System.out.println("Arrays.toString(extendsArray(arr,2222) = " + Arrays.toString(extendsArray(arr,2222)));

    }

    // Write a method, finding and returning the smallest number
    public static int findSmallestNumber(int[] arr){
        int keep = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < keep) {
                keep = arr[i];
            }
        }
        return keep;
    }

    //  Write a method, finding and returning the biggest number

    public static int findBiggestNumber(int[] arr){
        int keep = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(keep<arr[i]) {
                keep=arr[i];}
            i++;
        }
        return keep;
    }
    // Write a method, calculating and returning the sum of all numbers with a while loop
    public static int findSumm(int[] arr) {
        int summ=0;
        for (int i = 0; i < arr.length; i++) {
            summ=summ+arr[i];
        }
        return summ;
    }

    // Write a method, calculating and returning the average over all numbers
    public static int findAverage(int[] arr){
        int summ=0, average=0;
        int totNumber = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0)
                totNumber=totNumber-1;

            summ=summ+arr[i];
        }
        return summ/totNumber;
    }

    //  (complicated): Write a method, which returns an array with duplicated numbers (81, 51)
    public static int[] findDuplicatedInArray(int[] arr){
        int[] myArr=new int[arr.length/2];
        int z=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]==arr[j]) {  //duplicated element
                    myArr[z] = arr[i];
                    z++;
                }
            }
        }
        return myArr;
    }
    

    //  Write a method, to calculate the average over all values (think about datatype)
    public static int findValueAverage(int[] arr){
    int summ=0, average=0;
        for (int i = 0; i < arr.length; i++) {
            summ=summ+arr[i];
         }
        return summ/arr.length;
    }
    //  7: Write a method, which replaces one number by a new new number => public static void replace(int searchNumber, int newNumber)
    public static void replace(int[] arr, int searchNumber, int newNumber){
        int[] myArrayIndex=findIndexNumber(arr,searchNumber);
        for (int i = 0; i < myArrayIndex.length; i++) {
            if (myArrayIndex[i]!=-1){
                arr[myArrayIndex[i]]=newNumber;
            }
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
    public static int[] findIndexNumber(int[] arr,int searchNumber){
        int index=-1;
        int z=0;
        int[] myArrayIndex=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchNumber) {
                index=i;
                myArrayIndex[z]=index;
                z++;
            }
        }
        for (int j = z; j < arr.length; j++) {
            myArrayIndex[j]=-1;
        }
        System.out.println("Arrays.toString(myArrayIndex) = " + Arrays.toString(myArrayIndex));
        return myArrayIndex;
    }
    // 8 (complicated): Write a method which extends an array by one number. You need to create a new array with a length + 1 and copy existing values to array and add the new number at end

    public static int[] extendsArray(int[] arr,int number) {
        int[] myArray=new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            myArray[i]=arr[i];
        }
        myArray[arr.length]=number;
        return myArray;
    }
}

