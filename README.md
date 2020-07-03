# service-cars
An example spring boot project providing rest api to mange cars


#Getting started
1. Start postgres sql 
docker run --name postgres-o -e POSTGRES_PASSWORD=admin123 -d -p 5432:5432 postgres:alpine

2. Start spring boot project from IDE


APIs:

1. GET /rest/v1/cars

Example :
Request: 
GET localhost:8080/rest/v1/cars

Response : 
[
    {
        "id": 1,
        "name": "Hyundai i20",
        "details": "{\"gearType\": \"auto\", \"releaseYear\": \"2020\"}"
    },
    {
        "id": 2,
        "name": "Maruti Suzuki",
        "details": "{\"gearType\": \"manual\"}"
    }
]


2. POST /rest/v1/cars

Example : 

Request: 
body :
{
    "name" : "Maruti Suzuki",
    "details" : "{\"gearType\" :\"manual\"}"
    
}

Response: 
{
    "id": 1,
    "name": "Maruti Suzuki",
    "details": "{\"gearType\" :\"manual\"}"
}

