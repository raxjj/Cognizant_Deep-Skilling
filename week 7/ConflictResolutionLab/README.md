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

## 6. Add hello.xml to master with different content

```
$ cat > hello.xml   # <hello><message>Hello from master trunk</message><owner>master-user</owner></hello>
$ git status
On branch master
Untracked files:
	hello.xml
```

Note `hello.xml` does not yet exist in `master`'s history — it only exists
on `GitWork` so far — so this creates two independent versions of a
same-named new file on each branch, the setup for an add/add conflict.

## 7. Commit the change to master

```
$ git add hello.xml
$ git commit -m "Add hello.xml on master with different content"
[master 54885b4] Add hello.xml on master with different content
```

## 8. Observe the log

```
$ git log --oneline --graph --decorate --all
* 54885b4 (HEAD -> master) Add hello.xml on master with different content
| * f9d4424 (GitWork) Update hello.xml content on GitWork
| * f75a66f Add initial hello.xml on GitWork
|/
* d8c08ca Initial commit on master
```

The two branches have clearly diverged, each with its own `hello.xml`.

## 9. Check differences with git diff

```
$ git diff master GitWork -- hello.xml
diff --git a/hello.xml b/hello.xml
index ce02b56..894e5c5 100644
--- a/hello.xml
+++ b/hello.xml
@@ -1,5 +1,5 @@
 <?xml version="1.0"?>
 <hello>
-  <message>Hello from master trunk</message>
-  <owner>master-user</owner>
+  <message>Hello from GitWork branch</message>
+  <author>branch-user</author>
 </hello>
```

## 10. Visualize with P4Merge

P4Merge is **not installed** on this machine, so this step is documented
rather than run directly (see the branching/merging lab for the
`git config diff.tool` / `difftool.p4merge.cmd` setup). Once configured:

```
git difftool master GitWork -- hello.xml
```

This opens P4Merge showing the master and branch versions of `hello.xml`
side-by-side with the differing `<message>`/`<owner>`/`<author>` lines
highlighted in color.

## 11. Merge the branch into master

```
$ git merge GitWork -m "Merge branch 'GitWork' into master"
Auto-merging hello.xml
CONFLICT (add/add): Merge conflict in hello.xml
Automatic merge failed; fix conflicts and then commit the result.
```


