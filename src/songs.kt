fun main(){
val songs:MutableList<String> = mutableListOf("Smoke Sprite",
    "Luther","Miss Understood")
    playAll(songs)
    addSong("Marilyn Monroe",songs)
}
fun playAll(songs:List<String>){
 for (songs in songs){
     println("Now Playing: $songs")
 }
}
fun addSong(songTitle:String,songs:MutableList<String>){
    songs.add(songTitle)
    println("Now Playing: $songTitle")

}