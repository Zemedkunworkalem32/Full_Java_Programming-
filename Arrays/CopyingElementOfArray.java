public class CopyingElementOfArray {
    public static void main(String[] args) {

        int[] A = {12, 11, 10, 9, 8, 7, 6, 5, 4, 3};
        int[] B = new int[A.length-2]; // New array to hold copied elements

        System.out.println("Original array:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

        // Copy elements
        System.arraycopy(A, 2, B, 0, A.length-2);

        System.out.println("\nCopied array:");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
    }
}