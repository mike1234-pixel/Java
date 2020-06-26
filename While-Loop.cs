// Example of guessing game in C# - while loop and writing to / reading from the console. Program takes user input.

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            string secretWord = "hello";
            string guess = "";

            while(guess != secretWord)
            {
                Console.Write("Enter guess: ");
                guess = Console.ReadLine();
            }
            Console.Write("You Win!");

            Console.ReadLine();
        }

    }
}
