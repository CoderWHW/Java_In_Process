
public class OperateTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		//最有效率的计算2*8
//		System.out.println(2*8); 		//普通方法
//		System.out.println("2*8 = "+(2<<3));	//移位运算
		
		//对两个整数的值进行互换
		int a = 3,b = 5;
		System.out.println("a = "+ a +",b = "+ b);
		
		//a = b;	//错误
	
	
		//不借助中间变量
		a = a + b;//求和,a = 8,b = 5 
		b = a - b;//b = 3,a = 8
		a = a - b;//b = 3,a = 5
		
		System.out.println("a = "+ a +",b = "+ b);
	}

}
