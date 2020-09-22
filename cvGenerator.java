package cvGenerator;

import java.util.ArrayList;
import java.util.List;

public class cvGenerator {

    public static void main(String[] args) {        
        // Initialize subject
        String aboutMe = "Műszaki szakszövegíróként kezdett el először igazán érdekelni a szoftverfejlesztés, programozás világa.\n"
                + "Kíváncsi lettem, hogy azon felül, hogy mit tud egy program, vajon hogyan csinálja azt.\n"
                + "Így vágtam bele a kódolás tanulásába, először autodidaktaként, később egy online iskola diákja lettem.\n"
                + "A tananyag elsajátítása közben a kezdeti érdeklődésem kibontakozott, és a tanulás a szenvedélyemmé vált.\n"
                + "Elköteleződtem képességeim fejlesztése mellett, melyeket egy sikeres céggel együttműködve képzelek el a továbbiakban.";
        Person subject = new Person("Balázs Paraszthy", "paraszthybalazs@gmail.com", "+3630-176-2651", "https://github.com/MarcusCalgar", "https://bit.ly/2RDF17x", aboutMe);
        
        //Initialize studies
        List<Study> studies = new ArrayList<>();
        Study firstSchool = new Study("StudiCore Online", 2019, 2020);
        Study secondSchool = new Study("The Odin Project", 2018, 2019);
        studies.add(firstSchool);
        studies.add(secondSchool);
        
        // Initialize Projects
        List<Project> projects = new ArrayList<>();
        Project firstProject = new Project("Költségvetés Tervező", "(https://bit.ly/35NuDSU)", "Költségvetés nyilvántartó program amely lehetővé teszi egy család pénzmozgásának nyomon követését.");
        Project secondProject = new Project("Tennivaló kezelő", "(https://bit.ly/2ZPZUkl)", "Konzolból működtethető tennivaló kezelő alkalmazás.");
        Project thirdProject = new Project("Körlevél küldő", "(https://bit.ly/3hHXt9v)", "Konzolos körlevél előállító alkalmazás, amely az előállított leveleket fájlba írja.");
        Project fourthProject = new Project("Önéletrajz generátor", "(https://bit.ly/3hOPmrM)", "CV készítő alkalmazás, amivel a jelen önéletrajz is előállítható.");
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
        Workplace semcon = new Workplace(2017, 2020, "Semcon Kft.", "Technical Writer", "Feladatom volt egy vezető távközlési cég mérnökeivel "
                + "együttműködve két különböző szoftveres termék dokumentációjának írása, fejlesztése, frissítése. "
                + "Emellett részt vettem különböző, a termékek által használt technológiákhoz tartozó tréningeken és továbbképzéseken.");
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
