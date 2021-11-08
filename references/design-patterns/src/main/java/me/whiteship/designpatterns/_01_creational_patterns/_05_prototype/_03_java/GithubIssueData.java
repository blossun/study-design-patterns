package me.whiteship.designpatterns._01_creational_patterns._05_prototype._03_java;

public class GithubIssueData {

    private int id;

    private String title;

    private String repositoryUser;

    private String repositoryName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRepositoryUser() {
        return repositoryUser;
    }

    public void setRepositoryUser(String repositoryUser) {
        this.repositoryUser = repositoryUser;
    }

    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    @Override
    public String toString() {
        return "GithubIssueData{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", repositoryUser='" + repositoryUser + '\'' +
                ", repositoryName='" + repositoryName + '\'' +
                '}';
    }
}
