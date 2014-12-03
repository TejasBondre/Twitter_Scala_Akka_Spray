import akka.actor._
import scala.concurrent._
import akka.pattern.ask
import spray.routing.SimpleRoutingApp

import org.json4s._
import org.json4s.native.Serialization
import org.json4s.native.Serialization.{read, write,writePretty}
import spray.http._
import spray.http.MediaTypes._
import spray.routing.{Route, RequestContext}
import spray.routing.directives._
import scala.concurrent.duration._
import common._
import scala.util.Random

object MyServer extends App with SimpleRoutingApp {
    implicit val actorSystem = ActorSystem("RESTServerSystem")
    import actorSystem.dispatcher

    implicit val timeout = akka.util.Timeout(500000)
 
    val serverIP = args(0)
    val serverPort = "5150"
    val remoteActorString = "akka.tcp://BtcMasterSystem@"+serverIP+":"+serverPort+"/user/MasterActor"

    // type Route = RequestContext => Unit

    //directives
  
    def getJson(route: Route): Route = {
        get {

        }
    }
  
    val remote = actorSystem.actorFor(remoteActorString) 
  
    println(remote)
  
    lazy val helloRoute = get {

    }

    lazy val sendTestMesgRoute = get {

    }

    lazy val sendTweetRoute = get {

    }

    lazy val showTweetRoute = get {

    }

    lazy val fetchUserTimelineRoute = get {

    }

    lazy val fetchHomeTimelineRoute = get {

    }

    lazy val distroyTweetRoute = get {

    }

    lazy val getFriendship = get {

    }

    lazy val getFollowerListRoute = get {

    }

    lazy val destroyFriendship = get {

    }

    lazy val sendMessage = get {

    }

    lazy val sendTweetRoute2 = get {

    }

    lazy val getsearchTweets = get {

    }  
    startServer(interface = "localhost", port = 8080) {

    }
}

object JsonUtil {
    //private implicit val formats = Serialization.formats(NoTypeHints)
    implicit val formats = native.Serialization.formats(ShortTypeHints(List(classOf[Tweet])))
    def toJson(tweet:Tweet) : String = writePretty(tweet)
    def toJson(timeline:Timeline) : String = writePretty(timeline)
    def toJson(tweet:TweetFromUser) : String = writePretty(tweet)
    def toJson(stringList:List[String]) : String = writePretty(stringList)
    def toJson(followerList:FollowerList) : String = writePretty(FollowerList)
    def toJson(searchTimeline:SearchTimeline) : String = writePretty(searchTimeline)
}