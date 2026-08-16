class Student {
    void study() {
        System.out.println("Student is studying");
    }
}

public class Anonymous {
    public static void main(String[] args) {

        new Student().study();
    }
}