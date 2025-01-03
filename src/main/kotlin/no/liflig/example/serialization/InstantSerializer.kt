package no.liflig.example.serialization

import java.time.Instant
import java.time.format.DateTimeFormatter
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

typealias SerializableInstant = @Serializable(InstantSerializer::class) Instant

object InstantSerializer : KSerializer<Instant> {
  private val formatter = DateTimeFormatter.ISO_INSTANT

  override val descriptor: SerialDescriptor =
      PrimitiveSerialDescriptor("java.time.Instant", PrimitiveKind.STRING)

  override fun serialize(encoder: Encoder, value: Instant): Unit =
      encoder.encodeString(formatter.format(value))

  override fun deserialize(decoder: Decoder): Instant =
      formatter.parse(decoder.decodeString(), Instant::from)
}
