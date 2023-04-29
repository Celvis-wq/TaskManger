# TaskManager.java
# Version: 0.0.4

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
[<img align="left" alt="" width="26px" src="https://camo.githubusercontent.com/651195b8c66a9dd22316e672992077dbcecea4ca904b45a6681558ebc0ecc517/68747470733a2f2f75706c6f61642e77696b696d656469612e6f72672f77696b6970656469612f656e2f7468756d622f332f33302f4a6176615f70726f6772616d6d696e675f6c616e67756167655f6c6f676f2e7376672f33303070782d4a6176615f70726f6772616d6d696e675f6c616e67756167655f6c6f676f2e7376672e706e67" style="padding-right:10px;" />]

<br />
<br />

---

### Changelog:
Changes:
1. "end" on the start of the program bug should be fixed
2. Removed the import statements for java.nio.file.Files and java.nio.file.Paths, as they are no longer needed
3. Removed the check for file existence and file creation using Files.notExists and Files.createFile. It is now using FileWriter in append mode, which will create the file if it does not exist
4. Reverted the FileWriter creation logic back to the original code, as it is more suitable for this specific use case
5. Kept the equalsIgnoreCase change from the previous revision, as it is a more efficient and cleaner way to check for the "end" command

TODO:
1. None as of now.





