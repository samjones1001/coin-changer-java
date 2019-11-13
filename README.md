# coin-changer-java ![Build Status](https://travis-ci.com/samjones1001/coin-changer-java.svg?branch=master) ![Test Coverage](https://codecov.io/gh/samjones1001/coin-changer-java/branch/master/graph/badge.svg)

An implementation of the Coin Changer kata in Java.

### Setup

This project uses [Gradle](https://gradle.org/) to manage dependencies.

- Clone this repository and navigate to its root directory in the command line
- If not already present on your system, install gradle using `brew install gradle` for macOS, or `sdk install gradle 6.0` for other Unix-based operating systems.
- Build the project using `./gradlew build`

### Tests

In order to run the test suite, navigate to the projects root directory in the command line and run `./gradlew test`.

### Execution

To execute the program, navigate to the root directory, then use `./gradlew run args='amount'` where amount represents the value of the change you wish to calculate.

Output will be printed to the command line as a list of integers representing coins.

For example:

```shell
$ ./gradlew run args='24'
$ [20, 2, 2]
```

