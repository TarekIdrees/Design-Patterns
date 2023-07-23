package clients

import Duck
import algorithms.fly.FlyNoWay
import algorithms.quack.QuackFast

class RubberDuck: Duck(
    flayBehavior = FlyNoWay(),
    quackBehavior = QuackFast()
) {
    override fun display() {
        println("I'm rubber duck")
    }
}