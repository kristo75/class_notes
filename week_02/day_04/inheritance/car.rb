require_relative("vehicle.rb")


class Car < Vehicle

  attr_reader :colour

  def initialize(number_of_wheels, colour)
    super(number_of_wheels)
    @colour = colour
  end


end
