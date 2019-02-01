package com;

/**
 * Author:Fanleilei
 * Created:2019/2/1 0001
 */
public class Test1 {

    public static void main(String[] args) {

        long x=1L;
        System.out.println(x);
        int y=1;
        System.out.println(y);
        System.out.println(11+1L);

        long num=2147483648L;
        //可以从小类型到大类型
        //但是从大类型到小类型，要强转，但有可能丢失数据
        int result= (int) num;
        System.out.println(result);

        //byte类型保存的范围是：-128~127,一个字节
        byte data = (byte)300;   //300转换为二进制位：1 0010 1100 ，但byte占一个字节即8位，所以只取后8位。所以300转换为byte类型后输出结果为44
        System.out.println(data);//44

    }
}
