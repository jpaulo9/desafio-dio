import java.util.*;

public class Main {



    public static void main(String[] args) {



        int n = Integer.parseInt(new Scanner(System.in).nextLine());

        int cnt = 1;
        int tmp = 0;
        int res = 0;

        while(n > 0) {

            cnt *= n;
            n--;

            if(n < 1) {
                res += cnt;
                break;
            }

            cnt *= n;
            n--;

            if(n < 1) {
                res += cnt;
                break;
            }

            cnt /= n;
            n--;

            if(n < 1) {
                res += cnt;
                break;
            }

            tmp += n;
            n--;

            if(n < 1) {
                res += cnt;
                break;
            }

            res += cnt;
            cnt = -1;
        }

        res += tmp;
        System.out.println(res);
    }


    }








//




