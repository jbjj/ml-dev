# ML-Dev

An Eclipse plug-in for Standard ML.

ML-Dev is a plug-in for the [Eclipse IDE][eclipse] that adds support for the Standard ML
programming language. It provides features for programming in SML using Eclipse, such as
an editor with syntax highlighting and error checking, and the ability to run SML programs within
Eclipse.


## Features

-   Text editor for SML
    -   Syntax highlighting
    -   Highlighting of matching brackets
    -   Syntax errors marked while typing

-   Outline of all declarations in the file
    -   Updated as you type
    -   Selection follows editor and vice versa

-   Run SML programs within Eclipse
    -   Support for CM

-   User guide integrated into Eclipse help


## Usage

ML-Dev _User Guide_ contains important information for running SML in Eclipse. The User Guide can
be accessed from the Eclipse help system (_Help \> Help Contents_). You can also
[read the User Guide online][mldev-guide].

Running SML programs requires an interactive SML interpreter installed on your system. The plug-in
has only been tested on SML/NJ 110.0.7, but it should work on any SML implementation that supports the
`use` primitive.


## Authors

The ML-Dev plug-in was written by [Rahul Narain][narain] in 2004, with the inspiration and guidance
of [Prof. Sanjiva Prasad][prasad].

[eclipse]: http://www.eclipse.org
[mldev-guide]: http://www.eecs.berkeley.edu/~narain/projects/mldev/userguide/
[narain]: http://www.eecs.berkeley.edu/~narain/
[prasad]: http://www.cse.iitd.ac.in/~sanjiva/
