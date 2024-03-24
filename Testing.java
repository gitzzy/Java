import java.util.Scanner;

public class Testing {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // size of array
    int n = sc.nextInt();

    int[] arr = new int[n];
    boolean ispostivie = false;

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    // window
    int k = sc.nextInt();

    for (int i=0; i<n-k+1; i++) {
      for (int j=i; j<k; j++) {
        if (arr[j] < 0) {
          System.out.print(arr[j]);
          break;
        } else {
          ispostivie = true;
        }
      }
    }
    if (!ispostivie) {
      System.out.println("0");
    }
  }
}