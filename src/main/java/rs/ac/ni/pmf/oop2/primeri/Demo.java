package rs.ac.ni.pmf.oop2.primeri;

public class Demo {
    /**
     * The main method serves as the entry point to the application
     * and demonstrates the usage of the Student class by creating an instance
     * and printing it to the console.
     *
     * @param args command-line arguments passed to the program
     */
    public static void main(final String[] args) {
        final Student student = new Student(
                1,
                "Petar",
                "Petrovic",
                "1232131231232",
                null,
                null,
                    null,
                null,
                null);
        System.out.println(student);
    }
}
