package org.example.ddd.entry.scrum.domain;

import org.example.ddd.common.event.DomainEventPublisher;
import org.example.ddd.entry.scrum.BacklogItemStatusType;

/**
 * 积压工作项 <br>
 * 领域模型
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

    public String getId() {
        return id;
    }

    public String getSprintId() {
        return sprintId;
    }

    public BacklogItemStatusType getStatus() {
        return status;
    }
    public void commitTo(String sprintId) {
        this.sprintId = sprintId;
        this.status = BacklogItemStatusType.COMMITTED;
        // 发布事件 ……
        DomainEventPublisher.instance().addListener(new BacklogItemListener());
        DomainEventPublisher.instance().publishEvent(new BacklogCommitted(this, this));
    }
}
