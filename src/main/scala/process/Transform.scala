package process

import com.mongodb.casbah.Imports._
import db.Common._
import domain.Travel
import db.MongoFactory

object Transform extends App {

  def saveData(travel: Travel) {
    val mongoObj = buildMongoDbObject(travel)
    
    MongoFactory.collection.save(mongoObj)
  }

}