chickens = [
  "Margaret",
  "Hetty",
  "Mabel",
  "Craig",
  "Max"
]


angry_chickens = []


chickens.each do |chicken|
  angry_chickens.push(chicken.upcase())
end

angry_chickens = chickens.map do |chicken|
  chicken.upcase()
end


p chickens
p angry_chickens








# for chicken in chickens
#   p chicken
# end
#or you can display as a block
# as per below.
#
# chickens.each {|chicken| print chicken}

# chickens.each do |chicken|
# p chicken
# end
