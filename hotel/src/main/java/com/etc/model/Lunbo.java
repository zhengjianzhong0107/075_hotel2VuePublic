package com.etc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Lunbo {
    private Integer lid;
    private String lphoto;
    private String ltitle;
    private String ltext;
    private Integer fid;
}
