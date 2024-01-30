/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.chickencoder.mathutil.core;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author hoanghamhoc
 */
@RunWith(value = Parameterized.class)//khai báo cho thằng java tao chơi tham số hóa nha
public class AdvancedFactorialRunRightTest {
    //ta sẽ dùng kỹ thuật data driven testing/Parameterzed Tesing
    //tham số từ bộ kỹ thuật testing
    //là kỹ thuật tách bộ dữ liệu test ra hẳn câu lệnh kiểm thử hàm

    //xét cho bài getF()
    //bộ data, đặt ở file text, excel, table/database
    //0 -> 1;
    //1 -> 1;
    //2 -> 2;
    //3 -> 6;
    //4 -> 24;
    //5 -> 120;
    //nhồi field bộ data này vào trong lời gọi hàm getF()+ assertEquals
    //tách bạch data và lời gọi hàm check result
    @Parameterized.Parameters
    //chuẩn bị bộ data ở txt, excel, database
    //nếu để ở file ngoài thì phải viết thêm đoạn code đọc data vào
    public static Object[][] initData() {
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},};
    }

    @Parameterized.Parameter(value = 0)
    public int n;//bạn muốn tính mấy giai thừa

    @Parameterized.Parameter(value = 1)
    public long expected;

    @Test
    public void checkFactorialGivenRightArgumentReturnWells() {// kỹ thuật đặt tên hàm của dân testing
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }
}
