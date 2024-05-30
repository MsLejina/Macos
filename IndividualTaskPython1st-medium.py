balance = 0
try:
  deposit = float(input('Please enter the amount of money you want to deposit: '))

  balance = balance + deposit
except Exception as e:
  print(f'Wrong input, exception was {e}.')

while True:
  try:
      new_deposit = input('Thank you! Would you like to make another deposit? If yes: enter the amount of money. If not and you want to exit, write "exit": ')
      new_deposit = new_deposit.lower()
      if new_deposit == 'exit':
        break
      else:
        balance = balance + float(new_deposit)
  except Exception as e:
    print(f'Wrong input, exception was {e}.')


print(f'Your total amount deposited is {balance}')
