package remote

import common._

case class ServerStatistics(userId : String, keyValue: HashMap[Tweet, Int] )
case class PrintStat(actorName:String, count: Int)
case class PrintUserStat(actorName:String, count: Int)
case class PrintOutUserTweets(actorName:String, count: Int)
case class PrintOutHomeTweets(actorName:String, count: Int)
case class PrintFollowerCount(actorName:String,followerCount: Int,userCount:Int)

case class ProcessTweet(tweet:String,uid:String,time:Long)
case class UserDetails(userId:String, userName:String, password:String)

case class PutTweetHomeTimline(userid:String,tweet:Tweet)
case class PutTweetUserTimline(userid:String,tweet:Tweet)
case class PutFollowerToUser(targetId:String,followerid:String)
case class PutTweet(tweetid:String,tweet:Tweet)

case class GetHomeTimeline(userid:String)
case class GetUserTimeline(userid:String)
case class GetFollowerList(userid:String)
case class Entry(key: String, value: String)

case class TokenizeTweet(tweet:Tweet)
case class PutTweetAgainstToken(token:String,tweet:Tweet)
case class GetTweetsAgainstToken(token:String)
case class SearchToken(token:String)

case object PrintStatistics

case class SentMessages(sourceId: String, tagretId: String, message: String)
case class PutSentMessages(sourceId:String, tagretId: String, message:String)
case class PutReceivedMessages(targetId:String, sourceId:String, message:String)
case class PrivateMessage(fromUserId:String, toUserId:String, message:String)

case class RemoveFollowerToUser(targetId:String, followerid:String)
//Inbox(userid:String,messageList:List[PrivateMessage])
//Outbox(userid:String,messageList:List[PrivateMessage])


object TwitterServer {

	def main(args : Array[String]) {

		// mappings for Hashconsistent routing
		def hashMapping: ConsistentHashMapping = {

		}
	
	}
}

class Worker(cacheRouter: ActorRef, parser: ActorRef) extends Actor {

	implicit val timeout = akka.util.Timeout(500000)

	def receive = {
		case ProcessTweet(tweet,senderId,time) ⇒ {

		}
			
		case SearchToken(token) => {
		
		}	
			
		case Follow(sourceUserId,targetUserId) => {

		}

		case common.UnFollow(sourceUserId,targetUserId) => {

		}

		case common.SentMessages(sourceId,targetId, message) => {

		}

		case FetchUserToFollow(sourceId,randNum) => {

		}

		case DeleteTweetById(tweetId) => {

		}

		case PrintStatistics => {

		}
	}
}

class Master(nrOfWorkers: Int, listener: ActorRef,cacheRouter: ActorRef, parser: ActorRef) extends Actor {
	def receive = {

		case GetTweetById(tweetId) => {

		}
		
		case DeleteTweetById(tweetId) => {

		}
		
		case  GetFollowerList(userid) => {

		}
	
		case FetchUserToFollow(sourceId,randNum) => {

		}

		case Register(userFullName,userId,password) => {

		}
	
		case Login(userId,password) => {

		} 

		case TweetFromUser(tweet,senderId,time) => {	

		}	
			
			
		case Follow(sourceUserId,targetUserId) => {	

		}

		case common.UnFollow(sourceUserId,targetUserId) => {

		}

		case common.SentMessages(sourceUserId, targetUserId, message) => {

		}

		case UpdateUserTimeline(userId) => {

		}

		case UpdateHomeTimeline(userId) => {

		}

		case UpdateMentionTimeline(userId) => {

		}
		
		case UpdateSearchTimeline(userId,searchToken) => {	

		}	

		case PrintStatistics => {

		}
			
		case Start => {

		}
			
	}
}
	
	// a parser class to parse the tweets and do any string prossing operation inthe incoming tweets
	class TweetParser(listener:ActorRef,cacheRouter: ActorRef) extends Actor {
		def receive = {
			case TokenizeTweet(tweet) => {

			}
		}
	}
	
	class Cache (listener: ActorRef) extends Actor {

	def receive = {

		case "sendTweetStats" => {

		}
		
		case UserDetails(userId,userName,password) => {

		}
		
		case PutTweetAgainstToken(token,tweet) => {

		}

		case GetTweetsAgainstToken(token) => {

		}

		case Entry(key, value) => { 

		}

		case PutTweet(tweetId,tweet) => {
			
		}
		
		case GetTweetById(tweetId) => {

		}
		
		case DeleteTweetById(tweetId) => {
		
		}
		
		case GetHomeTimeline(userid) => {
		
		}
		
		case GetUserTimeline(userid) => {

		}
		
		case GetFollowerList(userid) => {

		}
		
		case PutTweetHomeTimline(userid,tweet) => {

		}
		
		case PutTweetUserTimline(userid,tweet) => {

		}
	
		case PutFollowerToUser(targetId,followerid) => {

		}

		case RemoveFollowerToUser(targetId,followerid) => {

		}

		case PutSentMessages(sourceId,targetId, message) => {

		}

		case PutReceivedMessages(targetId, sourceId, message) => {

		}

		case FetchUserToFollow(randKeyString,radnId) => {

		}

		case key: String => {

		}
	}
}


class Listener extends Actor {

		def receive = {
	
		case ShutdownMaster(message) ⇒ {

		}

		
		case PrintStat(actorName, count) => {

		}

		case "printTweetStatistics" => {

		}

		case PrintUserStat(actorName, count) => {

		}
		
		case PrintOutUserTweets(actorName,count) => {

		}
		
		case PrintOutHomeTweets(actorName,count) => {

		}
		
		case PrintFollowerCount(actorName,fcount,ucount) => {

		}
	}
}
