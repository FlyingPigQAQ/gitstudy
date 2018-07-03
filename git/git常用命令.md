# Git常用命令
## git diff彩色输出
git config --global color.ui auto
### 工作区与暂存区比较
git diff
### 暂存区与版本区比较
git diff --staged
### 版本区互相比较
git diff commit1 commit2
## git checkout
### 回退到过去版本，进行代码检查或者bug查找
git checkout old_commit_id
### 从旧的commit_id到最新的id
git checkout master  
[commitId生成细节](https://git-scm.com/book/en/v2/Git-Internals-Git-Objects)
## 分支
###  创建分支
git branch new_branch
### 过去的commit_id创建分支
git branch new_branch commit_id
### 切换分支
git checkout branch_name
### 创建并切换分支
git checkout -b new_branch
### 删除分支
git branch -d new_branch
### 强制删除分支
git branch -D new_branch

## git 分页器
git 使用命令行分页器 less 浏览所有信息。以下是 less 的重要快捷键：  
要按行向下滚动，使用 j 或 ↓  
要按行向上滚动，使用 k 或 ↑  
要按页向下滚动，使用空格键或 Page Down 按钮  
要按页向下滚动，使用 b 或 Page Up 按钮  
要退出，使用 q  
## git log
-p  
--stat  
-w  
--oneline  
--graph 条目和行添加到输出的最左侧。显示实际的分支  
--all 显示仓库中的所有分支  
--decorate(显示tag标签，**2.3版本之后，自动添加该参数**)
## git show
-p  
--stat  
-w  
## git tag
-a 创建带注释的标签 （git tag -a v0.1）(git tag -a v0.1 privous_commit_id)
-d 删除标签

## git merge
合并有以下两种类型：
快进合并 – 要合并的分支必须位于检出分支前面。检出分支的指针将向前移动，指向另一分支所指向的同一 commit。  
普通类型的合并
 - 两个完全不同的分支被合并
 - 创建一个合并 commit  

## git commit
 --amend (添加文件到最近的commit,而不需要重新生成commit)
## git revert old_commit_id
- 将撤消目标 commit 所做出的更改(如果新建文件并提交到该commit,执行revert该文件会消失)  
- 创建一个新的 commit 来记录这一更改   

## git reset
## git reflog
--mixed(默认)  版本库->工作区  
--soft     版本库->暂存区  
--hard  版本库->垃圾回收区  
git reset HEAD~1 父节点
git reset HEAD~2 祖父节点...以此类推
>**执行reset之前，最好创建备份分支**   
git branch backup
