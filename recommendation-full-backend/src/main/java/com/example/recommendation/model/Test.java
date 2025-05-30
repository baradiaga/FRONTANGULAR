package com.example.recommendation.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tests")
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String chapter;
    private String subject;
    private String student;
    private int score;
    private int maxScore;

    // Getters
    public Long getId() {
        return id;
    }

    public String getChapter() {
        return chapter;
    }

    public String getSubject() {
        return subject;
    }

    public String getStudent() {
        return student;
    }

    public int getScore() {
        return score;
    }

    public int getMaxScore() {
        return maxScore;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setMaxScore(int maxScore) {
        this.maxScore = maxScore;
    }
}