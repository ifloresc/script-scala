package db

import com.mongodb.casbah.Imports._
import domain.Travel

object Common {
  
  /**
   * Convert a Travel object into a BSON format that MongoDb can store.
   */
  def buildMongoDbObject(travel: Travel): MongoDBObject = {
      val builder = MongoDBObject.newBuilder
      
      builder += "tipo_pago" -> travel.tipo_pago
      builder += "dest" -> travel.dest
      builder += "org" -> travel.org
      builder += "fecha" -> travel.fecha
      builder += "home" -> travel.home
      builder += "cant_pers" -> travel.cant_pers
      builder += "idioma" -> travel.idioma
      builder += "cabina" -> travel.cabina
      builder += "tipo_viaje" -> travel.tipo_viaje
      
      builder.result
  }
}