from ShoppingClassTW import shopping
#import shopping class from the file that contains the class

#defining list function and asks users to input number of items
def make_listTW():
    shopping_list = []
    number_of_items = eval(input("How many items will you order today? "))

    #if number of item entered is less than 1, while loop is used to ask for another input that is at least 1 or more.
    while True:
        if number_of_items < 1:
            print("Number of items must be at least 1")
            number_of_items = eval(input("How many items will you order today? "))
        else:
            break

    #iterating each item asking for name and amount of pounds
    for i in range(number_of_items):
        print("Item #",i+1)
        #using .title() capitalizes the first letter of the word input by the user
        name = input("Enter name of food for the item: ").title()
        amount = eval(input("Enter amount of pounds: "))

        #using a while loop to validate whether amount entered is greater than 0.
        #if not, user is asked to reinput the amount.
        while True:
            if amount <= 0:
                print("Amount of pounds must be greater than 0.")
                amount = eval(input("Enter amount of pounds: "))
            #if the amount is valid, the loop will break
            else:
                break

        item = shopping(name, amount)
        #appends each item entered by the user
        shopping_list.append(item)

    return shopping_list

#function that displays the list of items from the shopping list along with the name. amount of pounds, and price.
def displayTW(list_of_items):
    for items in list_of_items:
        print(items.__str__(),"\n---------------------------------------------------------------------")

#function that calculates the total cost of all items purchased
def calculate_amountTW(list_of_items): 
    total = 0
    for i in range(len(list_of_items)):
        total += list_of_items[i].totalTW()
    return total

#main function for calling all the above functions
def main_shoppingTW():
    shopping_list= make_listTW()
    print("Here's a summary of the items purchased \n---------------------------------------------------------------------")
    displayTW(shopping_list)
    print(f"Total Cost: ${calculate_amountTW(shopping_list):.2f}")

#calling out the main function
main_shoppingTW()
