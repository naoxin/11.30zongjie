package zuoye10;

/*
 * ��100֮�ڵ����� 
 * */
public class Dishi {
	public static void main(String[] args) {
		 int i,n,k=0;
	     for (n = 4; n<=100; n++) {     //3~100��������
	         i=2;
	         while (i<n) {
	             if (n%i==0)  break;  //��������˵��n����������������ǰѭ��
	             i++;
	          }

	        
	      if (i==n) {     //���i==n��˵��n���ܱ�2~n-1������������
	             k++;             //ͳ��������ĸ���
	             System.out.print(i+ "\t ");
	             if (k %6==0)    //ÿ���5������
	              System.out.println();
	         }
	     }
	}

}
