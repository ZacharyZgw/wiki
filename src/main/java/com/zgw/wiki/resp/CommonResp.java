package com.zgw.wiki.resp;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CommonResp<T> {
    private boolean success = true;
    private String message;
    private T content;
}
