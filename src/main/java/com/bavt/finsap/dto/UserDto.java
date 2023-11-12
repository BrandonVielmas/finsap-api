package com.bavt.finsap.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {

    private Integer Id;
    private String Name;
    private String LastName;
    private String Email;
    private String Password;
    private Date CreateDate;
    private Date UpdateDate;

}
