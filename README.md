service-loader-demo
===================

A small demo of the JDK ServiceLoader mechanism.

The `java.util.ServiceLoader` class was added in JDK 6 to provide support
for the de-facto service provider loading mechanism that has been used by
Java extensions for many years.  

A _service_ is defined as a set of interfaces and (often abstract) classes;
i.e. a service provides an API for some functionality.  An example of a 
service is the JavaMail (`javax.mail`) API.  A service can have one or 
more _providers_ that implement all or part of the API, perhaps in different 
ways.

An application that wishes to use a service needs a mechanism to locate
a suitable provider for the service.  The `ServiceLoader` mechanism provides
underlying support for a _service locator_ object.  The locator is used to
find a suitable provider for a given service.

This demo is Maven project that consists of several submodules:

* service-loader-demo -- is the top-level project
* service-loader-api -- provides the service API for a simple service that
  provides some sort of character encoding/decoding capability
* service-provider-standard -- is a service provider implementation
* service-provider-alternate -- is a service provider implementation
* service-provider-main -- is a simple `main` that uses the 
  `CodecLocator` defined in the service API to locate codecs for two different
  character encodings
