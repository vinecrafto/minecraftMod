#!/usr/bin/env python
# encoding: utf-8

import os.path
import sys
import subprocess

if __name__ == "__main__":
    this_path = os.path.dirname(os.path.realpath(__file__))
    gradlew = 'gradlew'
    gradle = os.path.join(this_path, gradlew)
    args = [gradle, 'setupDecompWorkspace', 'eclipse']
    print args

    subprocess.Popen(args)

# `pwd`/gradlew setupDecompWorkspace eclipse
