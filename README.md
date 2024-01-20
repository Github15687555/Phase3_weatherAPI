# simplilearnPhase3Project1

I have performed API testing on Postman for the application (https://openweathermap.org/api), on RestAssured for (https://dummy.restapiexample.com), and performed load testing on JMeter for (https://blazedemo.com). 

- SCENARIO 1 (Postman)
Inside my new collection, I created global variables for appID, city, state and country. Then I created two Get requests for geolocation; the first request provided me the latitude and longitude values for my city and state, and the second one also provided me the country.
Using the latitude and longitude values from the first requests, I created global variables for them and inputted them on a new Get request for Air pollution.

The Test asserted that the status code of the request would return as 200, that the latitude and longitude values in the JSON response body were matching with the expected values, and that the JSON response body contained an expected string. All 3 test types passed.

- SCENARIO 2 (RestAssured)
Under my package com.project.dummyapi, I created 3 classes.
The first class GetRequest sent out an API request to fetch all the employee data and asserted the response body contained a specific string, and another API request to fetch all employee data by ID (for ID# 16) and asserted the response body contained a specific string.

The second class PutRequest sent out an API request to update employee data (for ID# 1) and asserted the response body contained a specific string.

The third class DeleteRequest sent out an API request to delete employee record (for ID# 2) and asserted the response body contained a specific string.

- SCENARIO 3 (JMeter)
Load testing
The script on the application was performed using the HTTP(S) Test Script Recorder. The flight from Sao Paulo to London was chosen, and the flight provided by United Airlines, and so forth. The thread group was then run with a single user (#ThreadCount = 1 user and Ramp-Up time = 1 second), and then virtual users were added (#ThreadCount = 500 users and Ramp-Up time = 2 seconds)

Finally, A Summary report was produced where the average time and error percentage can be analyzed for each sampler.
