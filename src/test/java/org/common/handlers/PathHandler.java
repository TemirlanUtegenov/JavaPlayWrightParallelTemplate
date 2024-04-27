package org.common.handlers;

import lombok.Getter;
import org.ConfProperties;

@Getter
public class PathHandler {
    private final String baseWebAppUrl = ConfProperties.getFileProperty("base-web-url");

}