# CS 3308 Mission 04 -- Deques

## Due: Sunday February 10, 2019 @ 2300

## Purpose
* Build a Deque Implementation using a Wrapped LinkedList
* Implement some useful deque methods
* Implement an efficient stack merging method using a Deque
* Implement a new data structure using a deque

## Problem Statement
Given the Deque ADT, implement a Deque using your DoublyLinkedList. Then use the Deque and other ADTs to solve the following problems:

1. Suppose you have two nonempty stacks S and T and a deque D. Describe how to use D so that S stores all teh elements of T below all of its original elements with both sets of elements still in their original order.
2. Using a Deque to design a two-color DoubleStack ADT which represents two stacks -- one "red" and one "blue" -- and which has two versions of the basic stack operations.

## Assignment
1. Fork this repository
2. Review the two new interfaces in `edu.isu.cs.structures` package -- `Deque` and `RedBlueDoubleStack`. Pay close attention to the methods defined, any interfaces they extend, and the documentation provided.
3. Using those interfaces implement: `LinkedDeque` which is a `Deque` based on a `DoublyLinkedList` as a basis and `RedBlueDoubleStackImpl` which is a `RedBlueDoubleStack` which is based on a `Deque`.
4. Once you have those implemented, then implement the method `<E> void dequeStackMerge(Stack<E> into, Stack<E> from)` in class `DequeStackMerge`. Be sure to take note of the documentation and even peruse the associated tests to fully understand this method.

## Submission
When you have completed the assignment (all tests pass) or it is reaching midnight of the due date, make sure you have completed the following:
1. Committed all changes to your repo
2. Pushed your changes to GitHub
3. Tagged your repo as "COMPLETE"
4. Pushed the "COMPLETE" tag to GitHub

## Grading -- 70 Points
* DequeStackMerge - 3 Points
* LinkedDeque - 31 Points
* RedBlueDoubleStack - 30 Points
* Comments and Style - 6 Points
