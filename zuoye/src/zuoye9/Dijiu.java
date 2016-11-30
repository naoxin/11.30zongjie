package zuoye9;

/*
 * 有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位。 
 * 
 * */
public class Dijiu {

	public static void main(String[] args) {
		 boolean[] persons = doCall(100);
	        for (int i = 0; i < persons.length; i++) {
	            if (persons[i]) {
	                System.out.println("最后留下的是："+(i+1)+"号。");
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
                        System.out.println("编号为："+(i+1)+"的人退出。");
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
