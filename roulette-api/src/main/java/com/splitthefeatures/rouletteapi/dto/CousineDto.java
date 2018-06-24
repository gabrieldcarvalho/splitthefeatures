package com.splitthefeatures.rouletteapi.dto;


/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
public class CousineDto {
    private Integer id;
    private String description;

    public CousineDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
