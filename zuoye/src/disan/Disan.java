package disan;

import java.util.ArrayList;
import java.util.List;

import zuoye2.littleRabbit;

public class Disan {
	/*
	 * �ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ���������Ϊ���٣�
	 * ���л��з�װ��ʹ��
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
	            System.out.println("��" + k + "������" + c + "������");
//	            System.out.println("----------------------------------------");
	        }
	    }
	}




//		int num1=1;
//        int num2=1;
//        int num=num1+num2;
//
//        System.out.print("  "+num1+"  "+num2+"  "+num);
//        //ǰ48����
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
	
	

	   


