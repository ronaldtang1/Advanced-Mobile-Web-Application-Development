public class ArrayDemo {
    public static void main(String[] args) {
        int sum = 0;
        double avg = 0.0;

        getRequirements();
        int[] myArray = new int[]{12, 15, 34, 67, 4, 9, 10, 7, 13, 50};
        sum = getSum(myArray);
        avg = getAvg(myArray);

        System.out.print("Numbers in the array are: ");
        printArray(myArray);
        reverseArray(myArray);
        System.out.println("\nSum of all numbers is: " + sum);
        System.out.printf("Average is: %.1f\n", avg);
        
        for(int x: myArray){
            if(x > avg){
                System.out.print(x + " ");
            }
        }
        System.out.println("are greater than the average.");
    }//end main

    public static void getRequirements(){
        System.out.println("Developer: Ronald Tang");
        System.out.println("Program creates an array with the following numbers,");
        System.out.println("and performs the operations below using user-defined methods.\n");
    }//end getRequirements

    public static void printArray(int[] arr){
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }//end printArray

    public static void reverseArray(int[] arr){
        for(int i = 0; i < arr.length / 2; i++){
           int temp = arr[i];
           arr[i] = arr[arr.length - i - 1];
           arr[arr.length - i - 1] = temp;
        }
        System.out.print("\nnumbers in reverse order are: ");
        printArray(arr);
    }//end reverseArray

    public static int getSum(int[] arr){
        int sum = 0;
        for(int x : arr){
            sum += x;
        }

        return sum;
    }//end getSum

    public static double getAvg(int[] arr){
        double avg = 0.0;
        int count = 0;
        int sum = 0;

        for (int x:arr){
            sum += x;
            count++;
        }
        avg = (sum * 1.0)/count;

        return avg;
    }//end getAvg
}//end class
