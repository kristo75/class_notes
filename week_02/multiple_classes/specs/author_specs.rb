require("minitest/autorun")
require("minitest/rg")
require_relative("../author")
require_relative("../writing_tool")


class TestAuthor < MiniTest::Test

  def setup
    @laptop = WritingTool.new("MacBook Pro", "laptop")
    @typewriter = WritingTool.new("Remington", "typewriter")
    @author = Author.new("Neil Gaiman",
      @laptop)
      @author2 = Author.new("E.A Poe", @typewriter)
    end

    def test_author_has_name
      assert_equal("Neil Gaiman", @author.name())
    end
    
    def test_author_can_write
      assert_equal("American Gods",
        @author.write("American Gods"))
      end

      def test_author_can_write_with_typewriter
        result = @author2.write("The Raven")
        assert_equal("The Raven, with old school click clacking", result)
      end

    end
