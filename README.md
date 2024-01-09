Microsoft Windows [Version 10.0.19045.3803]
(c) Microsoft Corporation. All rights reserved.

D:\KASHIF\Spring_NewWorkspace\DemoSpringBootApp>**git init**
Initialized empty Git repository in D:/KASHIF/Spring_NewWorkspace/DemoSpringBootApp/.git/

D:\KASHIF\Spring_NewWorkspace\DemoSpringBootApp>**git add .**
warning: in the working copy of '.gitignore', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of '.mvn/wrapper/maven-wrapper.properties', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'mvnw', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'mvnw.cmd', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'pom.xml', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'src/main/java/com/example/demo/WorkflowPublishersApplication.java', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'src/main/resources/application.properties', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'src/test/java/com/example/demo/WorkflowPublishersApplicationTests.java', LF will be replaced by CRLF the next time Git touches it

D:\KASHIF\Spring_NewWorkspace\DemoSpringBootApp>**git status**
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   .gitignore
        new file:   .mvn/wrapper/maven-wrapper.jar
        new file:   .mvn/wrapper/maven-wrapper.properties
        new file:   mvnw
        new file:   mvnw.cmd
        new file:   pom.xml
        new file:   src/main/java/com/example/demo/KafKaConsumer.java
        new file:   src/main/java/com/example/demo/UserObject.java
        new file:   src/main/java/com/example/demo/WorkflowPublishersApplication.java
        new file:   src/main/resources/application.properties
        new file:   src/test/java/com/example/demo/WorkflowPublishersApplicationTests.java


D:\KASHIF\Spring_NewWorkspace\DemoSpringBootApp>**git commit -m "Kafa First Commit"**
Author identity unknown

*** Please tell me who you are.

Run

  git config --global user.email "you@example.com"
  git config --global user.name "Your Name"

to set your account's default identity.
Omit --global to set the identity only in this repository.

fatal: unable to auto-detect email address (got 'Mehreen Fathima@DESKTOP-Q4N62R1.(none)')

D:\KASHIF\Spring_NewWorkspace\DemoSpringBootApp>**git config --global user.email iamkashifmohideen@gmail.com**

D:\KASHIF\Spring_NewWorkspace\DemoSpringBootApp> **git config --global user.name iamkashifmohideen**

D:\KASHIF\Spring_NewWorkspace\DemoSpringBootApp>**git commit -m "Kafa First Commit"**
[master (root-commit) 1ef54fb] Kafa First Commit
 11 files changed, 715 insertions(+)
 create mode 100644 .gitignore
 create mode 100644 .mvn/wrapper/maven-wrapper.jar
 create mode 100644 .mvn/wrapper/maven-wrapper.properties
 create mode 100644 mvnw
 create mode 100644 mvnw.cmd
 create mode 100644 pom.xml
 create mode 100644 src/main/java/com/example/demo/KafKaConsumer.java
 create mode 100644 src/main/java/com/example/demo/UserObject.java
 create mode 100644 src/main/java/com/example/demo/WorkflowPublishersApplication.java
 create mode 100644 src/main/resources/application.properties
 create mode 100644 src/test/java/com/example/demo/WorkflowPublishersApplicationTests.java

D:\KASHIF\Spring_NewWorkspace\DemoSpringBootApp>**git remote add origin https://github.com/iamkashifmohideen/kafka-project.git**

D:\KASHIF\Spring_NewWorkspace\DemoSpringBootApp>**git push-u origin master**
git: 'push-u' is not a git command. See 'git --help'.

D:\KASHIF\Spring_NewWorkspace\DemoSpringBootApp>git push -u origin master
To https://github.com/iamkashifmohideen/kafka-project.git
 ! [rejected]        master -> master (fetch first)
error: failed to push some refs to 'https://github.com/iamkashifmohideen/kafka-project.git'
hint: Updates were rejected because the remote contains work that you do not
hint: have locally. This is usually caused by another repository pushing to
hint: the same ref. If you want to integrate the remote changes, use
hint: 'git pull' before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.

D:\KASHIF\Spring_NewWorkspace\DemoSpringBootApp>git pull
remote: Enumerating objects: 3, done.
remote: Counting objects: 100% (3/3), done.
remote: Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (3/3), 602 bytes | 40.00 KiB/s, done.
From https://github.com/iamkashifmohideen/kafka-project
 * [new branch]      main       -> origin/main
 * [new branch]      master     -> origin/master
There is no tracking information for the current branch.
Please specify which branch you want to merge with.
See git-pull(1) for details.

    git pull <remote> <branch>

If you wish to set tracking information for this branch you can do so with:

    git branch --set-upstream-to=origin/<branch> master



D:\KASHIF\Spring_NewWorkspace\DemoSpringBootApp>**git push -u origin master**
To https://github.com/iamkashifmohideen/kafka-project.git
 ! [rejected]        master -> master (non-fast-forward)
error: failed to push some refs to 'https://github.com/iamkashifmohideen/kafka-project.git'
hint: Updates were rejected because the tip of your current branch is behind
hint: its remote counterpart. If you want to integrate the remote changes,
hint: use 'git pull' before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.

D:\KASHIF\Spring_NewWorkspace\DemoSpringBootApp>**git pull**
There is no tracking information for the current branch.
Please specify which branch you want to merge with.
See git-pull(1) for details.

    git pull <remote> <branch>

If you wish to set tracking information for this branch you can do so with:

    git branch --set-upstream-to=origin/<branch> master


D:\KASHIF\Spring_NewWorkspace\DemoSpringBootApp> **git push-u origin master**
git: 'push-u' is not a git command. See 'git --help'.

D:\KASHIF\Spring_NewWorkspace\DemoSpringBootApp>git push -u origin master
To https://github.com/iamkashifmohideen/kafka-project.git
 ! [rejected]        master -> master (non-fast-forward)
error: failed to push some refs to 'https://github.com/iamkashifmohideen/kafka-project.git'
hint: Updates were rejected because the tip of your current branch is behind
hint: its remote counterpart. If you want to integrate the remote changes,
hint: use 'git pull' before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.



#1 solution
[https://docs.github.com/en/authentication](https://docs.github.com/en/authentication/connecting-to-github-with-ssh/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent?platform=windows)
C:\Users\Mehreen Fathima\.ssh
Open Git Bash
ssh-keygen -t rsa -b 4096 -C "iamkashifmohideen@gmail.com"

Key will be generated
id_rsa
id_rsa.pub


https://github.com/settings/keys/SSH Key
new key paste the id_rsa.pub




D:\KASHIF\Spring_NewWorkspace\DemoSpringBootApp>**git pull origin master**
From https://github.com/iamkashifmohideen/kafka-project
 * branch            master     -> FETCH_HEAD
fatal: refusing to merge unrelated histories

D:\KASHIF\Spring_NewWorkspace\DemoSpringBootApp>**git push -u origin master**
To https://github.com/iamkashifmohideen/kafka-project.git
 ! [rejected]        master -> master (non-fast-forward)
error: failed to push some refs to 'https://github.com/iamkashifmohideen/kafka-project.git'
hint: Updates were rejected because the tip of your current branch is behind
hint: its remote counterpart. If you want to integrate the remote changes,
hint: use 'git pull' before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.



D:\KASHIF\Spring_NewWorkspace\DemoSpringBootApp>**git fetch origin**

D:\KASHIF\Spring_NewWorkspace\DemoSpringBootApp>**git rebase origin/master**
Successfully rebased and updated refs/heads/master.

D:\KASHIF\Spring_NewWorkspace\DemoSpringBootApp>**git rebase --continue**
fatal: No rebase in progress?

D:\KASHIF\Spring_NewWorkspace\DemoSpringBootApp>**git pull origin master**
From https://github.com/iamkashifmohideen/kafka-project
 * branch            master     -> FETCH_HEAD
Already up to date.

D:\KASHIF\Spring_NewWorkspace\DemoSpringBootApp>**git push origin master**
Enumerating objects: 28, done.
Counting objects: 100% (28/28), done.
Delta compression using up to 4 threads
Compressing objects: 100% (19/19), done.
Writing objects: 100% (27/27), 64.12 KiB | 1.49 MiB/s, done.
Total 27 (delta 0), reused 0 (delta 0), pack-reused 0
To https://github.com/iamkashifmohideen/kafka-project.git
   2a12b60..0db9d0c  master -> master

D:\KASHIF\Spring_NewWorkspace\DemoSpringBootApp>
