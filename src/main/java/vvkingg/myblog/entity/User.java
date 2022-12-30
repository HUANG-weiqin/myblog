package vvkingg.myblog.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private int id;
    private String user_name;
    private String user_password;
}
