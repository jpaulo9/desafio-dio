import java.util.Scanner;

public class QuadradosPerfeitos {


    public static boolean quadrdoPerdeito(int n) {
        double sqr = Math.sqrt(n);

        return sqr == Math.floor(sqr);
    }

    public static int minN(int n) {
        if (quadrdoPerdeito(n)) {
            return 1;
        }

        int result = n;

        for (int i = 1; i * i < n; i++) {
            result = Integer.min(result, 1 + minN(n - i * i));
        }

        return result;
    }

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int i;
        int N = input.nextInt();
        int[] nums = new int[N];
        for (i = 0; i < N; i++) {
            nums[i] = input.nextInt();
        }
        //TODO: mova todos os inteiros pares para o inicio do array, seguido por todos os números ímpares
        int j = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                nums[i] = nums[i] ^ nums[j] ^ (nums[j] = nums[i]);
                j++;
            }
        }

        for (int entry : nums) {
            System.out.println("" + entry);
        }

    }
}