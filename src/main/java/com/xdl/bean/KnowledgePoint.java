package com.xdl.bean;

import java.io.Serializable;
import java.util.Objects;

public class KnowledgePoint implements Serializable {
    private Integer point_id;
    private String point_name;
    private String memo;
    private Integer state;

    public KnowledgePoint() {
    }

    public KnowledgePoint(Integer point_id, String point_name, String memo, Integer state) {
        this.point_id = point_id;
        this.point_name = point_name;
        this.memo = memo;
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KnowledgePoint that = (KnowledgePoint) o;

        if (!Objects.equals(point_id, that.point_id)) return false;
        if (!Objects.equals(point_name, that.point_name)) return false;
        if (!Objects.equals(memo, that.memo)) return false;
        return Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {
        int result = point_id != null ? point_id.hashCode() : 0;
        result = 31 * result + (point_name != null ? point_name.hashCode() : 0);
        result = 31 * result + (memo != null ? memo.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "KnowledgePoint{" +
                "point_id=" + point_id +
                ", point_name='" + point_name + '\'' +
                ", memo='" + memo + '\'' +
                ", state=" + state +
                '}';
    }

    public Integer getPoint_id() {
        return point_id;
    }

    public void setPoint_id(Integer point_id) {
        this.point_id = point_id;
    }

    public String getPoint_name() {
        return point_name;
    }

    public void setPoint_name(String point_name) {
        this.point_name = point_name;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
