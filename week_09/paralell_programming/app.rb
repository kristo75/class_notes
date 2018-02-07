# def puts_later(string, seconds_to_wait)
#   return Thread.new do
#     sleep(seconds_to_wait)
#     p string
#   end
# end
#
# p "Hi"
# thread = puts_later("bye", 4)
# new_thread = puts_later("Am I late?", 3)
# p "What's up?"
#
#  thread.join()
# new_thread.join()
#
# #Hi
# #Whats Up
# #Am I late
# #Bye
