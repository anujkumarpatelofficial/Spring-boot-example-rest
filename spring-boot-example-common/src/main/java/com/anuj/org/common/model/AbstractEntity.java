package com.anuj.org.common.model;

import com.anuj.org.common.entity.ModifiableEntity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public abstract class AbstractEntity<E extends AbstractEntity<E>> implements ModifiableEntity {
    private static final long serialVersionUID = 1l;
    @Id
    @GeneratedValue
    private Long id;
    private  Class<E>  entityClass;

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public boolean isPersisted() {
        return getId() != null;
    }
}
