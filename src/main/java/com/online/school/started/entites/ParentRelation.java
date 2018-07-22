package com.online.school.started.entites;

import javax.persistence.*;

@Entity
public class ParentRelation {

    @Id
    @GeneratedValue
    private Long id;

    @MapsId
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private User parent;

    @MapsId
    @ManyToOne
    @JoinColumn(name = "child_id")
    private User child;

    public Long getId() {
        return id;
    }

    public ParentRelation setId(Long id) {
        this.id = id;
        return this;
    }

    public User getParent() {
        return parent;
    }

    public ParentRelation setParent(User parent) {
        this.parent = parent;
        return this;
    }

    public User getChild() {
        return child;
    }

    public ParentRelation setChild(User child) {
        this.child = child;
        return this;
    }
}
