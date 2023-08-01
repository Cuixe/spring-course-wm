Microservice communication
it is very common in microservice architecture that service talk to each other user a URL rest call
Traditionally this is getting out using RestTemplate class
But using RestTemplate is error prone and time consuming
In order to make rest calls declarate in spring cloud offer the library Openfeign
Steps to use Openfeign
1.- Add appropiate dependency
2.- Create an interface CouponServiceFeingCient
3.- Add attributes a the interface
4.- Declare methods in the interface signature must match with remote methods via Rest calling
Method name can be change 
5.- Annotate this methods with the same annotation matching with remote methods
Consider defining a bean of type 'com.walmart.api.order.feing.client.CouponServiceFeingCient' in your configuration.
Above exception ocourse if we don't enable feing client
6.- Enable feign client but annotating application class with @EnableFeignClients
