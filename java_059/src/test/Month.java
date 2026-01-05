/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package test;

/**
 *
 * @author huy
 */
public enum Month {
    January(31),
    February(29),
    March(31),
    April(30),
    May(31),
    June(30),
    July(31),
    August(31),
    September(30),
    October(31),
    November(30),
    December(31);

    private final int numOfDay;

    private Month(int numOfDay) {
        this.numOfDay = numOfDay;
    }

    public int numOfDay() {
        return this.numOfDay;
    }
}
