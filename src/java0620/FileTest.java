package java0620;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Javaimsi\\zoom\\newFile.txt");
        File file2 = new File("C:\\Javaimsi\\zoom\\aaa");
        File file3 = new File("C:\\Javaimsi\\zoom2\\log");

        file3.mkdirs(); //mkdirs : 모든 디렉터리(파일)을 만들어준다.

        file2.mkdir();  //mkdir : 해당 경로에 디렉터리(파일)을 만든다.

        file.createNewFile();

        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());

        // file.delete(); //삭제
    }
}
