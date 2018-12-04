public class Sum_Test {
    public static void main(String[] args){
        /*
        练习：
        获取1-10 10个数字的和
         */
        int x = 1, sum = 0;
        //x为初始值，sum为累加变量
        while (x <= 10) {
            sum = sum + x;
            x++;
        }
        System.out.println("sum = " + sum);

        /*
        思路：
        1：每次参与加法的数值不确定
        2：定义一个变量，记录每一次的和
        3：初始值自增
         */
    }
}
