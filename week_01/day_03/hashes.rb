# meals = ['Corn Flakes', 'Soup', 'Sushi']
#
# p meals[0]
#
# my_first_hash = Hash.new()
# my_seond_hash = {}
# #
#
# meals = {breakfast: "corn flakes", :lunch => "soup", :dinner => "sushi"}
#
#
# p meals
#
# p meals[:breakfast]
#
#
# p meals.keys()
# p meals.values()

#
# name = {"josh" => 20, "Mia" => 15, "Emmeline" => 10}
#
# name["josh"] = 30
#
# p name
# #
#  countries = {
#    uk: {
#         capital: "London",
#         population: 1000
#       },
#    germany: {
#         capital: "Berlin",
#         population: 2000
#       }
#  }
#  p countries[:germany] [:population]
#
marvel = {
          ironman: {
                    alias: "Tony Stark",
                    attacks: {
                      punch: 10,
                      kick: 100
                              }
                    },

          hulk: {
                  alias: "Bruce Banner",
                  attacks: {
                  smash: 1000,
                  roll: 500
                            }
                }

          }
          p marvel[:hulk] [:attacks] [:smash]
