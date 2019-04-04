package com.thoughtworks.kotlin.classes

/*
    * We can define properties in the primary constructor
    * Default visibility is `public` for all the properties.
    * Getters and Setters are automatically generated, All the interaction happen using getters and setters
    * To define our own getters/setters we need to define properties outside of primary constructor
    * We can choose getter and setter to be private
    * We can make the properties `private` but then we cannot use getters and setters around them, however we can have other behaviours for them
    * We can override a function by putting keyword override before that
    * We can create data classes which will have equals,hashcode, toString
* */