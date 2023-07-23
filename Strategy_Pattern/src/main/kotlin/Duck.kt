import algorithms.fly.FlyBehavior
import algorithms.quack.QuackBehavior

abstract class Duck(
    private val flayBehavior: FlyBehavior,
    private val quackBehavior: QuackBehavior
) {
    abstract fun display()

    fun preformFly(){
        flayBehavior.fly()
    }

    fun preformQuack(){
        quackBehavior.quack()
    }

    fun swim(){
        println("All ducks float")
    }
}