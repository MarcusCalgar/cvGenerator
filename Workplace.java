package cvGenerator;

public class Workplace {
 private int startYear;
    private int endYear;
    private String companyName;
    private String jobDescription;

    public Workplace(int startYear, int endYear, String companyName, String jobDescription) {
        this.startYear = startYear;
        this.endYear = endYear;
        this.companyName = companyName;
        this.jobDescription = jobDescription;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
}
