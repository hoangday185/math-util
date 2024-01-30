/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chickencoder.mathutil.core;

/**
 *
 * @author hoanghamhoc
 */
public class MathUtil {

    //viết hàm toán học tính giai thừa n! = 1 . 2 . 3 ... .n
    //quy ước 0! = 1! = 1
    //không có quy ước giai thừa của số âm
    //21! tràn kiểu long : long có 18 số 0
    //túm lại : hàm tính giai thừa của n = 0 ... 20
    //ta xài luôn kỹ thuật lập trình test driven development (test first)
    //ta nghĩ về test, kịch bản test, bộ dữ liệu test trước khi code
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0..20");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
//        if (n == 1 || n == 0) {
//            return 1;
//        }
//        return n * getFactorial(n - 1);
    }
    //sure 5! = 120
    //     6! = 720
    //xây dựng dàn khung trước nha
}
