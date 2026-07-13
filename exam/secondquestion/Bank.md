# Bank Account and KYC - Java OOP Problem

## Problem Statement

Create a class **BankAccount** with the following attributes:

-   `accId` -- String
-   `accHolderName` -- String 
-   `accType` -- String in saving or current
-   `occupation` -- String


Create a class **KYC** with the following attributes:

-   `panCardNumber` -- String
-   `accountIdentificationType` -- String
-   `accountIdentification` -- String
-   `status` -- String

Provide appropriate constructors, getters and setters for all the
attributes.

A **BankAccount** has exactly one **KYC** object . A **KYC** has exactly one *BankAccount** object and 
**KYC** doesnot exists uniquely and always account should have a bank .


## Method

Create a static method:findtbankByKYC()

This method will take an array of BankAccount objects and a String parameter as input parameters.

This method will search for all BankAccount objects whose account type matches the given account type (String parameter passed) and whose associated KYC status is "Lapsed". The comparison should be case-insensitive.

The method should return an array of BankAccount objects that satisfy the above conditions.

If no BankAccount object satisfies the given criteria, then the method should return null.


All search operations  must be **case-insensitive**.

Declare Solution Class with the `main()` method:

  Declare an array of `BankAccount` objects.
 If the array length is less than or equal to `0`,
 Print Add few more accounts to the bank



6.  If the returned array is `null`, print:

```{=html}
<!-- -->
```
    KYC Lapsed is not found

Otherwise, print the details of each matching `BankAccount`.

## Sample Input

  3
A101
Rahul
Savings
Engineer
PAN12345
Aadhar
123456789012
Lapsed
A102
Priya
Current
Business
PAN23456
Passport
P9876543
Active
A103
Amit
Savings
Teacher
PAN34567
VoterID
V12345678
Lapsed
Savings
## Sample Output

  
Rahul
Savings
Engineer
Aadhar
Lapsed
Amit
Savings
Teacher
VoterID
Lapsed
## If No Matching Account Exists

### Input

   0

### Output

   Add few more accounts to bank account array

## Note:
Make sure the main method is in java.