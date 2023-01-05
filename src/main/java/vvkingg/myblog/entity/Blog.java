package vvkingg.myblog.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

@Data
public class Blog implements Serializable {
    private int blog_id;
    private int author_id;
    private String blog_title;
    private String blog_content;
    private Date modify_date;
    private String blog_tags;
    private int readed_numb;
}
