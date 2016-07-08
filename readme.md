#Java 8 New Exciting Features

##Project LAMBDA
An Effort to bring java to the world of functional programming

###Lamba Expressions
A lambda is an anonymous function(A function without a name)
Instantiate interface with single method
Replace more verbose class declaration

###Stream API

####Traversing Streams

Using Stream use Filter by Predicate Object

```people.stream().filter(pred).forEach(p -> System.out.println(p.getName()));```

Using multi-threading

```people.parallelStream().filter(pred).forEach(p -> System.out.println(p.getName()));```

####Array to Stream

Using Stram in Array

```
Stream<Person> stream = Stream.of(people);
stream.forEach(p -> System.out.println(p.getInfo()));
```

Same as above code but using Arrays

```
Stream<Person> stream = Arrays.stream(people);
stream.forEach(p -> System.out.println(p.getInfo()));
```

####Aggregating Stream

####Parallel Stream 
Most efficient way
But not good for sequential ordering
```
List<String> strings = new ArrayList<>();
	for (int i = 0; i < 10000; i++) {
		strings.add("Item " + i);
	}

	strings.stream().parallel()
		.forEach(str -> System.out.println(str));

}
	```

To count the Arrays
```long count = strings.stream().count();```

To get the Sum and Average

```
int sum = people.stream().mapToInt(p -> p.getAge()).sum();
		
	System.out.println("Sum of Ages : " + sum);
	
	OptionalDouble avg = people.stream().mapToInt(p -> p.getAge()).average();
	
	if(avg.isPresent()) {
		System.out.println("Average : " + avg.getAsDouble());
	} else {
		System.out.println("Avg not calculated");
	}
``` 


##JavaScipt Engine

A new JavaScript engine named Nashorn.
It replaces the older rhino engine and it can be used from the command line or in java code files

```
ScriptEngineManager mgr = new ScriptEngineManager();
ScriptEngine engine = mgr.getEngineByName("nashorn");
String script = "'Hello World'.length";
Object result = engine.eval(script);
System.out.println(result);
```


##String delimited list

```
String provinces[] = {"Ontario", "BC", "Nova Scotia", "Alberta"};
String provincesList = String.join(", ", provinces);
```

##String Joiner Class 

```		
StringJoiner sj = new StringJoiner(", ", "{ ", " }");
		sj.add("Alberta")
		  .add("British Columbia")
		  .add("Ontario");
System.out.println(sj);
```

##Enhancements in Concurrency
New methods to handle race condition
Improvements to ConcurrentHashMap
Parallel options with arrays
New methods for composing asyn operations

##New Collection methods
Iterable : forEach()
Collection : removeIf()
List : replaceAll(), sort()
Iterator : forEachRemaining
Map : forEach(), replace(), remove(), and more


