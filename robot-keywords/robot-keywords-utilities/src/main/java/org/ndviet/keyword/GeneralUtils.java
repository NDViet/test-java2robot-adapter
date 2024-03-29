package org.ndviet.keyword;

import org.ndviet.library.log.LogHelpers;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;
import org.robotframework.javalib.library.AnnotationLibrary;

import java.util.Arrays;

@RobotKeywords
public class GeneralUtils extends AnnotationLibrary {
    public GeneralUtils() {
        super(Arrays.asList("org/ndviet/keyword/GeneralUtils.class"));
    }

    @RobotKeyword
    @ArgumentNames({"object"})
    public static void prettyPrintObjectDetails(Object object) {
        LogHelpers.prettyPrintObjectDetails(object);
    }
}
