package java0404.staticsample;

public class StudentHideTest {
    public static void main(String[] args) {
        StudentHide studentHide = new StudentHide();

        studentHide.setStudentId(22074001);
        studentHide.setStudentName("권오석");
        studentHide.setSutdentDepart("인공지능");
        studentHide.setStudentAddress("수원시 권선구 세류동");

        studentHide.getStudentAddress();

        System.out.println(studentHide.toString());

        StudentHide studentHide2 = new StudentHide();
        studentHide2.setStudentName("이순신");

        System.out.println(studentHide2.toString());
    }
}
