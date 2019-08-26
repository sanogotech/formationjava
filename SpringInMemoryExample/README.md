# https://javainterviewpoint.com/spring-security-inmemoryuserdetailsmanager/

We have autowired InMemoryUserDetailsManager and PasswordEncoder classes, InMemoryUserDetailsManager enables us to create, retrieve, modify and 
delete the UserDetails and PasswordEncoder is an implementation of BCryptPasswordEncoder used to encode the password.

All the request which start with /employee requires USER role and the request which start with /manager requires MANAGER role. 
checkIfUserExists(), createUser(), updateUser(), deleteUser() methods will help us to make changes to the in-memory UserDetails

#POSTMAN

##Check if the User Exist or Not
In POSTMAN,  select GET method and hit the URL “http://localhost:8080/SpringInMemoryExample/employee/employee”

In the Authorization, tab select the Type as “Basic Auth” and key in the valid username /password [employee/password (or) manager/password].
 You should get a response like“employee” exist in InMemoryUserDetailsManager