# Bank Account and KYC - Java OOP Problem

## Problem Statement

Create a class **BankAccount** with the following attributes:

-   `accId` -- String
-   `accHolderName` -- String
-   `accType` -- String
-   `occupation` -- String
-   `kyc` -- KYC

Create a class **KYC** with the following attributes:

-   `panCardNumber` -- String
-   `accountIdentificationType` -- String
-   `accountIdentification` -- String
-   `status` -- String

Provide appropriate constructors, getters and setters for all the
attributes.

A **BankAccount** has exactly one **KYC** object associated with it
(Aggregation).

## Method

Create a static method:

``` java
public static BankAccount[] findBankByKYC(BankAccount[] accounts, String accountType)
```

### Requirements

-   Search for all BankAccount objects whose:
    -   `accType` matches the given `accountType`.
    -   Associated KYC `status` is `"Lapsed"`.
-   Both comparisons must be **case-insensitive**.
-   Return an array of all matching BankAccount objects.
-   If no matching object is found, return `null`.

## Solution Class

In the `main()` method:

1.  Declare an array of `BankAccount` objects.
2.  If the array length is less than or equal to `0`, initialize it with
    a valid size.
3.  Create and add a few `BankAccount` objects along with their
    respective `KYC` objects.
4.  Read the `accountType` from the user.
5.  Call:

``` java
findBankByKYC(accounts, accountType);
```

6.  If the returned array is `null`, print:

```{=html}
<!-- -->
```
    KYC Lapsed is not found

Otherwise, print the details of each matching `BankAccount`.

## Sample Input

    Savings

## Sample Output

    A101
    Rahul
    Savings
    Engineer

    A105
    Priya
    Savings
    Teacher

## If No Matching Account Exists

### Input

    Current

### Output

    KYC Lapsed is not found
