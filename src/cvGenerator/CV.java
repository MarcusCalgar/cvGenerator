package cvGenerator;

import java.util.List;

public class CV {

    private Person subject;
    private List<Study> studies;
    private List<Project> projects;
    private List<Experience> experience;
    private List<Workplace> workplaces;
    private List<Reference> references;

    public CV(Person subject, List<Study> studies, List<Project> projects, List<Experience> experience, List<Workplace> workplaces, List<Reference> references) {
        this.subject = subject;
        this.studies = studies;
        this.projects = projects;
        this.experience = experience;
        this.workplaces = workplaces;
        this.references = references;
    }

    public Person getSubject() {
        return subject;
    }

    public void setSubject(Person subject) {
        this.subject = subject;
    }

    public List<Study> getStudies() {
        return studies;
    }

    public void setStudies(List<Study> studies) {
        this.studies = studies;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public List<Experience> getExperience() {
        return experience;
    }

    public void setExperience(List<Experience> experience) {
        this.experience = experience;
    }

    public List<Workplace> getWorkplaces() {
        return workplaces;
    }

    public void setWorkplaces(List<Workplace> workplaces) {
        this.workplaces = workplaces;
    }

    public List<Reference> getReferences() {
        return references;
    }

    public void setReferences(List<Reference> references) {
        this.references = references;
    }
    
}
