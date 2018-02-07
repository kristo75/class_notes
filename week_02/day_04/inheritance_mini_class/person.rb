class Person

  attr_reader :first_name, :last_name

  def initialize(first_name, last_name)
    @first_name = first_name
    @last_name = last_name
  end

  def talk()
    return "Hello, my name is Kris Anderson"

  def first_name()
    return "Kris"
  end

  def last_name()
    return "Anderson"
  end
end
