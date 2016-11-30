package disan;

import java.util.ArrayList;
import java.util.List;

import zuoye2.littleRabbit;

public class Disan {
	/*
	 * 古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
	 * 其中还有分装的使用
	 */
	public static void main(String[] args) {
		
		int a=1;
		int b=1;
		int c=0;
//		
//		 List list = new ArrayList();
//	        list.add(new littleRabbit());
	        for (int k = 1; k <= 20; k++) {
	        	a=b;
	        	b=c;// 0
	        	c=a+b;//1
//	            for (int j = 0; j < list.size(); j++) {
//	                littleRabbit rabbit = (littleRabbit) list.get(j);
//	                int age = rabbit.getAge();
//	                if (age >= 3) {
//	                    list.add(new littleRabbit());
//	                }
//	                age++;
//	                rabbit.setAge(age);
//	            }
	            System.out.println("第" + k + "个月有" + c + "对兔子");
//	            System.out.println("----------------------------------------");
	        }
	    }
	}




//		int num1=1;
//        int num2=1;
//        int num=num1+num2;
//
//        System.out.print("  "+num1+"  "+num2+"  "+num);
//        //前48个月
//        for(int i=3;i<48;i++){
//            int num3=num+num2;
//            num2=num;
//            num=num3;
//            
//            System.out.print("  "+num3);
//            if(i%5==0){
//                System.out.println();
//            }
//        }
	
	

	   


