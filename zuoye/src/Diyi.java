import java.io.File;
import java.util.LinkedList;

/*
 * .������һ���ļ����µ������ļ�����չʾ���㼶��ϵ���ļ���������ʾ�������һ����ʽд���ı���
    Ҫ�󣺾����ܼ򵥡��߼�����
           ��ѡ�洢��ʽ�ṹҲ�ܿ����㼶��ϵ�����ɶ�д��ֱ��ʹ��
 */
public class Diyi {

	public static void main(String[] args) {
		int fileNum = 0, folderNum = 0;
        File file = new File("f:/ͼƬ");
        if (file.exists()) {
            LinkedList<File> list = new LinkedList<File>(); 
            File[] files = file.listFiles();
            for (File file2 : files) {
                if (file2.isDirectory()) {
                    System.out.println("�ļ���:" + file2.getAbsolutePath());
                    list.add(file2);
                    fileNum++;
                } else {
                    System.out.println("�ļ�:" + file2.getAbsolutePath());
                    folderNum++;
                }
            }
            File temp_file;
            while (!list.isEmpty()) {
                temp_file = list.removeFirst();
                files = temp_file.listFiles();
                for (File file2 : files) {
                    if (file2.isDirectory()) {
                        System.out.println("�ļ���:" + file2.getAbsolutePath());
                        list.add(file2);
                        fileNum++;
                    } else {
                        System.out.println("�ļ�:" + file2.getAbsolutePath());
                        folderNum++;
                    }
                }
            }
        } else {
            System.out.println("�ļ�������!");
        }
        System.out.println("�ļ�����:" + folderNum + ",�ļ��й���:" + fileNum);

	}
}
