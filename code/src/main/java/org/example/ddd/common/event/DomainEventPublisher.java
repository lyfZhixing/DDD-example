package org.example.ddd.common.event;

import java.util.ArrayList;
import java.util.List;

public class DomainEventPublisher {

    private List<DomainListener> listeners = new ArrayList<>();

    private static final DomainEventPublisher instance = new DomainEventPublisher();

    public static DomainEventPublisher instance() {
        return instance;
    }

    public void addListener(DomainListener listener) {
        this.listeners.add(listener);
    }


    public void publishEvent(DomainEvent event) {
        for (DomainListener listener : listeners) {
            listener.onDomainEvent(event);
        }
    }
}
