package dzvz;

import java.util.stream.Stream;

/**
 * Created by dzmirtyviarzhbitski on 12/16/15.
 */
public class RotateArray {

    //O(n*k)
    public static  <T> void rotateArray(T[] a, int k){
        if (k % a.length == 0){
            return;
        }
        for (int i = 1; i <= k ; i++){
            shift(a);
        }
    }

    private static <T> void shift(T[] a) {
        T tmp = a[a.length - 1];
        for (int i =  a.length - 2 ; i>=0 ;i--){
            a[i + 1] = a[i];
        }
        a[0] = tmp;
    }

    public static void print(Integer[] array) {
        StringBuilder builder = new StringBuilder();
        Stream.of(array).forEach(v-> builder.append(v).append(" "));
        System.out.println(builder.toString());
    }
}
