/*
15. Write a Java program to add, update, remove, and display login details using
LinkedHashMap.
TestCases:
Input: Add, update, display (insertion order preserved)
ADD alice a1
ADD bob b1
UPDATE alice a2
DISPLAY
Output: true
{alice=a2, bob=b1}
Input: Remove, re-add (reinserted at end)
ADD alice a1
ADD bob b1
ADD carol c1
REMOVE bob
ADD bob b2
DISPLAY
Output: true
{alice=a1, carol=c1, bob=b2}
*/