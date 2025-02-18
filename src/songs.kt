fun main(){
val songs:MutableList<String> = mutableListOf("Smoke Sprite",
    "Luther","Miss Understood")
    playAll(songs)
}
fun playAll(songs:List<String>){
 for (songs in songs){
     println("Now Playing: $songs")
 }
}