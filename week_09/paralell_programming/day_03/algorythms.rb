# find number 23 in the array below

# sorted_array = [1,3,7,8,9,21,23,45,46]
#
# def linear_search(search_number, array)
#   for number in array
#     return true if number == search_number
#   end
#   return false
# end
#
# p linear_search(23, sorted_array)



#find middle element
#check if its my number
#decide if number is bigger or smaller.
#repeat

sorted_array = [1,3,7,8,9,21,23,45,46]

def binary_search(search_number, array)

  return false if array.empty?

  middle_index = array.length() / 2
  middle_element = array[middle_index]

  return true if search_number == middle_element

  new_search_area = search_number < middle_element ?
  array[0..middle_index -1] : array[middle_index +1..array.length() - 1]
  return binary_search(search_number, new_search_area)

end
p binary_search(10, sorted_array)
