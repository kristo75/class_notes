# counter = 0
# my_number = 7
#
# while (counter < my_number)
#   p "The counter is #{counter}"
#   counter += 1
# end
# ###########################
# my_number = 9
#
# p "What nubmber am I thinking of?"
# input = gets.chomp().to_i()
#
# while (input != my_number)
#   if (input < my_number)
#     p "Too low..."
#   else
#     p "Too high..."
#   end
#   p "Try again!"
#   input = gets.chomp().to_i()
#
# end
# # p "Yes, that's my number"
# # ################################
# while (true)
#   p "Type something:"
#   input = gets.chomp()
#   p "you Typed: #{input}"
#   break if (input.downcase == "q")
# end
#############################
# numbers = [1,2,3,4,5]
#
#
# for number in numbers
# p number * 3
# end
# p "i'm finished"
# # ################################
#
# numbers = [1,2,3,4,5]
#
# sum = 0
# #
# # for number in numbers
# #   sum = sum += number
# # end
# # p sum
# # #######################
#
# chicken_hashes = [
#   { name: "Margaret", age: 2, eggs: 0 },
#   { name: "Hetty", age: 1, eggs: 2 },
#   { name: "Henrietta", age: 3, eggs: 1 },
#   { name: "Audrey", age: 2, eggs: 0 },
#   { name: "Mabel", age: 5, eggs: 1 }
# ]
# # totaleggs = 0
# #
# for chicken_hash in chicken_hashes
#   # p "Hey #{chicken_hash[:name]}"
#  totaleggs += chicken_hash [:eggs]
#  chicken_hash [:eggs] = 0 #resets basked back to zero when
#  #print chicken_hashes
#
# end
# p totaleggs
# p chicken_hashes
#####################################
#
# def count_eggs(chickens_array)
# total_eggs = 0
#
#   for chicken_hash in chickens_array
#   total_eggs += chicken_hash[:eggs]
#   chicken_hash[:eggs] = 0
#   end
#   return total_eggs
# end
# #
# # p count_eggs(chicken_hashes)
# # ########################################
# def find_chicken_by_name(chickens_array, name)
#     for chicken_hash in chickens_array
#       if chicken_hash[:name] == name
#         return chicken_hash
#       end
#     end
#     return "Not found"
#   end
#
#   result1 = find_chicken_by_name(chicken_hashes, 'Mabel')
#
#   p result1
####

stops = [ "Croy", "Cumbernauld", "Falkirk High", "Linlithgow", "Livingston", "Haymarket" ]
# p stops.push("Edinburgh Waverley")



# 1. Add `"Edinburgh Waverley"` to the end of the array
# # 2. Add `"Glasgow Queen St"` to the start of the array
# p stops.unshift("Glasgow Queen St")

# 3. Add `"Polmont"` at the appropriate point (between `"Falkirk High"` and `"Linlithgow"`)
# p stops[4] = ("polmont")

# 4. Work out the index position of `"Linlithgow"`
# p stops.count["Lintlithgow"].to_i

# 5. Remove `"Livingston"` from the array using its name
p stops.pop(5)
# 6. Delete `"Cumbernauld"` from the array by index

# 7. How many stops there are in the array?
# 8. How many ways can we return `"Falkirk High"` from the array?
# 9. Reverse the positions of the stops in the array
# 10. Print out all the stops using a for loop
