# Newbie Ed. 2021

Here lives all the stuff for the 2021 newbie ed.

## Format

Each dirctory is organized by lesson, with the following format: `<number>_<lesson>`. <br />
Inside each lesson there is `README.md` with an assignment. <br />
For each assingment please make a folder for yourself like so: `<first>_<last>`. <br />
If a lesson has parts they should be named so: `<letter>_<sublesson>`. <br />

### Example

```
newbie-ed
├─ 2020
├─ 2021
   ├─ 01_cmd
   ├─ 02_git
      ├─ john_doe
         └─ README.md
      └─ README.md
   ├─ 03_java
      ├─ john_doe
         └─ Main.java
   ├─ 04_oops
   ├─ 05_inheritance
   └─ 06_git2
```

## Order

The order for newbie ed can be found [here](https://docs.google.com/document/d/1B7yyqWRYecFkDHLbK46FZrSarQgD_g4x_QwnTIkw2F4/edit?usp=sharing).

## Mandatory?

None of this is mandatory! The entire point is to give you Java practice as well as git practice.  

# How to set up Java (For Windows (x64), updated 11/03/20)
(adoptopenjdk.net link is by the courtesy of our mentor, Jeanne Boyarsky)

You should first check if Java is already installed with step 4 and type in `java --version` into Git Bash and make sure your version is java 11
1. Go here: https://adoptopenjdk.net/?variant=openjdk11&jvmVariant=hotspot, and download `OpenJDK 11 (LTS)` with `HotSpot` JVM
2. Run the `OpenJDK11U-jdk_x64_windows_hotspot_11.0.9_11.msi`
    1. Click `Next`
    2. Check the `I accept the terms in the License Agreement` box and click `Next`
    3. Click the box next to `Set JAVA_HOME variable` and click `Entire feature will be installed on local hard drive`
    4. Click `Next` then `Install` and give it permission
3. To check if this worked, open (or reopen) Git Bash and type in `javac` and press `Enter`
4. If command is not found, contact an oldbie and set up a meeting with them.
    * The command is found if Git Bash spits out a bunch of stuff with --

# How to set up Java (for all other operating systems)
Go here: and follow the instruction for you specific operating system: https://adoptopenjdk.net/installation.html?variant=openjdk11&jvmVariant=hotspot (I would recommend you to use the same version and JVM as the one mentioned above)
