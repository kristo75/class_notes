require_relative('../db/sql_runner')

class Customer

  attr_reader(:id)
  attr_accessor(:first_name, :last_name)

  def initialize(options)
    @id = options['id'].to_i() if options['id']
    @first_name = options['first_name']
    @last_name = options['last_name']
  end


  def save()
    sql = "INSERT INTO customers
    (first_name,last_name)
    VALUES ($1, $2)
    RETURNING id;"
    result = SqlRunner.run(sql, [@first_name, @last_name])
    @id = result[0]['id'].to_i()

    # array_ofhashes = db.exec_prepared('save', values)
    # id_hash = results[0]
    # id = id_hash['id']
    # @id = id.to_i()

  end

  def pizza_orders
    sql = 'SELECT * FROM pizza_orders
    WHERE customer_id = $1'
    order_hashes = SqlRunner.run(sql, [@id])
    order_objects = order_hashes.map do |order_hash|
      PizzaOrder.new(order_hash)
    end

    return order_objects

  end

  def Customer.delete_all
    sql = "DELETE FROM customers;"
    SqlRunner.run(sql)
  end

end
