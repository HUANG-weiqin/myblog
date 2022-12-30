package vvkingg.myblog.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Blog implements Serializable {

    private int author_id;
    private String title;
    private String descri;
    private String content;

}
