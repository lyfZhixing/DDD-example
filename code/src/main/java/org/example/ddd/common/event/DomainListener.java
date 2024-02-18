package org.example.ddd.common.event;

import java.util.EventListener;

public interface DomainListener<E extends DomainEvent> extends EventListener {
    void onDomainEvent(E event);
}
