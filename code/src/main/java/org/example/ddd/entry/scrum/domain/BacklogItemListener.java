package org.example.ddd.entry.scrum.domain;

import org.example.ddd.common.event.DomainListener;

public class BacklogItemListener implements DomainListener<BacklogCommitted> {
    @Override
    public void onDomainEvent(BacklogCommitted event) {
        BacklogItem backlogItem = event.getBacklogItem();
        System.out.printf("after task commit ---\n" +
                "task id: %s,task status: %s, sprint id: %s",
                backlogItem.getId(), backlogItem.getStatus().toString(), backlogItem.getSprintId());
    }
}
