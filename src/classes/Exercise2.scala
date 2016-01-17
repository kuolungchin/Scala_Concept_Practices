package classes

class BankAccount {
  private var balanceAmt:Int = 0
  
  def balance = balanceAmt
  
  def withdraw(amt: Int){
    if(balanceAmt > amt) balanceAmt -= amt
  }
  
  def deposit(amt: Int){
    if(amt > 0) balanceAmt += amt
  }
}