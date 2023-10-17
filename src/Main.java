import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] arr = {90, 90, 50, 50, 50, 50, 90, 90};

        System.out.printf(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.printf(Arrays.toString(arr));
        int m = bott(arr);
        System.out.println(m);

    }
    public static int bott(int[] arr) {
        int i = 0;
        int count = 0;
        int j = arr.length;
                    for (j = arr.length - 1; j >= 0; j--) {
                        if ((j >= i) && (arr[i] + arr[j]) <= 135) {
                            i++;
                            count++;
                        } else if ((j >= i) && arr[j] <= 135) {
                            count++;
                        }
                    }

        return count;
        }
    }
