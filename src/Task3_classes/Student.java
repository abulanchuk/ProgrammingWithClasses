package Task3_classes;

public class Student {
    String surname;
    String initials;
    int numberOfGroup;
    int[] academicPerformance = new int[5];

    public Student(String surname, String initials, int numberOfGroup, int[] academicPerformance) {
        this.surname = surname;
        this.initials = initials;
        this.numberOfGroup = numberOfGroup;
        this.academicPerformance = academicPerformance;
    }

    public boolean checkStudent() {
        for (int i = 0; i < academicPerformance.length; i++) {
            if (academicPerformance[i] < 9) {
                return false;
            }
        }
        return true;
    }

    public String getSurname() {
        return surname;
    }


    public int getNumberOfGroup() {
        return numberOfGroup;
    }

}
