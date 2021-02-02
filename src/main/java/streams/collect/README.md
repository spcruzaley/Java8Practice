## Collectors

* How to **create a list**
* How to **create a set**
* How to **join specific fields** from a given list of Objects
* How to **join specific fields** from a given list of Objects **using a delimiter**
* Using **groupingBy** to create a person Map grouped by a specified field/category (*By Gender in this example*)
    * We can use groupingBy with a second parameter know as ***downstream collector***, some of them are:
        * **toSet()**: returning **Map<String, Set<T>>** instead of default (List).
        * **counting()**: returning **Map<String, Long>** that produces a count of the collected elements.
        * **summing(Int|Long|Double)**: returning **Map<String, (Int|Long|Double)>** takes a function argument, applies the function to the downstream elements, and produces their sum.
        * **maxBy** & **minBy**: returning **Map<String, T>** take a comparator and produce maximum and minimum of the downstream elements.
* Using **partitioningBy** to create a person Map using a Predicate to generate a list from a given validation (*By Male gender in this example*)