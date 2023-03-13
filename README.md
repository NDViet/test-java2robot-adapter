## Introduction

Implementation for Test Libraries written in Java can be used in Robot Framework.<br>
[robotframework/JavalibCore](https://github.com/robotframework/JavalibCore) is the base for implementing.<br>

## List dependency repositories

1. [test-parent-pom](../../../test-parent-pom)
2. [test-automation-fwk](../../../test-automation-fwk)

## Dependencies declaration

```xml
<!-- https://mvnrepository.com/artifact/org.ndviet/robot-keywords-utilities -->
<dependency>
    <groupId>org.ndviet</groupId>
    <artifactId>robot-keywords-utilities</artifactId>
    <version>${version}</version>
</dependency>
```

```xml
<!-- https://mvnrepository.com/artifact/org.ndviet/robot-keywords-webui -->
<dependency>
    <groupId>org.ndviet</groupId>
    <artifactId>robot-keywords-webui</artifactId>
    <version>${version}</version>
</dependency>
```

## Source code usage

1. Clone repository "test-parent-pom" (**mandatory**)

```shell
git clone git@github.com:ndviet/test-parent-pom.git
```

2. Clone repository "test-automation-fwk" (optional)

```shell
git clone git@github.com:ndviet/test-automation-fwk.git
```

3. Clone this repository, all these repositories should be checked out in the same directory

```shell
git clone git@github.com:ndviet/test-java2robot-adapter.git
```

4. Build source code in each repository following the order

- test-parent-pom
- test-automation-fwk
- test-java2robot-adapter

## Reference

A sample project is using these Robot Keywords.<br>

* [test-automation-project](../../../test-automation-project)
