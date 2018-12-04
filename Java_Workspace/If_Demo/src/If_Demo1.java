public class If_Demo1 {
        public static void main(String[] args){

            int a = 1,b = 2,c = 3;


            //pure_if
            if(a<b){
                System.out.println("a<b");
            }



            //if_else
            if(c<b){
                System.out.println("c<b");
            }else{
                System.out.println("c>b / c=b");
            }



            //if else_if
            if(c<b){
                System.out.println("c<b");
            }else if(c>b){
                System.out.println("c>b");
            }else{
                System.out.println("c=b");
            }



            //if nest
            if(a>0){
                if(a == 1){
                    System.out.println("a");
                }else{
                    System.out.println("b");
                }
            }else{
                if(a == 2){
                    System.out.println("c");
                }else{
                    System.out.println("d");
                }
            }


        }
    }