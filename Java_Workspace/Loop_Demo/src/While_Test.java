public class While_Test {
    public static void main(String[] args) {





        /*
        需求：
        1~100之间，6的倍数出现的次数
         */


        /*
        思路：（计数器思想）
        1：定义x为初始值，B_6为6的倍数出现的次数
        2：while循环确定范围为小于等于100
        3：if判断x除以6是否有余数
        4：没有余数，则B_6加1
        5：while循环体，x自增1，进行下一个数的判断
         */

        int x = 1, B_6 = 0;

        while (x <= 100)
        {

            if (x % 6 == 0) {
                B_6++;
            }
            x++;
        }

        System.out.println("6的倍数有：" + B_6 + "个");

    }
}

