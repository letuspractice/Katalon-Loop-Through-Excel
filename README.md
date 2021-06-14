# Katalon-Loop-Through-Excel
This demostrates Katalon scripting to loop through an Excel Data source in a Test Case

In Katalon: Create a data source and point to an Excel file 

Use the imports:
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.testdata.ExcelData

Use the statement:
ExcelData data = findTestData("TestDataName") 
where TestDataName is the name you gave your test data

To loop use the block:
for (def index : (0..data.getRowNumbers() - 1)) {
//do something with data here
}

Inside the loop block you can use:
 //use the data
 
 OrderNumber = data.internallyGetValue("order_no", index)
 
 Where: 
 OrderNumber is a variable we would have defined earlier
 
 order_no is the column name in the Excel Sheet
 
 index is the current row number in the loop
