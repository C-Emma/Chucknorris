Projet ANDROID 
=============

## Chunknorris
Ce TP a pour objectif de créer une application avec Android Studio. L'application consiste à afficher des blagues grâce à une liste dynamique utilisant une API. 

Ce projet a été implémentaté en Kotlin. On se base sur l'utilisation d'un ReclyclerView pour créer la liste dynamique et d'une data class permettant de recueillir les données renvoyées par l'API en format JSON. Les informations contenues dans ce JSON sont ensuite converties en Kotlin à l'aide de la librairie Serialization.

## Etat du projet
A la fin de la partie 1 (Create a UI List component), au lancement de l'application, on obtient une liste dynamique contenant j1, j2,...,jn qui se charge une fois arrivé en fin de page.

Le projet a été mené jusqu'au test de JokeSerialization.kt (Part 2 - Fetch jokes : Import Retrofit & Rx Java).
L'importation de la librairie Serialization et la nouvelle data classe Joke  fonctionne. Cependant après de nombreuses tentatives les deux fonctions serialize() et deserialize() dans Joke.kt sont toujours mal implémentées.

