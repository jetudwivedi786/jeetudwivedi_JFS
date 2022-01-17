# creating database
use mongo_practice
#created colletction name movies and insert one data
 db.movies.insertOne({title:"Fight club",writer:"Chuck Palahniuko",Year:1999,actors:["Brad pitt","Edward Norton"]})
#inserted the multipleline data by insertmany command 
db.movies.insertMany([{title:"Pulp Fiction",writer:"Quentin Tarantino",Year:1994,actors:["John Travolta","Uma Thurman"]},{title:"Inglorious Basterds",writer:"Quentin Tarantino",Year:2009,actors:["Brad pitt","Diane Kruger","Eli Roth"]},{title:"The Hobbit: An Unexpected Journey",writer:"J.R.R Tolkein",Year:2012,franchise:"The Hobbit"},{title:"The Hobbit: The Desolation of Smaug",writer:"J.R.R Tolkein",Year:2013,franchise:"The Hobbit",synopsis:"Bilbo and Company are forced are to engage in a war against an array of combatants and keep the Lonely Mountain from falling into the hands of a rising darkness."},{title:"Pee Wee Herman's Big Adventure"},{title:"Avatar"}])
#query/Find documents
#1 get all the documents
db.movies.find().pretty()
#2 get all documents with writer set to "Querntin Tarantino"
db.movies.find({writer:"Quentin Tarantino"}).pretty()
#3 get all documents where actors include "Brad pitt"
db.movies.find({actors:"brad pitt"}).pretty()
#4 get all documents where franchise set to "The Hobbit"
db.movies.find({franchise:"The Hobbit"}).pretty()
#5 get all movies released in the 90's
db.movies.find({$and:[{Year:{$gt:1900}},{Year:{$lt:2000}}]}).pretty()
#6 get all movies released before the year 2000 or after 2010
db.movies.find({$or:[{Year:{$lt:2000}},{Year:{$gt:2010}}]}).pretty()
#update documents
#1 add synopsis

