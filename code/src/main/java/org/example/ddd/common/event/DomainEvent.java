package org.example.ddd.common.event;

import java.util.EventObject;

public class DomainEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public DomainEvent(Object source) {
        super(source);
    }
}
