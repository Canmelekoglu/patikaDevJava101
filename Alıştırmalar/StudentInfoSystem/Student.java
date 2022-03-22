public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    Course biyoloji;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya,Course biyoloji) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.biyoloji = biyoloji;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya, int biyoloji) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat*0.70;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik*0.70;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya*0.70;
        }
        if (biyoloji>=0 && biyoloji<=100){
            this.biyoloji.note = biyoloji*0.70;
        }

    }

    public void performanceNote (int perfMat, int perfFizik, int perfKimya, int perfBiyoloji) {
        if (perfMat >=0 && perfMat<=100 ) {
            this.mat.perfNote= perfMat*0.30;
        }
        if (perfFizik >=0 && perfFizik<=100 ) {
            this.fizik.perfNote = perfFizik * 0.30;
        }
        if (perfKimya >=0 && perfKimya<=100 ) {
            this.kimya.perfNote = perfKimya * 0.30;
        }
        if (perfBiyoloji>=0 && perfBiyoloji<=100){
            this.biyoloji.note = perfBiyoloji*0.70;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.fizik.note + this.kimya.note + this.mat.note + this.mat.perfNote +
                this.kimya.perfNote + this.fizik.perfNote + this.biyoloji.note + this.biyoloji.perfNote) / 4;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notları : " + this.mat.note +" - "+ this.mat.perfNote);
        System.out.println("Fizik Notları : " + this.fizik.note +" - "+ this.fizik.perfNote);
        System.out.println("Kimya Notları: " + this.kimya.note +" - "+ this.kimya.perfNote);
        System.out.println("Biyoloji Notları: " + this.biyoloji.note +" - "+ this.biyoloji.perfNote);
    }

}
