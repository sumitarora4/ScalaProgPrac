package Exercises.Strings;object FlattenListOfList extends App{

        val list1 = List("pencil", "pen", "sharpener")
        val list2 = List("math book", "french book", "english book")

        val finalList: List[List[String]] = List(list1, list2)

        // 1) use flatMap and then Map again
        finalList.flatMap(x => x.map(y=> s"$y is required in the classroom.")).foreach(println)

        //  2) use flatten and then only Map -- this is more meaningful.
        finalList.flatten.map(y=> s"$y is required in the classroom.").foreach(println)


        }
