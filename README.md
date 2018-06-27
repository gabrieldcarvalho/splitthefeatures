# SplitTheFeatures
A restaurant related social app with awesome features 
An experiment with Eureka client-side service discovery to build a scalable microservices architecture

# What is it for?
If you're an indecise person and still wants to have no trouble ordering a good meal, we choose the restaurant for you and even give you a discount coupon!
* The discount value will be based in how much filter you input, high risk, high reward!
* You can choose how long it will take to expire the coupon, but once the coupon is generated there is no rollback! Choose it wisely!

# Hou to execute it
* Run the service-registry first, and then the cousine-api, restaurant-api and roulette-api
* These applications are already set to run in different ports in order to make possible run everything at the same time in development environment
* Forget about the api-gateway (still not ready)

# Things to be done:
* Unit tests with Mockito; Integration tests with Wiremock/Mockito
* Swagger documentation
* Set the Zuul api-gateway
* Calculate the current hard-coded discount value
* Improve the random restaurant obtainance; It shouldn't search all the restaurants every time

# Future developments
* Authentication / Customer registrations;
* Location filtering, with a radius input;
* Restaurants validating coupons in order to allow customers generate new ones;

