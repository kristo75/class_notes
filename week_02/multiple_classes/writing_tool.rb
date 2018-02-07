class WritingTool

  attr_reader :name

  def initialize(name, tool_type)
    @name = name
    @tool_type = tool_type
  end

  def type(book)
    if @tool_type == "typewriter"
      return "#{book}, with old school click clacking"
    else
      return book
    end
  end


end
