import io.StdIn._

var deck = Array(1,2,3,4,5,6)





var doLoop = true
while (doLoop) {
  println(deck.head + " Remaining " + (deck.length - 1))
  var userInput = readLine
  if (userInput.length == 2) {
    println("Move from tab " + userInput(0) + " to foundation pile " + userInput(1))
    // determine if input is valid
    // (check to see if move is valid)
    // move from tab to foundtaion
  } else if (userInput.length == 1 ) {
    // move the card from the deck!!!
    userInput.toLowerCase match {
      case "1" => println("you picked 1")
      case "2" => println("you picked 2")
      case "3" => println("you picked 3")
      case "4" => println("you picked 4")
      case "a" => println("you picked a")
      case "b" => println("you picked b")
      case "c" => println("you picked c")
      case "d" => println("you picked d")
      case default => println("Invalid input!!!!!!!!")
    }
  } else {
      userInput.toLowerCase match {
        case "quit" => doLoop = false
        case default => println("invalid input")
      }
  }
}

  deck = deck.tail
