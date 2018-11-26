# Real World Kata #1 - Users API
This kata differs from traditional ones as it attempts to provide you with an example of something you are likely to
encounter in the real world.

The aim of this is for people to implement new features utilising Outside-in TDD (from the Acceptance test inwards).

Remember to start with a failing acceptance test, and then work your way writing failing test until you have implemented
the required behaviour to get it to green.

## The tasks
Starting with a new acceptance test (see [the first acceptance test](src/test/java/upsd/acceptance/AT_GetUserById.java))
implement the features described here. They are intentionally vague as to give you some freedom.

### Feature #1 - User not found
You need to implement the scenario when a client requests a user that does not exist. For example, there are no users
and a client requests a user with an ID of 12.

### Feature #2 - Get all users
When a client requests all users, you must return all users found.

### Feature #3 - Add a user
Add the ability for a client to add a user via the API.

### Feature #4 - Delete a user
Enable clients of the API to delete a user.

### Feature #5 - Search for user by name
Enable clients of the API to search for users using their name.

## Running the tests
To run the tests, execute the below in a terminal of your choice at the root of the project:

    $ ./gradlew test