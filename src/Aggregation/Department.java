package Aggregation;

import java.util.*;

public class Department
{
    private String name;
    private List<Student> students;
    Department(String name, List<Student> students)
    {
        this.name = name;
        this.students = students;
    }

    public List<Student> getStudents()
    {
        return students;
    }


}
