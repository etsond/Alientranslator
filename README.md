# Alien Translator
This is a Java program that translates messages from two different fictional alien languages into Earth English. The two fictional languages are called Beaumondian and Reginian.

## Usage
When you run the program, it will prompt you to enter the planet from which the message is coming. If you enter 1, it means the message is from Beaumondian planet. If you enter 2, it means the message is from Reginian planet.

Once you have entered the planet, the program will prompt you to enter the message to be translated.

The program will then translate the message to Earth English and print the translated message to the console.

Example
Here is an example of how to use the program:

```ruby
What planet?
1
What is the message?
Zkdw brx kdyh wr vwulqj?
Original Message in Beaumondian: Zkdw brx kdyh wr vwulqj?
Translation in Earth English: What you have to offer?
```
### Testing
This program was tested using JUnit. The test cases cover different scenarios, including:

- Translating a message from Beaumondian to Earth English
- Translating a message from Reginian to Earth English
- Entering a planet that is not 1 or 2
- To run the tests, navigate to the project directory and run the following command:

```ruby
$ javac -cp .:junit-4.XX.jar AlienTranslatorTest.java
$ java -cp .:junit-4.XX.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore AlienTranslatorTest
```
> Note that you need to replace XX with the version number of JUnit you have installed.
## Credits
code Block https://docs.github.com/en/get-started/writing-on-github/working-with-advanced-formatting/creating-and-highlighting-code-blocks
