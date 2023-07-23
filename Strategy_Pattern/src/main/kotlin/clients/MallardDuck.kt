package clients

import Duck
import algorithms.fly.FlyWithWings
import algorithms.quack.QuackNormal

class MallardDuck : Duck(FlyWithWings(), QuackNormal()) {
    override fun display() {
        println("I'm a real mallard duck")
    }
}