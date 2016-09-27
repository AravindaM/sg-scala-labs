# Singapore Scala lab

This repository, intended for the [Spring User Group Meetup](https://www.meetup.com/singasug/events/234315161/) on 28th Sep 2016, is an introductory lab to the scala language.

It is a patchwork of exercises taken from [scala-labs](https://github.com/scala-labs/scala-labs), the book [Scala for the Impatient](http://horstmann.com/scala/) and the Coursera course [Functional Programming Principles in Scala](https://www.coursera.org/learn/progfun1).

Before starting the lab, make sure to setup your environment (section below) and optionally go through this [Scala quick tour](https://docs.google.com/presentation/d/1KowHAem2BEnUNKMMbjQJE_tHOIgVWVAmI5OajVMQIa0/edit?usp=sharing).

Environment Setup
-------

- First make sure a version of the JDK is installed. Preferably java 8, although Java 6 and 7 will work too with scala-2.11.x used in this lab.

```
$ java -version
java version "1.8.0_51"
Java(TM) SE Runtime Environment (build 1.8.0_51-b16)
Java HotSpot(TM) 64-Bit Server VM (build 25.51-b03, mixed mode)
```

- Then install the latest version of [SBT](http://www.scala-sbt.org/0.13/docs/Setup.html) (stands for "Simple Build Tool") the de facto build tool for Scala applications. After adding the `sbt` command to your PATH, validate with the command line
  ```
  $ sbt about
  [info] Set current project to redmart (in build file:/Users/redmart/)
  [info] This is sbt 0.13.12
  ...
  ```

- Finally Install a scala-compatible IDE, for example
  - [IntelliJ IDEA Community edition](https://www.jetbrains.com/idea/#chooseYourEdition)
  - [Scala IDE for Eclipse](http://scala-ide.org/)

Start the lab
-------

- Clone this repo
```
$ git clone https://github.com/damien-neveu/sg-scala-labs.git
```
- Navigate to the `sg-scala-labs` folder and compile the project
  - `$ cd sg-scala-labs/`
  - `$ sbt clean compile`

- Open the project within your IDE
  - In IntelliJ : File -> Open -> `/path/to/folder/sg-scala-labs` -> Choose `SBT` -> Check `Auto-Import` only -> OK

- Fix all [exercises](src/main/scala/com/meetup/scalab) so their tests pass
  - `$ sbt test`

### USeful Links

- [Scala API](http://www.scala-lang.org/files/archive/api/current/#package)
- [Scala Index](https://index.scala-lang.org/)
