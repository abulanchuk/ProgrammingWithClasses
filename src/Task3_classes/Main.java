package Task3_classes;

public class Main {
    public static void main(String[] args) {

        Student[] arrayStudents = new Student[9];
        arrayStudents[0] = new Student("Ivanov", "A.S", 1, new int[]{1, 4, 3, 2, 4});
        arrayStudents[1] = new Student("Petrov", "M.A", 7, new int[]{5, 3, 10, 9, 8});
        arrayStudents[2] = new Student("kozlov", "K.H", 8, new int[]{10, 9, 10, 9, 8});
        arrayStudents[3] = new Student("Polotos", "S.S", 177, new int[]{5, 3, 10, 4, 8});
        arrayStudents[4] = new Student("Solor", "F.K", 165, new int[]{10, 10, 10, 9, 10});
        arrayStudents[5] = new Student("Smith", "L.U", 13, new int[]{10, 9, 10, 9, 9});
        arrayStudents[6] = new Student("Lerema", "N.R", 1898, new int[]{5, 3, 2, 9, 8});
        arrayStudents[7] = new Student("Masherovich", "M.S", 3, new int[]{5, 3, 6, 9, 8});
        arrayStudents[8] = new Student("Peto", "D.G", 561, new int[]{5, 3, 8, 9, 0});

        for (int i = 0; i < arrayStudents.length; i++) {
            if (arrayStudents[i].checkStudent() == true) {
                System.out.println("Student's surname: " + arrayStudents[i].surname + " and number of group " + arrayStudents[i].numberOfGroup);
            }
        }
    }
}
