package com.xdl.bean;

import java.io.Serializable;

public class QuestionType implements Serializable {
    private Integer id;
    private String name;
    private Integer subjective;

    public QuestionType() {
    }

    public QuestionType(int id, String name, int subjective) {
        this.id = id;
        this.name = name;
        this.subjective = subjective;
    }

    @Override
    public String toString() {
        return "QuestionType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subjective=" + subjective +
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

    public int getSubjective() {
        return subjective;
    }

    public void setSubjective(int subjective) {
        this.subjective = subjective;
    }
}
