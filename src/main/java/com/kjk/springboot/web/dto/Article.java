package com.kjk.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Article {

    private final Long id;
    private final String title;
    private final String author;

}
