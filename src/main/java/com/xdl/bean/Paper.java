package com.xdl.bean;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

public class Paper implements Serializable {
    private int id;
    private String name;
    private int duration;
    private int total_point;
    private int pass_point;
    private boolean is_visible;
    private int status;
    private Timestamp create_time;
    private String summary;
    private int is_subjective;
    private String answer_sheet;
    private String creator;
    private double difficulty;
    private List<Question> questions;

    public Paper() {
    }

    public Paper(int id, String name, int duration, int total_point, int pass_point, boolean is_visible, int status, Timestamp create_time, String summary, int is_subjective, String answer_sheet, String creator, double difficulty, List<Question> questions) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.total_point = total_point;
        this.pass_point = pass_point;
        this.is_visible = is_visible;
        this.status = status;
        this.create_time = create_time;
        this.summary = summary;
        this.is_subjective = is_subjective;
        this.answer_sheet = answer_sheet;
        this.creator = creator;
        this.difficulty = difficulty;
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", duration=" + duration +
                ", total_point=" + total_point +
                ", pass_point=" + pass_point +
                ", is_visible=" + is_visible +
                ", status=" + status +
                ", create_time=" + create_time +
                ", summary='" + summary + '\'' +
                ", is_subjective=" + is_subjective +
                ", answer_sheet='" + answer_sheet + '\'' +
                ", creator='" + creator + '\'' +
                ", difficulty=" + difficulty +
                ", questions=" + questions +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getTotal_point() {
        return total_point;
    }

    public void setTotal_point(int total_point) {
        this.total_point = total_point;
    }

    public int getPass_point() {
        return pass_point;
    }

    public void setPass_point(int pass_point) {
        this.pass_point = pass_point;
    }

    public boolean isIs_visible() {
        return is_visible;
    }

    public void setIs_visible(boolean is_visible) {
        this.is_visible = is_visible;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Timestamp getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Timestamp create_time) {
        this.create_time = create_time;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getIs_subjective() {
        return is_subjective;
    }

    public void setIs_subjective(int is_subjective) {
        this.is_subjective = is_subjective;
    }

    public String getAnswer_sheet() {
        return answer_sheet;
    }

    public void setAnswer_sheet(String answer_sheet) {
        this.answer_sheet = answer_sheet;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public double getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(double difficulty) {
        this.difficulty = difficulty;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
