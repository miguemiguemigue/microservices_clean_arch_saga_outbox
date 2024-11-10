package com.food.ordering.system.saga;

import com.food.ordering.system.domain.event.DomainEvent;

public interface SagaStep<T, S extends DomainEvent, U extends DomainEvent> {

    // Regular step in the saga
    S process(T data);

    // Handle compensation in case of failure
    U rollback(T data);
}
