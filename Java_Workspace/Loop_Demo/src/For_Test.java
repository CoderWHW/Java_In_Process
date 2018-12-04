public class For_Test {
    public static void main(String[] args) {
        /*
        需求：使用for完成累加算法
        计算1-100的和
         */

        int sum = 0;
        for(int i = 0;i<=100;i++)
        {
            sum = sum + i;
        }

        System.out.println("1-100的和为："+sum);


        /*
        需求：打印1-10共10个数字
         */

        //while
        int x = 1;
        while(x<=10)
        {
            System.out.println("x = "+x);
            x++;
        }

        //for
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("i = "+i);
        }

        //注意作用域
        //在for循环中定义的变量只在循环作用域中有效
    }
}
