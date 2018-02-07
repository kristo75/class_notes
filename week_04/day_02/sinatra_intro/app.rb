require('sinatra')
require('sinatra/contrib/all') if development?()

get('/hello') do
  p 'Hi!'
  name = 'Kris'
  "Hello #{name}"

end

# Make a get route called "roll-die" and use Ruby
# code to return a random number between 1 and 6

get('/roll-die') do
  # random_generator = Random.new()
  # random_number = random_generator.rand(1..6)
  # random_number.to_s()

  "rolling... #{rand(1..6)}"
end


get('/hello/:first/:last') do
  p params.to_s()

  "Hello #{params['first']} #{params['last']}!"
end

get('/friends/:number') do
  friends =['Monica', 'Joey', 'Chandler', 'Phoebe', 'Rachel', 'Ross']
  index = params[:number].to_i() - 1
  friends[index]

end

get('friends/:name') do
  friends =['Monica', 'Joey', 'Chandler', 'Phoebe', 'Rachel', 'Ross']
  if friends.include?(params[:name])
    "yes! That person is a friend"


  else
    "no, I don't know a #{params[:name]}"

  end
end
