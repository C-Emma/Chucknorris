package com.example.chucknorris

import kotlinx.serialization.*
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration

@Serializable
data class Joke(
    @SerialName("categories")
    val categories: List<String>,
    @SerialName("createdAt")
    val createdAt: String,
    @SerialName("iconUrl")
    val iconUrl: String,
    @SerialName("id")
    val id: String,
    @SerialName("updatedAt")
    val updatedAt: String,
    @SerialName("url")
    val url: String,
    @SerialName("value")
    val value: String
)
    /*companion object : KSerializer<Joke>{
        override val descriptor: SerialDescriptor = PrimitiveDescriptor("Joke", PrimitiveKind.STRING)


        val data = Joke(
        emptyList(),
        "2020-01-05 13:42:26.766831",
        "\"https://assets.chucknorris.host/img/avatar/chuck-norris.png",
        "pyNXTV7WThiNLRykGsQmrg",
        "2020-01-05 13:42:26.766831",
        "https://api.chucknorris.io/jokes/pyNXTV7WThiNLRykGsQmrg",
        "The hills are alive with the sound of Chuck Norris' dong slapping against his legs while he walks."
    )

     fun serialize() {
        val json = Json(JsonConfiguration.Stable).stringify(Joke.serializer(), data)
         print(json)
    }

     fun deserialize() {
        val joke = Json(JsonConfiguration.Stable).parse(Joke.serializer(), data)
    }*/
