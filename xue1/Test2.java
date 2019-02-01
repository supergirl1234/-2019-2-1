package com;

/**
 * Author:Fanleilei
 * Created:2019/2/1 0001
 */
public class Test2 {

    public static void main(String[] args) {
        int maxIntvalue=Integer.MAX_VALUE;
        int minIntvalue=Integer.MIN_VALUE;
        System.out.println(maxIntvalue);//2147483647
        System.out.println(maxIntvalue+1);//溢出，导致结果错误，为-2147483648
        //在结果溢出得情况下，解决方法:转换数据类型
        System.out.println(maxIntvalue+1L);//2147483648，在数字后加L或l表示long型
        Long maxLongIntvalue=maxIntvalue+1L;
        System.out.println(maxLongIntvalue);//2147483648
        System.out.println(minIntvalue);//-2147483648
        System.out.println(minIntvalue-1);//同样的结果溢出2147483647
        Long minLongIntvalue=minIntvalue-1L;
        System.out.println(minLongIntvalue);//-2147483649
    }
}
