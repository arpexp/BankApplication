
Enum class is used for taking functionality of Saving bank account and Current Bank Account.
SAVING("SAVING_ACCOUNT"),
CURRENT("CURRENT_ACCOUNT");


**There are following API's:**

HeadOfficeController
API: creating bank branch :
(HeadBranch is created by hardcode just for illustration)
http://localhost:8080/bank/office

=============================================================================================

BankAccountController:

API:creating customer for customer entity
http://localhost:8080/customer/createcustomer

API: WithDraw Amount from account
http://localhost:8080/bankaccount/withdraw

Similarly we can create deposit api as well with little modification.



=======================================================================================
BranchController:
API:-Creating account of customer
http://localhost:8080/branch/createaccount

API: Getting customer by PanNumber
http://localhost:8080/branch/getCustomerbyPan

=========================================================================================


Transaction is getting saved in transaction entity and ministatement functionality can be achieved
by writing modifying query as which is used in Transaction repo :
 @Query(value = "Select * from transaction limit 10 WHERE accountNumber = :accountNumber order by id desc", nativeQuery = true)
 
 Currently the project is in working state(75%) and few functionalities are yet to be completed .





