/*
 * Copyright (C) 2009-2019 Lightbend Inc. <https://www.lightbend.com>
 */

package akka.serialization

import akka.actor.{ ActorSystem, ExtendedActorSystem, ExtensionId, ExtensionIdProvider }

/**
 * SerializationExtension is an Akka Extension to interact with the Serialization
 * that is built into Akka
 */
object SerializationExtension extends ExtensionId[Serialization] with ExtensionIdProvider {
  override def get(system: ActorSystem): Serialization = super.get(system)
  // DOTTY -> explicit brackets
  override def lookup() = SerializationExtension
  override def createExtension(system: ExtendedActorSystem): Serialization = new Serialization(system)
}
