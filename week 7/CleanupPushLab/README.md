# Hands-on Lab: Clean Up and Push Back to Remote Git

Objective: explain and practice cleaning up local state and pushing pending
work from a feature/hands-on lab back to a remote Git repository.

This lab continues on from the conflict-resolution lab's repository:
[../ConflictResolutionLab/GitDemo/](../ConflictResolutionLab/GitDemo/)
(hands-on ID "Git-T03-HOL_002" is the pending work referenced in step 4 —
i.e. the merge-conflict resolution and `.gitignore` commits already made
there).

## 1. Verify master is in a clean state

```
$ git status
On branch master
nothing to commit, working tree clean
```

Working tree is clean — no uncommitted changes, nothing left to stash or
commit before interacting with the remote.

