#!/bin/sh

git checkout master
git pull
git for-each-ref --shell --format="%(refname:lstrip=-1)" refs/remotes/origin | \
while read entr
do
   entry=$(echo "$entr" | sed "s/'//g")
   if [ "$entry" = "HEAD" ] || [ "$entry" = "master" ]  
   then
	continue  
   fi
   git checkout "refs/remotes/origin/$entry" && git merge master && git push origin "HEAD:$entry"
done
git checkout master


