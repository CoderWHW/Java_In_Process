public class OperateDemo {
    public static void main(String[] args){
        int a = 3,b = 5;
        System.out.println("a1 = "+ a +",b1 = " + b);

        a = a + b;  //求和，a = 8,b = 5
        b = a - b;  //a = 8,b = 3
        a = a - b;  //a = 5,b = 3

        System.out.println("a2 = "+a+",b2 = "+b);   //ab的值已交换
    }
}
