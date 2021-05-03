# scala-spark3-archetype

[![Actions Status](https://github.com/sertansenturk/scala-spark3-archetype/actions/workflows/maven.yml/badge.svg)](https://github.com/sertansenturk/scala-spark3-archetype/actions)
[![Github Package](https://img.shields.io/badge/Github_Package-Latest-blue.svg)](https://github.com/sertansenturk/scala-spark3-archetype/packages/710913)
[![Scala version](https://img.shields.io/badge/Scala-2.12.13-red)](https://www.scala-lang.org/download/2.12.13.html)
[![Spark version](https://img.shields.io/badge/Spark-3.0.1-orange)](https://spark.apache.org/releases/spark-release-3-0-1.html)
[![codecov](https://codecov.io/gh/sertansenturk/scala-spark3-archetype/branch/main/graph/badge.svg?token=GdkSYkGabC)](https://codecov.io/gh/sertansenturk/scala-spark3-archetype)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![License: CC BY-NC-SA 4.0](https://img.shields.io/badge/License-CC%20BY--NC--SA%204.0-ff69b4.svg)](http://creativecommons.org/licenses/by-nc-sa/4.0/)

A maven archetype to kickstart projects in Scala/Spark.

## Introduction

This archetype consists of Spark 3 and complementary libraries for testing, code coverage, automatic code stylization, etc.

For the complete list of dependencies and versions, please refer to the [pom.xml](pom.xml) file.

## Local install

In the terminal run:

```sh
mvn clean install
```

The [mvn command above](#local-install) also runs the tests under [/src/test](./src/test).

## Testing and Continous Integration

The pushes and Pull Requests to the `main` branch are automatically built and tested by Github Actions ([workflow yaml file](.github/workflows/maven.yml)).

Upon a successful build, Github actions uploads the test coverage report ([codecov link](https://app.codecov.io/gh/sertansenturk/scala-spark3-archetype)) and publishes a snapshot ([Github Packages](https://github.com/sertansenturk/scala-spark3-archetype/packages/)).

## 4. License

The source code hosted in this repository is licensed under [MIT License](https://mit-license.org/). The data (features, models,  figures, results, documentation, etc.) in this repository are licensed under [Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License](http://creativecommons.org/licenses/by-nc-sa/4.0/).

## 5. Authors

Sertan Şentürk  
contact@sertansenturk.com
