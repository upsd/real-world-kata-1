# Real World Kata #1 - Users API
This kata differs from traditional ones as it attempts to provide you with an example of something you are likely to
encounter in the real world.

The aim of this is for people to implement new features utilising Outside-in TDD (from the Acceptance test inwards).

Remember to start with a failing acceptance test, and then work your way writing failing test until you have implemented
the required behaviour to get it to green.

## The tasks
Starting with a new acceptance test (see [the first acceptance test](src/test/java/upsd/AT_GetUserById.java)) implement
the features described here. They are intentionally vague as to give you some freedom.

### Feature #1 - User not found
You need to implement the scenario when someone requests a user that does not exist. For example, there are no users
and someone makes the following request: `/users/12`.

### Feature #2 - Get all users
When someone visits `/users/` you should return all users found.

### Feature #3 - Add a user
Add the ability for someone to add a user via the API.

### Feature #4 - Delete a user
Enable users of the API to remove users.

### Feature #5 - Search for user by name
Enable users of the API to search for users using their name.