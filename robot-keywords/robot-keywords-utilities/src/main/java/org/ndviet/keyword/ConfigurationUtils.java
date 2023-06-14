package org.ndviet.keyword;

import org.ndviet.library.configuration.AbstractConfiguration;
import org.ndviet.library.configuration.ConfigurationManager;
import org.ndviet.library.configuration.JsonConfiguration;
import org.ndviet.library.configuration.YamlConfiguration;
import org.ndviet.library.spring.SpringHelpers;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;
import org.robotframework.javalib.library.AnnotationLibrary;

import java.util.Arrays;
import java.util.List;

@RobotKeywords
public class ConfigurationUtils extends AnnotationLibrary {
    public ConfigurationUtils() {
        super(Arrays.asList("org/ndviet/keyword/ConfigurationUtils.class"));
        SpringHelpers.getInstance().getBean("ConfigurationFactory");
    }

    @RobotKeyword
    public String getValue(String key) throws Exception {
        return ConfigurationManager.getInstance().getValue(key);
    }

    @RobotKeyword
    public List<String> getListValues(String key) throws Exception {
        return ConfigurationManager.getInstance().getListValues(key);
    }

    @RobotKeyword
    public AbstractConfiguration readYamlConfiguration(String filePath) throws Exception {
        AbstractConfiguration configuration = new YamlConfiguration();
        configuration.readConfigurationFrom(filePath);
        return configuration;
    }

    @RobotKeyword
    public AbstractConfiguration readJsonConfiguration(String filePath) throws Exception {
        AbstractConfiguration configuration = new JsonConfiguration();
        configuration.readConfigurationFrom(filePath);
        return configuration;
    }

}
