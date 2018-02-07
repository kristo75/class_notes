class BankAccount

  attr_accessor :holder_name, :amount, :type

  def initialize(holder_name, amount, type)
    @holder_name = holder_name
    @amount = amount
    @type = type
  end


  def pay_into_account(amount_to_pay_in)
    @amount = @amount + amount_to_pay_in
  end

  def pay_monthly_fee

    if @type == "personal"
      @amount -= 10
    end
    if @type == "business"
      @amount -= 50
    end
  end

  #
  # def holder_name
  #   return @holder_name
  # end
  #
  # def amount
  #   return @amount
  # end
  #
  # def type
  #   return @type
  # end
  #
  # def set_holder_name(holder_name)
  #    @holder_name = holder_name
  #
  # end


end
