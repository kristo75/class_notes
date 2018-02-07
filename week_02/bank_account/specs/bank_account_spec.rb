require('minitest/autorun')
require('minitest/rg')
require_relative('../bank_account')

class TestBankAccount < MiniTest::Test

  def setup
    @bank_account = BankAccount.new("John", 500, "business")
    @bank_account2 = BankAccount.new("John", 500, "personal")
  end


  def test_account_name
    bank_account = BankAccount.new("John", 500, "business")
    assert_equal("John",bank_account.holder_name)

  end

  def test_account_amount
    bank_account = BankAccount.new("John", 500, "business")
    assert_equal(500,bank_account.amount)
  end

  def test_account_type
    bank_account = BankAccount.new("John", 500, "business")
    assert_equal("business",bank_account.type)
  end

  def test_set_holder_name
    bank_account = BankAccount.new("John", 500, "business")
    bank_account.holder_name=("Joanna")
    assert_equal("Joanna",bank_account.holder_name)
  end

  def test_pay_into_account
    @bank_account.pay_into_account(100)
    assert_equal(600,@bank_account.amount)
  end

  def test_pay_monthly_fee
    @bank_account.pay_monthly_fee
    assert_equal(450, @bank_account.amount)
  end



end
