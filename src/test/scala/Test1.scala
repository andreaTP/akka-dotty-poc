import org.junit.Test
import org.junit.Assert._

class Test1 {
  @Test def t1(): Unit = {
    import akka.actor._
    import scala.concurrent.ExecutionContext
    import java.util.concurrent.Executors

    implicit val executionContext = ExecutionContext.fromExecutor(Executors.newCachedThreadPool())

    val system = ActorSystem()

    val ping = system.actorOf(Props(new Actor {
      def receive = {
        case str: String =>
          println(s"PING received $str")
          sender() ! "pong"
      }
    }))

    val pong = system.actorOf(Props(new Actor {
      def receive = {
        case str: String =>
          println(s"PONG received $str")
          ping ! "ping"
      }
    }))

    pong ! "start"

    Thread.sleep(2000)

    system.terminate()
    println("end")
  }
}