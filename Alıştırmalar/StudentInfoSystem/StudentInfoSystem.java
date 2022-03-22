public class StudentInfoSystem {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");
        Course biyoloji = new Course("Biyoloji", "BIO101", "BIO");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");
        Teacher t4 = new Teacher("Ilayda Hoca", "5557548962", "BIO");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);
        biyoloji.addTeacher(t4);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya,biyoloji);
        s1.addBulkExamNote(50,20,40,60);
        s1.performanceNote(70,50,85,70);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya,biyoloji);
        s2.addBulkExamNote(100,50,40, 55);
        s2.performanceNote(100,50,75,100);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya,biyoloji);
        s3.addBulkExamNote(50,20,40, 70);
        s3.performanceNote(66,50,70, 80);
        s3.isPass();

        Student s4 = new Student("Can Melekoglu",4,"160103008",mat,fizik,kimya,biyoloji);
        s4.addBulkExamNote(80,55,66, 52);
        s4.performanceNote(80,55,75,100);
        s4.isPass();
    }
}
