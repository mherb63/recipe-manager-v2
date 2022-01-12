package com.mherb.recipemanager.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RecipeNotFoundException extends RuntimeException {
    public RecipeNotFoundException(String msg) {
        super(msg);
        log.error(msg);
    }
}
