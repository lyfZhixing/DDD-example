package org.example.ddd.entry.scrum.data;

import org.example.ddd.entry.scrum.BacklogItemStatusType;

/**
 * 积压工作项 <br>
 * 纯数据模型 getter setter
 */
public class BacklogItem {

    /** 工作项id */
    private String id;
    /** 冲刺id */
    private String sprintId;
    /** 任务状态 */
    private BacklogItemStatusType status;

    public BacklogItem(String id) {
        this.id = id;
    }

    public void setSprintId(String sprintId) {
        this.sprintId = sprintId;
    }

    public void setStatus(BacklogItemStatusType status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getSprintId() {
        return sprintId;
    }

    public BacklogItemStatusType getStatus() {
        return status;
    }

}
