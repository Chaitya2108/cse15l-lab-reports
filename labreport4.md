# Lab Report 4: Vim Commands

This report uses git and vim commands to clone a repository, edit the contents of a file, and then commit and push the changes. The following steps are taken to run these commnads.

4. Log into ieng6
5. Clone the fork of the repository from your Github account (using SSH URL)
6. Run the tests, demonstrating that they fail.
7. Edit the code to fix the failing test.
8. Run the tests, demonstrating that they pass.
9. Commit and push the resulting change to your Github account.

## Step 1: Log onto ieng6

I used the following command to log into ieng6. No password was required because I had the SSH key saved on my local machine.
```
ssh chjodhavat@ieng6-202.ucsd.edu
```

![Image](step1.png)

## Step 2: Clone the repository
Once in ieng6, I used the following command to fork the repository. I obtained this link from the Github website. The SSH link was used because the remote server had the SSH key used to access my personal GitHub account. 
```
git clone git@github.com:Chaitya2108/lab7.git
```

![Image](step2.png)

## Step 3: Run the tests, show they fail
I first used `cd lab7` to cd into the cloned repository. Instead of typing `lab7`, I used `<tab>` after pressing the first letter to autocomplete the repository's name. I then use the bash script to run the JUnit tests. To do this, I run `bash test.sh`, again using `<tab>` after typing the first two letters to autocomplete the file name. They fail becuase the implementation is incorrect.

![Image](step3.png)

## Step 4: Edit the file using vim
To acccess the file, I type `vim ListExamples.java`. After typing `Li`, I use `<tab>` to autocomplete up to `ListExamples`. I then type `.` and use `<tab>` to access the `.java` file. Once in vim, I press the following keys to locate the error and fix it: `<4><4><G><right><right><right><right><right><x><i><2><esc><:><w><q><enter>`. The `<4><4><G>` keystrokes move the cursor to the beginning of line 44. The 5 `<right>` keystrokes move the cursor right before the `1` that is deleted. The `<x>` key deletes the character to the left of the cursor, and the `<i>` key puts Vim into insert mode. `<2>` is used to insert 2, and then `<esc>` is pressed to quit insert mode. `<:><w><q>` is used to save all the edits made to the file and then quit it. 

![Image](step4.png)

## Step 5: Run the JUnit tests again.
Since bash commands are saved, I press `<up><up><enter>` to locate and run `test.sh`. This time, the tests run correctly because the implementation is fixed.

![Image](step5.png)

## Step 6: Commit and push changes.
I run the following commands to commit and push my changes.
```
git add *
git commit -m "commit changes"
git push
```
`git add *` adds all changes made to the repository into the staging area. `git commit -m` commits the changes to the repository permanently, with the commit message being given by the user. `git push` pushes all the changes onto the repository stored on GitHub, allowing other users to pull the updated version.

![Image](step6.png)