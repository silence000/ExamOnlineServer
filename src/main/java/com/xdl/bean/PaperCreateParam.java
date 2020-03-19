package com.xdl.bean;

import java.util.HashMap;

public class PaperCreateParam {
    private String paperName; // 试卷名
    private HashMap<Integer, Integer> questionTypeNum; // 试题类型数量
    private HashMap<Integer, Float> questionTypePoint; // 试题类型分数
    private Float difficulty; // 试题难度系数
    private int passPoint; // 及格分数
    private int time; // 试卷持续时间
    private int paperPoint; // 试卷总分
    private String paperType; // 试卷类型

    public PaperCreateParam() {
    }

    public PaperCreateParam(String paperName, HashMap<Integer, Integer> questionTypeNum, HashMap<Integer, Float> questionTypePoint, Float difficulty, int passPoint, int time, int paperPoint, String paperType) {
        this.paperName = paperName;
        this.questionTypeNum = questionTypeNum;
        this.questionTypePoint = questionTypePoint;
        this.difficulty = difficulty;
        this.passPoint = passPoint;
        this.time = time;
        this.paperPoint = paperPoint;
        this.paperType = paperType;
    }

    @Override
    public String toString() {
        return "PaperCreateParam{" +
                "paperName='" + paperName + '\'' +
                ", questionTypeNum=" + questionTypeNum +
                ", questionTypePoint=" + questionTypePoint +
                ", difficulty=" + difficulty +
                ", passPoint=" + passPoint +
                ", time=" + time +
                ", paperPoint=" + paperPoint +
                ", paperType='" + paperType + '\'' +
                '}';
    }

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }

    public HashMap<Integer, Integer> getQuestionTypeNum() {
        return questionTypeNum;
    }

    public void setQuestionTypeNum(HashMap<Integer, Integer> questionTypeNum) {
        this.questionTypeNum = questionTypeNum;
    }

    public HashMap<Integer, Float> getQuestionTypePoint() {
        return questionTypePoint;
    }

    public void setQuestionTypePoint(HashMap<Integer, Float> questionTypePoint) {
        this.questionTypePoint = questionTypePoint;
    }

    public Float getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Float difficulty) {
        this.difficulty = difficulty;
    }

    public int getPassPoint() {
        return passPoint;
    }

    public void setPassPoint(int passPoint) {
        this.passPoint = passPoint;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getPaperPoint() {
        return paperPoint;
    }

    public void setPaperPoint(int paperPoint) {
        this.paperPoint = paperPoint;
    }

    public String getPaperType() {
        return paperType;
    }

    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }
}
