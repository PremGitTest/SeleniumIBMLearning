superhero=["Thor","Dr. Strange","Ironman",["Hulk","MS Marvel"]]
print(superhero)

def sayhello(name):
    print("Greetings "+name)
    print("My superhero is:"+superhero[2])
    print("Greeting"+name+"!!"+"My favorite superhero is: "+superhero[1]+"and total count is: "+str(len(superhero)))
    print(f'Greeting {name} !!, My favorite superhero is: {superhero[1]} and total count is: {str(len(superhero))}')

sayhello("Prem")
print(superhero[-1][0])
print(superhero[-1])
print(superhero[3][1])
def sayhello():
    print("Greeting!! ")

sayhello()
#prints all values
for x in superhero:
    print(x)
#get lenght of list
print(len(superhero))
#validate value present in lis
#isThorPresent="Thor" in superhero

if("Thor" in superhero):
    print("Yes,'Thor is present in the list")
#ADD ITEM into the list
superhero.insert(4, "Batman")
print(superhero)
#remove an item
superhero.remove("Thor")
print(superhero)
#remove an item from last
superhero.pop()
print(superhero)
#remove third last
superhero.pop(2)
itemremoved=superhero.pop(1)
print(itemremoved)
print(superhero)
#empty list
superhero.clear()
print(superhero)

superhero1=("Hulk","Thor","Ironman","MARVEL")
print(type(superhero1))

superhero2={"Hulk","Thor","Superman","Ironman"}
print(type(superhero2))
superhero2.add("Batman")
print(superhero2)
print(superhero1, superhero2)
superhero2.update(["Msuniverse","DrStrange"])
print(superhero2)
for x in superhero1:
    print(x)
for x in superhero2:
    print(x)
print(len(superhero1))
print(len(superhero2))  
isHulkpresent="MsUniversee" in superhero1
print(isHulkpresent)
isHulkpresent="Hulk" in superhero2
print(isHulkpresent)
#Dictionary creation-------
browser={
    "browserName":"Chrome",
    "createdBy":"Google",
    "latest_version":106,
    "old_version":[105,104,103,102,101]
    }
print(type(browser))
print(browser)
print("------get browser values----")
print(browser["latest_version"])
print(browser["old_version"])
print(browser["old_version"][-1])
#change the key values
print("----change values-----")
print(browser)
browser["latest_version"]=107
browser["old_version"][-2]=108.5
print(browser)
#get all keys
print("------get all keys------")
for x in browser:
    print(x)
    print(browser[x])
for x in browser:
    print("key:"+x+",value:"+str(browser[x]))
    print(f'key: {x} ,values: {browser[x]}')

#access keys and values both
for x, y in browser.items():
    print(f'{x}:{y}')

# validate key present in dictionary 

verifyPresent = "latest_version" in browser

print(verifyPresent)
if "latest_version" in browser:

    print(f'yes, key present into dictionary and its value are: {browser["latest_version"]}')
#Add items to dictionary
print("----add items to dictionary--------")
print(browser)
browser["isWinSupported"]=True
print(browser)
#remove an item from dictionary
print("-----remove item from dictionary------")
print(browser)
browser.pop("isWinSupported")
print(browser)

ibm_emp = {"empName": "Amit", "emp_ID" : 123456, "emp_phone": "9899989988", "location": "NCR"}
removedItems = ("emp_ID", "location")     # tuple example ------ set/tuple/list
print(ibm_emp)



for x in removedItems:
    ibm_emp.pop(x)
print(ibm_emp)







# # Empty dictionary
ibm_emp.clear()
print(ibm_emp)

#Constructor
browser1 = dict(

                browserName = "Chrome",

                createdBy = "Google",

                latest_version = 106,

                old_version = [105.5, 104.5, 103.5, 102.5, 101.5]

                

                )

print(type(browser))

print(browser)



print(type(browser1))

print(browser1)