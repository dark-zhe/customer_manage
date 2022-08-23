package com.turing.customermanage.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Menu {
    private String mid;
    private Integer pid;
    private Integer type;
    private String mname;
}
