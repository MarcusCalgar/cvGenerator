package cvGenerator;

import java.util.ArrayList;
import java.util.List;

public class cvGenerator {

    public static void main(String[] args) {        
        // Initialize subject
        String aboutMe = "I was working as a technical writer when the world of programming first started to interest me.\n"
                + "I got curious that apart from what a program does, how does it do it. Therefore, I started to learn coding.\n"
                + "I chose the self-taught route in the beginning, later, I switched to an online school.\n"
                + "During my studies, my first interest blossomed and became a passion for learning.\n"
                + "I set my mind on honing my programming skills, which I would like to continue alongside a successful company.";
        Person subject = new Person("Balázs Paraszthy", "paraszthybalazs@gmail.com", "+3630-176-2651", "https://github.com/MarcusCalgar", "https://bit.ly/2RDF17x", aboutMe);
        
        //Initialize studies
        List<Study> studies = new ArrayList<>();
        Study firstSchool = new Study("StudiCore Online", 2019, 2020);
        Study secondSchool = new Study("The Odin Project", 2018, 2019);
        studies.add(firstSchool);
        studies.add(secondSchool);
        
        // Initialize Projects
        List<Project> projects = new ArrayList<>();
        Project firstProject = new Project("Finance planner", "(https://bit.ly/35NuDSU)", "Makes tracking the finances of a family or individual more easy.");
        Project secondProject = new Project("To-do app", "(https://bit.ly/2ZPZUkl)", "Lightweight to-do app that works from the console.");
        Project thirdProject = new Project("Email sender", "(https://bit.ly/3hHXt9v)", "Email sender that can send mails to multiple recipients at once. It writes the generated letters into text files.");
        Project fourthProject = new Project("CV generator", "(https://bit.ly/3hOPmrM)", "More of a funny app, that can create a CV such as this one from the console.");
        projects.add(firstProject);
        projects.add(secondProject);
        projects.add(thirdProject);
        projects.add(fourthProject);

        //Initialize experience
        List<Experience> professionalExperiences = new ArrayList<>();

        ArrayList<String> progLanguages = new ArrayList<>();
        progLanguages.add("Java 8");
        progLanguages.add("HTML 5");
        progLanguages.add("CSS 3");
        progLanguages.add("JavaScript");
        Experience programmingLanguages = new Experience("Programming Languages", progLanguages);
        professionalExperiences.add(programmingLanguages);

        ArrayList<String> gui = new ArrayList<>();
        gui.add("Swing");
        Experience knownGUIs = new Experience("GUI", gui);
        professionalExperiences.add(knownGUIs);

        ArrayList<String> unitTesting = new ArrayList<>();
        unitTesting.add("JUnit");
        Experience unitTest = new Experience("Unit Testing", unitTesting);
        professionalExperiences.add(unitTest);

        ArrayList<String> database = new ArrayList<>();
        database.add("MySQL");
        database.add("JDBC");
        Experience databaseTechnologies = new Experience("Database Technologies", database);
        professionalExperiences.add(databaseTechnologies);

        ArrayList<String> version = new ArrayList<>();
        version.add("GIT");
        Experience versionControl = new Experience("Version Control", version);
        professionalExperiences.add(versionControl);

        ArrayList<String> miscTech = new ArrayList<>();
        miscTech.add("NetBeans IDE");
        miscTech.add("NClass UML Editor");
        miscTech.add("yEd Graph Editor");
        Experience miscTechnologies = new Experience("Other Technologies", miscTech);
        professionalExperiences.add(miscTechnologies);

        ArrayList<String> language = new ArrayList<>();
        language.add("Fluent English knowledge");
        Experience spokenLanguages = new Experience("Language", language);
        professionalExperiences.add(spokenLanguages);

        ArrayList<String> otherKnowledge = new ArrayList<>();
        otherKnowledge.add("Agile methodologies");
        otherKnowledge.add("Basic Linux user experience");
        Experience other = new Experience("Other Knowledge", otherKnowledge);
        professionalExperiences.add(other);

        //Initialize workplaces
        List<Workplace> workplaces = new ArrayList<>();
        Workplace semcon = new Workplace(2017, 2020, "Semcon Kft.", "Technical Writer", "My task was to cooperate with the software developers of a leading telecommunication company,\n"
                + "in order to keep the documentation of two separate software products modern, fresh and up-to-date.\n"
                + "I also participated in trainings which were realted to the technologies the software used.");
        workplaces.add(semcon);
        
        //Initialize references
        List<Reference> references = new ArrayList<>();
        Reference danielP = new Reference("Dániel Pasztuhov", "CTO at StudiCore Oktatási Kft.", "daniel.pasztuhov@studicore.hu");
        Reference peterV = new Reference("Péter Varga", "Teacher at StudiCore Oktatási Kft.", "varga.peter@studicore.hu");
        references.add(danielP);
        references.add(peterV);

        //Initialize CV
        CV curriculumVitae = new CV(subject, studies, projects, professionalExperiences, workplaces, references);

        //Generate CV
        showPerson(curriculumVitae);
        insertLine(2);
        showStudies(curriculumVitae);
        insertLine(2);
        showProjects(curriculumVitae);
        insertLine(2);
        showExperience(curriculumVitae);
        insertLine(2);
        showWorkplaces(curriculumVitae);
        insertLine(2);
        showReferences(curriculumVitae);
    }

    public static void showPerson(CV cv) {
        System.out.println("Name: " + cv.getSubject().getName());
        insertLine(1);
        System.out.println("Email: " + cv.getSubject().getEmail());
        System.out.println("Phone: " + cv.getSubject().getPhoneNumber());
        insertLine(1);
        System.out.println("GitHub: " + cv.getSubject().getGitHubAddress());
        System.out.println("LinkedIn: " + cv.getSubject().getLinkedInPage());
        insertLine(2);
        System.out.println("About Me");
        insertLine(1);
        System.out.printf("%40s%n", cv.getSubject().getAboutMe());
    }

    public static void showStudies(CV cv) {
        System.out.println("Studies");
        insertLine(1);
        cv.getStudies().forEach((Study study) -> {
            System.out.println(study.getName() + " - " + study.getStartingYear() + " - " + study.getEndYear());
        });
    }

    public static void showProjects(CV cv) {
        System.out.println("Projects");
        insertLine(1);
        cv.getProjects().forEach((Project project) -> {
            System.out.println(project.getName());
            System.out.println(project.getLink());
            System.out.println(project.getDescription());
            insertLine(1);
        });
    }

    public static void showExperience(CV cv) {
        System.out.println("Experience");
        insertLine(1);
        cv.getExperience().forEach((Experience exp) -> {
            System.out.println(exp.getType());
            exp.getItems().forEach((String item) -> {
                System.out.println(" - " + item);
            });
            insertLine(1);
        });
    }

    public static void showWorkplaces(CV cv) {
        System.out.println("Relevant workplaces");
        insertLine(1);
        cv.getWorkplaces().forEach((Workplace place) -> {
            System.out.println(place.getStartYear() + " - " + place.getEndYear() + " " + place.getCompanyName() + " - " + place.getJobTitle());
            insertLine(1);
            System.out.println(place.getJobDescription());
        });
    }
    
    public static void showReferences(CV cv){
        System.out.println("References");
        insertLine(1);
        cv.getReferences().forEach((Reference ref)->{
            System.out.println(ref.getName());
            System.out.println(ref.getTitle());
            System.out.println(ref.getEmail());
            insertLine(1);
        });        
    }

    public static void insertLine(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("");
        }
    }
}
