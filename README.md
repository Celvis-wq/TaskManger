# TaskManager.java
# Version: 0.0.3

## Purpose:

- This is a basic program that creates a list of tasks through user input.
<br />

## FAQ:
- Latest Java JDK (Oracle)
- Any operating system.
- This program is not complete at the moment. I will continue to improve and add more to this program. Please report any issues to me @discord: Celvis#5477

### How to use:
- cd /TaskManger (Go to the directory TaskManger is located)
- javac TaskManger.java (This creates the class file, compiled)
- java TaskManger (Run the class file)

# Languages used:
- Java
[<img align="left" alt="Java" width="26px" src="https://camo.githubusercontent.com/651195b8c66a9dd22316e672992077dbcecea4ca904b45a6681558ebc0ecc517/68747470733a2f2f75706c6f61642e77696b696d656469612e6f72672f77696b6970656469612f656e2f7468756d622f332f33302f4a6176615f70726f6772616d6d696e675f6c616e67756167655f6c6f676f2e7376672f33303070782d4a6176615f70726f6772616d6d696e675f6c616e67756167655f6c6f676f2e7376672e706e67" style="padding-right:10px;" />]

<br />
<br />

---

### Changelog:
Change:
1. Changed the endTaskList variable to isRunning, now a boolean variable.
2. Changed the if statement condition to use taskName.equalsIgnoreCase("end") instead of taskName.toLowerCase().equals("end").
3. Simplified the file-writing code by using the ternary operator to determine whether to append or create a new file.

TODO:
1. Fix "end" on the start of the program (It shouldn't create a file when you type "end" on the first tasklist creation option)
