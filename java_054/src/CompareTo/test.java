/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CompareTo;

/**
 *
 * @author huy
 */
public class test {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(150, "Vu Van Thanh", "001", 9);
        SinhVien sv2 = new SinhVien(120, "Bui Tien Dung", "002", 10);
        SinhVien sv3 = new SinhVien(130, "Ha The Anh", "010", 7);
        
        System.out.println(sv1.compareTo(sv2));
        System.out.println(sv3.compareTo(sv1));
    }
}
