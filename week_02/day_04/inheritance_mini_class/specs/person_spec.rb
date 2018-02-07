require('minitest/autorun')
require_relative('../person.rb')

class TestPerson < Minitest::Test

  def setup
    @person = Person.new("Kris", "Anderson")
  end

  def test_person_has_first_name
    assert_equal("Kris", @person.first_name)
  end

  def test_person_has_last_name
    assert_equal("Anderson", @person.last_name)
  end
  #
  def test_talk
    assert_equal("Helo my name is Kris Anderson", @person.talk)
  end

end
