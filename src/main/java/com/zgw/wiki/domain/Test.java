package com.zgw.wiki.domain;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Data
@ToString
public class Test {
    private Integer id;
    private String name;
    private String passworg;
}
