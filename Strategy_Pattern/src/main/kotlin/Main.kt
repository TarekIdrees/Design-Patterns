import clients.MallardDuck
import clients.RubberDuck

fun main() {

    val mallardDuck = MallardDuck()
    mallardDuck.display()
    mallardDuck.preformFly()
    mallardDuck.preformQuack()

    println("============================================")

    val rubberDuck = RubberDuck()
    rubberDuck.display()
    rubberDuck.preformFly()
    rubberDuck.preformQuack()

}