package zuoye4;
/*
 * 有1,2,3,4四个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 * */

public class Disi {
	public static void main(String[] args) {
		int i=0;  //保存百位上的数
		int j=0;  //保存十位上的数
		int k=0;  //保存各位上的数
		int t=0;  //保存数字个数 
		//检查百位上的数
		for(i=1;i<=4;i++){
			//检查十位上的数
		   for(j=1;j<=4;j++){
			   //检查个位上的数
		   for(k=1;k<=4;k++){
			   //判断是否重复
		    if(i!=j && j!=k && i!=k){
		    	//计算有多少数
		         t+=1;
		        System.out.println(i*100+j*10+k);
		    } 
		     }  
		   }
		 }
		System.out.println (t);
	}

}
