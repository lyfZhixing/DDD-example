package org.example.ddd.entry.scrum.domain;

import org.example.ddd.common.event.DomainEvent;

public class BacklogCommitted extends DomainEvent {

    private final BacklogItem backlogItem;

    public BacklogItem getBacklogItem() {
        return this.backlogItem;
    }

    public BacklogCommitted(Object source, BacklogItem item) {
        super(source);
        this.backlogItem = item;
    }
}
