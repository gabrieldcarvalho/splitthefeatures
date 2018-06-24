package com.splitthefeatures.cousineapi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
@Entity
@Table(name = "cousine")
public class Cousine {
    @Id
    @GeneratedValue
    private Long id;

    @Size(max = 200)
    private String description;

    public Cousine() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
