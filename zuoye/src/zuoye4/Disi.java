package zuoye4;
/*
 * ��1,2,3,4�ĸ����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣�
 * */

public class Disi {
	public static void main(String[] args) {
		int i=0;  //�����λ�ϵ���
		int j=0;  //����ʮλ�ϵ���
		int k=0;  //�����λ�ϵ���
		int t=0;  //�������ָ��� 
		//����λ�ϵ���
		for(i=1;i<=4;i++){
			//���ʮλ�ϵ���
		   for(j=1;j<=4;j++){
			   //����λ�ϵ���
		   for(k=1;k<=4;k++){
			   //�ж��Ƿ��ظ�
		    if(i!=j && j!=k && i!=k){
		    	//�����ж�����
		         t+=1;
		        System.out.println(i*100+j*10+k);
		    } 
		     }  
		   }
		 }
		System.out.println (t);
	}

}
