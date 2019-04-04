package com.thoughtworks.kotlin.classes

//1. BankAccount abstract base class
//   - has primary constructor with account number
//   - has withdraw and deposit methods
//   - balance is initialized to 0, and cannot be directly set from outside. It can be manipulated only through withdraw
//     and deposit methods
//   - Printing an object should show account number and balance clearly

//2. SavingsAccount is a BankAccount, and provides a method to calculate simple interest given a rate and number of years

//3. CurrentAccount is a BankAccount, with no extra behaviour compared to its base class

//