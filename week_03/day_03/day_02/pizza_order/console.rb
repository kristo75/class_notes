require('pry-byebug')
require_relative('./models/pizza_order')
require_relative('./models/customer')

PizzaOrder.delete_all()
Customer.delete_all()

customer1 = Customer.new({
  'first_name' => 'Jason',
  'last_name' => 'Byrne'
  })

customer1.save()

order1 = PizzaOrder.new({
  'topping' => "Mushroom",
  'quantity' => '2',
  "customer_id" => customer1.id
  })

order1.save()
order1.topping='Cheese'
all_orders = PizzaOrder.all()
order1.update()

customer = customer1.get_pizza

orders = customer1.get_orders


binding.pry
nil
