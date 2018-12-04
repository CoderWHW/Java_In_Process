public class Switch_demo {
    public static void main(String[] args){

        //switch运算demo(局部)
        {
            int a = 3, b = 5;
            char ope = '-';

            switch (ope) {
                case '+':
                    System.out.println(a + b);
                    break;
                case '-':
                    System.out.println(a - b);
                    break;
                case '*':
                    System.out.println(a * b);
                    break;
                case '/':
                    System.out.println(a / b);
                    break;
                default:
                    System.out.println("请重新输入");
                    break;
            }
        }


    }
}
