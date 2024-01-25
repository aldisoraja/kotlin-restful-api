# API Specification

## Authentication
request :
  - Header :
    - X-Api-Key : "your secret api key"

## Get Baju

request :
- Method : GET
- Endpoint : `/api/baju`
- Header :
    - Accept: application/json
- Query Param :
    - size : number,
    - page : number
- Body :

response :

```json
{
    "code" : "number",
    "status" : "string",
    "data" :[ {
        "id": "string, unique",
        "size": "string",
        "warna": "string",
        "tipe": "string",
        "harga": "long",
        "createAt" : "date",
        "updateAt" : "date"
    },
    {
        "id": "string, unique",
        "size": "string",
        "warna": "string",
        "tipe": "string",
        "harga": "long",
        "createAt" : "date",
        "updateAt" : "date"
    }
  ]
}
```

## Get Baju {id}
request :
- Method : GET
- Endpoint : `/api/baju/{id}`
- Header :
    - Accept: application/json
- Body :

response :

```json
{
  "code" : "number",
  "status" : "string",
  "data" : {
    "id": "string, unique",
    "size": "string",
    "warna": "string",
    "tipe": "string",
    "harga": "long",
    "createAt" : "date",
    "updateAt" : "date"
  }
}
```

## Create Baju
request : 
- Method : POST
- Endpoint : `/api/baju`
- Header : 
  - Content-Type: application/json
  - Accept: application/json
- Body :

```json
{
    "id": "string, unique",
    "size": "string",
    "warna": "string",
    "tipe": "string",
    "harga": "long"
}
```
response :

```json
{
  "code" : "number",
  "status" : "string",
  "data" : {
    "id": "string, unique",
    "size": "string",
    "warna": "string",
    "tipe": "string",
    "harga": "long",
    "createAt" : "date",
    "updateAt" : "date"
  }
}
```

## Update Baju

request :
- Method : PUT
- Endpoint : `/api/baju/{id}`
- Header :
    - Content-Type: application/json
    - Accept: application/json
- Body :

```json
{
    "size": "string",
    "warna": "string",
    "tipe": "string",
    "harga": "long"
}
```
response :

```json
{
  "code" : "number",
  "status" : "string",
  "data" : {
    "id": "string, unique",
    "size": "string",
    "warna": "string",
    "tipe": "string",
    "harga": "long",
    "createAt" : "date",
    "updateAt" : "date"
  }
}
```

## Delete Baju

request :
- Method : DELETE
- Endpoint : `/api/baju/{id}`
- Header :
    - Accept: application/json
- Body :

response :

```json
{
    "code" : "number",
    "status" : "string"
}
```
