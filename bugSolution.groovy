```groovy
def myMethod(param) {
  if (param == null) {
    return 0
  } else if (param instanceof List) {
    // Handle List input
    return param.sum()
  } else if (param instanceof Number) {
    // Handle Number input
    return param * 2
  } else {
    // Handle other unexpected input types, returning a default value or throwing a custom exception
    return -1 //Or throw new IllegalArgumentException("Unsupported parameter type: "+param.class)
  }
}

println myMethod(null)       // Output: 0
println myMethod([1, 2, 3]) // Output: 6
println myMethod(5)         // Output: 10
println myMethod("abc")     // Output: -1
```