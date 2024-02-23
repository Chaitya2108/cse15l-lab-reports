# Lab Report 4: Vim Commands

This report uses git and vim commands to clone a repository, edit the contents of a file, and then commit and push the changes. The following steps are taken to run these commnads.

4. Log into ieng6
5. Clone the fork of the repository from your Github account (using SSH URL)
6. Run the tests, demonstrating that they fail.
7. Edit the code to fix the failing test.
8. Run the tests, demonstrating that they pass.
9. Commit and push the resulting change to your Github account.

## Step 4: Log onto ieng6

I used the following command to log into ieng6. No password was required because I had the SSH key saved on my local machine.
```
ssh chjodhavat@ieng6-202.ucsd.edu
```

## Step 5: Clone the repository
Once in ieng6, I used the following command to fork the repository. I obtained this link from the Github website.
```
git clone git@github.com:Chaitya2108/lab7.git
```

## Step 6: Run the tests, show they fail
I use the bash script to run the JUnit tests. They fail becuase the implementation is incorrect.
```
bash test.sh
```

## Step 7
