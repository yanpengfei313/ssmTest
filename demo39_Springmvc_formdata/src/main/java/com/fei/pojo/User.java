package com.fei.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User  {
    private String username;
    private String password;
    private String nickname;
    private Date birthday;

    private List<String> hobbies;

}
