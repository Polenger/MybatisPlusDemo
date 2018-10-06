package com.loikun.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserReq {
    @Max(value = 1000)
    private Integer id;
    @Length(max = 10, message = "name 长度不能超过10")
    private String name;

    private String code;
}
