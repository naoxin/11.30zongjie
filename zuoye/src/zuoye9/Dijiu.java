package zuoye9;

/*
 * ��n����Χ��һȦ��˳���źš��ӵ�һ���˿�ʼ��������1��3��������������3�����˳�Ȧ�ӣ���������µ���ԭ���ڼ��ŵ���λ�� 
 * 
 * */
public class Dijiu {

	public static void main(String[] args) {
		 boolean[] persons = doCall(100);
	        for (int i = 0; i < persons.length; i++) {
	            if (persons[i]) {
	                System.out.println("������µ��ǣ�"+(i+1)+"�š�");
	            }
	        }
	}
	public static boolean[] doCall(int person) {
        boolean[] persons = new boolean[person];
        int number = person, key = 0;
        for (int i = 0; i < person; i++)
            persons[i] = true;
        while (number != 1) {
            for (int i = 0; i < person; i++) {
                if (!persons[i]) {
                    continue;
                } else {
                    key++;
                    if (key % 3 == 0) {
                        System.out.println("���Ϊ��"+(i+1)+"�����˳���");
                        persons[i] = false;
                        key = 0;
                    }
                }
            }
            number = 0;
            for (int i = 0; i < person; i++) {
                if (persons[i]) {
                    number++;
                }
            }
        }
        return persons;
    }
}
