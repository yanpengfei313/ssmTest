package com.fei.pojo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class User implements Serializable {

    private String username;
    private String password;
    private String nickname;
    //@DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private List<String> hobbies;
}
