package com.splitthefeatures.cousineapi.dto;


/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
public class CousineDto {
    private Long id;
    private String description;

    public CousineDto() {
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
