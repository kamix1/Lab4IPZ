package Lab3

import org.apache.spark._
import org.apache.spark.sql.SparkSession

object Task3_1 {
  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder
      .appName("My Spark Application") // необов'язковий і буде
      // автоматично згенерований, якщо не вказано
      .master("local[*]")//лише для демонстрації і тестування,
      //використовуйте замість цього spark-submit
      .config("spark.sql.warehouse.dir", "target/spark-warehouse")
      .getOrCreate

    val path2 = "C://spark//examples//src//main//resources//employees.json"
    val path1 = "C://spark//examples//src//main//resources//people.json"
    val People = spark.read.json(path1).show()
    val Empoyees = spark.read.json(path2).show()
    //added message
  }
}
