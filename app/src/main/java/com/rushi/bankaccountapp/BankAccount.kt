package com.rushi.bankaccountapp

class BankAccount(var accountHolder:String,var balance:Double) {
    private var transactionHistory= mutableListOf<String>()

    fun checkBalance(){
     println("$accountHolder's has balanced $$balance")
    }

    fun deposit(amount:Double){
     balance +=amount
     transactionHistory.add("$accountHolder's Deposit $$amount")
    }

    fun withdraw(amount: Double){
     balance -=amount
     transactionHistory.add("$accountHolder's Withdraw $$amount")
    }

    fun transactionHistory(){
     println("$accountHolder's Transaction History :")
     for (transaction in transactionHistory){
      println(transaction)
     }

    }
}