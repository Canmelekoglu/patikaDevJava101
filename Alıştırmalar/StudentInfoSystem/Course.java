public class Course {
    String name;
    String code;
    String prefix;
    double note;
    double perfNote;
    Teacher teacher;

    public Course(String name,String code,String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.perfNote=0;
    }
    public void addTeacher(Teacher teacher) {
        if (this.prefix.equals(teacher.branch)) {
            this.teacher = teacher;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(teacher.name + " Akademisyeni bu dersi veremez.");
        }
    }
    public void printTeacher(){
        if (teacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + teacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
    }
