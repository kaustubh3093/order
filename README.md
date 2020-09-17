# Order processing
## Name: Kaustubh Singh 

-----------------------------------------------------------------------
-----------------------------------------------------------------------
Following are the commands and the instructions to run your project.

1) Clone the project into the local repository
2) Import the project in any IDE of your choice

-----------------------------------------------------------------------
## Instruction to clean install:

####Command: Right Click on the project or pom.xml
####Command: Run As -> Maven Clean
####Command: Run As -> Maven Install

It will create the tar file into the target

-----------------------------------------------------------------------
## Instruction to Run the Project:

####Method 1:
####Command: Right click on OrderApplication.java class and Run as -> Java Application

####Method 2:
####Command: Into the Terminal : Navigate to the project directory --> java -jar target/order-0.0.1-SNAPSHOT.jar

Description: You project will start listening to the port 8080 and now you can work with the Rest endpoints

-----------------------------------------------------------------------

## Endpoints:
## Single Order Endpoints:

Create Order: 
Method: POST Endpoint: localhost:8080/order/create
JSON: 
	{
		"order_item_name" : "Pencil",
		"order_status" : "shipped",
		"order_item_qty" : 2,
		"order_subtotal" : 12.4,
		"order_customer_id": "pencil@1234",
		"order_tax" : 1.6,
		"order_shipping_charges" : 4,
		"order_total" : 18,
		"order_payment_method" : "Credit",
		"order_payment_date" : "2020-05-21T12:12:45.45",
		"order_created_date" : "2020-05-21T12:12:45.45",
		"order_modified_date" : "2020-05-21T12:12:45.45",
		"order_payment_confirmation_number" : 1234512,
		"order_billing_addressline1" : "1 Davis St",
		"order_billing_city" : "Chicago",
		"order_billing_state" : "IL",
		"order_billing_zip" : 12111,
		"order_instore_pickup" : true,
		"order_curbside_delivery" : false,
		"order_ship_to_home" : false,
		"order_shipping_addressline1" : "1 Davis ST",
		"order_shipping_city" : "Chicago",
		"order_shipping_state":"IL",
		"order_shipping_zip" : 12113
	}

Get Order:
Method: GET Endpoint: localhost:8080/order/a9738707-2d56-47d2-a4ec-7d6eb3b7c964
Return: Returns the order if order with the given id present in the database or else throw an exception

Update OrderStatus:
Method: Delete Endpoint: localhost:8080/order/bf27d687-a816-4b4f-b8bd-957c2c0a9514
Return: It will change the order status to Cancelled

## Bulk Order Endpoint:
To Add order in Bulk
Method: POST Endpoint: localhost:8080/bulk/batch
JSON:
[
    {
		"order_item_name" : "Pencil",
		"order_status" : "shipped",
		"order_item_qty" : 2,
		"order_subtotal" : 12.4,
		"order_customer_id": "pencil@1234",
		"order_tax" : 1.6,
		"order_shipping_charges" : 4,
		"order_total" : 18,
		"order_payment_method" : "Credit",
		"order_payment_date" : "2020-05-21T12:12:45.45",
		"order_created_date" : "2020-05-21T12:12:45.45",
		"order_modified_date" : "2020-05-21T12:12:45.45",
		"order_payment_confirmation_number" : 1234512,
		"order_billing_addressline1" : "1 Davis St",
		"order_billing_city" : "Chicago",
		"order_billing_state" : "IL",
		"order_billing_zip" : 12111,
		"order_instore_pickup" : true,
		"order_curbside_delivery" : false,
		"order_ship_to_home" : false,
		"order_shipping_addressline1" : "1 Davis ST",
		"order_shipping_city" : "Chicago",
		"order_shipping_state":"IL",
		"order_shipping_zip" : 12113
	},
    	{
		"order_item_name" : "Pen",
		"order_status" : "shipped",
		"order_item_qty" : 2,
		"order_subtotal" : 11.4,
		"order_customer_id": "pencil@1234",
		"order_tax" : 3.6,
		"order_shipping_charges" : 7,
		"order_total" : 22,
		"order_payment_method" : "Credit",
		"order_payment_date" : "2020-05-21T12:12:45.45",
		"order_created_date" : "2020-05-21T12:12:45.45",
		"order_modified_date" : "2020-05-21T12:12:45.45",
		"order_payment_confirmation_number" : 1234512,
		"order_billing_addressline1" : "1 Davis St",
		"order_billing_city" : "Chicago",
		"order_billing_state" : "IL",
		"order_billing_zip" : 12111,
		"order_instore_pickup" : true,
		"order_curbside_delivery" : false,
		"order_ship_to_home" : false,
		"order_shipping_addressline1" : "1 Davis ST",
		"order_shipping_city" : "Chicago",
		"order_shipping_state":"IL",
		"order_shipping_zip" : 12113
	}

]


To Update Order in bulk
Method: PUT Endpoint: localhost:8080/bulk/batch
JSON:
[
    {
        "order_id" : "15811e5f-d474-499d-ad36-73c54661af77",
        "order_status" : "shipped"
    },
    {
        "order_id" : "22548dda-9e93-4c84-bc0e-ae7aa6e03530",
        "order_status" : "Delivered"
    }
]

## Actuator Rest Endpoint
App Info --> http://localhost:8080/actuator/info
App Health Check --> http://localhost:8080/actuator/health

-----------------------------------------------------------------------

## Testing

## To test service
OrderServiceImplTest.java

## To test Controller
BulkOrderControllerTest.java
SingleOrderControllerTest.java
-----------------------------------------------------------------------

Date: [09/17/2020]


