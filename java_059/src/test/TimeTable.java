/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author huy
 */
public class TimeTable {
    private Day thu;
    private String cacMonHoc;

    public TimeTable(Day thu, String cacMonHoc) {
        this.thu = thu;
        this.cacMonHoc = cacMonHoc;
    }

    public Day getThu() {
        return thu;
    }

    public void setThu(Day thu) {
        this.thu = thu;
    }

    public String getCacMonHoc() {
        return cacMonHoc;
    }

    public void setCacMonHoc(String cacMonHoc) {
        this.cacMonHoc = cacMonHoc;
    }

    @Override
    public String toString() {
        return "TimeTable{" + "thu=" + thu + ", cacMonHoc=" + cacMonHoc + '}';
    }
    
    
}
