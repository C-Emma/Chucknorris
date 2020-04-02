package com.example.chucknorris

import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Serializable
data class Joke (
    @SerialName("createdAt")
    val createdAt: String = "2020-01-05 13:42:26.766831",
    @SerialName("iconUrl")
    val iconUrl: String = "https://assets.chucknorris.host/img/avatar/chuck-norris.png",
    @SerialName("id")
    val id: String = "pyNXTV7WThiNLRykGsQmrg",
    @SerialName("updatedAt")
    val updatedAt: String = "2020-01-05 13:42:26.766831",
    @SerialName("url")
    val url: String = "https://api.chucknorris.io/jokes/pyNXTV7WThiNLRykGsQmrg",
    @SerialName("value")
    val value: String = "The hills are alive with the sound of Chuck Norris' dong slapping against his legs while he walks."
)

