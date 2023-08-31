package com.etc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Hotel {
    private Integer hid;
    private String htitle;
    private String address;
    private String htext;
    private String htel;
    private Double jingdu;
    private Double weidu;
    private String star;
}
