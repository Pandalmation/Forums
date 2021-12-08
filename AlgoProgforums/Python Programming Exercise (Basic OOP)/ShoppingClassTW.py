#created class called shopping
class shopping:

    #created initializer method to get name of item and the amount needed
    def __init__(self, name, amount):
        self.name = name
        self.amount = amount
        self.price = 0
        self.totalprice = 0

    #created private price list method to store prices of each food item
    def __PriceListTW__(self):
        if self.name== "Dry Cured Iberian Ham":
            self.price= 177.8
        elif self.name== "Wagyu Steaks":
            self.price= 450
        elif self.name== "Matsutake Mushrooms":
            self.price= 272
        elif self.name== "Kopi Luwak Coffee":
            self.price= 306.5
        elif self.name== "Moose Cheese":
            self.price= 487.2
        elif self.name== "White Truffles":
            self.price= 3600
        elif self.name== "Blue Fin Tuna":
            self.price= 3603
        elif self.name== "Le Bonnotte Potatoes":
            self.price= 270.81
        else:
            self.price= 0.00

    #created total price method to calculate total price for the amount of a single food item purchased
    def totalTW(self):
        self.__PriceListTW__()
        self.totalprice = self.price*self.amount
        return self.totalprice
    
    #created an accessor method used to access all data related to the item entered
    def __str__(self):
        self.__PriceListTW__()
        return f"Item: {self.name} \nAmount ordered: {self.amount} pounds \nPrice per pound: ${self.price:.2f} \nPrice of Order: ${self.totalTW():.2f}"




