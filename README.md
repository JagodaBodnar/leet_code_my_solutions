### Instructions
Tasks from: https://leetcode.com/problemset/

-----------------------------------------------------------------------------------
### 217. Contains Duplicate
Given an integer array nums, return true if any value 
appears at least twice in the array,
and return false if every element is distinct.

#### Example 1:
Input: nums = [1,2,3,1]</br>
Output: true

#### Example 2:
Input: nums = [1,2,3,4]</br>
Output: false

#### Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]</br>
Output: true

-----------------------------------------------------------------------------------

### 1. Two Sum
Given an array of integers nums and an integer target, 
return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution,
and you may not use the same element twice.
You can return the answer in any order.

#### Example 1:
Input: nums = [2,7,11,15], target = 9 </br>
Output: [0,1]</br>
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].</br>

#### Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

#### Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]

-----------------------------------------------------------------------------------

### 242. Valid Anagram
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
typically using all the original letters exactly once.

#### Example 1:

Input: s = "anagram", t = "nagaram" </br>
Output: true
#### Example 2:
Input: s = "rat", t = "car"</br>
Output: false

-----------------------------------------------------------------------------------
 
### 49. Group Anagrams
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.

#### Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]</br>
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]</br>
#### Example 2:

Input: strs = [""]</br>
Output: [[""]]
#### Example 3:

Input: strs = ["a"]</br>
Output: [["a"]]

-----------------------------------------------------------------------------------

### 36. Valid Sudoku

Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.

Input: board =</br>
[["5","3",".",".","7",".",".",".","."]</br>
,["6",".",".","1","9","5",".",".","."]</br>
,[".","9","8",".",".",".",".","6","."]</br>
,["8",".",".",".","6",".",".",".","3"]</br>
,["4",".",".","8",".","3",".",".","1"]</br>
,["7",".",".",".","2",".",".",".","6"]</br>
,[".","6",".",".",".",".","2","8","."]</br>
,[".",".",".","4","1","9",".",".","5"]</br>
,[".",".",".",".","8",".",".","7","9"]]</br>
Output: true
 