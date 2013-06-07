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

A service provider specifies some metadata in plain text files in 
the `META-INF/services` class path container.  The name of each text
file specifies the fully-qualified class name of an interface or class
specified in the service API.  The file contents consist of a single line
of text that specifies the fully-qualified class name of a class that 
implements or extends the type specified in the file name.  Each 
implementation class must have a public no-arg constructor that is used
by the `ServiceLoader` to construct an instance of the class.

An application that wishes to use a service needs a mechanism to locate
a suitable provider for the service.  The `ServiceLoader` mechanism provides
underlying support for a _service locator_ object.  The locator is used to
find a suitable provider for a given service.  The `ServiceLoader` class
provides methods that can locate implementations of a given interface or
class in the service API on the application class path, using the metadata 
specified by one or more service providers.  The service locator is 
responsible for determining which provider to select when multiple providers 
are available.

This demo is Maven project that consists of several submodules:

* service-loader-demo -- is the top-level project
* service-loader-api -- provides the service API for a simple service that
  provides some sort of character encoding/decoding capability
* service-provider-standard -- is a service provider implementation
* service-provider-alternate -- is a service provider implementation
* service-provider-main -- is a simple `main` that uses the 
  `CodecLocator` defined in the service API to locate codecs for two different
  character encodings
