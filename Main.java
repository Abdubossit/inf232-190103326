class Course{
    private String courseName;
    private String[] students = new String[30];
    private int numberOfStudents;


    public Course(String courseName){
      this.courseName = courseName;
    }
    public void addStudent(String student){
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    public String[] getStudents(){
        return students;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    public String getCourseName(){
        return courseName;
    }
    public void dropStudent(String student){
        for (int i = 0; i < students.length; i++) {

            if (student.equalsIgnoreCase(students[i])) {

                students[i] = null;
                numberOfStudents--;
                while (i < numberOfStudents) {
                    students[i] = students[i + 1];
                    i++;
                }
                break;
            }
        }
    }
    public void clear(){
        students = new String[25];
        numberOfStudents = 0;
    }

    public Object clone() {
        Course course = null;
        try {
            course = (Course)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        course.students = students.clone();
        course.courseName = new String(courseName);

        return course;
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Курс аты : ");
        String course_name = in.next();
        Course course = new Course(course_name);

        System.out.print("Курстагы орын саны ");
        int num = in.nextInt();

        for (int i = 0; i < num; i++) {
            course.addStudent("Student " + (i + 1));
        }


        String[] students = course.getStudents();
        System.out.println(course.getCourseName());
        for (int i = 0; i < students.length; i++) {
            System.out.printf("%-12s ", students[i]);
            if ((i + 1) % 5 == 0) {
                System.out.printf("\n");
            }

        }
        System.out.println("СтуденттіҢ жалпы саны " + course.getNumberOfStudents());

        System.out.println("\nЕкі студетті тізімнен шыҒарыҢыз..");
        System.out.print("ШыҒуҒа тиісті біріші студеттіҢ номері: ");
        int n1 = in.nextInt();
        System.out.print("ШыҒуҒа тиісті  екінші студеттіҢ номері: ");
        int n2 = in.nextInt();
        course.dropStudent("Student " + (n1));
        course.dropStudent("Student " + (n2));

        System.out.println("Студеттер тізімі...\n");
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.printf("%-12s ", students[i]);

            if ((i + 1) % 5 == 0) {
                System.out.printf("\n");
            }
        }
        System.out.println("\nҚалҒан студеттер саны " + course.getNumberOfStudents());

    }
}
