package com.chickencoder.mathutil.core;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import com.chickencoder.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author hoanghamhoc
 */
@RunWith(value = Parameterized.class)//cách khai báo với java tao chơi tham số hóa
public class AdvancedFactorialRunExceptionRightTest {

    @Parameterized.Parameters
    public static Object[] initData() {
        return new Integer[]{
            -1, -2, -3, -4, -5
        };
    }

    @Parameterized.Parameter(value = 0)
    public int n;//bạn muốn tính mấy giai thừa

    @Test(expected = IllegalArgumentException.class)
    public void checkFactorialGivenRightArgumentThrowsException() {
        MathUtil.getFactorial(n);
    }
}
