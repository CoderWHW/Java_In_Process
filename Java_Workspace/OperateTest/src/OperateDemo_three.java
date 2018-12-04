public class OperateDemo_three {
    public static void main(String[] args){
        int x = 3,y;

        y = (x>1)?100:200;
            //三元运算符
//      System.out.println(y);

        //取两个整数变量最大的数
        int a = 4,b = 9,max;
        max = (a>b)?a:b;
        //取最大值
        System.out.println(max);

        //取三个整数中较大的整数
        int o = 4,p = 5,q = 6,maxx;
        maxx = (o>p)?o:p;
        maxx = (max > q)?maxx:q;
        System.out.println(maxx);
    }
}
