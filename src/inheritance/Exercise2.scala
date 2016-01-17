package inheritance

class BankAccount2(initialBalance: Double) {
  private var balance = initialBalance
  def currentBalance = balance
  def deposit(amount: Double) = {balance += amount; balance}
  def withdraw(amount: Double) = {balance += amount; balance}
}

class SavingAccount(initialBalance: Double) extends BankAccount2(initialBalance){
  
  private var freeDepositCount = 3
  private val interest: Double = 0.05
  
  def earnMonthlyInterest{
    freeDepositCount = 3
    super.deposit(super.deposit(0) * 0.05)
  }
  
  override def deposit(amount: Double) = { 
     if(freeDepositCount > 0 ){
       freeDepositCount -= 1
       super.deposit(amount)
     }else{
       super.deposit(amount - 1)
     }
   }
  
  override def withdraw(amount: Double) = { 
    if(freeDepositCount > 0 ){
       freeDepositCount -= 1
       super.withdraw(amount)
     }else{
       super.withdraw(amount - 1)
     }
  }
}