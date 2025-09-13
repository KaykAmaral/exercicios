package exercicios.ex17_1.entities;

import java.util.Objects;

public class Student {

    private int code;

    public Student(int code) { setCode(code); }

    private void setCode(int code) { this.code = code; }
    private int getCode() { return this.code; }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return code == student.code;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(code);
    }

}