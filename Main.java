import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        char[] letters = {'z', 'b', 'e', 'f', 'a', 'c', 'o'};


        Arrays.sort(letters);
        reverseArray(letters);


        System.out.println("Letters sorted from Z to A:");

        for (char letter : letters) {

            System.out.print(letter + " ");

        }
    }

    public static void reverseArray(char[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {

            char temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;

        }
    }
}
