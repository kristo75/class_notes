chickens = [
  "Margaret",
  "Hetty",
  "Mabel",
  "Craig",
  "Max"
]

# chickens.each_with_index do |chicken, index|
# p "#{chicken} is at index #{index}"
# end
#
# found_chicken = chickens.find {|chicken| chicken[0] == 'H'}
#(This just finds first chicken with 'M')
# p found_chicken
#
# ➜  enumeration ruby more_enumerable_methods.rb
# "Hetty"

# all_m_chickens = chickens.find_all {|chicken| chicken[0] =='M'}
#
# p all_m_chickens
# #this prints all chickens with a "M"
# ➜  enumeration ruby more_enumerable_methods.rb
# # ["Margaret", "Mabel", "Max"]
#
# string = chickens.reduce {|accumulator, chicken| accumulator + ", " + chicken}
# p string


numbers = [1, 2, 3, 4, 5]

sum = numbers.reduce do |running_total, current_number|
running_total + current_number
end

p sum
