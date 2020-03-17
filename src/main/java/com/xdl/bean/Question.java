package com.xdl.bean;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

public class Question implements Serializable {
    private Integer id;
    private String desccription;
    private Integer question_type_id;
    private Integer points;
    private Integer group_id;
    private Integer is_visible;
    private Timestamp create_time;
    private String creator;
    private Timestamp last_modify;
    private String answer;
    private Integer expose_times;
    private Integer right_times;
    private Integer wrong_times;
    private Double difficulty;
    private String analysis;
    private String reference;
    private String examing_point;
    private String keyword;
    private List<Integer> pointList;

    public Question() {
    }

    public Question(Integer id, String desccription, Integer question_type_id, Integer points, Integer group_id, Integer is_visible, Timestamp create_time, String creator, Timestamp last_modify, String answer, Integer expose_times, Integer right_times, Integer wrong_times, Double difficulty, String analysis, String reference, String examing_point, String keyword, List<Integer> pointList) {
        this.id = id;
        this.desccription = desccription;
        this.question_type_id = question_type_id;
        this.points = points;
        this.group_id = group_id;
        this.is_visible = is_visible;
        this.create_time = create_time;
        this.creator = creator;
        this.last_modify = last_modify;
        this.answer = answer;
        this.expose_times = expose_times;
        this.right_times = right_times;
        this.wrong_times = wrong_times;
        this.difficulty = difficulty;
        this.analysis = analysis;
        this.reference = reference;
        this.examing_point = examing_point;
        this.keyword = keyword;
        this.pointList = pointList;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", desccription='" + desccription + '\'' +
                ", question_type_id=" + question_type_id +
                ", points=" + points +
                ", group_id=" + group_id +
                ", is_visible=" + is_visible +
                ", create_time=" + create_time +
                ", creator='" + creator + '\'' +
                ", last_modify=" + last_modify +
                ", answer='" + answer + '\'' +
                ", expose_times=" + expose_times +
                ", right_times=" + right_times +
                ", wrong_times=" + wrong_times +
                ", difficulty=" + difficulty +
                ", analysis='" + analysis + '\'' +
                ", reference='" + reference + '\'' +
                ", examing_point='" + examing_point + '\'' +
                ", keyword='" + keyword + '\'' +
                ", pointList=" + pointList +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDesccription() {
        return desccription;
    }

    public void setDesccription(String desccription) {
        this.desccription = desccription;
    }

    public Integer getQuestion_type_id() {
        return question_type_id;
    }

    public void setQuestion_type_id(Integer question_type_id) {
        this.question_type_id = question_type_id;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Integer group_id) {
        this.group_id = group_id;
    }

    public Integer getIs_visible() {
        return is_visible;
    }

    public void setIs_visible(Integer is_visible) {
        this.is_visible = is_visible;
    }

    public Timestamp getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Timestamp create_time) {
        this.create_time = create_time;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Timestamp getLast_modify() {
        return last_modify;
    }

    public void setLast_modify(Timestamp last_modify) {
        this.last_modify = last_modify;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getExpose_times() {
        return expose_times;
    }

    public void setExpose_times(Integer expose_times) {
        this.expose_times = expose_times;
    }

    public Integer getRight_times() {
        return right_times;
    }

    public void setRight_times(Integer right_times) {
        this.right_times = right_times;
    }

    public Integer getWrong_times() {
        return wrong_times;
    }

    public void setWrong_times(Integer wrong_times) {
        this.wrong_times = wrong_times;
    }

    public Double getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Double difficulty) {
        this.difficulty = difficulty;
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getExaming_point() {
        return examing_point;
    }

    public void setExaming_point(String examing_point) {
        this.examing_point = examing_point;
    }

    public List<Integer> getPointList() {
        return pointList;
    }

    public void setPointList(List<Integer> pointList) {
        this.pointList = pointList;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
