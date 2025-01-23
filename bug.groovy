```groovy
def myMethod(param) {
  if (param == null) {
    return 0 // Handle null input
  }
  // ... rest of the method
}

println myMethod(null) // Output: 0
println myMethod([1, 2, 3]) // This will throw an exception because of type mismatch
```