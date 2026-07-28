# Hands-on Lab: Resolving Merge Conflicts

Objective: explain and practice resolving a merge conflict that arises when
both the trunk (`master`) and a feature branch modify the same part of the
same file.

## Why conflicts happen

Git can auto-merge two branches when their changes don't overlap. A
**conflict** happens when both branches changed the *same lines* of the
*same file* (or, as here, both independently created a new file with the
same name but different content — an "add/add" conflict). Git can't decide
which version is "correct," so it stops the merge, marks the file as
unmerged, and writes both versions into the file separated by conflict
markers (`<<<<<<<`, `=======`, `>>>>>>>`) for a human to resolve.

All steps below were run in [GitDemo/](GitDemo/), a local Git repository.

## 1. Verify master is clean

```
$ git status
On branch master
nothing to commit, working tree clean
```

## 2. Create branch "GitWork" and add hello.xml

```
$ git checkout -b GitWork
Switched to a new branch 'GitWork'

$ cat > hello.xml   # <hello><message>Hello</message></hello>
$ git status
On branch GitWork
Untracked files:
	hello.xml
```

```
$ git add hello.xml
$ git commit -m "Add initial hello.xml on GitWork"
```

## 3. Update hello.xml content and observe status

```
$ # edited hello.xml: message -> "Hello from GitWork branch", added <author>
$ git status
On branch GitWork
Changes not staged for commit:
	modified:   hello.xml
```

## 4. Commit the change to the branch

```
$ git add hello.xml
$ git commit -m "Update hello.xml content on GitWork"
[GitWork f9d4424] Update hello.xml content on GitWork
```

## 5. Switch to master

```
$ git checkout master
Switched to branch 'master'
```

