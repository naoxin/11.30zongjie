package zuoye8;

/*
 * 
 * �����ַ������Ӵ����ֵĴ���   
 * */
public class Diba {
	public static void main(String[] args) {
		String str = "abcdefabhjlecababcababababababaaababab";
		String str1 = "ab";
		int count = 0;
		int start = 0;
		while (str.indexOf(str1, start) >= 0 && start < str.length()) {
			count++;
			start = str.indexOf(str1, start) + str1.length();
		}
		System.out.println(str1 + "��" + str + "���ֵĴ���Ϊ" + count);
	}

}        
