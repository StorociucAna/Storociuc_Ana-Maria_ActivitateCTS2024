package sustinereExamen.main;

import sustinereExamen.clase.Student;
import sustinereExamen.clase.SustinereExamen;

public class Main {
    public static void main(String[] args){
        Student student1 = new Student(123, "Pop Denis", "popdenis@stud.ase.ro", 3);
        Student student2 = new Student(126, "Maria Ion", "maria@stud.ase.ro", 3);
        Student student3 = new Student(541, "Vasile Radu", "radu@stud.ase.ro", 3);
        Student student4 = new Student(785, "Stan Ana", "ana@stud.ase.ro", 3);

        SustinereExamen examenPoo = new SustinereExamen("POO");
        SustinereExamen examenCts = new SustinereExamen("CTS");

        examenPoo.inregistrareStudent(student1);
        examenPoo.inregistrareStudent(student2);
        examenPoo.inregistrareStudent(student1);
        examenPoo.inregistrareStudent(student4);
        examenPoo.inregistrareStudent(student3);
        examenPoo.inregistrareStudent(student4);

    }
}
