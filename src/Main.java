import OOP.Gryffindor;
import OOP.Hogwarts;
import OOP.Hufflepuff;
import OOP.Ravenclaw;
import OOP.Slytherin;
import static OOP.Gryffindor.compareGryffindorStudents;
import static OOP.Hufflepuff.compareHufflepuffStudents;
import static OOP.Ravenclaw.compareRavenclawStudents;
import static  OOP.Slytherin.compareSlytherinStudents;

public class Main {
    public static void main(String[] args) {
        Slytherin draco = new Slytherin("Драко Малфой", 14, 28,
                10, 45, 55, 67, 91);

        Slytherin grehem = new Slytherin("Грэхэм Монтегю", 11, 23,
                66, 22, 75, 45, 38);

        Slytherin gregori = new Slytherin("Грегори Гойл", 35, 83,
                42, 51, 48, 69, 91);


        Ravenclaw chou = new Ravenclaw("Чжоу Чанг", 15, 45,
                41, 64, 42, 25);

        Ravenclaw padma = new Ravenclaw("Падма Патил", 15, 25,
                75, 40, 80, 29);

        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 25, 44,
                50, 63, 72, 80);


        Hufflepuff zakharia = new Hufflepuff("Захария Смит", 13, 24,
                75, 65, 45);

        Hufflepuff sedrik = new Hufflepuff("Седрик Диггори", 33, 41,
                55, 23, 81);

        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 41,
                24, 61, 70, 22);


        Gryffindor harry = new Gryffindor("Гарри Поттер", 30, 28,
                76, 48, 97);

        Gryffindor hermiona = new Gryffindor("Гермиона Грейнджер", 72, 64,
                71, 22, 63);

        Gryffindor ron = new Gryffindor("Рон Уизли", 81, 45,
                25, 18, 20);
        print(draco);
        print(chou);
        print(zakharia);
        print(harry);
        System.out.println();
        //сравнивают между собой учеников одного факультета по свойствам
        (harry).compareGryffindor(hermiona);
        System.out.println();

        (zakharia).compareHufflepuff(sedrik);
        System.out.println();

        (chou).compareRavenclaw(padma);
        System.out.println();

        (draco).compareSlytherin(gregori);
        System.out.println();


        compareGryffindorStudents(harry, ron);
        System.out.println();

        compareHufflepuffStudents(zakharia, sedrik);
        System.out.println();

        compareRavenclawStudents(padma, chou);
        System.out.println();

        compareSlytherinStudents(draco, gregori);
        System.out.println();

        harry.compareHogwarts(draco);
        System.out.println();

        chou.compareHogwarts(gregori);
        System.out.println();

    }

    public static void print(Hogwarts students) {
        System.out.println(students);
    }
    }
