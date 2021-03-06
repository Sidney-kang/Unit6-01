# Created by : Sidney Kang
# Created on : 1 Dec. 2017
# Created for : ICS3UR
# Daily Assignment - Unit 6-01
# This program

from enum import Enum

Week = Enum('Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday')

def day_of_the_week(day_chosen):
    chosen_day = Week[(day_chosen - 1)]
        
    return chosen_day
        
day_chosen = raw_input("What day of the week is your favourite (enter the number)?")

day_chosen = int(day_chosen)

while day_chosen < 0 or day_chosen > 7:
      print("Please enter a number between 1 - 7")
      day_chosen = raw_input("What day of the week is your favourite (enter the number)?")
      day_chosen = int(day_chosen)

day_of_the_week(day_chosen)
answer = day_of_the_week(day_chosen)
print("Your favourite day of the week is " + str(answer))
