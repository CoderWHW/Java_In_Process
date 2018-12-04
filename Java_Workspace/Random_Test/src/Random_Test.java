import java.util.Random;

class Random_Test{
    public static void main(String[] args) {
        
        Random r1 = new Random(50);
        int[] num= new int[50];
        for(int i = 0;i<num.length;i++){
            num[i] = 0 + r1.nextInt(51);
        } 
        System.out.println(r1);
    }
}