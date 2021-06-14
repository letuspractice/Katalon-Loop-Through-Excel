import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.testdata.ExcelData

String OrderNumber =''
String priorOrderNumber =''
String name =''

String priorSubplan =''
String state =''
String determination =''
String desc =''
String longDesc =''

ExcelData data = findTestData("Orders Data")


for (def index : (0..data.getRowNumbers() - 1)) {

 //use the data
 OrderNumber = data.internallyGetValue("order_no", index) 
 name = data.internallyGetValue("name", index) 
 //state = data.internallyGetValue("State", index) 
 //determination = data.internallyGetValue("Lic Det", index)
 //desc = data.internallyGetValue("Lic Descr", index) 
 //longDesc = data.internallyGetValue("Long Descr", index) 
 if( (priorOrderNumber != OrderNumber) ) {
	 println( "${OrderNumber} is a new Order - Change something")
	 println("$name")
 } 

 	 
 //record the last order 
 priorOrderNumber = OrderNumber
 
 //save/update here data
 
}