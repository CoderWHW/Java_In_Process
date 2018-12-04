public class Season_Test {
    public static void main(String[] args){
        /*
        一年四季
        春：3，4，5
        夏：6，7，8
        秋：9，10，11
        冬：12，1，2

       需求：根据用户输入，给出对应的季节
         */

        int mon = 3;

        //数值判断
        if(mon == 3||mon==4||mon==5){
            System.out.println("春季");
        }else if(mon == 6||mon == 7||mon == 8){
            System.out.println("夏季");
        }else if(mon == 9||mon == 10||mon == 11){
            System.out.println("秋季");
        }else if(mon == 12||mon == 1||mon == 2){
            System.out.println("冬季");
        }else{
            System.out.println("输入有误，请重新输入!");
        }



    if(mon >= 3 && mon <= 5){
        System.out.println("春");
        }//........

    }
}
