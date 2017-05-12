# Mongo DB Sample

Sample application wrote to learn Mongo.

This application uses Spring Boot


## URL's to test

Sample data:

```
{
	"_id" : ObjectId("5915276344ae3c15da7b2ce9"),
	"_class" : "br.com.apsusit.demo.model.Contact",
	"firstName" : "Wesley",
	"lastName" : "Santos",
	"address" : "0, Nowhere St",
	"phoneNumber" : "202-456-1111",
	"email" : "me@mastercard.com",
	"twitterHandle" : "@me",
	"facebookProfile" : "https://www.facebook.com/me",
	"linkedInProfile" : "http://www.linkedin.com/in/me/ ",
	"googlePlusProfile" : "https://plus.google.com/+me"
}

```
List of methods:

GET:
- http://localhost:8080/contacts - Select all
- http://localhost:8080/contacts/{id} - Select by id
- http://localhost:8080/contacts/name/{lastName} - Select by lastName
- http://localhost:8080/contacts/address/{address} - Select by address using like %.

POST:
- http://localhost:8080/contacts/

DELETE:
- http://localhost:8080/contacts/{id}

PUT:
- http://localhost:8080/contacts/{id}
