package me.whiteship.designpatterns._03_behavioral_patterns._20_state._02_after;

public interface State {

    void addReview(String review, Student student);

    void addStudent(Student student);
}
