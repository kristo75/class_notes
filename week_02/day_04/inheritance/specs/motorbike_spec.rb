require('minitest/autorun')
require_relative('../motorbike')

class TestMotorbike < Minitest::Test


  def setup
    @motorbike = Motorbike.new()
  end

  def test_motorbike_can_start_engine
    assert_equal("Vrrmmm, I'm a motorbike", @motorbike.start_engine)
  end

  def test_motorbike_has_four_wheels
    assert_equal(2, @motorbike.number_of_wheels)
  end


end
