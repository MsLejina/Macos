class Client:
  def __init__(self, client_id, client_name):
    self.client_id = client_id
    self.client_name = client_name
    self.transactions = []

  def purchase_items(self, items):
      new_transaction = Transaction(self, items)
      self.transactions.append(new_transaction)
     

  def print_transactions(self):
      print(f" {self.client_name} has made following transactions:")
      for transaction in self.transactions:
        transaction.print_summary()


class Items:

  def __init__(self, item_id, item_name, price):
    self.item_id = item_id
    self.item_name = item_name
    self.price = price


class Transaction:
  number_of_transactions = 1

  def __init__(self, client, items):
    self.client = client
    self.items = items
    self.transaction_id = Transaction.number_of_transactions
    Transaction.number_of_transactions += 1

  def print_summary(self):
      print(f"Transaction {self.transaction_id} contains:")
      total_cost = 0
      for item in self.items:
          print(f" - {item.item_name}: Eur {item.price}")
          total_cost += item.price
      print("Total Cost: Eur", total_cost)

inventory = [
    Items(1, "Shampoo", 13.99),
    Items(2, "Conditioner", 13.99),
    Items(3, "Shower gel", 4.99),
    Items(4, "Hand soap", 3.59),
    Items(5, "Hand cream", 2.55),
    Items(6, "Lip balm", 2.59),
    Items(7, "Body lotion", 5.38),
    Items(8, "Eye cream", 19.83),
    Items(9, "Shaving foam", 5.78),
    Items(10, "Tooth paste", 4.56)
  ]

clients = []
clients.append(Client('101', 'Tina'))
clients.append(Client('102', 'Anna'))
clients.append(Client('103', 'George'))

clients[0].purchase_items([inventory[0]])
clients[0].purchase_items([inventory[1], inventory[7], inventory[3], inventory[9]])
clients[1].purchase_items([inventory[2], inventory[8], inventory[4]])
clients[2].purchase_items([inventory[5],inventory[6]])


for client in clients:

  client.print_transactions()
