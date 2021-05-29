
# VENDING MACHINE



## Covered Functionalities

- Option for the user to select an Item from the displayed list of coke,soda and pepsi.
- Option for the user to pay the amount in the denominations of 1,5,10,25 only.
- Collect item and the change if any.
- Option for the user to cancel the item and get the refund before buying the item.
- Option for the supplier to reset the machine upon successful authentication.

## Assumptions

- There was not much information about the type off application (UI or Console). Hence developed Console application.
- There was not much information about types of tests to be developed and hence developed the TestNG Unit tests.
- There was not much information on the definition for reset option for vending machine supplier. Hence, developed the application to take the input of the item code to reset the quanity of the respective item to a defined number.


## Run the Vending Machine Code

 - Open Eclipse IDE
 - Navigate to /VendingMachine(Console)/src/main/VendingMachine.java
 - Run the application
 - The application will open in the console and operation of the application is self explanatory based on the messages displayed in the console.
 
## Sample flow of the application

- As soon as VendingMachine.java is run, the user will have a choice either to continue or exit, with   the following message displayed in the console<br />
"Type Y and press Enterkey to start the vending machine or N to exit"
- If user types Y and press Enterkey,he will be prompted to enter the item code
- after the code is entered, user will be prompted to enter the amount.The flow continues
- Note:The above steps are of only one scenario mentioned for sample.Other valid scenarios could also be considered.
  
## Run the Vending Machine TestNg tests

 - Open Eclipse IDE
 - Navigate to /VendingMachine(Console)/src/test/ and the below tests are available <br />
 			ProductsDetailsTest.java <br />
 			SupplierTest.java <br />
 			ValidationsTest.java <br />
 - Please make sure the TestNG Library is added to the build path 
 - Run each of the file as TestNG test or right click on the test folder and run as TestNg test
 - Once the test is complete, the test results will be available in the test-output folder

