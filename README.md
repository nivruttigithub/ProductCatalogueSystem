# ProductCatalogueSystem

## Overview
This project is a RESTful API for managing a structured product catalog system. It allows users to perform CRUD operations on products, search for products based on various criteria, and rate products. The API is built using Java, Spring boot with MongoDB as the database.

## Features
- CRUD operations for products
- Searching products by name, category, and attributes
- Pagination and sorting for efficient data retrieval
- Rating products with user comments
- MongoDB integration for data storage

## Prerequisites
Before running this project, ensure you have the following installed:
- Java Development Kit (JDK) 11 or higher
- Apache Maven
- MongoDB Server
  
## Set up MongoDB:
Ensure MongoDB is installed and running on your system.
Create a new database named product_catalog.

## MongoDB Response Structure : 
id
66265699efcd4d7ef2ddf6a0
name
"Laptop"
description
" designed to be portable computers smaller and lighter than desktops "
price
60000

categories
Array (2)
0
"HP"
1
"Dell"

attributes
Array (3)

0
Object
key
"size"
value
"large"

1
Object
key
"color"
value
"Silver"

2
Object
key
"brand"
value
"Example Brand"

availability
Object
inStock
true
quantity
100
_class
"com.LeadToRevenue.ProductCatalogueSystem.model.Product"
