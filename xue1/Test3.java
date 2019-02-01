package com;

/**
 * Author:Fanleilei
 * Created:2019/2/1 0001
 */
public class Test3 {

    public static void main(String[] args) {

        double d=12.1;
        System.out.println(d);//12.1
        long a=10L;//用L表示long数据类型
        System.out.println(a);
        float f=12.9F;//要用F表示float类型
        System.out.println(f);
        System.out.println(1.1*1.1);


        int num1=10;
        int num2=4;
        System.out.println(num1/num2);//int/int 结果仍为int
        System.out.println(num1/(double)num2);//int/double结果为double

        char zifu1='A';
        int num4=9;
        System.out.println(zifu1);//A
        System.out.println(num4);//9
        int num5=zifu1;
        System.out.println(num5);//65
        //int转换为char需要强转
        char zifu2=(char)num5;
        System.out.println(zifu2);

        System.out.println(10==10);
        System.out.println(11==10);


        String StrName="java is best";
        System.out.println(StrName);
        String str2="hello";
        System.out.println(StrName+str2);
        System.out.println(StrName+num4+num5);//，有一个是字符串，用+连接，则全部是字符串连接
        System.out.println(StrName+(num4+num5));//先计算括号里面的加法，再字符串连接



    }
}
