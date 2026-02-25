public class SecondLargest {
  public static void main(String[] args) {
    int[] A = {1, 2, 3, 4, 5};
    int max = A[0];
    int secondMax = Integer.MIN_VALUE;

    for (int i = 1; i < A.length; i++) {
        if (A[i] > max) {
            secondMax = max;
            max = A[i];
        } else if (A[i] > secondMax && A[i] != max) {
            secondMax = A[i];
        }
    }

    if (secondMax == Integer.MIN_VALUE) {
        System.out.println("There is no second largest element in the array.");
    } else {
        System.out.println("The maximum element in the array is: " + max);
        System.out.println("Second largest element in the array is: " + secondMax);
    }
  }
  
}
