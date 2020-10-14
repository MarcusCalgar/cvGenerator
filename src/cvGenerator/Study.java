package cvGenerator;

public class Study {

    private String name;
    private int startingYear;
    private int endYear;

    public Study(String name, int startingYear, int endYear) {
        this.name = name;
        this.startingYear = startingYear;
        this.endYear = endYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStartingYear() {
        return startingYear;
    }

    public void setStartingYear(int startingYear) {
        this.startingYear = startingYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }
    
    
}
