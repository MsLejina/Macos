print('Dear Client, welcome to the Bank!') 

balance = 0

while True:
  try:
    bankOperation = int(input('What would you like to do?\nEnter "1" to Deposit money \nEnter "2" to Withdraw money \nEnter "3" to Check balance or \nEnter "4" to Exit \n' ))
    if bankOperation == 4:
      break
    elif bankOperation == 1:
      deposit = float(input('Enter the amount of money you want to deposit: '))
      if deposit < 0:
        print('Transaction failed. You have to enter a positive number.')
      else:
        balance = balance + deposit
        print(f'Your current balance is {balance} ')
    elif bankOperation == 2:
      withdrawal = float(input('Enter the amount of money you want to withdraw: '))
      if withdrawal > balance:
        print('Withdrawal is not possible, your balance is insufficient.')
      elif withdrawal < 0: 
        print('Withdrawal not possible: please enter a positive number.')
      else:
        balance = balance - withdrawal
        print(f'You withdrew {withdrawal}, your current balance is {balance}')
    elif bankOperation == 3:
      print(f'Your total balance is {balance}')
    else:
      print('Invalid input. Please enter a number from  1 to 4.')

  except Exception as e:
   print(f'Wrong input, exception was {e}.')
