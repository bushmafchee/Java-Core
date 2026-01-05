/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author huy
 */
public class Test {

    public static void main(String[] args) {
        TimeTable tkb_t2 = new TimeTable(Day.Monday, "Math, Chemistry");
        TimeTable tkb_t3 = new TimeTable(Day.Tuesday, "History, Sport");
        System.out.println(tkb_t3);
    
        int x = Month.January.numOfDay();
        System.out.println(x);
    }
}
