App Injection
=============
*A small addon for easier access to the android.app.Application object.*

This library provides one trait `AppInjection` that can be mixed into a `Fragment` or an `Activity`. The trait adds 
one method `app: _ <: Application`. You can then define a global service or resource in the Application class, and 
it will be accessible is all Activities and Fragments.

```scala
class MainActivity extends android.app.Activity 
    with AppInjection[SomeApplication] {

  override def onCreate(saved: Bundle): Unit = {
    super.onCreate(saved)
    
    assert( this.app.isInstanceOf[SomeApplication] )
    
  }
  
}
```

Installation
------------

The library is hosted on Github. To include in your project, add the Github repository to your dependencies. 


```Groovy
repositories {
    maven {
        url 'https://github.com/AliceCengal/android-app-injection/raw/master/library/release'
    }
}

dependencies {
    // Other dependencies
    // ...
    compile 'com.cengallut:appinjection:1.1.0'
}
```
