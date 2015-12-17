package dzvz;

import org.junit.Test;

import java.util.Random;

import static dzvz.RotateArray.print;
import static dzvz.RotateArray.rotateArray;

/**
 * Created by dzmirtyviarzhbitski on 12/16/15.
 */
public class RotateTest {

    @Test
    public void test(){
        test(new Integer[]{1,2,3,4,5,6,7}, 3);
    }

    @Test
    public void test2(){
        test(new Integer[]{1,2,3}, 1);
    }

    @Test
    public void test3(){
        test(new Integer[]{1,2,3}, 3);
    }

    @Test
    public void testRandom(){
        Random random = new Random();
        int length = 10;
        Integer[] array = new Integer[length];
        for (int i = 0 ; i < length; i++){
            array[i] = random.nextInt(length);
        }
        test(array, random.nextInt(length / 2) + 1);
    }

    public void test(Integer[] verify, int k){
        Integer [] copy  = new Integer [verify.length];
        System.arraycopy(verify, 0, copy, 0, verify.length);
        print(copy);
        System.out.println(String.format("Shift on '%s'", k));
        rotateArray(verify, k);
        print(verify);
        System.out.println("==============================");
        for (int i = 0 ; i < verify.length ; i++){
            if (copy[i]!=verify[(i + k)%verify.length]){
                throw new IllegalStateException(String.format("Invalid symbol '%s' on position '%s' ", verify[i],i ));
            }
        }
    }

}
