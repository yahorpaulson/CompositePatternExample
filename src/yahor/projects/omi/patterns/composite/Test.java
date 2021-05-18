package yahor.projects.omi.patterns.composite;

public class Test {
    public static void main(String[] args) {
        Institute institute = new Institute("InstituteDescription1", "Siarheyeu");
        ResearchGroup researchGroup1 = new ResearchGroup("ResearchGroupDescription1.1", "Human1", 12,124);
        ResearchGroup researchGroup2 = new ResearchGroup("ResearchGroupDescription1.2", "Human2", 32, 421);
        System.out.println(institute.getDescription());
        System.out.println(researchGroup1.getHead());
        System.out.println(researchGroup2.getEmployeeNum());
    }
}
