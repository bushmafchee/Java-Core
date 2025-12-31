
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author huy
 */
public class ArrayCopy {
    public static void main(String[] args) {
        // kieu nguyen thuy
        int[] mang1 = {1, 2, 3};
        
        // copy mang cach 1
        int[] mang1_a = mang1;
        mang1_a[0] = 100;
        
        System.out.println("Mang 1: " + Arrays.toString(mang1));
        System.out.println("Mang 1: " + Arrays.toString(mang1_a));
        
        //copy mang cach 2 - dung ham clone
        int[] mang1_b = mang1_a.clone();
        mang1_a[0] = 50;
        System.out.println("Mang 1_b: " + Arrays.toString(mang1_a));
        
        //copy mang cach 3 - dung ham System.arraycopy
        int[] mang1_c = new int[mang1.length];
        
        System.arraycopy(mang1, 0, mang1_c, 0, mang1.length);
        mang1_c[0] = 90;
        System.out.println("Mang 1_c: " + Arrays.toString(mang1_c));
        
        // Kieu doi tuong
        String[] mang_doi_tuong = {"Huy", ".vn"};
    }
}
