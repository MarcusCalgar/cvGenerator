package cvGenerator;

public class Person {

    private String name;
    private String email;
    private String phoneNumber;
    private String gitHubAddress;
    private String linkedInPage;
    private String aboutMe;

    public Person(String name, String email, String phoneNumber, String gitHubAddress, String linkedInPage, String aboutMe) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gitHubAddress = gitHubAddress;
        this.linkedInPage = linkedInPage;
        this.aboutMe = aboutMe;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setGitHubAddress(String gitHubAddress) {
        this.gitHubAddress = gitHubAddress;
    }

    public String getGitHubAddress() {
        return gitHubAddress;
    }

    public void setLinkedInPage(String linkedInPage) {
        this.linkedInPage = linkedInPage;
    }

    public String getLinkedInPage() {
        return linkedInPage;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public String getAboutMe() {
        return aboutMe;
    }
    
}
