import java.util.Set;

public class Student {
    private String name;
    private String soname;
    private int age;
    private int groupID;
    private String targetOfTraining;
    private int problemSolution;
    private int moduleSolution;
    private boolean experience;

    public Student(String name, String soname, int age) {
        this(name, soname, age, 0, 0, 0, false);
    }

    public Student(String name, String soname, int age, int groupID, int problemSolution, int moduleSolution, boolean experience) {
        this.name = name;
        this.soname = soname;
        this.age = age;
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
