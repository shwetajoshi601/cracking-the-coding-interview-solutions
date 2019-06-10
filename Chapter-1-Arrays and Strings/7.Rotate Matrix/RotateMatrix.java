import java.util.*;

public class RotateMatrix {

    /**
     * Rotates the matrix by 90 degrees
     */
    public static void rotateImage(int[][] image, int n) {
        int lastIdx = n-1;
        // swapping elements to rotate
        for(int i =0;i<n;i++) {
            for(int j=0;j<n-i;j++) {
                int temp = image[lastIdx-j][lastIdx-i];
                image[lastIdx-j][lastIdx-i] = image[i][j];
                image[i][j] = temp;
            }
        }
    }

    public static void printImage(int[][] image, int n) {
        for(int i=0; i<n; i++) {
            for(int j=0;j<n;j++) {
                System.out.print(image[i][j] + "   ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the image: ");
        int n = sc.nextInt();
        if(n > 1) {
            int[][] image = new int[n][n];
            System.out.println("Enter the pixels for the " + n + "x" + n + " image.");
            for(int i=0;i<n;i++) {
                for(int j=0;j<n;j++) {
                    System.out.println("Value for image[" + i + "][" + j + "]: ");
                    image[i][j] = sc.nextInt();
                }
            }
            System.out.println("The original image is : ");
            printImage(image, n);
            rotateImage(image, n);
            System.out.println("--------------------------------------------");
            System.out.println("The rotated image is : ");
            printImage(image, n);
        } else {
            System.out.println("The image cannot be rotated!");
        }
    }
}