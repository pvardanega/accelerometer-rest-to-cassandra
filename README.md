# accelerometer-rest-to-cassandra

REST API receiving accelorometers data and storing them into Cassandra. Each acceleration contains:
* date when it has been captured (format is ISO-8601, eg, 2015-04-11T18:48:43.511Z)
* acceleration force along the x axis (unit is m/s²) 
* acceleration force along the y axis (unit is m/s²)
* acceleration force along the z axis (unit is m/s²) 

## Prerequisites
* Cassandra [http://apache.mirrors.ovh.net/ftp.apache.org/dist/cassandra/2.1.4/apache-cassandra-2.1.4-bin.tar.gz](2.1.4) installed locally
* Java 8+
* Gradle 2.3+

## Start the application
`mvn spring-boot:run`

## Use the API
* /POST http://localhost:8080/accelerometor-api/acceleration
* Header `Content-Type` must be set: application/json
* body: 
```
{
  "date": "2015-04-11T18:48:43.511Z",
  "x": 0.98
  "y": 6.43
  "z": 9.01
}
```
* returned status: 201 CREATED
