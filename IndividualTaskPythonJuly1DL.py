with open ('/content/prices.txt', 'r') as file:
  prices = file.readlines()

  total_price = 0
  total_items = 0
  for priceline in prices:
    try:
      priceline = priceline.strip()
      total_price = total_price + float(priceline)
      total_items = total_items + 1
    except ValueError:
      print(f"Skipping invalid line: {priceline}")

  print(total_price)
  print(total_items)
  
