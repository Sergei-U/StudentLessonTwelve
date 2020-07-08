import java.util.Set;

public class Student {
    public String name;
    public String soname;
    public int age;
    public int groupID = 0;
    public int problemSolution;
    public int moduleSolution;
    public boolean experience;
    Student newStudent1 = new Student("vasya:", "knopkin", 22);
    Student newStudent2 = new Student("alosha", "masterkin", 24);

    public void setNewStudent1(Student newStudent1) {
        experience = true;
        moduleSolution = 5;
        problemSolution = 6;
    }

    public void setNewStudent2(Student newStudent2) {
        experience = false;
        moduleSolution = 3;
        problemSolution = 1;
    }

    public Student(String name, String soname, int age) {

        this.name = name;
        this.soname = soname;
        this.age = age;
    }

    public Student(int groupID, int problemSolution, int moduleSolution, boolean experience) {
        this.groupID = groupID;
        this.problemSolution = problemSolution;
        this.moduleSolution = moduleSolution;
        this.experience = experience;
    }
    public int getGroupID(){
        return groupID;
    }
    public int getProblemSolution(){
        return problemSolution;
    }
    public int getModuleSolution(){
        return moduleSolution;
    }
    public boolean getExperience(){
        return experience;
    }

}
