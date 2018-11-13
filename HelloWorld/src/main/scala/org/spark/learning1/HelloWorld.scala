package org.spark.learning1

import org.apache.spark
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.log4j

object HelloWorld {
  def main(args:Array[String]){
    
    //Logger.getLogger("org").setLevel(Level.ERROR)
    
    val conf = new SparkConf().setAppName("Test2SparkApp").setMaster("local[*]")
    val sc = new SparkContext(conf)
    println("Hello World")
    sc.stop()    
  } 
}