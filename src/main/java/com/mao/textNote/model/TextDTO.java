package com.mao.textNote.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TextDTO {

    private String userName;
    private String text;
}
