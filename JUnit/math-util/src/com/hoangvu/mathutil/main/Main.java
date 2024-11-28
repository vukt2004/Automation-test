/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hoangvu.mathutil.main;

import com.hoangvu.mathutil.core.MathUtil;

/**
 *
 * @author vundh
 */
public class Main {
    public static void main(String[] args) {
        long expected = 120;
        int  n = 5;
        long actual = MathUtil.getFactorial(n);
        System.out.println("Expected: 5! = " + expected);
        System.out.println("Actual: 5! = " + actual);
    }
}
