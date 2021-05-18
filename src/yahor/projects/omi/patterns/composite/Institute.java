package yahor.projects.omi.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Institute implements IResearchGroup{

    private String description;
    private String head;
    List<IResearchGroup> researchGroups;

    public Institute(String description, String head){
        this.description = description;
        this.head = head;
        this.researchGroups = new ArrayList<IResearchGroup>();
    }


    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public String getHead() {
        return this.head;
    }

    @Override
    public int getEmployeeNum() {
        int number = 0;
        for(IResearchGroup researchGroup : researchGroups){
            number = researchGroup.getEmployeeNum();
        }
        return number;
    }

    @Override
    public int getPublicationsNum() {
        int number = 0;
        for(IResearchGroup researchGroup : researchGroups){
            number = researchGroup.getPublicationsNum();
        }
        return number;
    }

}