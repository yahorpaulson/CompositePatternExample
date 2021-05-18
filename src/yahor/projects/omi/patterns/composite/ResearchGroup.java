package yahor.projects.omi.patterns.composite;

public class ResearchGroup implements IResearchGroup{

    private String description;
    private String headName;
    private int numOfEmpl;
    private int numOfPubl;

    public ResearchGroup(
            String description,
            String headName,
            int numOfEmpl,
            int numOfPubl
    ){
        this.description = description;
        this.headName = headName;
        this.numOfEmpl = numOfEmpl;
        this.numOfPubl = numOfPubl;
    }


    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public String getHead() {
        return this.headName;
    }

    @Override
    public int getEmployeeNum() {
        return this.numOfEmpl;
    }

    @Override
    public int getPublicationsNum() {
        return this.numOfPubl;
    }
}