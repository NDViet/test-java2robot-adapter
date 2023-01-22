package org.ndviet.keyword;

import org.ndviet.library.template.TemplateHelpers;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;
import org.robotframework.javalib.library.AnnotationLibrary;

import java.util.Arrays;
import java.util.Map;

@RobotKeywords
public class TemplateUtils extends AnnotationLibrary {
    public TemplateUtils() {
        super(Arrays.asList("org/ndviet/keyword/TemplateUtils.class"));
    }

    @RobotKeyword
    @ArgumentNames({"templateString", "variable"})
    public static String processTemplate(String templateString, Map variables) throws Exception {
        return TemplateHelpers.processTemplate(templateString, variables);
    }
}
