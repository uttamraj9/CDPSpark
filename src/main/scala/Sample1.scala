object Sample1 {
  import org.apache.spark.rdd.RDD

  import org.apache.spark.{SparkConf, SparkContext}
  def main(args:Array[String]): Unit = {
    val conf = new SparkConf().setAppName("PI").setMaster("local")
    val sc = new SparkContext(conf)
    val rdd:RDD[Int] = sc.parallelize(List(1,2,3,4,5))
    val rddCollect:Array[Int] = rdd.collect()
    println("Number of Partitions: "+rdd.getNumPartitions)
    println("Action: First element: "+rdd.first())
    println("Action: RDD converted to Array[Int] : ")
    rddCollect.foreach(println)

    //val rdd = sc.textFile("/Users/uttamkumar/Desktop/Training/InteliJ/SparkScala/src/main/scala/*")
    //rdd.foreach(f => {
    //println(f)
    //})

    //val textFile = sc.textFile("/Users/uttamkumar/Desktop/Training/InteliJ/SparkScala/src/main/scala/sampl.txt")
    //println(textFile.count())
    //println(textFile.first())


  }
}