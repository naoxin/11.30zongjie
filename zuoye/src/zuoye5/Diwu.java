package zuoye5;


/*
 * ��1+2!+3!+...+20!�ĺ�
 * */
public class Diwu {
	public static void main(String[] args) {
		 int sum=0;
		 for(int i=1;i<=20;i++)//���ڱ���1~20
		 {   int temp=1;
		     for(int j=1;j<=i;j++)//������i!;
		      {
		          temp*=j;
		      }
		    sum+=temp;

		 } 
		 System.out.println(sum);
	 }
}


