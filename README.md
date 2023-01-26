# Password Validator
This is a simple program validating strength of passwords.

A password is considered "weak" in following conditions:
  - If password is all lowercase.
  - If password is all uppercase.
  - If password is numeric.
  - If password is already in common words.
  - If password is shorter than 6 characters.
  
There are two main lists: passwords and common_words. Passwords are listed in passwords list and it is iterated in getPasswordStrength() method to validate strength of password and it's result is stored in strengths list. 
