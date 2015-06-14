package com.github.kimutansk.reactive

import akka.actor.ActorSystem
import akka.stream.ActorFlowMaterializer
import akka.stream.scaladsl.{Sink, Source}
import io.scalac.amqp.Connection

/**
 * RabbitMQを用いたReactive Streams検証用クラス
 *
 * @author kimutansk
 */
object ReactiveRabbitApp extends App {
  override def main(args: Array[String]): Unit = {
    // streaming invoices to Accounting Department
    val connection = Connection()
    val queue = connection.consume(queue = "invoices")
    val exchange = connection.publish(exchange = "accounting_department",
      routingKey = "invoices")

    implicit val system = ActorSystem()
    implicit val materializer = ActorFlowMaterializer()

    Source(queue).map(_.message).to(Sink(exchange)).run()
  }
}
