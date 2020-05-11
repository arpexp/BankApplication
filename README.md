Please find final code in zip format .

Enum class is used for taking functionality of Saving bank account and Current Bank Account.
SAVING("SAVING_ACCOUNT"),
CURRENT("CURRENT_ACCOUNT");


**There are following API's:**

HeadOfficeController

API: creating Headbank branch :
http://localhost:8080/bank/headoffice

API: creating bank branch :

API:http://localhost:8080/bank/office

API:http://localhost:8080/bank/getbranch/{id}

API:http://localhost:8080/bank/getallbranch

=============================================================================================

CustomerController:

API:http://localhost:8080/customer/createcustomer

=============================================================================================

BankAccountController:

API:creating customer for customer entity
http://localhost:8080/customer/createcustomer

API: WithDraw Amount from account
http://localhost:8080/bankaccount/withdraw

API: Deposit Amount in account- same as withdraw with replacing amount+current_balance.

API: TransactionList from account:

http://localhost:8080/bankaccount/getTransaction/{accountNumber}

APi: http://localhost:8080/bankaccount/getminiTransaction/{accountNumber}



=======================================================================================
BranchController:
API:-Creating account of customer
http://localhost:8080/branch/createaccount

API: Getting customer by PanNumber
http://localhost:8080/branch/getCustomerbyPan

API:http://localhost:8080/branch/getCustomerAccountNumber

=========================================================================================


MYSQL DB is used for DB operations.


 
 





