public class LecturerData19 {
    public static void showAllLecturerData(Lecturer19[] lectArray) {
        System.out.println("================================================================================");
        System.out.printf("| %-10s | %-20s | %-10s | %-5s |\n", "ID", "Name", "Gender", "Age");
        
        for (Lecturer19 lecturer : lectArray) {
            System.out.printf("| %-10s | %-20s | %-10s | %-5d |\n",
            lecturer.id, lecturer.name, (lecturer.gender ? "Male" : "Female"), lecturer.age);

            // System.out.println("ID: " + lecturer.getId() + ", Name: " + lecturer.getName() + ", Gender: "
            //         + (lecturer.getGender() ? "Male" : "Female") + ", Age: " + lecturer.getAge());
        }
    }

    public static void countLecturerByGender(Lecturer19[] lectArray) {
        int maleCount = 0, femaleCount = 0;
        for (Lecturer19 lecturer : lectArray) {
            if (lecturer.gender)
                maleCount++;
            else
                femaleCount++;
        }
        System.out.println("Male Lecturers: " + maleCount);
        System.out.println("Female Lecturers: " + femaleCount);
    }

    public static void averageLectureAgeByGender(Lecturer19[] lectArray) {
        int maleAgeSum = 0, femaleAgeSum = 0, maleCount = 0, femaleCount = 0;
        for (Lecturer19 lecturer : lectArray) {
            if (lecturer.gender) {
                maleAgeSum += lecturer.age;
                maleCount++;
            } else {
                femaleAgeSum += lecturer.age;
                femaleCount++;
            }
        }
        System.out.println("Average Age of Male Lecturers: " + (maleCount > 0 ? (maleAgeSum / maleCount) : "N/A"));
        System.out.println(
                "Average Age of Female Lecturers: " + (femaleCount > 0 ? (femaleAgeSum / femaleCount) : "N/A"));
    }

    public static void showOldestLecturerInfo(Lecturer19[] lecturerArray) {
        Lecturer19 oldest = lecturerArray[0];
        for (Lecturer19 lecturer : lecturerArray) {
            if (lecturer.age > oldest.age) {
                oldest = lecturer;
            }
        }
        System.out.println("Most Senior Lecturer - ID: " + oldest.id + ", Name: " + oldest.name + ", Age: "
                + oldest.age);
    }

    public static void showYoungestLecturerInfo(Lecturer19[] lecturerArray) {
        Lecturer19 youngest = lecturerArray[0];
        for (Lecturer19 lecturer : lecturerArray) {
            if (lecturer.age < youngest.age) {
                youngest = lecturer;
            }
        }
        System.out.println("Youngest Lecturer - ID: " + youngest.id + ", Name: " + youngest.name + ", Age: "
                + youngest.age);
    }

}
