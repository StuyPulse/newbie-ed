# StuyPulse SE Cheat Sheet

This cheat sheet contains all that you have learned during newbie ed and with each item condensed into short descriptions. In no way does this replace the [newbie ed slides](https://drive.google.com/drive/folders/11xVp71yDtqEglCm1SSzIVBgTVq8ioPV6). This should only be used as a quick reference guide whenever necessary. If more detail is required, use your best friend [Google](https://google.com), find the corresponding slides to the topic, or ask for help. 

OOP and Robot Code sections are work in progress. 

## Table Of Contents

- [cmd](#cmd)
- [git](#git)
- [java](#java)
- [oop](#oop)
- [robot code](#robot-code)
- [guides](#guides)

## cmd

[CMD Prompt Slides](https://docs.google.com/presentation/d/130NjxfLpfdALPbP1LePpvjjwWFw0k261HRZ66z1S4RE/edit?usp=sharing)

### `pwd`

Prints the current directory path.

### `ls`

Lists the direct children of the current directory. This does not automatically list hidden files/folders (files starting with `.` such as `.git`). 

`-a` tag lists all direct children of the current directory, which includes hidden directories or folders and files. 

### `cd [directoryname]`

Changes the current directory to the one specified. Can be relative. Is case sensitive. Pressing `TAB` may autofill choices however, they may be partial if there are multiple with similar names. 

Wrap the name of the child with `""` if the name is more than one word. 

### `clear`

Clears the terminal buffer and terminal window. 

### `mkdir [directoryname]`

Create a new directory or folder inside of the current directory.

### `touch [filename]`

Creates a new file with the specified name and extension. If no extension is supplied, it is assumed to be a `.txt` file. 

### `rm [filename]`

Removes the specified file. 

`-r` tag stands for recursive. Works on directories or folders. Removes all children of the specified directory including the directory itself. 

- eg. `rm -r Edwin`

`-f` tag stands for force. Works on dictionaries and files. Removes write protected files and large folders which may refuse to be deleted. 

- eg. `rm -f Edwin`

`-r` and `-f` can be combined to `-rf` to have combined functionality. 

- eg. `rm -rf Edwin`

### `cp [filename] [directory]` | `cp [filename] [filename] ... [directory]`

Copies file(s) into a new directory or folder. 

`-r` tag stands for recursive. Works on directories or folders. Copies the entire directory and its children into the new directory.

### `mv [filename | directoryname] [directory]` | `cp [filename] [directory] ... [directory]`

Moves files from current directory to new directory. Can be used to rename files or directories.

### `cat [filename]`

Prints a file's contents into the terminal. 

### `history`

Shows the history of the commands you have run. 

`code [filename | directory]` | `nano [filename]` | `notepad [filename]` | `gedit [filename]` | `vim [filename]`

Opens file or directory in specified editor. 

[Back to top](#)

## git

[Git Slides](https://docs.google.com/presentation/d/1hPkmVCb7XJuE-Kbb_apk0PicVLmaolZxj3dEWZgZV8Q/edit?usp=sharing)

### `git init`

Used to initialize a new git repository.

### `git remote add origin [url]`

Used to add a new remote repository to your local repository. Connects your local git repository to a remote repository.

### `git clone [url]`

Used to clone a remote repository to your local system. All changes to your local "clone" do not affect the remote repository until you push your changes.

### `git pull`

Updates your local repository with changes from the remote repository.

### `git status`

Displays the differences or changes made to the local repository and the remote repository.

### `git add [file]`

Adds the file to the git index for your repository. Basically stages your file to be committed to a repository. After adding a file, you will see that it is marked by git as `staged`.

### `git commit -m [commit message] -m [commit description]`

Commits your changes to the git repository. This does not change your remote repository until you push your changes. A commit message is required however, a commit description is not. 

WRITE GOOD COMMIT MESSAGES OR RENEE WILL CUT YOUR FINGERS OFF!!! 

### `git push`

Pushes your commited changes in your local repository to the remote repository. 

### `git branch [branch]`

If no branch is specified, git will return a list of all branches on your local repository and highlights the branch you are currently working on. This

If a branch is specified, it will create a new branch with the name specified if it does not already exist.

MAKE GOOD BRANCH NAMES OR STUYPULSE WILL COME AFTER YOU!!! Our convention for branches is `intials/feature-name`.

`-d` tag will delete the specified branch. 

- eg. `git branch -d ic/feature`

### `git checkout [branch]`

Checks out of the current branch into the specified branch. Changes may need to be stashed or not, and files will be replaced with those in that particular branch. 

**Beware of old branches, they may cause a lot of headaches, namely merge conflicts. Tons of merge conflicts.**

### `git merge [branch]`

Merges the changes from the specified branch into the branch you are currently in. Beware of merge conflicts. 

If a merge conflict does arise, don't panic. Follow the instructions provided by the ever helpful git and resolve any conflicts. 

### `git rebase [branch]`

Reapplies the commits of the current branch onto the specified branch. This may lead to merge conflicts. 

[Back to top](#)

## java

### Relevant Resources

[Java Basics One](https://docs.google.com/presentation/d/1FBkgqQfGXg0vPp0GTR6SE8dErRoHfiTfYP9lLm4px6U/edit?usp=sharing)

- Data Types
- Variables
- Arithmetic Operators
- Assignment Operators
- Incremental Operators

[Java Basics Two](https://docs.google.com/presentation/d/18yGJYc7Smld79WcnJvQ08uxlZosipNIc0hQZ4TxCtt8/edit?usp=sharing)

- Comparison Operators
- Logical Operators
- Conditionals
- Arrays
- Looping (While, For, Arrays, Enhanced For)

[Java Basics Three](https://docs.google.com/presentation/d/1SWvCGiW-gO-QLk1b7tuH7HaSKk8GmivWhizNVysOT80/edit?usp=sharing)

- Functions

`System.out.println([ String ]);` is used to print out any String you pass into the terminal window. 

`// [comment]` can be used to make a line of code a single-line comment.

`/* [comment spanning multiple lines] */` can be used to multiple lines of code a multi-line comment.

`;`s separate each line of code that isn't a bracket in Java. They should follow each line of code to be executed as they show that the code for that line has ended. 

### Variables

`[data type] [name] = [value];` is the format in which a variable is defined and assigned a value. 

### Basic data types in Java

| data type | description | example |
| --- | --- | --- |
| String | A list of characters | "StuyPulse 694" |
| int | Any non-decimal number | 694 |
| double | Any decimal number | 0.938 |
| boolean | A true or false value | true |

### Arithmetic Operators

| operator | description | compatible data types | example |
| --- | --- | --- | --- |
| + | Addition | int, double, string | "Stuy" + "Pulse" |
| - | Subtraction | int, double | 1.0 - 1.1 |
| * | Multiplication | int, double | 2 * 8 |
| / | Division | int, double | 360 / 90 |
| % | Modulo | int, double | 24 % 3 |

### Assignment Operators

| operator | description | example | equivalent expression |
| --- | --- | --- | --- |
| = | Assignment | int x = 12 | int x = 12 |
| += | Addition Assignment | x += 12 | x = x + 12 |
| -= | Subtraction Assignment | x -= 12 | x = x - 12 |
| *= | Multiplication Assignment | x *= 12 | x = x * 12 |
| /= | Division Assignment | x /= 12 | x = x / 12 |
| %= | Modulo Assignment | x %= 12 | x = x % 12 |

### Incremental & Decremental Operators

| operator | description | compatible data types | example |
| --- | --- | --- | --- |
| ++ | Increment | int, double | x++ |
| -- | Decrement | int, double | x-- |

### Comparison Operators

| operator | description | example |
| --- | --- | --- |
| == | equal to | 1 == 2 |
| != | not equal to | 1 != 2 |
| <, <= | greater than, greater than or equal to | 1 <= 2 |
| >, >= | less than, less than or equal to | 1 > 2 |

### Logical Operators

| operator | description | example |
| --- | --- | --- |
| ! | not | !true |
| && | and | 1 == 2 && 2 == 3 |
| \|\| | or | 1 > 5 \| 2 < 6 |
| == | equal to | 1 == 2 |
| != | not equal to | 1 != 2 |

### Conditionals

```
if (boolean) { 
  code to execute
}
```

If the boolean value returned is true, the code wrapped in the `if` statement will be run. If not, it will be skipped. 

```
if (boolean) { 
  code to execute
} else {
  code to execute
}
```

`else` statements can be added to the end like this. The code under `else` will be run if the `if` statment is skipped. 

```
if (boolean) { 
  code to execute
} else if {
  code to execute
} else {
  code to execute
}
```

`else if` statements will run if it's condition is met and the previous `if` or `else if` statement was skipped. You can string multiple `else if` statements to do different things under different conditions. 

```
switch (expression) {
  case [value]: 
    code to execute
    break;
  case [value]: 
    code to execute
    break;
  case [value]: 
    code to execute
    break;
}
```

`switch case` evaluates the expression once, gets its result, and checks if it is equal to the defined values in each case. If true, run the code under the case, else skip to the next case. 

### Arrays

Arrays are a list of values which can be set to one variable. This variable can be called and an array of values would be returned. Arrays can store values of any data type, however in Java, only one type of data can be in an array. 

Note that array sizes in Java are **immutable**. 

`dataType[] arrayName = new dataType[numberOfElements];`

As shown above, to create a new array, you must specify the data type of the values in the array. 

`dataType[] arrayName = {value, value, ...};`

As shown above, you surround the values you want to assign to your array with curly brackets. If an array is made this way, Java will assign the number of items in the array you provide as the length of the array. 

### Indexes

All indexes start with 0. To get the value of an element in an array, use its index to call it as shown below. 

`arrayName[index]`

You can treat the returned value as a normal value of its type. 

### Looping

Loops are used to repeat a set of instructions over and over again, until a certain condition is met. 

**While Loops**

```
while (boolean) {
  code to execute
}
```

While loops are used to loop through a set of instructions while the condition provided is true. The value of the condition should start out as true. 

Example: 
```
int i = 0
while (i < 100) {
  System.out.println("I'm annoying!");
  i++
}
```

**For Loops**

```
for (declaration; check; increment) {
  code to execute
}
```

In while loops, you usually have a separate counter variable which is incremented per run. For loops condense this into one line. 

Example: 
```
while (int i = 0; i < 100; i++) {
  System.out.println("I'm annoying!");
} 
```

**Looping through arrays**

Traditional Method: 
```
dataType[] arrayName = {value, value, ...};

for (int i = 0; i < arrayName.length; i++) {
  code to execute
  // System.out.println(arrayName[i]);
}
```

Enhanced Method: 
```
for (dataType element : array) {
  code to execute
}
```

### Functions

```
public static returnType functionName(dataType parameterName, ...) {
  code to execute
  return value;
}
```

`returnType` is the data type of the value returned by the function. If no data will be returned, `returnType` should be `void` and the `return` will not be needed.

[Back to top](#)

## OOP

[Back to top](#)

## robot-code

[Back to top](#)

## guides

### Updating your Romi to the latest version

[Guide to Updating Romi Firmware](https://docs.google.com/document/d/16zthrzJMA8NHwttWnD0OXyUzDMMrEJ85JXWFRo2nNWw/edit?usp=sharing)

### Updating your Romi to the latest version

[Guide to Updating roboRIO Firmware](https://docs.google.com/document/d/1DPnIsDCaQsJ0756feanOjQgPalymSTVKIdDy70mpYFw/edit?usp=sharing)

[Back to top](#)
