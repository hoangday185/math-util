/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.chickencoder.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author hoanghamhoc
 */
public class FactorialTest {

    public FactorialTest() {
    }

    @Test //biến 1 hàm kèm cái Annotation này sẽ biến hàm dưới thành hàm main()
    public void checkFactorialGivenRightArgumentReturnWells() {// kỹ thuật đặt tên hàm của dân testing
        long expected = 120; // tui hi vọng 120 được trả về
        long actual = MathUtil.getFactorial(5);

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(1, MathUtil.getFactorial(0));
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        Assert.assertEquals(120, MathUtil.getFactorial(5));
        Assert.assertEquals(720, MathUtil.getFactorial(6));
        //so sánh được cả object nha
    }

    @Test(expected = IllegalArgumentException.class)
    //bắt xem, test xem hàm có ném ra ngoại lệ như kì vọng không
    //ví dụ nếu ta getF(-5) => thề ném ra ngoại lệ
    //nếu đụng gọi hàm getF(-5) mà hàm ném ra ngoại lệ tương ứng => hàm viết đúng
    //ta có màu xanh =)))
    //Junit 4 coi ngoại lệ là không giá trị, không assertEquals(ngoại lệ, actual)
    public void checkFactorialGivenRightArgumentThrowsException() {
        //hàm này sẽ văng ra ngoại lệ là đúng
        MathUtil.getFactorial(-5);//phải ném ngoại lệ mới là đúng
    }
}

//chốt hạ xanh đỏ
//xanh : khi tất cả cách tình huống test phải là màu xanh, tức là mọi expected
//và actual phải khớp nhau
//Đỏ : chỉ càn 1 cái đỏ, tất cả coi như đỏ
//Logic : hàm đã đúng thì phải đúng trong mọi tình huống test
// không chấp nhận lúc đúng lúc sai
//có 2 loại đỏ : 1 là tính toán sai
//               2 là kỳ vọng cũng sai :)
