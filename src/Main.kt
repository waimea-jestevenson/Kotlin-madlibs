/**
 *
 */

fun main() {
    val name = getString("Enter a person's name: ")
    val heOrShe = getString("Is that person a 'he' or a 'she'?: ")
    val anotherName = getString("Enter another person's name: ")
    val verbing = getString("Enter a verb ending in 'ing': ")
    val verbed = getString("Enter a verb ending in 'ed':")
    val item = getString("Enter an object:")
    val animal = getString("Enter a animal:")

    println("Ok, here is your story.")
    println("$name was walking down the road when $heOrShe bumped into $anotherName who was $verbing a $item.")
    println("'Woah, dude! Those are some awesome skills!', said $name as $heOrShe $verbed.")
    println("$anotherName then rode away on a $animal.")


}

/**
 * function to get string inputs from the user
 */
fun getString(prompt: String): String {
 var userInput: String
 while (true) {
     print(prompt)

     userInput = readln()
     if (userInput.isNotBlank()) break
 }
    return userInput
}

