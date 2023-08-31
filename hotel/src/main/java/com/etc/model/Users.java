package com.etc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Users {
    private String utel;
    private String upwd;
    private String uname;
    private String usex;
    private String uphoto;
}
