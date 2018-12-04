import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Week_Test {
    public static void  main(String[] args){
        /*
        需求：根据用户数据，判断该数据对应的星期
        1-星期一-Monday

        思路：用户输入无法获取，但只是具体数据的一种获取手段
        功能是根据用户数据进行对应星期的打印
        完全可以使用变量进行操作
        变量的值可以由用户来决定
         */

        int date = 1;

        if (date == 1){
            System.out.println("Monday");
        }else if (date == 2){
            System.out.println("Tuesday");
        }else if(date == 3){
            System.out.println("Wednesday");
        }else if(date == 4){
            System.out.println("Thursday");
        }else if(date == 5){
            System.out.println("Friday");
        }else if(date == 6){
            System.out.println("Saturday");
        }else if(date == 7){
            System.out.println("Sunday");
        }else{
            System.out.println("您的输入有误，请重新输入!");
        }

    }
}
