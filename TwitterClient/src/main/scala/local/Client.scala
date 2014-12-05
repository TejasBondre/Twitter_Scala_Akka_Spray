package local

import akka.actor._
import common._
import akka.util._
import scala.concurrent.duration._

import scala.util.Random

import akka.routing.RoundRobinRouter
import java.net.InetAddress

import scala.concurrent.ExecutionContext.Implicits.global


case class RemoteDetail(remoteActorString : String)
case class Profile(numberoftweetsperhour: Double, percentageusers: Double, followercount: Int, followingcountrate: Double, 
	               userTimelineRefreshrate: Double, homeTimelineRefreshrate: Double, mentionTimelineRefreshrate: Double)      // refresh rate in seconds
case class FollowerTarget(sourceId: String,targetId: String)


object Local {

	def main(args: Array[String]) {

	}

}


class UserActor(remote: ActorRef, profileobj: Profile, totalusers: Int,
				userId: String, j: Int,clientId:String) extends Actor {


	def receive = {
  		
	    // register users
		case Register(userFullName,userId,password) => {

		}
		
		case RegistrationOK => {

		}
	
	
		// login users
		case LoginOK => {	

		}  
	
		case "followmessage" => {

	    }
    
	    case Follow(sourceId,targetUserId) => {

	    }
	
	    case "tickTweet" =>  {

	    } 	

		case TweetProcessedOK => {

		}


		case "updateUserTimeline" => {

		}

		case "updateHomeTimeline" => {

		}

		case "updateMentionTimeline" => {

		}

		case UpdateSearchTimeline(userId, searchToken) => {

		}
	
		case UserTimeline(userTimeline) => {

		}
	
		case HomeTimeline(homeTimeline) => {

		}

		case _ =>
     	   println("LocalActor got something unexpected.")

	}

}
