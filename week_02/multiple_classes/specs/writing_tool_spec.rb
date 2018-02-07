require("minitest/autorun")
require("minitest/rg")
require_relative("../writing_tool")

class TestWritingTool < MiniTest::Test

  def setup
    @typewriter = WritingTool.new("Remington", "Typewriter")
  end

def test_tool_has_name
  assert_equal("Remington", @typewriter.name())
end


end
