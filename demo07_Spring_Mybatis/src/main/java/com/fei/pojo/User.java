package com.fei.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private Integer uid;
    private String username;
    private String sex;
    private Date birthday;
    private String address;
}
