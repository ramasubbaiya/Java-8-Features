#Java 8 New Exciting Features

##Project LAMBDA
An Effort to bring java to the world of functional programming

###Lamba Expressions
A lambda is an anonymous function(A function without a name)
Instantiate interface with single method
Replace more verbose class declaration

##Stream API

###Traversing Streams

Using Stream use Filter by Predicate Object
```people.stream().filter(pred).forEach(p -> System.out.println(p.getName()));```

Using multi-threading
```people.parallelStream().filter(pred).forEach(p -> System.out.println(p.getName()));```

###Array to Stream

```Stream<Person> stream = Stream.of(people);
		
	stream.forEach(p -> System.out.println(p.getInfo()));```

Same as above code but using Arrays

```Stream<Person> stream = Arrays.stream(people);
		
	stream.forEach(p -> System.out.println(p.getInfo()));```

###Aggregating Stream

##Parallel Stream 
Most efficient way
But not good for sequential ordering
```List<String> strings = new ArrayList<>();
		for (int i = 0; i < 10000; i++) {
			strings.add("Item " + i);
		}

		strings.stream().parallel()
			.forEach(str -> System.out.println(str));

	}```

To count the Arrays
```long count = strings.stream().count();```

To get the Sum and Average
```int sum = people.stream().mapToInt(p -> p.getAge()).sum();
		
		System.out.println("Sum of Ages : " + sum);
		
		OptionalDouble avg = people.stream().mapToInt(p -> p.getAge()).average();
		
		if(avg.isPresent()) {
			System.out.println("Average : " + avg.getAsDouble());
		} else {
			System.out.println("Avg not calculated");
		}```
